<%@ page import="com.planrest.dao.impl.InstitutionDao" %>
<%@ page import="com.planrest.models.Institution" %>
<%@ page import="java.util.List" %>
<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="java.io.ByteArrayInputStream" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.planrest.util.*" %>
<%@ page import="com.planrest.dao.impl.ProfileDao" %>
<%@ page import="com.planrest.models.Profile" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/places_style.css" />" rel="stylesheet" type="text/css">
    <title>Выбор заведения</title>

</head>
<body>

<!-- Блок верхнего меню -->
<%@include file="jspf/top_menu.jspf" %>

<!-- Главный блок с инфой -->
<div id="main_block">

    <!-- Блок с категориями поиска (находиться в левой колонке) -->
    <%@include file="jspf/search_left_menu_for_places.jspf" %>

    <%
        String searchString = "";

        if (request.getParameter("search_string") != null) {
            searchString = request.getParameter("search_string");
            session.setAttribute("search_string", searchString);
        } else if (session.getAttribute("search_string") != null) {
            searchString = session.getAttribute("search_string").toString();
        } else {
            session.setAttribute("search_string", searchString);
        }

    %>

    <!-- Блок поиска -->
    <div class="right_colum">

        <div class="search_block">
            <form name="search_form" method="GET" action="/places">
                <input type="text" placeholder="Поиск..." class="search_text" value="<%=searchString%>" name="search_string"/>
                <input type="submit" value="Поиск" id="btn_search" />
            </form>
            <br/><br/>
        </div>

        <!-- Блок в котором отображаеться список заведений -->
        <div class="list_of_places">

            <%
                List<Institution> allInstitution = null;

                Enumeration<String> names = request.getParameterNames();
                int len = 0;
                while (names.hasMoreElements()) {
                    names.nextElement();
                    len++;
                }

                Enumeration<String> parameterNames = request.getParameterNames();
                if (parameterNames.hasMoreElements() && len==1) {
                    String parameterName = parameterNames.nextElement();
                    int parameterValue = 0;
                    try {
                        String stringParameterValue = request.getParameter(parameterName);

                        if (parameterName.equals("search_string")) {
                            InstitutionDao institutionDao = new InstitutionDao();
                            allInstitution = institutionDao.getInstitutionsByName(stringParameterValue);
                        }  else {
                            parameterValue = Integer.valueOf(stringParameterValue);
                            SelectedInstitutionList selectedInstitutionList = new SelectedInstitutionList(parameterName, parameterValue);
                            allInstitution = selectedInstitutionList.getInstitutions();

                            if (allInstitution != null) {

                                String title = selectedInstitutionList.getTitle();
                                String name = null;
                                switch (title) {
                                    case "Тип":
                                        name = TypeList.getTypeList().get(parameterValue);
                                        break;
                                    case "Кухня":
                                        name = KitchenList.getKitchenList().get(parameterValue);
                                        break;
                                    case "Район":
                                        name = RegionList.getRegionList().get(parameterValue);
                                        break;
                                    case "Услуги":
                                        name = ServiceList.getServiceList().get(parameterValue);
                                        break;
                                }

                                %>
                                <h1><%=title%>: <%=name%></h1>
                                <%

                            }
                        }

                    } catch (Exception e) {
                        allInstitution = null;
                    }

                } else if (len == 0){
                    InstitutionDao institutionDao = new InstitutionDao();
                    allInstitution = institutionDao.getAllInstitution();
                }

                if (allInstitution == null || len > 1) {
            %>

            <h1>Страница не найдена...</h1>

            <%
                } else if (allInstitution.size() == 0) {
            %>

            <h2>По запросу ничего не найдено...</h2>

            <%
                } else {
                    for (Institution institution : allInstitution) {
            %>

            <div class="card_of_place">

                <div class="img_place">
                    <a href="institution?institution_id=<%=institution.getId()%>">
                        <%if (institution.getAvatar() == null) {
                        %>
                            <img src="/resources/images/camera_200.png" alt="">
                        <%} else {%>
                            <img src="<%=request.getContextPath()%>/ShowInstitutionLogo?index=<%=institution.getId()%>" alt="">
                        <%}%>
                    </a>
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name" id="pl_nm">
                                <a href="institution?institution_id=<%=institution.getId()%>"><h2><%=institution.getName()%></h2></a>
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                <%=institution.getRegion()%>
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "adress">
                                <b>Адрес:</b>
                            </div>

                            <div class = "adress" id="adr">
                                <%=institution.getAddress()%>
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "time">
                                <b>Время работы:</b>
                            </div>

                            <div class = "time" id="tm">
                                <%=institution.getWorkingHours()%>
                            </div>
                        </div>

                    </div>

                </div>

            </div>

            <%
                    }
                }
            %>

        </div>

    </div>

</div>

</body>
</html>

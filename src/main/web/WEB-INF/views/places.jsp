<%@ page import="com.planrest.dao.impl.InstitutionDao" %>
<%@ page import="com.planrest.models.Institution" %>
<%@ page import="java.util.List" %>
<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="java.io.ByteArrayInputStream" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.planrest.util.SelectedInstitutionList" %>
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
    <%@include file="jspf/search_left_menu.jspf" %>

    <!-- Блок поиска -->
    <div class="right_colum">
        <%@include file="jspf/search_block.jspf" %>

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
                        parameterValue = Integer.valueOf(request.getParameter(parameterName));
                        SelectedInstitutionList selectedInstitutionList = new SelectedInstitutionList(parameterName, parameterValue);
                        allInstitution = selectedInstitutionList.getInstitutions();
                    } catch (NumberFormatException e) {
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

            <h1>Ничего не найдено...</h1>

            <%
                } else {
                    for (Institution institution : allInstitution) {
            %>


            <div class="card_of_place">

                <div class="img_place">
                    <img src="<%=request.getContextPath()%>/ShowImage?index=<%=institution.getId()%>" alt="">
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "place_name">
                                <b>Название:</b>
                            </div>

                            <div class = "place_name" id="pl_nm">
                                <%=institution.getName()%>
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>Район:</b>
                            </div>

                            <div class = "region" id="reg">
                                Оболонский
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

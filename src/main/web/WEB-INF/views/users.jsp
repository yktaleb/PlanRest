<%@ page import="com.planrest.models.Profile" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.planrest.dao.impl.ProfileDao" %>
<%@ page import="com.planrest.util.SelectedUsersList" %>
<%@ page import="com.planrest.util.RegionList" %>
<%@ page import="com.planrest.util.StatusList" %>
<%@ page import="com.planrest.util.SexList" %>
<%@ page import="com.planrest.dao.impl.FriendDao" %>
<%@ page import="com.planrest.models.Friend" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/users_style.css" />" rel="stylesheet" type="text/css">
    <title>Поиск людей</title>
</head>
<body>
<!-- Блок верхнего меню -->
<%@include file="jspf/top_menu.jspf" %>
<!-- Главный блок с инфой -->
<div id="main_block">
    <!-- Блок с категориями поиска (находиться в левой колонке) -->
    <%@include file="jspf/search_left_menu_for_users.jspf" %>

    <%
        request.setCharacterEncoding("UTF-8");
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
            <form name="search_form" method="GET" action="/users">
                <input type="text" placeholder="Поиск..." class="search_text" value="<%=searchString%>" name="search_string"/>
                <input type="submit" value="Поиск" id="btn_search" />
            </form>

            <br/><br/>
        </div>
        <!-- Блок в котором отображаеться список пользователей -->
        <div class="list_of_people">

            <%
                List<Profile> allProfile = null;

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
                            allProfile = profileDao.getProfilesByName(stringParameterValue);
                        }  else {
                            parameterValue = Integer.valueOf(stringParameterValue);
                            SelectedUsersList selectedUsersList = new SelectedUsersList(parameterName, parameterValue);
                            allProfile = selectedUsersList.getProfiles();

                            if (allProfile != null) {

                                String title = selectedUsersList.getTitle();
                                String name = null;
                                switch (title) {
                                    case "Район":
                                        name = RegionList.getRegionList().get(parameterValue);
                                        break;
                                    case "Семейное положение":
                                        name = StatusList.getStatusList().get(parameterValue);
                                        break;
                                    case "Пол":
                                        name = SexList.getSexList().get(parameterValue);
                                        break;
                                }

                                %>
                                <h1><%=title%>: <%=name%></h1>
                                <%

                            }
                        }

                        } catch (Exception e) {
                                e.printStackTrace();
                            allProfile = null;
                        }

                } else if (len == 0){
                    allProfile = profileDao.getAllProfile();
                }

                if (allProfile == null || len > 1) {
            %>

            <h1>Страница не найдена...</h1>

            <%
            } else if (allProfile.size() == 0) {
            %>

            <h2>По запросу ничего не найдено...</h2>

            <%
            } else {
                for (Profile profile : allProfile) {
            %>

            <div class="card_of_people">

                <div class="img_people">
                    <a href="user?id=<%=profile.getId()%>">
                        <%if (profile.getAvatar() == null) {
                        %>
                            <img src="/resources/images/camera_200.png" alt="">
                        <%} else {%>
                            <img src="<%=request.getContextPath()%>/ShowProfileAvatar?index=<%=profile.getId()%>" alt="">
                        <%}%>
                    </a>
                </div>

                <div class="short_inf">
                    <div class="center">
                        <div class="inf">
                            <div class = "people_name">
                                <a href="user?id=<%=profile.getId()%>"><b><%=profile.getName()%> <%=profile.getSurName()%></b></a>
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "region">
                                <b>
                                    <%if (profile.getRegion()!=null){
                                    %>
                                        <%=profile.getRegion()%>
                                    <%
                                    }%>
                                </b>
                            </div>
                        </div>

                        <div class="inf">
                            <div class = "age">
                                <%if (profile.getDateOfBirth()!=null){
                                %>
                                    <b><%=profile.getDateOfBirth()%></b>
                                <%
                                }%>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="btn_add">
                    <%if (myProfile != null){
                        if (!profile.getId().equals(myProfile.getId())){
                            FriendDao friendDao = new FriendDao();
                            boolean isMy = false;
                            for (Friend friend : friendDao.getAllFriend()) {
                                if (friend.getIdFriend().equals(myProfile.getId())) {
                                    if (friend.getProfile().getId().equals(profile.getId())) {
                                        isMy = true;
                                        break;
                                    }
                                }

                                if (friend.getProfile().getId().equals(myProfile.getId())) {
                                    if (friend.getIdFriend().equals(profile.getId())) {
                                        isMy = true;
                                        break;
                                    }
                                }
                            }
                            if (!isMy) {

                    %>
                        <form method="post"  action="add_to_friends_in_users_page" acceptCharset="UTF-8">
                            <input type="hidden" value="<%=profile.getId()%>" name="id">
                            <input type="submit" value="добавить"/>
                        </form>
                    <%
                            }
                        }
                    }%>
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

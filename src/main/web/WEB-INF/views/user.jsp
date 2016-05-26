<%@ page import="com.planrest.dao.impl.ProfileDao" %>
<%@ page import="com.planrest.models.Profile" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="com.planrest.models.Friend" %>
<%@ page import="com.planrest.dao.impl.FriendDao" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/user_style.css" />" rel="stylesheet" type="text/css">
    <title>User</title>
</head>
<body>

<!-- Меню -->
<%@include file="jspf/top_menu.jspf" %>

<!-- Форма со всей информацией -->
<div class="user_page">

    <%
        request.setCharacterEncoding("UTF-8");
        boolean isMyPage = false;
        long id = Long.valueOf(request.getParameter("id"));
        Profile profile = null;
        if (myProfile != null) {
            if (id == myProfile.getId()) {
                isMyPage = true;
                profile = myProfile;
            } else
                profile = profileDao.getById(id);
        }else
            profile = profileDao.getById(id);
    %>

    <!-- Блок в кокором размещяется и логотип и информация(справа от логотипа) -->
    <div class="block_with_information1">
        <!-- Блок в котором размещается логотим заведения -->
        <div class="block_with_avatar">
            <div class="avatar">
                <%if (profile.getAvatar() == null) {
                %>
                    <img src="/resources/images/camera_200.png" id="logo-img">
                <%} else {%>
                    <img src="<%=request.getContextPath()%>/ShowProfileAvatar?index=<%=profile.getId()%>">
                <%}%>
            </div>
            <%
                if (isMyPage) {
            %>
                <a href="#" class="button">Изменить изображение</a>
            <%
                }
            %>
        </div>
        <!-- Блок в котором размещается мнформация о заведении -->
        <div class="information_block">

            <div class="inf">
                <div class = "name">
                    <b><%=profile.getName()%></b>
                </div>

                <div class = "second_name">
                    <b><%=profile.getSurName()%></b>
                </div>

                <div class = "redact">
                    <a href="">Редактировать</a>
                </div>
            </div>

            <div class="inf">
                <div class = "status">
                    <%if (profile.getStatus()!=null){
                    %>
                    <%=profile.getStatus()%>
                    <%}%>
                </div>
            </div>

            <div class="inf">
                <%if (profile.getCity()!=null){%>
                    <div class = "city">
                        <b>Город:</b>
                    </div>

                    <div class = "detail_city">
                        <b><%=profile.getCity()%></b>
                    </div>
                <%}%>
            </div>

            <div class="inf">
                <%if (profile.getRegion()!=null){%>
                    <div class = "region">
                        <b>Район:</b>
                    </div>

                    <div class = "detail_region">
                        <b>
                            <%=profile.getRegion()%>
                        </b>
                    </div>
                <%}%>
            </div>

            <div class="inf">
                <%if (profile.getRelationshipStatus()!=null){%>
                    <div class = "sp">
                        <b>Семейное положение:</b>
                    </div>

                    <div class = "detail_sp">
                        <b>
                            <%=profile.getRelationshipStatus()%>
                        </b>
                    </div>
                <%}%>
            </div>

            <div class="inf">
                <%if (profile.getPhoneNumber()!=null){%>
                    <div class = "contacts">
                        <b>Контакты:</b>
                    </div>

                    <div class = "detail_contacts">
                        <b>
                            <%=profile.getPhoneNumber()%>
                        </b>
                    </div>
                <%}%>
            </div>

            <div class="inf">
                <%if (profile.getLinkVk()!=null){%>
                    <div class = "sait">
                        <b>Ссылка на социальную сеть:</b>
                    </div>

                    <div class = "detail_sait">
                            <a href="<%=profile.getLinkVk()%>" target="_blank"><%=profile.getLinkVk()%></a>
                    </div>
                <%}%>
            </div>

            <div class="inf">
                <%if (profile.getAboutMyself()!=null){%>
                    <div class = "about">
                        <b>О себе:</b>
                    </div>

                    <div class = "detail_about">
                        <b>
                            <%=profile.getAboutMyself()%>
                        </b>
                    </div>
                <%}%>
            </div>

        </div>
    </div>

    <div class="block_with_information2">
        <div class="friends">

            <div class="head_table">
                <b>Друзья</b>
                <input type="submit" value="" class="btn_search"/>
                <input type="text" placeholder="Поиск..." class="search_text" />
            </div>

            <div class="friends_list">
                <%if (myProfile != null){
                    Profile friendProfile = new Profile();
                    FriendDao friendDao = new FriendDao();
                    for (Friend friend : friendDao.getAllFriend()) {
                        if (friend.getIdFriend().equals(profile.getId())) {
                            friendProfile = friend.getProfile();
                        } else if(friend.getProfile().getId().equals(profile.getId())){
                            friendProfile = profileDao.getById(friend.getIdFriend());
                        } else continue;
                %>
                                <div class="friend_card">

                                    <div class="block_with_friend_avatar">
                                        <div class="friend_avatar">
                                            <a href="user?id=<%=friendProfile.getId()%>">
                                                <%if (friendProfile.getAvatar() == null) {
                                                %>
                                                    <img src="/resources/images/camera_200.png" alt="">
                                                <%} else {%>
                                                    <img src="<%=request.getContextPath()%>/ShowProfileAvatar?index=<%=friendProfile.getId()%>" alt="">
                                                <%}%>
                                            </a>
                                        </div>
                                    </div>

                                    <div class="friend_information">

                                        <a href="user?id=<%=friendProfile.getId()%>"><%=friendProfile.getName()%> <%=friendProfile.getSurName()%></a>

                                    </div>

                                    <div class="delete_btn">

                                        <a href="#win1" class="button"><img src="ic_delete_black_24dp_1x.png" alt="удалить"></a>
                                        <a href="#x" class="overlay" id="win1"></a>
                                        <div class="popup">
                                            <h3>Удаление из списка друзей</h3>
                                            <p>Вы точно хотите удалить этого пользователя из списка друзьей?</p>
                                            <br/>
                                            <div id="button">
                                                <input type="submit" class="choise" value="Да" />
                                                <input type="submit" class="choise" value="Нет" />
                                            </div>
                                            <a class="close" title="Закрыть" href="#close"></a>
                                        </div>
                                    </div>
                                </div>
                <%
                    }
                }
                %>



            </div>
        </div>

        <div class="visit">

            <div class="head_table">
                <b>Заведения</b>
            </div>

            <div class="visit_list">
                <div class="visit_card">

                    <div class="block_with_place_img">
                        <div class="place_img">
                            <img src="back.jpg">
                        </div>
                    </div>

                    <div class="visit_information">

                        <a href="">Название заведения</a>
                        <div class="visit_date">
                            Дата посещения
                        </div>

                        <div class="visit_time">
                            Время
                        </div>
                    </div>

                    <div class="delete_btn">

                        <a href="#win2" class="button"><img src="ic_delete_black_24dp_1x.png" alt="удалить"></a>
                        <a href="#x" class="overlay" id="win2"></a>
                        <div class="popup">
                            <h3>Отмена посещения</h3>
                            <p>Вы точно хотите отменить посежение этого заведения?</p>
                            <br/>
                            <div id="button">
                                <input type="submit" class="choise" value="Да" />
                                <input type="submit" class="choise" value="Нет" />
                            </div>
                            <a class="close" title="Закрыть" href="#close"></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>



</body>
</html>
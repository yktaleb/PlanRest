<%@ page import="com.planrest.util.RegionList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/edit_profile_style.css" />" rel="stylesheet" type="text/css">
    <title>Редактирование информации</title>
</head>
<body>

<!-- Меню -->
<%@include file="jspf/top_menu.jspf" %>

<form method="post"  action="/edit_profile_check" acceptCharset="UTF-8">
    <div id="main-block">
        <input type="hidden" name="myId" value="<%=myProfile.getId()%>">
        <p><h3>Информация о себе:</h3></p>
        <ol>
            <li><p>Текстовая информация:</p>
                <label for="name" >Имя:</label>
                <input type="text" name="name" id="name" value="<%=myProfile.getName()%>"/>
                <br/><br/>
                <label for="second_name" >Фамилия:</label>
                <input type="text" name="surName" id="second_name" value="<%=myProfile.getSurName()%>"/>
                <br/><br/>
                <label for="status" >Статус:</label>
                    <%if (myProfile.getStatus()!=null) {%>
                        <input type="text" id="status" name="status" value="<%=myProfile.getStatus()%>"/>
                    <%
                    } else {%>
                        <input type="text" id="status" name="status" value=""/>
                    <%
                    }%>
                <br/><br/>
                <label for="city" >Город:</label>
                    <%if (myProfile.getCity()!=null) {%>
                        <input type="text" id="city" name="city" value="<%=myProfile.getCity()%>"/>
                    <%
                    } else {%>
                        <input type="text" id="city" name="city" value="" />
                    <%
                    }%>
                <br/><br/>
                <label for="region" >Район:</label>
                <select size="1" name="region">
                    <option disabled selected="">Выберите ройон</option>
                    <option name="region" value="Голосеевский">Голосеевский</option>
                    <option name="region" value="Дарницкий">Дарницкий</option>
                    <option name="region" value="Деснянский">Деснянский</option>
                    <option name="region" value="Днепровский">Днепровский</option>
                    <option name="region" value="Оболонский">Оболонский</option>
                    <option name="region" value="Печерский">Печерский</option>
                    <option name="region" value="Подольский">Подольский</option>
                    <option name="region" value="Святошинский">Святошинский</option>
                    <option name="region" value="Соломенский">Соломенский</option>
                    <option name="region" value="Шевченковский">Шевченковский</option>
                </select>
                <br/><br/>
                <label for="sp" >Семейное положение:</label>
                <select size="1" name="sp">
                    <option disabled selected="">Выберите семейное положение</option>
                    <option name="relationship" value="Не женат(а)">Не женат(а)</option>
                    <option name="relationship" value="Встречается">Встречается</option>
                    <option name="relationship" value="Помолвлен(а)">Помолвлен(а)</option>
                    <option name="relationship" value="Женат(а)">Женат(а)</option>
                    <option name="relationship" value="Влюблен(а)">Влюблен(а)</option>
                    <option name="relationship" value="Все сложно">Все сложно</option>
                    <option name="relationship" value="В активном поиске">В активном поиске</option>
                </select>
                <br/><br/>
                <label for="tel" >Контакты:</label>
                    <%if (myProfile.getPhoneNumber()!=null) {%>
                        <input type="text" name="phoneNumber" id="tel" value="<%=myProfile.getPhoneNumber()%>"/>
                    <%
                    } else {%>
                        <input type="text" name="phoneNumber" id="tel" />
                    <%
                    }%>
                <br/><br/>
                <label for="sait" >Ccылка вк:</label>
                    <%if (myProfile.getLinkVk()!=null) {%>
                        <input type="text" name="linkVk" id="sait" value="<%=myProfile.getLinkVk()%>"/>
                    <%
                    } else {%>
                        <input type="text" name="linkVk" id="sait" />
                    <%
                    }%>
                <br/><br/>
                <label for="about" >О себе:</label>
                    <%if (myProfile.getAboutMyself()!=null) {%>
                        <textarea name="text_about" id="about" cols="100" rows="15" wrap="soft"><%=myProfile.getAboutMyself()%></textarea>
                    <%
                    } else {%>
                        <textarea name="text_about" id="about" cols="100" rows="15" wrap="soft" ></textarea>
                    <%
                    }%>

            <li><p>После проверки всей информации нажмите кнопку готово:</p>
                <input type="submit" value="Готово" class="new_inf"/>
            </li>
        </ol>
    </div>
</form>

</body>
</html>

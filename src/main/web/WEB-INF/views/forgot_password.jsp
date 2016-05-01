<%@ page import="com.planrest.dao.impl.ProfileDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/style_forgot_password.css" />" rel="stylesheet" type="text/css">
    <title>Change password</title>

</head>
<body>

    <form name="forgot_password" method="POST" action="change_password">
        <div id="authorization">
            <p class="loginAndPassword">Email</p>
            <input type="Text" id="login" class="inputText" name="username"/>
            <p class="loginAndPassword">New password</p>
            <input type="Password" id="password" class="inputText" name="password"/>
            <p class="loginAndPassword">Repeat new password</p>
            <input type="Password" id="repeat_password" class="inputText" name="repeat_password"/>
            <br/> <br/>
            <input type="submit" value="Change password" class="btnLog" >
            <%
                if (!ProfileDao.getIsThere()){
            %>
            <center><p style="color: #a3000b;">This e-mail address is not found</p></center>
            <%
                }
                ProfileDao.setIsThere(false);
            %>
        </div>

    </form>

</body>
</html>

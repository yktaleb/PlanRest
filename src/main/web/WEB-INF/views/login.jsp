<%--
  Created by IntelliJ IDEA.
  User: yarik
  Date: 25.03.2016
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/style_login.css" />" rel="stylesheet" type="text/css">
    <title>Авторизация</title>

</head>
<body>

    <form name="form_login" action="j_spring_security_check" method="POST">
        <div id="authorization">
            <p class="loginAndPassword">Login</p>
            <input type="Text" id="login" class="inputText" name="email"/>
            <p class="loginAndPassword">Password</p>
            <input type="Password" id="password" class="inputText" name="password"/>
            <br/> <br/>
            <input type="submit" value="Войти" id="btnLog" >
            <input type="submit" value="Регистрация" id="btnReg">
            <input type="checkbox" name="_spring_security_remember_me" value="Remember me"/>
            <br/>
            <a href="#" id="help">Забыли пороль?</a>
            <br/>
            <p>Неверный логин или пароль</p>
        </div>

    </form>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    <link href="<c:url value="/resources/css/login_and_password/style_login.css" />" rel="stylesheet" type="text/css">
    <title>Авторизация</title>

</head>
<body>

<form name="form_login" action="j_spring_security_check" method="POST">
    <div id="authorization">
        <p class="loginAndPassword">Email</p>
        <input type="Text" id="login" class="inputText" name="username"/>
        <p class="loginAndPassword">Password</p>
        <input type="Password" id="password" class="inputText" name="password"/>
        <br/> <br/>
        <input type="submit" value="Login" id="btnLog" >
        <br/>
        <input type="checkbox" name="_spring_security_remember_me">Remember me</input>
        <br/>
        <br/>
        <a href="forgot_password" id="help">Forgot password?</a>
        <a href="registration" id="registration">Sign up now!</a>
        <br/>
        <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
            <p class="error">Invalid email or password</p>
        </c:if>
    </div>

</form>

</body>
</html>

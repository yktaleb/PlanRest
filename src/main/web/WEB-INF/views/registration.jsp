<%--
  Created by IntelliJ IDEA.
  User: yarik
  Date: 25.03.2016
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link href="<c:url value="/resources/css/style_registration.css" />" rel="stylesheet" type="text/css">
</head>

<body>

<div id="authorization">
    <p class="loginAndPassword">Name</p>
    <input type="Text" class="inputText">
    <p class="loginAndPassword">Second name</p>
    <input type="Text" class="inputText">
    <p class="loginAndPassword">Email</p>
    <input type="Text" class="inputText">
    <p class="loginAndPassword">Password</p>
    <input type="Password" class="inputText">
    <p class="loginAndPassword">Repeat password</p>
    <input type="Password" class="inputText">
    <p id="loginAndPassword">Choose please sex</p>
    <label for="man" class="radio">man:</label> <input type="radio" id="man"/>
    <label for="woman" class="radio">woman:</label> <input type="radio" id="woman"/>
    <br> <br>
    <center><input type="submit" value="Registration" class="btnLog"></center>
</div>

</body>

</html>
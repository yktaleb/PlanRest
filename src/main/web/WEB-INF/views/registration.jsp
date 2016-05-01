<%@ page import="com.planrest.dao.impl.ProfileDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link href="<c:url value="/resources/css/style_registration.css" />" rel="stylesheet" type="text/css">
</head>

<body>
    <form:form method="POST" commandName="profile" action="check_user" >

        <div id="authorization">
            <p class="loginAndPassword">Name</p>
            <form:input path="name" type="Text" class="inputText"/>
            <p class="loginAndPassword">Second name</p>
            <form:input path="surName" type="Text" class="inputText"/>
            <p class="loginAndPassword">Email</p>
            <form:input path="email" type="Text" class="inputText"/>
            <p class="loginAndPassword">Password</p>
            <form:input path="password" type="Password" class="inputText"/>
            <p class="loginAndPassword">Repeat password</p>
            <input type="Password" class="inputText">
            <p id="loginAndPassword">Choose please sex</p>
            <form:radiobutton path="sex" class="radio" value="man" label="man" />
            <form:radiobutton path="sex" class="radio" value="woman" label="woman" />
            <br>
            <br>
            <center><input type="submit" value="Registration" class="btnLog"></center>
            <%
                if (ProfileDao.getIsThere()){
            %>
                    <center><p style="color: #a3000b;">This e-mail address already exists</p></center>
            <%
                }
                ProfileDao.setIsThere(false);
            %>
        </div>

    </form:form>

</body>

</html>
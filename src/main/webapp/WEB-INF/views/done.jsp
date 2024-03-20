<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>registeration done!</h1>
<%-- 
<h2>welcome : ${name }</h2>
<h2>your email address : ${email }</h2>
<h2>your password : ${password }</h2> 
--%>
<h2>welcome : ${user.name }</h2>
<h2>your email address : ${user.email }</h2>
<h2>your password : ${user.password }</h2> 

</body>
</html>
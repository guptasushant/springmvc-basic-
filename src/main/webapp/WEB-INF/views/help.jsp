<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String name =(String)request.getAttribute("key");
Integer id=(Integer)request.getAttribute("key2");
%>
<h1>this is help page </h1>
<h1>name and id is 
<%= name+" "+id %>
</h1>
</body>
</html>
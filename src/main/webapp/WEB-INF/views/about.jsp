<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is the about page ${name }</h1>
	<c:forEach var="item" items="${friends}">
	<h1>${item }</h1>
<%-- 	<c:out value="${item }"></c:out> --%>
	</c:forEach>
</body>
</html>
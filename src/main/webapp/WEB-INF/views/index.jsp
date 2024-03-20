<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is home page</h1>
	<%
	String name = (String) request.getAttribute("key");
	Integer id=(Integer)request.getAttribute("id");
	List<String> list = (List<String>) request.getAttribute("list");
	%>
	<h1>
		Name is:
		<%=name%></h1>
	<h1>
		ID is:
		<%=id%></h1>
	<%
	for (String s : list) {// out.println(s);
	%>
	<h1><%=s%></h1>
	<%
	}
	%>
</body>
</html>
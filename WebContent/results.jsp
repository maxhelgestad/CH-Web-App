<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page language="java" import="graph.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Path Results</title>
</head>
	<body>
		<h2>Path from USA to Destination</h2>
		<%LinkedList<Integer> path = (LinkedList<Integer>)session.getAttribute("path");%>
		<ol type="1">
		<%for (int i = path.size() - 1; i >= 0; i--) { %>
			<li><%= NorthAmericaGraph.COUNTRIES[path.get(i)] %></li>
		<%}%>
		</ol>
		<a href="index.jsp">Back to Menu</a>
	</body>
</html>
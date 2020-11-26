<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page language="java" import="graph.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Finding Path to Destination from USA</title>
</head>
<body>
  	<h2>Input Destination Country Below</h2>
    <form method="post" action="printAction.jsp">
  	<label for="dest">Destination:</label><br>
  	<input type="text" id="dest" name="dest"><br>
  	<input type="submit" value="Submit">
	</form>
	<%String res = request.getParameter("res");
	if (res != null){%>
		<p> The input does not match a possible destination country </p>
	<%}%>
</body>
</html>
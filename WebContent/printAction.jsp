<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page language="java" import="graph.*" %>
<%@page import="java.util.*" %>
<%
//get input country parameter
String c = request.getParameter("dest");

//Check if input is valid (exists in North America)
boolean exists = false;
for (int i = 0; i < 10; i++){
	if (NorthAmericaGraph.COUNTRIES[i].equals(c)){
		exists = true;
	}
}

//If it doesn't exist, send error code and go back to index
if (exists == false){
	response.sendRedirect("index.jsp?res=invalid");
}
//If it does, compute path and show results
else {
	NorthAmericaGraph map = new NorthAmericaGraph();
	int dest = Arrays.asList(NorthAmericaGraph.COUNTRIES).indexOf(c);
	ArrayList<ArrayList<Integer>> adj = map.getList();
	LinkedList<Integer> path = GraphController.printShortestPath(adj, 1, dest, 10);
	session.setAttribute("path", path);
	response.sendRedirect("results.jsp");
}
%>
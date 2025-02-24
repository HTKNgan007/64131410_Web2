<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP Example</title>
</head>
<body>
<center>
<h1> Hello JSP</h1>
<%= new Date().toString() %>
<%= "<br><b>Hôm nay tôi học JSP</b>" %>
<%
int x = 5;
int y = (int) Math.pow(x + 40, 2);
%>
<br>
<%= y %>
<hr>
<% out.print(y); %>
</center>
</body>
</html>
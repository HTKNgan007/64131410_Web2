<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    // Lấy dữ liệu từ form
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Kiểm tra thông tin đăng nhập
    if ("ABC".equals(username) && "MNK".equals(password)) {
        response.sendRedirect("UserProfile.htm");
    } else {
        response.sendRedirect("Login.htm");
    }
%>

</body>
</html>
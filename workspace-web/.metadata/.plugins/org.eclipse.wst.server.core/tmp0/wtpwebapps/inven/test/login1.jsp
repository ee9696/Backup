<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="inven.bean.InvenDTO" %>
<%@ page import="inven.dao.InvenDAO" %>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

InvenDAO invenDAO = InvenDAO.getInstance();
String name = invenDAO.login(id, pwd);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(name == null) { %>
	<%out.write("로그인 실패"); %>
<%}else { %>
	<%out.write("로그인 성공"); %>
<%} %>
<br>
<p><a href="main.jsp">main</a> &nbsp; <a href="write.jsp">회원가입</a></p> 
</body>
</html>
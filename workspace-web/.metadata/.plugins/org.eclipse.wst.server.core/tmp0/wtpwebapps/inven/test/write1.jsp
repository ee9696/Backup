<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="inven.bean.InvenDTO" %>
<%@ page import="inven.dao.InvenDAO" %>

<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name");
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String email1 = request.getParameter("email1");
String email2 = request.getParameter("email2");

InvenDTO invenDTO = new InvenDTO();
invenDTO.setName(name);
invenDTO.setId(id);
invenDTO.setPwd(pwd);
invenDTO.setEmail1(email1);
invenDTO.setEmail2(email2);

InvenDAO invenDAO = InvenDAO.getInstance();
invenDAO.write(invenDTO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>회원가입 성공!</h3>
<br>
<p><a href="main.jsp">main</a> &nbsp; <a href="login.jsp">로그인</a></p> 
</body>
</html>
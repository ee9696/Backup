<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.bean.BoardDTO" %>
<%@ page import="board.dao.BoardDAO" %>

<%
//데이터
request.setCharacterEncoding("UTF-8");

String subject = request.getParameter("subject");
String content = request.getParameter("content");

BoardDTO boardDTO = new BoardDTO();
boardDTO.setId("steam0410");
boardDTO.setName("권영민");
boardDTO.setEmail("steam0410@naver.com");
boardDTO.setSubject(subject);
boardDTO.setContent(content);

//DB
BoardDAO boardDAO = BoardDAO.getInstance();
boardDAO.boardWrite(boardDTO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>글쓰기 성공!</h3>
<br>
<input type="button" value="글목록" id="boardListBtn" onclick="location.href='boardWriteList.jsp?pg=1'">
</body>
</html>
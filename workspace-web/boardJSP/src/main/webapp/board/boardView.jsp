<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.dao.BoardDAO" %>
<%@ page import="board.bean.BoardDTO" %>
<%@ page import="java.io.PrintWriter" %>
<%
int seq = 0;
int pg = 0;
if(request.getParameter("seq") != null) {
	seq = Integer.parseInt(request.getParameter("seq"));
	pg = Integer.parseInt(request.getParameter("pg"));
}

BoardDTO boardDTO = new BoardDAO().getboardview(seq);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
border-collapse:collapse;
border-bottom:1px solid black;
}
tr {
border-top:1px solid black;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td colspan="3" align="center"><%=boardDTO.getSubject() %></td>
		</tr>
		
		<tr>
			<td>글번호 : <%=boardDTO.getSeq() %></td>
			<td>작성자 : <%=boardDTO.getId() %></td>
			<td>조회수 : <%=boardDTO.getHit() %></td>
		</tr>
		
		<tr>
			<td colspan="3" align="center" style="word-break:break-all">
				<textarea name="content" id="content" cols="50" rows="15" style="border:none" readonly><%=boardDTO.getContent() %></textarea>
				<div id="contentDiv"></div>
			</td>
		</tr>
	</table>
	<br>
	<input type="button" value="글목록" width="450" onclick="location.href='boardWriteList.jsp?pg=<%=pg%>'">
</body>
</html>
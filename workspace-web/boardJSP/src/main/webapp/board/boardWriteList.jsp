<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.dao.BoardDAO" %>
<%@ page import="board.bean.BoardDTO" %>
<%@ page import="java.util.List" %>

<%
//데이터
int pg = Integer.parseInt(request.getParameter("pg"));

//DB
//페이징처리 -1페이지당 5개씩
int endNum = pg*5;
int startNum = endNum-4;

BoardDAO boardDAO = BoardDAO.getInstance();
List<BoardDTO> list = boardDAO.getBoardWriteList(startNum, endNum);

int totalA = boardDAO.getTotalA();
int totalP = (totalA+4)/5;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse:collapse;
}
tr {
	border-top:1px dashed black;
}
#currentPageing{
	color:red;
	text-decoration:underline;
}
#paging{
	color:black;
	text-decoration:none;
}
#subjectA :hover {
	color:green; text-decoration:underline;
}
#subjectA :link {
	color:black; text-decoration:none;
}
#subjectA :visited {
	color:black; text-decoration:none;
}
#subjectA :active {
	color:black; text-decoration:none;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th width="50">글번호</th>
			<th width="400">제목</th>
			<th width="50">작성자</th>
			<th width="50">조회수</th>
			<th width="50">작성일</th>
		</tr>
		
		<%if(list != null) { %>
			<%for(BoardDTO boardDTO : list) { %>
			<%int seq = boardDTO.getSeq(); %>	
		<tr>
			<td width="50" align="center"><%=boardDTO.getSeq() %></td>
			<td><a id="subjectA"href="boardView.jsp?seq=<%=seq%>&pg=<%=pg%>"><%=boardDTO.getSubject() %></a></td>
			<td width="50" align="center"><%=boardDTO.getId() %></td>
			<td width="50" align="center"><%=boardDTO.getHit() %></td>
			<td width="50" align="center"><%=boardDTO.getLogtime() %>	
		</tr>
		
			<%}//for %>
	</table>
	
	<div style="width:600px; text-align:center;">
	<%for(int i=1; i<=totalP; i++) { %>
		<%if(i==pg){ // 현재 페이지%>
			[<a href="boardWriteList.jsp?pg=<%=i %> " id = "currentPageing"><%= i %></a>]
		<%} else { %>
			[<a href="boardWriteList.jsp?pg=<%=i %> " id = "paging"><%= i %></a>]
		<%} %>
	<%} %>
	</div>
<%} %>
	<div style="width:650px; "align="right">
		<input type="button" value="글작성" onclick="location.href='boardWriteForm.jsp'">
	</div>
</body>
</html>
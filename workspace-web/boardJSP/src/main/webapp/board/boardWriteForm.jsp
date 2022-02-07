<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse:collapse;
}
div {
	color:red;
	font-size:8pt;
	font-weight:bold;
}
</style>
</head>
<body>
<h2>글쓰기</h2>
<form name="boardWriteForm" method="post" action="boardWrite.jsp">
	<table border="1">
		<tr>
			<td width="100" align="center">제목</td>
			<td>
				<input type="text" name="subject" id="subject" size="50">
				<div id="subjectDiv"></div>
			</td>
		</tr>
		
		<tr>
			<td width="100" align="center">내용</td>
			<td>
				<textarea name="content" id="content" cols="50" rows="15"></textarea>
				<div id="contentDiv"></div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"> 
				<input type="button" value="글쓰기" id="boardWriteBtn" onclick="checkboardWriteForm()">
				<input type="reset" value="다시작성">
				<input type="button" value="글목록" onclick="location.href='boardWriteList.jsp?pg=1'">
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript" src="../js/board.js"></script>
</body>
</html>
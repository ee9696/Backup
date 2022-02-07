<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
<form id="writeForm">

<img alt="망상토끼" src="../image/망상토끼.png" width="70" height="70" 
style="cursor: pointer;" onclick="location.href='../index.jsp'">
<table cellpadding="5" cellspacing="0">
	<tr>
		<td>이름</td>
        <td>
           <input type="text" name="name" id="name">
           <div id="nameDiv"></div>
        </td>
	</tr>
	
		<tr>
		<td>아이디</td>
        <td>
           <input type="text" name="id" id="id">
           <div id="idDiv"></div>
        </td>
	</tr>
	
		<tr>
		<td>비밀번호</td>
        <td>
           <input type="password" name="pwd" id="pwd">
           <div id="pwdDiv"></div>
        </td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
			<input type="button" value="회원가입" id="writeBtn" />
            <input type="reset" value="다시작성"/>
		</td>
	</tr>
</table>
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/chapter06_SpringWebMaven/js/user.js"></script>
</body>
</html>











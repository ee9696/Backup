<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
#guestbookWriteForm div {
	color: red;
	font-size: 8pt;
	font-weight: bold;
}

table {
	border-collapse: collapse;
}
</style>

<h2>방명록 작성</h2>
<form id="guestbookWriteForm">
	<table border="1">
		<tr>
			<td width="100" align="center">작성자</td>
			<td id="name">
				${sessionScope.memName }
			</td>
		</tr>
		
		<tr>
			<td width="100" align="center">이메일</td>
			<td id="email">
				${sessionScope.memEmail }
			</td>
		</tr>
		
		<tr>
			<td width="100" align="center">제목</td>
			<td>
				<input type="text" name="subject" id="subject" size="50">
				<div id= "subjectDiv"></div>
			</td>
		</tr>
		
		<tr>
			<td width="100" align="center">내용</td>
			<td>
				<textarea name="content" id="content" cols="50" rows="15"></textarea>
				<div id= "contentDiv"></div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" id="guestbookWriteBtn" value="글작성">
				<input type="reset" value="다시작성">
				<input type="button" value="글목록" 
				onclick="location.href='/MQBProject/guestbook/guestbookList.do?pg=${pq}'">
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#guestbookWriteBtn').click(function(){
		//초기화 과정
		$('#subjectDiv').empty();
		$('#contentDiv').empty();
		
		if($('#subject').val() == '') {
			$('#subjectDiv').html('제목 입력'); 
			$('#subject').focus();
		}
		else if($('#content').val() == ''){
			$('#contentDiv').html('내용 입력');
			$('#content').focus();
		}
		else 
			$.ajax({
				url: '/MQBProject/guestbook/guestbookWrite.do',
				type: 'post',
				data: $('#guestbookWriteForm').serialize(),
				success: function(){
					alert("방명록 작성 성공");
					location.href="/MQBProject/guestbook/guestbookList.do?pg=1";
				},
				error: function(err){
					console.log(err);
				}
			});
	});
});
</script>
















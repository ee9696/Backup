<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정할 아이디 입력 : <input type="text" id="searchId">
<input type="button" id="searchBtn" value="검색">
<br><br>
<div id="resultDiv"></div>
<br><br>

<div id="modifyFormDiv">
	<form id="modifyForm">
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
		           <input type="text" name="id" id="id" readonly>
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
					<input type="button" value="회원정보수정" id="modifyBtn" />
		            <input type="reset" value="다시작성" id="resetBtn" />
				</td>
			</tr>
		</table>
	</form>
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#modifyFormDiv').hide();
	
	$('#searchBtn').click(function(){
		$('#resultDiv').empty();
		
		$.ajax({
			url: '/chapter06_SpringWebMaven/user/getUser',
			type: 'post',
			data: {'searchId': $('#searchId').val()},
			//dataType: 'json',
			//서버에서 받아올 데이터는 TEXT, HTML, XML, JSON 형식을 지정할 수 있다.
			//생략하면 요청한 자료에 맞게 자동으로 형식이 설정된다.
			success: function(data) {
				alert(JSON.stringify(data));
				
				if(data == ''){
					$('#resultDiv').text('찾고자 하는 아이디가 없습니다');
					$('#resultDiv').css('color', 'red');
					$('#resultDiv').css('font-weight', 'bold');
				
				}else{
					$('#modifyFormDiv').show();
					
					$('#name').val(data.name);
					$('#id').val(data.id);
					$('#pwd').val(data.pwd);
				}
			},
			error: function(err){
				console.log(err);
			}
		});
	});
	
	//다시작성 버튼
	$('#resetBtn').click(function(){
		$('#searchBtn').trigger('click');//강제로 이벤트 호출
	});
	
	$('#modifyBtn').click(function(){
		$.ajax({
			url: '/chapter06_SpringWebMaven/user/modify',
			type: 'post',
			data: $('#modifyForm').serialize(),
			success: function() {
				alert('회원 정보 수정 완료');
				location.href='/chapter06_SpringWebMaven/user/list';
			},
			error: function(err){
				console.log(err);
			}
		});
	});
});
</script>




</body>
</html>










<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style type="text/css">
img {
	width: 70px;
	height: 70px;
	cursor: pointer;
}
</style>

${sessionScope.memName }님 로그인
<br><br>

<input type="button" value="로그아웃" id="logoutBtn">
<input type="button" value="회원정보수정" onclick="location.href='/MQBProject/member/modifyForm.do'">

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$('#logoutBtn').click(function(){
	$.ajax({
		url: '/MQBProject/member/logout.do',
		type: 'post',
		success: function(){
			alert('로그아웃');
			location.href="/MQBProject/index.jsp";
		},
		error: function(err){
			console.log(err);	
		}
	});
});


//회원가입 유효성 검사
$('#memberWriteForm #memberWriteBtn').click(function(){
	
//	$('#idDiv').empty();
//	$('#pwdDiv').empty();
//	$('#pwdReDiv').empty();
//	$('#nameDiv').empty();
//	$('#nickNameDiv').empty();
	$('#emailDiv').empty();
//	$('#athDiv').empty();
	
	
	var nameForm = /^[가-힣]{2,4}$/;
	var nicknameForm = /^[\w\Wㄱ-ㅎㅏ-ㅣ가-힣]{2,20}$/;
	var telForm = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;
	var pwdForm = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/; //정규표현식
	
		
	var name = $('#memberWriteForm #memberWriteName').val();	
	var nickname = $('#memberWriteForm #memberWriteNick').val();
	var tel1 = $('#memberWriteForm #writeTel1').val();
	var tel2 = $('#memberWriteForm #writeTel2').val();
	var tel3 = $('#memberWriteForm #writeTel3').val();
	var tel = tel1 + "-" +  tel2 + "-" + tel3;
	var pwd = $('#memberWriteForm #memberWritePwd').val();
	
	if($('#memberWriteForm #memberWriteId').val() == ''){
		$('#memberWriteForm #emailDiv').html('아이디 입력');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWriteId').focus();
	}else if($('#memberWriteForm #memberWritePwd').val() == ''){
		$('#memberWriteForm #emailDiv').html('비밀번호 입력');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWritePwd').focus();
	}else if(!pwdForm.test(pwd)){
		$('#memberWriteForm #emailDiv').html('잘못된 비밀번호 형식입니다.');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWritePwd').focus();
	}else if($('#memberWriteForm #memberWritePwd').val() != $('#memberWriteRePwd').val()){
		$('#memberWriteForm #emailDiv').html('비밀번호 틀림');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWritePwd').focus();
	}else if($('#memberWriteForm #memberWriteName').val() == ''){
		$('#memberWriteForm #emailDiv').html('이름 입력');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWriteName').focus();
	}else if(!nameForm.test(name)){
		$('#memberWriteForm #emailDiv').html('잘못된 이름 형식입니다.');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWriteName').focus();
	}else if($('#memberWriteForm #memberWriteNick').val() == ''){
		$('#memberWriteForm #emailDiv').html('닉네임 입력');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWriteNick').focus();
	}else if(!nicknameForm.test(nickname)){
		$('#memberWriteForm #emailDiv').html('잘못된 닉네임 형식입니다.');
		$('#memberWriteForm #emailDiv').css('color','red');
		$('#memberWriteNick').focus();
	}else if(!telForm.test(tel)){
		$('#memberWriteForm #emailDiv').html('잘못된 번호 형식입니다.');
		$('#memberWriteForm #emailDiv').css('color','red');
	}else if($("#memberWriteForm #writeQuestion option").index( $("#memberWriteForm #writeQuestion option:selected") >= 1)){
		$('#writeAnwer').removeAttr('disabled');
		
	
	}else if($('#memberWriteForm #memberWriteEmail').val() == ''){
		$('#memberWriteForm #emailDiv').html('이메일을 입력해주세요');
		$('#memberWriteForm #emailDiv').css('color','red');
	}else if($('#memberWriteForm .gender').val() == ''){
		$('memberWriteForm #emailDiv').html('성별을 체크해주세요');
	
	}else if($('#memberWriteForm #memberWriteEmail1').val() == ''){
		$('#memberWriteForm #emailDiv').html('이메일을 입력해주세요');
		$('#memberWriteForm #emailDiv').css('color','red');
	}else if($('#memberWriteForm #athntNmbr').val() == ''){
		$('#memberWriteForm #emailDiv').html('이메일 인증 해주세요');
		$('#memberWriteForm #emailDiv').css('color','red');
	}else{
		

//		if($('#memberWriteForm #writeAnwer').val() == ''){
//		
//			$('#memberWriteForm #writeAnwer').val('false');
//			$('#memberWriteForm #writeQuestion').val('false').prop('selected',true);
//		}
//		 if($('#memberWriteForm #joinPath').val() == ''){
//			$('#memberWriteForm #joinPath').val('false');
/*		$.ajax({
			url: '/milkyWayForest/write/write',                url의 주소로 
			type:'post',
			data: $('#memberWriteForm').serialize(),
			success: function(){
				alert('회원 가입 등록');
				$('#memberWriteForm').submit();
			},
			error:function(err){
				console.log(err);
			}
		}); */
		
		$('#memberWriteForm').submit();
		}
	}
});
</script>
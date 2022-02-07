//회원가입
$('#writeBtn').click(function(){
	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	
	if($('#name').val() == '') 
		$('#nameDiv').html('이름 입력');
	else if($('#id').val() == '') 
		$('#idDiv').html('아이디 입력');
	else if($('#pwd').val() == '')
		$('#pwdDiv').html('비밀번호 입력');
	else
		//$('#writeForm').submit();
		
		$.ajax({
			url: '/chapter06_SpringWebMaven/user/write',
			type: 'post',
			data: $('#writeForm').serialize(),
			success: function(){
				alert('회원 가입 등록');
			},
			error: function(err){
				console.log(err);
			}
		});
});

//중복체크
$('#id').focusout(function(){
	$('#idDiv').empty();
	
	if($('#id').val() == '') 
		$('#idDiv').html('아이디 입력');
	else
		$.ajax({
			url: '/chapter06_SpringWebMaven/user/checkId',
			type: 'post',
			data: 'id=' + $('#id').val(),  // {'id' : $('#id').val()}
			dataType: 'text', //서버로 받을 타입  exist-사용불가능, non_exist-사용 가능
			success: function(data){
				if(data == 'exist'){
					$('#idDiv').text('사용 불가능');
				
				}else if(data == 'non_exist'){
					$('#idDiv').text('사용 가능');
				
				}
			},
			error: function(err){
				console.log(err);
			}
		});
});











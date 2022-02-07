$('#memberWriteForm #memberWriteId').focusout(function(){
	$('#memberWriteForm #emailDiv')empty();
	
	if($('#memberWriteForm #memberWriteId').val() == ''){
		$('#memberWriteForm #emailDiv').html('아이디를 입력하세요');
	}else{
		$.ajax({
			url: '/milkyWayForest/write/writeIdCheck',
			type:'post',
			data:'id='+$('#memberWriteForm #memberWriteId').val(),
			dataType:'text',
			success: function(data){
				data = data.trim();
				
				if(data == 'exist'){
					$('#memberWriteForm #emailDiv').html('사용 불가능');
				}else if(data == 'non_exist'){
					$('#memberWriteForm #emailDiv').html('사용 가능');
					$('#memberWriteForm #emailDiv').css('color','green');
					
					$('#checkId').val($('#memberWriteForm #memberWriteId').val());
				
				}
			},
			error: function(err){
				console.log(err);
			}
		});
	}
});
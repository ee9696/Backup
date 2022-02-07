<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>BLUEB</title>
</head>
<body>

<form name="form1">
<input type="checkbox" name="checkTmp" id="checkbox1" value="Y" /> checkbox1 
<input type="checkbox" name="checkTmp" id="checkbox2" value="Y" /> checkbox2 
<input type="checkbox" name="checkTmp" id="checkbox3" value="Y" /> checkbox3 

<input type="checkbox" id="checkAll"> 전체 선택 

<div> 
	<button type="button"id="next" disabled onclick="fnSubmit();">Next</button> 
</div>

</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
//전체 선택에 따른 하위 체크박스(checkTmp)의 활성/비활성화 여부
$('#checkAll').change(function(){
	var checked = $(this).prop('checked');
	$('input[name="checkTmp"]').prop('checked', checked);
});

$('input[name="checkTmp"]').change(function(){
	var tmpLength = $('input[name="checkTmp"]').length;
	var checkedLength = $('input[name="checkTmp"]:checked').length;
	var selectAll = (tmpLength == checkedLength);
	$('#checkAll').prop('checked', selectAll);
	selectAll ? $('#next').removeAttr('disabled'):$('#next').attr('disabled','disabled');
});
//전체선택 checkbox의 상태에 따라 id = next 값을 가진 버튼의 비활성화를 적용/해제
$('#checkAll').change(function(){
	//#checkAll의 값이 true 인 경우 $('#next').removeAttr('disabled');
	//#checkAll의 값이 false인 경우 $('#next').attr('disabled','disabled'); 이 적용됨
	$(this).prop('checked') ? $('#next').removeAttr('disabled'):$('#next').attr('disabled','disabled');
});

</script>
</body>
</html>


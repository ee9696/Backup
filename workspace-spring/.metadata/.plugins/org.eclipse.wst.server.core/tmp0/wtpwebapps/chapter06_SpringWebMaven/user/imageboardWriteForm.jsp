<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h3>이미지 등록</h3>

<!-- 1. 단순 submit ~ action -->
<%--
<form enctype="multipart/form-data" id="imageboardWriteForm" 
action="/chapter06_SpringWebMaven/user/imageboardWrite" method="post">    --%>
	
	<!-- 2. AJax -->
<form id="omageboardWriteForm">
	<table cellspacing="0" border="1" cellpadding="5">
	<tr>
		<td width="100" align="center">상품코드</td>
		<td>
			<input type="text" name="imageId" id="imageId" value="img_" size="40">
			<div id="imageIdDiv"></div>
		</td>
	</tr>	
	<tr>
		<td width="100" align="center">상품명</td>
		<td>
			<input type="text" name="imageName" id="imageName" size="40"></textarea>
			<div id="imageNameDiv"></div>
		</td>
	</tr>
	<tr>
		<td width="100" align="center">단가</td>
		<td>
			<input type="text" name="imagePrice" id="imagePrice" size="40"></textarea>
			<div id="imagePriceDiv"></div>
		</td>
	</tr>
	<tr>
		<td width="100" align="center">개수</td>
		<td>
			<input type="text" name="imageQty" id="imageQty" size="40"></textarea>
			<div id="imageQtyDiv"></div>
		</td>
	</tr>
	<tr>
		<td width="100" align="center">내용</td>
		<td>
			<textarea name="imageContent" id="imageContent" cols="40" rows="15"></textarea>
			<div id="imageContentDiv"></div>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="file" name="img">
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="file" name="img">
		</td>
	</tr>
	<!-- 	
	<tr>
	<td colspan="2">
		<input type="file" name="image1" id="image1" value="파일 선택">
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
		<input type="file" name="image2" id="image2" value="파일 선택">
		</td>
	</tr>
	 -->
	<tr>
		<td colspan="2" align="center">
			<input type="button" id="imageboardWriteBtn" value="이미지 등록">
			<input type="reset" value="다시작성">
		</td>
	</tr>
</table>
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$('#imageboardWriteBtn').click(function(){
		//1. 단순 submit
		//$('#imageboardWriteForm').submit();
		
		//2. AJax 통신
		var formData = new FormData($('#imageboardWriteForm')[0]); //form 안에 있는 모든 것
		$.ajax({
			url: '/chapter06_SpringWebMaven/user/imageboardWrite',
			type: 'post',
			enctype: 'multipart/form-data',
			processData: false,
			contentType: false,
			data: formData,
			success: function(){
				alert('이미지 등록 완료');
			},
			error: function(err){
				console.log(err)
			}
		});
	});
</script>
</body>
</html>

/*
processData
 - 기본값은 true
 - 기본적으로 Query String으로 변환해서 보내진다('변수=값&변수=값')
 - 파일 전송시에는 반드시 false로 해야 한다.(formData를 문자열로 변환하지 않는다)
 
contentType
  - 기본적으로 "application/x-www-form-urlencoded; charset=UTF-8"
  - 파일 전송시에는 'multipart/form-data'로 전송이 될 수 있도록 false로 설정한다
*/






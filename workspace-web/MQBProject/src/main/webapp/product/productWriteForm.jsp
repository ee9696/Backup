<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form id="productWriteForm" enctype="multipart/form-data" method="post" action="/MQBProject/product/productWrite.do">
	<table>
		<tr>
			<td width="100" align="center">상품 : </td>
			<td><input type="file" size="30" id="productImage" name="productImage">
			<div id="imageDiv"></div></td>
		<tr>
		
		<tr>
			<td width="100" align="center">상품명 : </td>
			<td><input type="text" size="8" id="productName" name="productName">
			<div id="nameDiv"></div></td>
		</tr>
	
		<tr>
			<td width="100" align="center">단가 : </td>
			<td><input type="text" size="5" id="productUnit" name="productUnit">
			<div id="unitDiv"></div></td>
		</tr>
		
		<tr>
			<td width="100" align="center">개수 : </td>
			<td><input type="text" size="5" id="productQty" name="productQty">
			<div id="qtyDiv"></div></td>
		</tr>
		
		<tr>
			<td width="100" align="center">할인율 : </td>
			<td><input type="text" size="5" id="productRate" name="productRate">%
			<div id="rateDiv"></div></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
			<input type="button" value="계산" id="productBtn">
			<input type="reset" value="취소">
			</td>
		</tr>	
	</table>
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

	$('#productBtn').click(function(){
		$('#productWriteForm').submit();
	});
/* $(function(){
	$('#productBtn').click(function(){
	
		//초기화 과정
		$('#imageDiv').empty();
		$('#nameDiv').empty();
		$('#unitDiv').empty();
		$('#qtyDiv').empty();
		$('#rateDiv').empty();
		
		if($('#productImage').val() == '') {
			$('#imageDiv').html('이미지를 넣어주세요'); 
			$('#productImage').focus();
		}
		else if($('#productName').val() == ''){
			$('#nameDiv').html('상품명을 입력해주세요.');
			$('#productName').focus();
		}
		else if($('#productUnit').val() == ''){
			$('#unitDiv').html('단가를 입력해주세요.');
			$('#productUnit').focus();
		}
		else if($('#productQty').val() == ''){
			$('#qtyDiv').html('수량을 입력해주세요.');
			$('#productQty').focus();
		}
		else if($('#productRate').val() == ''){
			$('#rateDiv').html('할인율을 입력해주세요.');
			$('#productRate').focus();
		}
		else 
			$.ajax({
				url: '/MQBProject/product/productWriteForm.do',
				type: 'post',
				data: $('#productWriteForm').serialize(),
				success: function(){
					alert("계산 성공");
					location.href="/MQBProject/product/productList.do?pg=1";
				},
				error: function(err){
					console.log(err);
				}
			});
	});
}); */
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table id="productListTable" border="1" cellspacing="0" cellpadding="5" frame="hsides" rules="rows">
	<tr>
		<th width="50">번호</th>
		<th width="50">이미지</th>
		<th width="50">상품명</th>
		<th width="50">단가</th>
		<th width="50">개수</th>
		<th width="50">합계</th>
		<th width="50">할인율</th>
		<th width="50">할인액</th>
		<th width="50">가격</th>
	</tr>
</table>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
		url:'/MQBProject/product/getProductList.do',
		type:'post',
		data:'pg=' + $('#pg').val(),
		dataType:'json',
		succes: function(data){
			console.log(data);
			
			$each(dadta.list, function(index, items){
				$('<tr>').append($('<td>',{
					align:'center',
					text:items.seq
				})).append($('<td>',{
					align:'center'
				}).append($('<img>',{
					src:'/MQBProject/storage/' + items.productImage,
					alt:items.productImage,
					style:'width: 70px; height: 70px; cursor:pointer;'
				}))).append($('<td/>',{
					align:'center',
					text:items.productName
				})).append($('<td/>',{
					align:'center',
					text:items.productUnit
				})).append($('<td/>',{
					align:'center',
					text:items.productQty
				})).append($('<td/>',{
					align:'center',
					text:items.productTotal
				})).append($('<td/>',{
					align:'center',
					text:items.productRate
				})).append($('<td/>',{
					align:'center',
					text:items.productDiscount
				})).append($('<td/>',{
					align:'center',
					text:items.productPrice
				})).appendTo($('#productListTable'));
			});
		},
		error:function(err){
			console.log(err);
		}
	});
});
</script>
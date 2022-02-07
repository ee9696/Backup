<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style type="text/css">
th {
	font-size: 16px;
}

td {
	font-size: 13px;
}

.subjectA:link { color: black; text-decoration: none; }
.subjectA:visited { color: black; text-decoration: none; }
.subjectA:hover { color: darkgreen; text-decoration: underline; }
.subjectA:active { color: black; text-decoration: none; }

#currentPaging {
	color: red;
	text-decoration: underline;
	cursor: pointer;
	border: 1px solid red;
}
#paging {
	color: black;
	text-decoration: none;
	cursor: pointer;
}

</style>
<form id="imageboardDeleteForm" method="get" action="/MQBProject/imageboard/imageboardDelete.do">

<input type="hidden" id="pg" style="margin-top:5px;" value="${requestScope.pg }">
<table id="imageboardListTable" border="1" cellspacing="0" cellpadding="5" frame="hsides" rules="rows">
	<tr>
		<th width="100"><input type="checkbox" id="all">글번호</th>
		<th width="100">이미지</th>
		<th width="200">상품명</th>
		<th width="150">단가</th>
		<th width="50">개수</th>
		<th width="150">합계</th>
	</tr>
</table>
<input type="button" id="choiceDeleteBtn" style="float:left;" value="선택삭제"> <!-- style="float: left;" -->

<div id="imageboardPagingDiv" style="display:inline-block; width:700px; text-align:center;"></div>
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
		url:'/MQBProject/imageboard/getImageboardList.do',
		type:'post',
		data:'pg=' + $('#pg').val(),
		dataType:'json',
		success: function(data) {
			console.log(data);
			
			$.each(data.list, function(index, items) {
				$('<tr>').append($('<td/>', {
					align:'center',
					text:items.seq
					
					}).prepend($('<input/>',{
						type:'checkbox',
						class:'check',
						name: 'check',
						value: items.seq
					}))
				).append($('<td/>',{
					align:'center',
					
				}).append($('<img/>',{
					src:'/MQBProject/storage/' + items.image1,
					alt: items.image1,
					style: 'width: 70px; height: 70px; cursor: pointer;'
					
				}))
				).append($('<td/>',{
					align:'center',
					text:items.imageName
					
				})).append($('<td/>',{
					align:'center',
					text:items.imagePrice.toLocaleString()
					
				})).append($('<td/>',{
					align:'center',
					text:items.imageQty.toLocaleString()
					
				})).append($('<td/>',{
					align:'center',
					text:(items.imagePrice*items.imageQty).toLocaleString()	
				})).appendTo($('#imageboardListTable'));
			}); //each
			
			//페이징 처리
			$('#imageboardPagingDiv').html(data.imageboardPaging);
		},
		error: function(err) {
			console.log(err);
		}
	});
});
</script>
<script type="text/javascript">
function imageboardPaging(param_pg) {
	location.href = '/MQBProject/imageboard/imageboardList.do?pg='+param_pg;
}


//전체 선택 전체 해제
$('#all').click(function(){
	if($('#all').prop("checked")) {
		$('.check').prop("checked", true);
	}else{
		$('.check').prop("checked", false);
	}
});

//선택 삭제
$('#choiceDeleteBtn').click(function(){
	var count = $('.check:checked').length;
	
	if(count==0)
		alert('삭제 할 항목을 선택하세요');
	else {
		if(confirm('정말로 삭제하시겠습니까?'))
			$('#imageboardDeleteForm').submit();
	}
})
</script>

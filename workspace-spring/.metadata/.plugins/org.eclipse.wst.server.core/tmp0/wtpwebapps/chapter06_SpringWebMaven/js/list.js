$(function(){
	$.ajax({
		url: '/chapter06_SpringWebMaven/user/getUserList',
		type: 'post',
		dataType: 'json',
		success: function(data) {
			console.log(JSON.stringify(data));
			
			$.each(data, function(index, items) {
				$('<tr/>').append($('<td/>', {
                    width: 100,
                    align: 'center',
                    text: items.name
                })).append($('<td/>', {
                    width: 100,
                    align: 'center',
                    text: items.id
                })).append($('<td/>', {
                    width: 100,
                    align: 'center',
                    text: items.pwd
                })).appendTo($('#table'))

            });
			
		},
		error: function(err){
			console.log(err);
		}		
	});
});

$(function(){
   $.ajax({
      url: '/MQBProject/guestbook/getGuestBookdList.do',
      type: 'post',
      data: 'pg='+$('#pg').val(),  // 보낼때 피쥐값을 가지고 가고 적으면 하나 많으면 5개 가지고 돌아온다. 
      dataType: 'json',  // 그리고 돌아오는 애는디티오의 여러개인 리스트인데 이게 리스트는 담아올수 없는 타입이니까 제이슨으로 바꿈 
      success: function(data){  //
         alert(JSON.stringify(data));
            
            $.each(data.list, function(index,items){
                $('<table>', { 
                  border: '1px soild black' ,
                
                  }).append($('<tr>')
                 .append($('<td>' ,{
                  text:'작성자', 
                  width: '100px'
               }))
                 
                 .append($('<td>' ,{
                  text: items.name,
                  width: '100px'
               }))   
                
                  .append($('<td>' ,{
                  text:'작성일', 
                  width: '100px'
               }))
               
               .append($('<td>',{
                  text: items.logtime,
                  width: '100px'
               })))
               
               .append($('<tr>')
               .append($('<td>',{
                  text:'이메일',
                  
               }))
               .append($('<td>', {
                  colspan: '3',
                  text: items.email
               })))
               
               
               .append($('<tr>')
               .append($('<td>',{
                     text: '제목'
                  }))
               .append($('<td>',{
                     colspan: '3',
                     text: items.subject
                  })))
               
               /*.append($('<tr>')
               .append($('<td>', {
                  colspan:'4',
                  height: '100px',
                  text: items.content
               })))*/
               .append($('<tr>')
               .append($('<td>' , {colspan:'4'}).append($('<pre>',{text: items.content}))))
               
               .appendTo($('#guestbookListForm'));
            
               
               
            });
      
       },


      error: function(err){
         console.log(err);
      }
   });
   
});   
/*
테이블 만들때 클래스 속성 준거 css에서 높이랑 이런거 설정할려고 햇었어가지고 
막 넣었던거라 클래스 없애도 되고 


*/

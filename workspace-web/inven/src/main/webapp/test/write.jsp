<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/style2.css">
    <script type="text/javascript" src="../js/js2.js"></script>
</head>
<body>
    <div id="container">
        <form name="writeForm" method="post" action="write1.jsp">
            <header>
                <h1>회원 가입</h1>
            </header>
            <div id="contents">
                <div>
                	<p>이름</p>
                    <input type="text" name="name" id="name" placeholder="이름" style="width:270px;height:30px;">
                    <div id="nameDiv"></div>
                </div>
                <br>
                <div>
                	<p>아이디</p>
                    <input type="text" name="id" id="id" placeholder="아이디" style="width:270px;height:30px;">
                    <div id="idDiv"></div>
                </div>
                <br>
                <div>
                	<p>비밀번호</p>
                    <input type="password" name="pwd" id="pwd" placeholder="비밀번호" style="width:270px;height:30px;">
                    <div id="pwdDiv"></div>    
                </div>
                <br>
                <div>
                    <input type="password" name="repwd" id="repwd" placeholder="한번 더 입력해 주세요." style="width:270px;height:30px;">
                    <div id="repwdDiv"></div>    
                </div>
                <br>
                <div>
                	<p>이메일</p>
                	<input type="text" name="email1" style="width:15; height:30px;">@
					<input type="text" name="email2" list="email2" placeholder="직접입력" style="height:30px;">
					<datalist id="email2"> 
						<option value="naver.com">naver.com
						<option value="daum.net">daum.net
						<option value="gmail.com">gmail.com
					</datalist>
                </div>
                <br>
                <br>
                <br>
                <div>
                    <input type="button" name="writeBtn" id="writeBtn" value="회원가입" onclick="checkWrite()">
                    <input type="reset" name="canBtn" id="canBtn" value="취소">
                </div>
                
            </div>  
            <footer>
        
            </footer>
        </form>
     </div> 
</body>
</html>
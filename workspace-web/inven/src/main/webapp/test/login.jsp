<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/style1.css">
    <script type="text/javascript" src="../js/inven1.js">

    </script>
</head>
<body>
    <div id="container">
        <form name="loginForm" method="post" action="login1.jsp">
            <header>
                <h1>Login</h1>
            </header>
            <div id="contents">
                <div>
                    <input type="text" name="id" id="id" placeholder="아이디" style="width:270px;height:30px;">
                    <div id="idDiv"></div>
                </div>
                <br>
                <div>
                    <input type="password" name="pwd" id="pwd" placeholder="비밀번호" style="width:270px;height:30px;">
                    <div id="pwdDiv"></div>    
                </div>
                <br>
                <br>
                <div>
                    <input type="button" name="loginBtn" id="loginBtn" value="로그인" onclick="goLogin()" style="width:270px;height:40px;">
                </div>
                <br>
                <p><a href="write.jsp">회원가입</a></p>
            </div>  
            <footer>
        
            </footer>
        </form>
     </div> 
</body>
</html>
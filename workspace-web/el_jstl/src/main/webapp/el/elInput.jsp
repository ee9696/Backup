<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="calcForm" method="get" action="elResult.jsp">
	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<td width="50" align="center">X</td>
			<td>
				<input type="text" name="x" id="x">
        	 	<div id="xDiv"></div>
        	</td>
     	</tr>
     
     	<tr>
			<td width="50" align="center">Y</td>
			<td>
				<input type="text" name="y" id="y">
       			<div id="yDiv"></div>
			</td>
		</tr>
     
     	<tr>
        	<td colspan="2" align="center">
           		<input type="submit" value="계산">
            	<input type="reset" value="취소">
         	</td>
      	</tr>
	</table>
</form>
</body>
</html>
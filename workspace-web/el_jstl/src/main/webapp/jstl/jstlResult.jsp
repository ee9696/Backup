<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<fmt:requestEncoding value="UTF-8" /> <!-- request.setCharecterEncoding("UTF-8") -->	
<style type="text/css">
body {
	color:${param.color};
}
</style>
</head>
<body>


<ul>
	<li>이 름 : ${param.name } </li><br>
	
	<li>나 이 : ${param.age }
		<c:if test="${param.age >= 20 }">
			<strong>성인</strong>
		</c:if>
		
		<c:if test="${param.age < 20 }">
			<strong>청소년</strong>
		</c:if>
	</li>
	<li>색 깔 : 
		<c:if test="${param.color == 'red' }"><strong>빨 강</strong></c:if>
		<c:if test="${param.color == 'green' }"><strong>초 록</strong></c:if>
		<c:if test="${param.color == 'blue' }"><strong>파 랑</strong></c:if>
		<c:if test="${param.color == 'violet' }"><strong>보 라</strong></c:if>
		<c:if test="${param.color == 'cyan' }"><strong>하 늘</strong></c:if>
	</li><br>
	
	<li>취 미 :
		${paramValues['hobby'][0] } <!-- paramValues.hobby[0] -->
		${paramValues['hobby'][1] }
		${paramValues['hobby'][2] }
		${paramValues['hobby'][3] }
		${paramValues['hobby'][4] }
	</li><br>
	
	<li>취 미 :
		<c:forEach var="data" items="${paramValues.hobby }" varStatus="i"><br>
			인덱스 = ${i.index } &emsp; 개수 = ${i.count }  &emsp; ${data } 
		</c:forEach>
	</li><br>
	
	
</ul>
</body>
</html>
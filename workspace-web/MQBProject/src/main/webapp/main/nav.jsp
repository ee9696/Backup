<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${sessionScope.memId == null }">
	<jsp:include page="../member/loginForm.jsp"/>
</c:if>
<c:if test="${memId != null }">
	<jsp:include page="../member/loginOk.jsp"/>
</c:if>
    
    
    
    
<!-- 
memId를 잡을 것이다.
만약 memId의 값이 존재하면 (로그인 했다) loginOk.jsp

만약 memId의 값이 존재하면 (로그인 안했다) loginForm.jsp

로그아웃을 시키면 alert("로그아웃"을 띄우고 index.jsp로 이동한다.
mvcmember 프로젝트를 참고하세요
 -->
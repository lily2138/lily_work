<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MemberVO vo = (MemberVO)session.getAttribute("vo");
	if(vo==null){		//로그인결과페이지부터 치고들어오는 사람때문에 이조건문을 달아놓는다.
%>
	<b><a href="login.html">로그인부터</a></b>
<%
	}else{
		session.invalidate();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function logoutpopup(){
		alert("Log OUT!!!!");
	}

</script>
</head>
<body onload="return logoutpopup()">
	<b>로그아웃 되셨습니다</b><br>
	<a href="index.html">Home....</a>
</body>
</html>
<%@page import="servlet.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	UserVO vo = (UserVO)session.getAttribute("vo");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b><%= vo.getId() %>님이 로그인하셨습니다.</b>
<br><br>
<a href="book.html">도서등록</a>
<a href="logout.jsp">로그아웃</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>vo정보 출력</h2><br>
아이디 : ${vo.id} <br>
이   름 : ${vo.name}<br>
주   소 : ${vo.address}<br>
${vo}<br>  <!-- toString -->

<hr>
<h2>list 정보 출력</h2><br>
아이디 : ${list[0].id} <br>
이   름 : ${list[0].name}<br>
주   소 : ${list[0].address}<br>
<br>
아이디 : ${list[1].id} <br>
이   름 : ${list[1].name}<br>
주   소 : ${list[1].address}<br>
<br>
</body>
</html>
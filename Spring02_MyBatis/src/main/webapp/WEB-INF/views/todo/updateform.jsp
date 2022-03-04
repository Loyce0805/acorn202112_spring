<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/todo/updateform.jsp</title>
</head>
<body>
<div class="container">
	<h1>회원정보 수정 폼</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${param.num }"/>
		<div>
			<label for="num">번호</label>
			<input type="text" name="num" id="num" value="${param.num }" disabled />
		</div>
		<div>
			<label for="content">할일</label>
			<input type="text" name="content" id="content" value="${param.content }" />
		</div>
		<div>
			<label for="regdate">날짜</label>
			<input type="text" name="regdate" id="regdate" value="${param.regdate }" />
		</div>
		
		<button type="submit">수정 확인</button>
		<button type="reset">취소</button>
	</form>
</div>
</body>
</html>
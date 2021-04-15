<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" modelAttribute="newMemo">
		<div>
			<label for="name">이름 : </label>
			<form:textarea id="memoContent" path="content" rows="3" cols="50" />
			<input type="submit" id="btnAdd" value="저장" />
		</div>
	</form:form>
</body>
</html>
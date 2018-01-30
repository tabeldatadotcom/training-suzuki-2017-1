<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Informasi dari form</title>
</head>
<body>

	<p>Halo ini dari method Post</p>
	<p>
		Nik : <c:out value="${outputNik}"></c:out> dan 
		Namanya : <c:out value="${outputNama}"></c:out> 
	</p>
	
</body>
</html>
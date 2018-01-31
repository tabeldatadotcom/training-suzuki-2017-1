<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src='<c:url value="/static/datatables/jQuery-3.2.1/jquery-3.2.1.min.js"></c:url>'></script>
<script type="text/javascript"
	src='<c:url value="/static/datatables/jQuery-3.2.1/jquery.serializejson.min.js"></c:url>'></script>
<script type="text/javascript"
	src='<c:url value="/static/datatables/datatables.min.js"></c:url>'></script>
<link rel="stylesheet"
	href='<c:url value="/static/bootstrap/css/bootstrap.min.css"></c:url>'>
<link rel="stylesheet"
	href='<c:url value="/static/datatables/DataTables-1.10.16/css/jquery.dataTables.min.css"></c:url>'>
<link rel="stylesheet"
	href='<c:url value="/static/datatables/DataTables-1.10.16/css/dataTables.bootstrap4.min.css"></c:url>'>
<script type="text/javascript" src='<c:url value="/app.js"></c:url>'></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Data Nasabah</title>
</head>
<body class="container">
	<h2>Form Data Nasabah</h2>

	<div class="row">
		<form id="form-register" class="container">
			<div class="form-group">
				<label for="cif">Usernmane</label> <input class="form-control"
					type="text" id="cif" required name="cif"
					placeholder="Input your CIF">
			</div>
			<div class="form-group">
				<label for="namaLengkap">Nama Lengkap</label> <input
					class="form-control" type="text" id="namaLengkap" required
					name="namaLengkap" placeholder="Input your fullname">
			</div>
			<div class="form-group">
				<label for="namaLengkap">Password</label> <input
					class="form-control" type="password" id="password" required
					name="password" placeholder="Input your secret password">
			</div>
			<div class="form-group">
				<button type="submit" id="submitButton" class="btn btn-primary">Kirim</button>
				<button type="reset" class="btn btn-yellow">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>
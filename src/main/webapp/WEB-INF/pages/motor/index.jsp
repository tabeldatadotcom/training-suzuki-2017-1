<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="application/javascript"
	src='<c:url value="/static/datatables/jQuery-3.2.1/jquery-3.2.1.min.js"></c:url>'></script>
<script type="application/javascript"
	src='<c:url value="/static/datatables/jQuery-3.2.1/jquery.serializejson.min.js"></c:url>'></script>
<script type="application/javascript"
	src='<c:url value="/static/datatables/datatables.min.js"></c:url>'></script>
<link rel="stylesheet"
	href='<c:url value="/static/bootstrap/css/bootstrap.min.css"></c:url>'>
<link rel="stylesheet"
	href='<c:url value="/static/datatables/DataTables-1.10.16/css/jquery.dataTables.min.css"></c:url>'>
<link rel="stylesheet"
	href='<c:url value="/static/datatables/DataTables-1.10.16/css/dataTables.bootstrap4.min.css"></c:url>'>

<!-- include motor.js -->
<script type="application/javascript" src='<c:url value="/motor.js"></c:url>'></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Data Nasabah</title>
</head>
<body class="container">
		
	<button id="buttonKirim">Kirim</button>
	<form>
		<div>
			<label>Nama Lengkap</label>
			<input type="text" required name="namaLengkap" id="namaId">
		</div>
		<div>
			<label>Nama Perusahaan</label>
			<input type="text" min="10" name= "namaAplikasi" id="appId">
		</div>
		<div>
			<button type="submit">Kirim Proposal</button>
			<button type="reset">Reset</button>
		</div>
	</form>
	
</body>
</html>
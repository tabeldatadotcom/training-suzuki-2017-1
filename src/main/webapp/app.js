$('h2').text("Halo dunia");

$(document).ready(function() {
	console.log("Jquery works");
	loadData();

	$("form").on("submit", function(event) {
		event.preventDefault();
		var cif = $('#cif').val();
		var namaLengkap = $('#namaLengkap').val();
		var value = {
				"cif" : cif,
				"namaLengkap" : namaLengkap
		}
		$.ajax({
			type : "POST",
			contentType : "application/json; charset=utf-8",
			url : "/jaxrs-example/api/nasabah/save",
			data : JSON.stringify(value),
			success : function() {
				console.log("Data berhasil dikirim ke server!");
				$("#form-register")[0].reset();
			},
			error: function(){
				alert("Tidak dapat menyimpan ke server!");
			},
			dataType : "json"
		});
	});

});

function loadData() {
	$.get("/jaxrs-example/api/nasabah/list", function(data) {
		var rows = $('#data-nasabah');
		var html = "";
		for(var nilai in data){
			html += "<tr><td>"+data[nilai].cif+"</td><td>"+data[nilai].namaLengkap+"</td></tr>";
		}
		rows.html(html);
	}).fail(function() {
		console.log("Tidak dapat load data nasabah");
	});
}

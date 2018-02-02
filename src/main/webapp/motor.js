$(document).ready(function() {
	console.log("Jquery udah running");
	$('#buttonKirim').on("click", function() {
		$.get( "/jaxrs-example/api/motor/anak", function( data ) {
		  console.log(data);
//		  untuk isi field dari http get method
		  $('#namaId').val(data.nama);
		  $('#appId').val(data.aplikasi);
		});
	});
	
	$("form").on("submit", function(event) {
//		tidak dikirim ke server / tidak merefresh
		event.preventDefault();
//		untuk mengambil nilai
		var namaLengkap = $('#namaId').val();
		var aplikasi = $('#appId').val();
		
		console.log("nilai dari nama lengkap dan aplikasi adalah "+ namaLengkap + " : "+ aplikasi);
	});

});
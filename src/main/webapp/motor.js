$(document).ready(function() {
	console.log("Jquery udah running");
	$('#buttonKirim').on("click", function() {
		console.log("Button di click");
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
console.log("Aplikasi Javascript loaded");

var nilaiNumber = 10;
console.log("nilai dari nilai number "+ nilaiNumber + " tipe datanya adalah " + typeof(nilaiNumber));

var nilaiText = 'Belajar Aplikasi Javascript';
console.log("nilai dari nilai text "+ nilaiText + " tipe datanya adalah " + typeof(nilaiText));

var nilaiBoolean = false;
console.log("nilai dari nilai boolean "+ nilaiBoolean + " tipe datanya adalah " + typeof(nilaiBoolean));

var nilaiNull = null;
console.log("nilai dari nilai null "+ nilaiNull + " tipe datanya adalah " + typeof(nilaiNull));

var nilaiUndefined = undefined;
console.log("nilai dari nilai nilaiUndefined "+ nilaiUndefined + " tipe datanya adalah " + typeof(nilaiUndefined));

var nilaiArray = ["Nilai pertama", "10", 10, 11, false, true, 10.0, 0.53343];
console.log("nilai array adalah "+ nilaiArray + " tipe datanya adalah "+ typeof(nilaiArray))
console.log(nilaiArray);

var nilaiObject = {
		"nilaiNumber" : nilaiNumber,
		"nilaiText" : nilaiText,
		"nilaiBoolean" : nilaiBoolean,
		"nilaiArray" : nilaiArray,
		"obj" : {
			"objInner" : 10,
			"objInner2" : "Dimas Maryanto",
			"outerObject" : {
				"innerObje" : 10
			}
		}
}

console.log(nilaiObject);
console.log("tipe data dari nilai object adalah "+ typeof(nilaiObject));

console.log("mengambil object sebagian dengan square bracket akses level 2 "+ nilaiObject['nilaiBoolean']);
console.log("mengambil object sebagian dengan square bracket akses level 3 "+ nilaiObject['obj']['objInner']);
console.log("mengambil object sebagian dengan dot operator "+ nilaiObject.obj.objInner2);
// ending belajar tipe data

var operasiMatematika = 10 + parseInt("10");
console.log("operasi matematika " + operasiMatematika);

var nilaiBilangan = 10;
if(nilaiBilangan == 10){
	console.log("Kondisi sama perbandingan antara number 10");
}

var nilaiBilangan = "10";
if(nilaiBilangan == 10){
	console.log("Kondisi string 10 dan number 10 sama dengan operator ==")
} else {
	console.log("Kondisi lainnya operator ==");
}

if(nilaiBilangan === 10){
	console.log("Kondisi string 10 dan number 10 sama dengan operator ===")
} else {
	console.log("Kondisi lainnya operator ===");
}

var nilaiBilangan = 10;
switch(nilaiBilangan){
	case 1 : console.log("sama dengan satu"); break;
	case 10 : console.log("sama dengan sepuluh"); break;
	default : console.log("Tidak ada yang sama");
}
// ending selection if dan switch

for(var i = 0; i < 10; i++){
	console.log("Saya minta maaf, tidak mengulanginya sekali lagi");
}

for(var index in nilaiArray){
	console.log("nilai terdapat di dalam array pada index ke "+ index + " adalah "+nilaiArray[index]);
}

i = 0;
while(i < 10){
	console.log("Saya minta maaf, menggunakan while");
	i++;
}

i = 0;
do{
	console.log("Saya minta maaf, menggunakan do-while");
	i++;
}while(i < 10);

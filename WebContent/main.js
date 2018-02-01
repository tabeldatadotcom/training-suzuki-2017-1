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

var nilaiObject = {
		"nilaiNumber" : nilaiNumber,
		"nilaiText" : nilaiText,
		"nilaiBoolean" : nilaiBoolean		
}

console.log(nilaiObject);
console.log("tipe data dari nilai object adalah "+ typeof(nilaiObject));
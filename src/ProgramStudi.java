
public class ProgramStudi {

	/**
	 * ini aplikasi utama
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ini komentar single row

		/*
		 * komentar banyak baris
		 */
		String namaProgramStudi = "Sistem Informasi 01";
		String[] daftarNamaProdi = { "Sistem Informasi", "Teknik Informatika", "Matematika", "Fisika" };
		Byte nilaiBilangTerkecil = 127;
		Short nilaiBilanganTerkecilKe2 = 32675;
		Integer nilaiBIlanganSedang = 30_000_000;
		Long nilaiBilanganBulatTerbesar = 3_000_000_000_000l;

		Float nilaiPecahan = 0.20f;
		Double nilaiPecahanBesar = 0.6_000_00d;

		Boolean apakahBenar = false;
		Character huruf = 'A';

		// i = i + 1;
		for (int i = 0; i < args.length; i++) {
			System.out.println("nama ke " + i + " adalah " + args[i]);
			if (i % 2 == 0) {
				Integer j = 0;
				while (j < daftarNamaProdi.length) {
					System.out
							.println("nama prodi perulangan dalam pelangan ke " + j + " adalah " + daftarNamaProdi[j]);
					j++;
				}
			} else {
				System.out.println("Nilainya bukan ganjil");
			}

		}

		int j = 0;
		while (j < daftarNamaProdi.length) {
			System.out.println("nama prodi ke " + j + " adalah " + daftarNamaProdi[j]);
			j++;
		}

		j = 0;
		do {
			System.out.println("nama prodi dengan do while ke " + j + " adalah " + daftarNamaProdi[j]);
			j++;
		} while (j < daftarNamaProdi.length);

		System.out.println("Halo saya sedang belajar Java");
		System.out.println("nama program studi adalah " + namaProgramStudi);
		System.out.println("nilai byte adalah " + nilaiBilangTerkecil);
		System.out.println("nilai short adalah " + nilaiBilanganTerkecilKe2);
		System.out.println("nilai integer adalah " + nilaiBIlanganSedang);
		System.out.println("nilai long adalah " + nilaiBilanganBulatTerbesar);
		System.out.println("nilai float adalah " + nilaiPecahan);
		System.out.println("nilai double adalah " + nilaiPecahanBesar);
		System.out.println("nilai boolean  adalah " + apakahBenar);
		System.out.println("nilai huruf adalah " + huruf);

		switch (nilaiBilangTerkecil) {
		case 127:
			System.out.println("ini sama dengan 127");
			break;
		case 0:
			System.out.println("nilai sama dengan 0");
			break;
		case 1:
			System.out.println("nilai sama denga 1");
			break;
		default:
			System.out.println("ini nilai default");
		}

	}
}

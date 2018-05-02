/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 14:25 AM     
     Updated By  : 
     Update Date : 
*/
class Alifar3 {
	public static void main(String[] args) {
		int jam, menit, detik, wBing, wIstirahat, wMatematika, wKumpul, totalWaktu, konversiWaktuMenit, konversiWaktuJam;

		jam = 3600;
		menit = 60;
		detik = 1;

		wBing = 6000;
		wIstirahat = 1800;
		wMatematika = 7200;
		wKumpul = 1234;

		totalWaktu = wBing + wIstirahat + wMatematika + wKumpul;
		konversiWaktuMenit = totalWaktu / 60;
		konversiWaktuJam   = konversiWaktuMenit / 60;

		System.out.println("Waktu Bahasa Inggris : " + wBing);
		System.out.println("Waktu Istirahat 	 : " + wIstirahat);
		System.out.println("Waktu Matematika 	 : " + wMatematika);
		System.out.println("Waktu Kumpul 		 : " + wKumpul);
		System.out.println("Total Waktu (Detik)  : " + totalWaktu);
		System.out.println("Total Waktu (Menit)  : " + konversiWaktuMenit);
		System.out.println("Total Waktu (Jam)  : " + konversiWaktuJam);	
	}
}

/*
Bima akan mengikuti ujian sekolahnya hari ini. Pada jam pertama, ia mendapatkan waktu 6000 detik untuk mengerjakan soal bahasa inggris. Setelah itu, diberikan waktu untuk istirahat sebanyak 1800 detik sebelum dilanjutkan untuk mengikuti ujian Matematika. Waktu yang diberikan untuk mengerjakan Matematika adalah 7200 detik. Lalu sebelum pulang, seluruh murid diwajibkan baris dilapangan untuk mendengarkan pengumuman oleh kepala sekolah selama 1234 detik. Berapa waktu yang telah dihabiskan disekolah pada hari itu? Ubahlah format waktunya kedalam jam, menit dan detik.
*/
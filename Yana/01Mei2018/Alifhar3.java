/*
created by	: Yana
time		: 1 Mei 2018 15.31


Bima akan mengikuti ujian sekolahnya hari ini. Pada jam pertama, 
ia mendapatkan waktu 6000 detik untuk mengerjakan soal bahasa inggris. 
Setelah itu, diberikan waktu untuk istirahat sebanyak 1800 detik 
sebelum dilanjutkan untuk mengikuti ujian Matematika. Waktu yang diberikan 
untuk mengerjakan Matematika adalah 7200 detik. Lalu sebelum pulang, seluruh murid diwajibkan baris 
dilapangan untuk mendengarkan pengumuman oleh kepala sekolah selama 1234 detik. 
Berapa waktu yang telah dihabiskan disekolah pada hari itu? 
Ubahlah format waktunya kedalam jam, menit dan detik.
*/

public class Alifhar3{
	public static void main(String[] args){

		int waktuInggris, waktuIstirahat, waktuMatematika, waktuBaris, jumlahDetik,
			detikJam, detikMenit;
		double jam, detik, menit;

		waktuInggris	= 6000;
		waktuIstirahat	= 1800;
		waktuMatematika	= 7200;
		waktuBaris		= 1234;
		detikJam		= 3600;
		detikMenit		= 60;

		jumlahDetik		= waktuInggris + waktuIstirahat + waktuMatematika + waktuBaris;

		jam 			= jumlahDetik / detikJam;
		menit 			= (jumlahDetik - (jam * detikJam)) / detikMenit;
		// detik 			= jumlahDetik - (((jumlahDetik / detikJam) + (jumlahDetik - (jam * detikJam))));
		detik 			= jumlahDetik % detikMenit;

		System.out.println("Jumlah Detik " +jumlahDetik);
		System.out.printf("Jam %.0f\n" ,Math.floor(jam));
		System.out.printf("Menit %.0f\n" ,Math.floor(menit));
		System.out.printf("Detik %.0f\n" ,detik);
		
	}
}

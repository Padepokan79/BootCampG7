/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	13.22
	* Updated by:
	*
*/

public class Alifhar3{
	public static void main(String[] args){
		System.out.println("Bima akan mengikuti ujian sekolahnya hari ini.");
		System.out.println("Ia mendapatkan 6000 detik untuk mengerjakan soal bahasa inggris.");
		System.out.println("waktu untuk istirahat sebanyak 1800 detik, Matematika adalah 7200 detik");
		System.out.println("mendengarkan pengumuman oleh kepala sekolah selama 1234 detik.");
		System.out.println("Berapa waktu yang telah dihabiskan disekolah pada hari itu?");
		System.out.println("Ubahlah format waktunya kedalam jam, menit dan detik.");

		int jam, menit, detik, inggris, matematika, istirahat, baris;
		inggris=6000; matematika= 7200; istirahat=1800; baris=1234;
		detik=inggris+matematika+istirahat+baris;
		
		menit=detik/60;
		detik=detik%60;
		
		jam=menit/60;
		menit=menit%60;

		System.out.println("\nWaktu yang dihabiskan Bima disekolah adalah "+jam+" jam, "+menit+" menit "+detik+" detik");
	}
}
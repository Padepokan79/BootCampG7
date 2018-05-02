/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Alifhar03 {
	public static void main( String[] args ){
		int inggris, istirahat, matematika, pengumuman, detik, menit, jam, totalDetik;

		inggris = 6000;
		istirahat = 1800;
		matematika = 7200;
		pengumuman = 1234;
		totalDetik = inggris + istirahat + matematika + pengumuman;
		jam = totalDetik / 3600;
		menit = (totalDetik - (3600 * jam)) / 60;
		detik = totalDetik % 60;
		
		System.out.println("Bima akan mengikuti ujian sekolahnya hari ini. Pada jam pertama, \n" +
							"ia mendapatkan waktu 6000 detik untuk mengerjakan soal bahasa inggris. \n"+
							"Setelah itu, diberikan waktu untuk istirahat sebanyak 1800 detik \n" + 
							"sebelum dilanjutkan untuk mengikuti ujian Matematika. Waktu yang \n" +
							"diberikan untuk mengerjakan Matematika adalah 7200 detik. Lalu \n" +
							"sebelum pulang, seluruh murid diwajibkan baris dilapangan untuk \n" +
							"mendengarkan pengumuman oleh kepala sekolah selama 1234 detik. \n" +
							"Berapa waktu yang telah dihabiskan disekolah pada hari itu? \n" +
							"Ubahlah format waktunya kedalam jam, menit dan detik.");
		System.out.println();
		System.out.println(jam + " Jam: " + menit + " Menit: " + detik + " Detik");
	}
}
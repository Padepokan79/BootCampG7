/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Alifhar3 {
		public static void main(String[] args) {
			int binggris,istrirahat,matematika,pengumuman,sec,jam,menit;

			binggris = 6000;
			istrirahat = 1800;
			matematika = 7200;
			pengumuman = 1234;

			sec = binggris+istrirahat+matematika+pengumuman;
			jam = sec /(3600);
			sec = sec - (3600*jam);
			menit = sec / 60;
			sec = sec - (60*menit);

			System.out.println("Bima akan mengikuti ujian sekolahnya hari ini. Pada jam pertama, ia mendapatkan waktu 6000 detik untuk mengerjakan soal bahasa inggris. Setelah itu, diberikan waktu untuk istirahat sebanyak 1800 detik sebelum dilanjutkan untuk mengikuti ujian Matematika. Waktu yang diberikan untuk mengerjakan Matematika adalah 7200 detik. Lalu sebelum pulang, seluruh murid diwajibkan baris dilapangan untuk mendengarkan pengumuman oleh kepala sekolah selama 1234 detik. Berapa waktu yang telah dihabiskan disekolah pada hari itu? Ubahlah format waktunya kedalam jam, menit dan detik.");
			System.out.println("Jam : " + jam + " Menit : " + menit + " Detik : " + sec);
		}
	}
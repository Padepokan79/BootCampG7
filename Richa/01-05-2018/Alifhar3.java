public class Alifhar3 {
	public static void main (String[] args) {
		int inggris, istirahat, matematika, ceramah, jam, menit, detik, sisamenit, sisadetik;

		inggris = 6000;
		istirahat = 1800;
		matematika = 7200;
		ceramah = 1234;

		detik = inggris + istirahat + matematika + ceramah;
		menit = detik/60;
		sisadetik = (detik%60);
		jam = menit/60;
		sisamenit = (menit%60);


		System.out.println ("Bima akan mengikuti ujian sekolahnya hari ini.\nPada jam pertama, ia mendapatkan waktu 6000 detik untuk mengerjakan soal bahasa inggris.\nSetelah itu, diberikan waktu untuk istirahat sebanyak 1800 detik sebelum dilanjutkan untuk mengikuti ujian Matematika.\nWaktu yang diberikan untuk mengerjakan Matematika adalah 7200 detik.\nLalu sebelum pulang, seluruh murid diwajibkan baris dilapangan untuk mendengarkan pengumuman oleh kepala sekolah selama 1234 detik.\nBerapa waktu yang telah dihabiskan disekolah pada hari itu? \nUbahlah format waktunya kedalam jam, menit dan detik.");
		System.out.println ("Jadi, waktu yang telah dihabiskan oleh Bima adalah " + jam + " jam " + sisamenit + " menit " + sisadetik + " detik");
	}
}

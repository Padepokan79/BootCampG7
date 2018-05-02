/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Yana03{
	public static void main ( String[]args ){
		double simpang1, simpang2, kantor, defJarak, waktuJalan, waktuMotor, jalanKaki, naikMotor, totalWaktu;

		simpang1 = 300;
		simpang2 = 200;
		kantor = 250;
		defJarak = 100;
		waktuJalan = 120;
		waktuMotor = 60;
		jalanKaki = ((simpang1 + simpang2) / defJarak) * waktuJalan;
		naikMotor = (kantor / defJarak) * waktuMotor;
		totalWaktu = jalanKaki + naikMotor;

		System.out.println("Perjalanan dari kosan Arief ke kantor 79 melewati 2 persimpangan, dari \n" +
							"kosan ke persimpangan ke-1 berjarak 300 meter, dari persimpangan ke-1 \n" +
							"ke persimpangan ke-2 berjarak 200 meter, dari persimpangan ke-2 ke kantor \n" +
							"79 berjarak 250 meter. Setiap 100 meter dapat ditempuh selama 120 detik \n" +
							"dengan jalan kaki dan 60 detik menggunakan motor. Jika Arief pergi dari \n" +
							"kosan ke persimpangan ke-2 dengan berjalan kaki, kemudian dari persimpangan \n" +
							"ke-2 ke kantor 79 menggunakan motor, berapa waktu tempuh perjalan Arief dari \n" +
							"kosan ke kantor 79?\n");
		
		System.out.printf("Waktu Perjalanan Arief %.0f detik", totalWaktu);
	}
}
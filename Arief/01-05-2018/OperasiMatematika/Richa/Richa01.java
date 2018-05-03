/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Richa01{
	public static void main( String[] args ){
		double jarak, waktu, waktuTelat, kecepatanAkhir;

		jarak = 30;
		waktu = 1;
		waktuTelat = 50.0 / 60.0;
		kecepatanAkhir = jarak / waktuTelat;

		System.out.println("Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan \n" + 
							"jarak 30 km. Jika dia terlambat berangkat 10 menit, kecepatan yang \n" +
							"harus digunakan agar sampai ke kantor adalah , \n");
		System.out.printf("Kecepatan yang dibutuhkan %.2f km", kecepatanAkhir);

	}
}
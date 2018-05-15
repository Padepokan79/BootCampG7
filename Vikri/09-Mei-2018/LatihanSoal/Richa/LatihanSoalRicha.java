/*
	Created By Vikri
	09/05/2018
	08:30

	1. Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km. 
Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke kantor adalah …
*/
public class LatihanSoalRicha{
	public static void main(String[] args) {
		double otw, selisih, selisihJam,telat, jarak, kecepatan;
		otw = 1*60;
		jarak = 30;
		telat = 10;

		selisih = otw - telat;
		selisihJam = selisih/60;
		kecepatan = jarak/selisihJam;
		System.out.println("kecepatan "+(int)kecepatan+" km/jam");
	}
}
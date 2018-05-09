/*
	Created By Vikri
	09/05/2018
	08:30

	1. Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km. 
Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke kantor adalah …
*/
public class LatihanSoalRicha{
	public static void main(String[] args) {
		double otw, telat, jarak, kecepatan;
		otw = 1*60;
		jarak = 30*1000;
		telat = 10;

		kecepatan = jarak/otw;
		otw = otw - telat;
		kecepatan = jarak/otw;
		kecepatan = kecepatan*otw;
		kecepatan = kecepatan/1000;
		System.out.println("kecepatan "+(int)kecepatan+" km/jam");
	}
}
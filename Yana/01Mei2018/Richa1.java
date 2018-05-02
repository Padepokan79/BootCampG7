/*
created by : Yana
*/

/*
1. Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km. 
Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke 
kantor adalah …
*/
public class Richa1{
	public static void main(String[] args){

		double jarakTempuh, waktuTempuh, waktuTerlambat, kecepatan;

		jarakTempuh		= 30;
		waktuTempuh		= 1;
		waktuTerlambat	= 50.0 / 60.0;
		kecepatan		= jarakTempuh / waktuTerlambat;

		System.out.println("Kecepatan yang dibutuhkan " +kecepatan+ " km/jam");

	}
}
/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
/*
	1. Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km. 
Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke kantor adalah …
*/
public class Richa01{
	public static void main(String[] args){
		int waktuTempuh, jarak, terlambat, kecepatan, operasi, konfersMenit, konfersMenit2, konfersMeter, menit, meter;

		waktuTempuh = 1; // jam
		jarak 		= 30; // km
		terlambat 	= 10; // menit
		menit 		= 60;
		meter 		= 1000;

		konfersMenit 	= waktuTempuh*menit;
		konfersMenit2 	= konfersMenit - terlambat;
		konfersMeter 	= jarak*meter;

		operasi 		= konfersMeter/konfersMenit2;
		kecepatan 		= operasi*menit/meter;


		System.out.print("Kecepatan yang harus digunakan agar sampai ke kantor adalah " + kecepatan + "Km/Jam");
	}
}
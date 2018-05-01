/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	09.18
	* Updated by:
	*
*/

public class Richa1{
	public static void main(String[] args){
		System.out.println("Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km.");
		System.out.println("Jika dia terlambat berangkat 10 menit,");
		System.out.println("kecepatan yang harus digunakan agar sampai ke kantor adalah");

		double jarak, waktu, kecepatan, terlambat;
		waktu=1;
		jarak=30;
		kecepatan=jarak/waktu;
		System.out.println("\nkecepatan apabila tidak terlambat: "+kecepatan+" km/jam");
		
		terlambat=1.0/6.0;
		waktu=waktu-terlambat;
		kecepatan=jarak/waktu;
		System.out.println("kecepatan saat terlambat 10 menit: "+kecepatan+" km/jam");
	}
}
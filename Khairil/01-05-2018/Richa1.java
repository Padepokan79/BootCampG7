/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 09:15 AM     
     Updated By  : 
     Update Date : 
*/
class Richa1 {
	public static void main(String[] args) {
		double kecepatan, waktu, jarak, delay;
		String soal;
		soal  = "Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km. Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke kantor adalah …";
		waktu = 60; //menit
		delay = 10; //menit
		waktu = waktu + delay;
		jarak = 30; //km
		kecepatan = jarak / (waktu / 60);
		System.out.println(soal);		
		System.out.println();		
		System.out.println("Waktu tempuh adalah    : " + waktu + " jam");
		System.out.println("Jarak tempuh adalah    : " + jarak + " km");
		System.out.println("Kecepatan mobil adalah : " + kecepatan + " km/jam");
	}
}
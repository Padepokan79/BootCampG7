/*
soal : 
Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km. 
Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke kantor adalah …

create by : Malik Chaudhary
time : 08-05-2018 8:28PM

*/

public class RichaSoal1{
	public static void main(String[] args){
		int jarak, waktu, terlambat, kecepatan;

		jarak = 30;
		waktu = 60;
		terlambat = 10;

		kecepatan = terlambat/(waktu/jarak);
		kecepatan = jarak+kecepatan;

		
		System.out.print("kecepatan yang harus digunakan agar sampai ke kantor adalah : "+kecepatan);

	}
}
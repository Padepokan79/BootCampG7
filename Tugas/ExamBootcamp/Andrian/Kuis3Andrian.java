/* 	Date 		: 29/5/2018    
	Time Start	: 08:26
	Time End 	: 
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				

Tabungan dimana setiap tahunnya anggota harus membayar setiap harinya 
sebesar 31rb pada tanggal ke 1, 30rb pada tanggal ke 2,
sampai 1rb pada tanggal 31. beranggotakan 4 orang.
selama 4 Diawali pada bulan januari sampai April (Tabungan Selalu Dimulai dari januari). 
Berapakah Besar tabungan keluarga tersebut?
	*/
	import java.util.Scanner;
	//import java.util.Random;

	public class Kuis3Andrian {
		public static void main(String[] args) {
			Scanner key =  new Scanner(System.in);
			int keluarga, nabung=1000, bulan, hari=1, hasilPerhari=0, hasilHariSelanjutnya=0;
			int [] jumlahHari = {31,28,31,30,31,30,31,31,30,31,30,31};
			int [] tabungan = new int [jumlahHari.length];

			// System.out.print("Masukan jumlah keluarga : ");
			// keluarga = key.nextInt();
			// System.out.print("Masukan Jumlah bulan : ");
			// bulan = key.nextInt();

			for (int index = 0; index<jumlahHari.length; index++) {
				while (hari<=jumlahHari[index]) {
					hasilPerhari = nabung * hari;
					hasilHariSelanjutnya = hasilHariSelanjutnya + hasilPerhari;
					hari++;
				}
				System.out.println(hasilHariSelanjutnya);
			}

		}
	}
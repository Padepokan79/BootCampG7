/*
created by : Malik chaudhary
time : 10-05-2018 3:04PM 
soal :

Beasiswa bidikmisi s3
- Laki-laki/Perempuan
- Pendidikan S2 rataan ipk s1&s2 : 3.25
- Akreditasi kampus min B

*/

import java.util.Scanner;
public class YanaBoolean2{
	public static void main(String[] args){

		Scanner bidik = new Scanner(System.in);

		String kelamin, pendidikan, akreditasi;
		double ipk, rata;
		boolean cewe, cowo, hasil, minPendidikan, minAkreditasi, maxAkreditasi;

		System.out.print("jenis kelamin (pria/wanita): ");
 		kelamin = bidik.next();	

 		System.out.print("Pendidikan terakhir (s1/s2/s3) : ");
 		pendidikan = bidik.next();	

 		System.out.print("rata-rata ipk s1-s2 : ");
 		ipk = bidik.nextDouble();	

 		System.out.print("Akreditasi kampus (A/B/C): ");
 		akreditasi = bidik.next();	

 		cewe = kelamin.equals("wanita");
 		cowo = kelamin.equals("pria");
 		minPendidikan = pendidikan.equals("s2");
 		rata = 3.25;
 		minAkreditasi = akreditasi.equals("B");
 		maxAkreditasi = akreditasi.equals("A");


 		hasil = ( ( cewe || cowo ) && minPendidikan && ipk == rata && ( minAkreditasi || maxAkreditasi )  );

 		System.out.print("Apakah anda diterima : "+hasil); 

	}
}
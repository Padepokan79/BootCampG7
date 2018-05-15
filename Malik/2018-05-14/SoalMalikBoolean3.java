/*
created by : malik chaudhary
time : 10-05-2018 7:52PM
soal :
sebuah tempat hiburan mengajukan syarat bagi para pelanggannya yang ingin bersenang senang di tempat tsb,
untuk cowo mereka diwajibkan kaya, ganteng tidak perlu, usia tidak boleh lebih dari 30, kulit harus putih
untuk cewe mereka harus cantik, kaya atau tidak yang penting putih

kaya = 10000000
penampilan = 7

*/

import java.util.Scanner;
public class SoalMalikBoolean3{
	public static void main(String[] args){

		Scanner hiburan = new Scanner(System.in);

		String kelamin, kulit;
		int usia, kaya, penampilan, minPenampilan, minKaya, minUsia;
		double penampilan;
		boolean cewe, cowo, hasilCewe, hasilCowo, putih, hasil;
		
		System.out.print("jenis kelamin (pria/wanita) : ");
 		kelamin = hiburan.next();
 		
		System.out.print("Berapa kekayaan anda : ");
 		kaya = hiburan.nextInt();

		System.out.print("Seberapa menarik anda (skala 0.0-10.0) : ");
 		penampilan = hiburan.nextDouble();


		System.out.print("Usia anda : ");
 		usia = hiburan.nextInt();


		System.out.print("Warna kulit (putih/hitam/coklat) : ");
 		kulit = hiburan.next();

 		cewe = kelamin.equals("cewe");
 		cowo = kelamin.equals("cowo");
 		putih = kulit.equals("putih");

 		minPenampilan = 7;
 		minKaya = 10000000;
 		minUsia = 30;

 		hasilCewe = ( cewe && penampilan >= minPenampilan && putih && ( kaya >= minKaya || kaya <= minKaya ) && usia <= minUsia);
 		hasilCowo = ( cowo && kaya >= minKaya && ( penampilan >= minPenampilan || penampilan <= minPenampilan ) && usia <= minUsia && putih );

 		hasil = ( hasilCowo || hasilCewe );


 		System.out.print("Apakah anda boleh masuk ? : "+hasil);
	}
}

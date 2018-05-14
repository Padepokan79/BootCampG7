/*
created by : Malik chaudhary
time : 10-05-2018 6:42PM 
soal :

Uuntuk bergabung dengan salah satu klub sepakbola di kota bencana,
 seseorang harus memiliki berusia 17 tahun dan hanya pria yang boleh bergabung.
 Skill yang harus dimiliki yaitu jugling minimal 100 untuk usia kurang dari 20th,
 dan jugling minimal 250 untuk usia diatas 20 tahun, selain itu kemampuan fisik juga
 harus diatas 8.0 dari skala 10.0 untuk pemain usia 20th keatas 

*/

import java.util.Scanner;
public class RyanBoolean3{
	public static void main(String[] args){

		Scanner klub = new Scanner(System.in);

		int usia, minUsia, jugling, minJugling, maxJugling, maxUsia;
		double fisik, minFisik;
		String kelamin;  
		boolean hasil1, hasil2, cowo, usiaBawah, usiaAtas, hasil;

		minUsia = 17;
		maxUsia = 20;
		minJugling = 100;
		maxJugling = 250;
		minFisik = 8.0;

		System.out.print("jenis kelamin (pria/wanita) : ");
 		kelamin = klub.next();

 		System.out.print("Usia anda : ");
 		usia = klub.nextInt();

 		System.out.print("Berapa banyak mampu jugling : ");
 		jugling = klub.nextInt();

 		System.out.print("kemampuan fisik anda (skala 0.0-10.0) : ");
 		fisik = klub.nextDouble();

 		cowo = kelamin.equals("pria");
 		usiaBawah = usia < maxUsia;
 		usiaAtas = usia >= maxUsia;

 		hasil1 = ( cowo &&  usiaBawah && usia >= minUsia && jugling >= minJugling );
 		hasil2 = ( cowo &&  usiaAtas && jugling >= maxJugling && fisik > minFisik );

 		hasil = ( hasil1 || hasil2 );


 		System.out.print("Apakah anda diterima ? : "+hasil);

	}
}
/*
created by : Malik chaudhary
time : 10-05-2018 6:35PM 
soal :

Disebuah perosotan kolam renang,
 anak yang diperbolehkan menaikinya yaitu :
	*Laki laki : 12 tahun keatas dan tinggi 150 keatas
	*Perempuan : 12 tahun keatas dan tinggi 145 keatas
*/

import java.util.Scanner;
public class RyanBoolean2{
	public static void main(String[] args){

		Scanner kolam = new Scanner(System.in);

		String kelamin;
		int usia, minUsia, tinggi, tinggiCewe, tinggiCowo;
		boolean hasil, hasilCowo, hasilCewe, cewe, cowo;

		System.out.print("jenis kelamin (pria/wanita) : ");
 		kelamin = kolam.next();


		System.out.print("Usia anak : ");
 		usia = kolam.nextInt();


		System.out.print("Tinggi anak : ");
 		tinggi = kolam.nextInt();

 		minUsia = 12;
 		tinggiCowo = 150;
 		tinggiCewe = 145;

 		cewe = kelamin.equals("wanita");
 		cowo = kelamin.equals("pria");

 		hasilCewe = ( cewe && usia > minUsia && tinggi > tinggiCewe );
 		hasilCowo = ( cowo && usia > minUsia && tinggi > tinggiCowo );
 		hasil = (hasilCewe || hasilCowo);


 		System.out.print("Apakah anak anda boleh renang ? : "+hasil);

	}	
} 
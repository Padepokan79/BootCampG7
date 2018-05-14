/*
created by : Malik chaudhary
time : 10-05-2018 9:06AM 
soal :

seleksi untuk olimpiade matematika. laki=laki atau perempuan yang belum pernah mengikuti seleksi berdomisili bandung memiliki 
nilai matematika di atas atau sama dengan 8 selama 2 semester. Domisili kota bisa lebih dari 1 kata

*/

import java.util.Scanner;
public class KhairilBoolean1{
	public static void main(String[] args){

		boolean hasil, cewe, cowo, pernah, belum;
		String kelamin, seleksi, domisili, domisiliOlimpiade;
		int nilai, minNilai;

		minNilai = 8;

		Scanner olimpiade = new Scanner(System.in);
		Scanner olimpiade2 = new Scanner(System.in);

		System.out.print("Jenis kelamin (pria/wanita) : ");
 		kelamin = olimpiade.next();

 		System.out.print("Pernah mengikuti seleksi ? (belum/pernah) : ");
 		seleksi = olimpiade.next();

 		System.out.print("Domisili : ");
 		domisili = olimpiade2.nextLine();

 		System.out.print("nilai matematika selama 2 semester : ");
 		nilai = olimpiade.nextInt();

 		cewe = kelamin.equals("wanita");
		cowo = kelamin.equals("pria");

		pernah = seleksi.equals("pernah");
		belum = seleksi.equals("belum");

		domisiliOlimpiade = "bandung";


 		hasil = ( ( cewe || cowo ) && belum && domisili.equals(domisiliOlimpiade) && nilai >= minNilai );

 		System.out.print("Apakah anda boleh mengikuti olimpiade ? : "+hasil); 

 		

 		

	}
}
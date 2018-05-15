/*
created by : Malik chaudhary
time : 10-05-2018 5:14PM 
soal :

Untuk Mendaftar menjadi murid baru ke salah 1 sekolah dasar 
 di daerah rawa rontek, seorang anak harus pandai mebaca,
 berusia minimal 7 tahun,
 dan mempunyai histori di Taman Kanak Kanak atau lihai membaca

 *pandai skala diatas 7, lihai adalah 10

*/
 import java.util.Scanner;
 public class RyanBoolean1{
 	public static void main(String[] args){

 		Scanner murid = new Scanner(System.in);

 		String tk;
 		int usia, minUsia;
 		double baca, lihai, minBaca, minLihai;
 		boolean hasil, pernah, belum;

 		System.out.print("apa anda bisa membaca (skala 0.0 - 10.0) : ");
 		baca = murid.nextDouble();

 		System.out.print("Usia murid : ");
 		usia = murid.nextInt();

 		System.out.print("Pernah masuk TK ? (pernah/belum) : ");
 		tk = murid.next();  

 		System.out.print("apa anda lihai membaca (skala 0.0 - 10.0) : ");
 		lihai = murid.nextDouble();


 		minUsia = 7;
 		minLihai = 10;
 		minBaca = 7;

 		pernah = tk.equals("pernah");
 		belum = tk.equals("belum");

 		hasil = ( baca > minBaca && usia >= minUsia && ( tk.equals(pernah) || lihai == minLihai ) );


 		System.out.print("Apakah anda bisa diterima ? : "+hasil);

 	}
 }

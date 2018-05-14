/*
created by : Malik chaudhary
time : 10-05-2018 10:16AM 
soal :

Kamu mempunyai ayah dan ibu. Kamu tidak sengaja membaca artikel tentang kecocokan sepasang suami istri. Menurut artikel
tersebut sepasang suami istri cocok apabila suami memiliki umur di atas istri tidak lebih dari 9 tahun, dalam 1
bulan frekuensi bertengkar tidak lebih dari 5 kali dan gaji suami lebih dari 5 juta rupiah. Kamu ingin mencari tahu kecocokan kedua ortumu. Tuliskan programnya!

*/
import java.util.Scanner;
public class RichaBoolean1{
	public static void main(String[] args){

		Scanner cocok = new Scanner(System.in);
  
		int usiaSuami, usiaIstri, bertengkar, gaji, selisih, maxselisih, frekuensi, maxGaji;
		boolean hasil;

		System.out.println("Selamat datang, ketahuilah kecocokan kalian sebagai suami istri!");

		System.out.print("Umur suami : ");
 		usiaSuami = cocok.nextInt();

		System.out.print("Umur istri : ");
 		usiaIstri = cocok.nextInt();	

		System.out.print("Dalam sebulan berapa kali frekuensi kalian bertengkar? : ");
 		bertengkar = cocok.nextInt();

		System.out.print("Berapa gaji suami dalam sebulan? : ");
 		gaji = cocok.nextInt();

 		selisih = usiaSuami - usiaIstri;
 		maxselisih = 9;
 		frekuensi = 5;
 		maxGaji = 5000000;

 		hasil = ( usiaSuami > usiaIstri && selisih <= maxselisih && bertengkar <= frekuensi && gaji > maxGaji );

		System.out.println();
		System.out.print("ini hasilnya....");
		System.out.print("Apakah kalian cocok menjadi suami istri?  : "+hasil);
	}
}
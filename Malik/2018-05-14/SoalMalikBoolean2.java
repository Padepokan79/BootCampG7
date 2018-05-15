/*
created by : malik chaudhary
time : 09-05-2018 3:25PM
soal :
Ani ingin membuat program kelulusan siswa, syarat kelulusan yang harus dipenuhi
nilai UN tidak boleh di bawah 7, izin max 3, alfa max 5, izin banyak pun tidak jadi masalah.
izin boleh lebih dari 5 tetapi nilai tidak boleh dibawah 7.5
=============================
          SURAT KELULUSAN
   =============================

   nilai un :
   izin :
   alfa :

   -----------------------------
   apakah anda lulus ? ...
*/

import java.util.Scanner;
public class SoalMalikBoolean2{
	public static void main(String[] args){
		
		Scanner lulus = new Scanner(System.in);

		int izin, alfa, minIzin, maxIzin, maxAlfa;
		double un, minUn, maxUn;
		boolean hasil;

		System.out.print("========================");
		System.out.print("     SURAT KELULUSAN    ");
		System.out.print("========================\n");

		System.out.print("nilai UN : ");
		un = lulus.nextInt();

		System.out.print("Berapa kali izin : ");
		izin = lulus.nextInt();

		System.out.print("Berapa kali alfa : ");
		alfa = lulus.nextInt();

		minIzin = 3;
		maxIzin = 5;
		maxAlfa = 5;
		minUn = 7;
		maxUn = 7.5;

		hasil = ( alfa <= maxAlfa && ( ( izin > maxIzin && un >= maxUn ) || ( un >= minUn && izin <= minIzin ) ) );


 		System.out.print("\n\n----------------------------");

 		System.out.print("Apakah anda lulus ? : "+hasil);



	}
}
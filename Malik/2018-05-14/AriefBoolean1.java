/*
created by : Malik chaudhary
time : 10-05-2018 8:53AM 
soal :

Spesifikasi laptop
Jumlah Ram setidaknya 8GB.
Kapasitas Penyimpanan HDD minimal 1TB.
Kecepatan processor tidak boleh kurang dari 3.0 Ghz dan tidak boleh lebih dari 4.5 Ghz


*/

import java.util.Scanner;
public class AriefBoolean1{
	public static void main(String[] args){
		int ram, hdd, minRam, minHdd;
		double processor, minProcessor, maxProcessor;
		boolean hasil;

		Scanner tol = new Scanner(System.in);

		minRam = 8;
		minHdd = 1000;
		minProcessor = 3.0;
		maxProcessor = 4.5;

		System.out.print("Jumlah RAM laptop : ");
 		ram = tol.nextInt();

		System.out.print("Kapasitas penyimpanan HDD (dalam GB): ");
 		hdd = tol.nextInt();


		System.out.print("Kecepatan processor : ");
 		processor = tol.nextDouble();

 		hasil = ( ram >= minRam && hdd >= minHdd && ( processor >= minProcessor && processor <= maxProcessor ) );

 		System.out.print("Apakah spek laptop sesuai ? : "+hasil); 





	}
}
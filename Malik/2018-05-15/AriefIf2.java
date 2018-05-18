/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 11:32AM

Soal :

Keroro ingin membeli laptop baru agar bisa main game high-end terbaru, budget yang ia keluarkan ingin 7.000.000 dan 
tidak lebih dari 10.000.000 dengan spesifikasi RAM 8GB, HDD 1TB, Kecepatan Processor ada di rentang 2.8 GHz ~ 3.5 GHz, 
namun ia akan tetap membeli berapapun harganya jika Kecepatan processor setidaknya 4.2 GHz atau merek gaming ternama. 
disisi lain ia tidak suka laptop dengan spesifikasi RAM lebih sedikit dari 8 GB, atau HDD kurang dari 500GB

OUTPUT
___________________________________________

	PORORO LAPTOP AND PC CENTER
___________________________________________

Merek		:
RAM		:
HDD		:
Processor	:
Harga		:

Status		: Anda Fanboy			>> Jika Merek ternama yang dibeli
		  Setuju untuk dibeli		>> Jika semua terpenuhi
		  Laptop Ngelag			>> Ram / HDD dibawah keinginan
		  Anda Sultan Fanboy		>> Jika Laptop Mahal dan Merk Ternama
___________________________________________

	     Semoga Bermanfaat
___________________________________________

*/

import java.util.Scanner;
public class AriefIf2{
	public static void main(String[] args){

		Scanner laptop = new Scanner(System.in);
		String merek;
		int ram, hdd, minRam, maxHdd, minHdd;
		double processor, harga, minHarga, maxHarga, minProcessor, midProcessor, maxProcessor;

		System.out.println("___________________________________________");
		System.out.println("       PORORO LAPTOP AND PC CENTER         ");
		System.out.println("___________________________________________");
		System.out.print("Merek : ");
		merek = laptop.next();
		System.out.print("RAM (GB): ");
		ram = laptop.nextInt();
		System.out.print("HDD (GB): ");
		hdd = laptop.nextInt();
		System.out.print("Processor : ");
		processor = laptop.nextDouble();
		System.out.print("Harga : ");
		harga = laptop.nextDouble();

		minHarga = 7000000;
		maxHarga = 10000000;

		minRam = 8;
		maxHdd = 1000;
		minHdd = 500;

		minProcessor = 2.8;
		midProcessor = 3.5;
		maxProcessor = 4.2;

		if ( (harga >= minHarga && harga <= maxHarga) && hdd >= maxHdd && ( processor >= minProcessor && processor <= midProcessor ) ) {
			System.out.print("Setuju untuk dibeli");
		}else if ( harga > maxHarga && merek.equals("MacBook") ) {
			System.out.print("Anda Sultan Fanboy");
		}else if ( processor >= maxProcessor || merek.equals("MacBook") ) {
			System.out.print("Anda Fanboy");		
		}else if ( hdd < minHdd || ram < minRam ) {
			System.out.print("Laptop nge lag");
		}else{
			System.out.print("Laptop tidak ada");
		}
	}
}
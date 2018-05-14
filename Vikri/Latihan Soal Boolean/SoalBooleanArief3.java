// Created by vikri 
// 12/05/2018
// 22:20
import java.util.Scanner;
public class SoalBooleanArief3{
	public static void main(String[] args) {
		boolean kriteria;
		int hdd, ram;
		double processor; 
		String namaLaptop;

		Scanner string = new Scanner(System.in);
		Scanner string2 = new Scanner(System.in);
		
		System.out.print("Nama Laptop, : ");
		namaLaptop = string2.next();

		System.out.print("Ram, : ");
		ram = string.nextInt();

		System.out.print("Kapasitas HDD (GB) : ");
		hdd = string.nextInt();

		System.out.print("Processor, : ");
		processor = string.nextDouble();

		kriteria = ram >= 8 && hdd >= 1000 && processor >= 3.0 && processor <= 4.5;
		System.out.println("Masuk kriteria? "+kriteria);
	}
}

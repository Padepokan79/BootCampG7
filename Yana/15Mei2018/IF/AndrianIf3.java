/*
Created by	: Yana
Time		: 15 Mei 2018 10.50
*/

import java.util.Scanner;

public class AndrianIf3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String	nama, predikat, keterangan;
		double 	nilaiUTS, nilaiUAS, nilaiTugas, persenUTS, persenUAS, persenTugas, totalNilai;

		System.out.println("=================================================");
		System.out.print("Nama        : ");
		nama = keyboard.next();
		System.out.print("UTS         : ");
		nilaiUTS = keyboard.nextDouble();
		System.out.print("UAS         : ");
		nilaiUAS = keyboard.nextDouble();
		System.out.print("Tugas       : ");
		nilaiTugas = keyboard.nextDouble();
		System.out.println("=================================================");

		persenUTS 	= nilaiUTS * 30 / 100;
		persenUAS 	= nilaiUAS * 30 / 100;
		persenTugas	= nilaiTugas * 40 / 100;
		totalNilai	= persenUTS + persenUAS + persenTugas;

		if ( totalNilai >= 80 && totalNilai <= 100 ) {
			predikat 	= "A";
			keterangan	= "Lulus";
			System.out.println("Selamat " +nama+ " predikat yang anda dapatkan " +predikat+ " dan anda dinyatakan " +keterangan);
		} else if ( totalNilai >= 60 && totalNilai <= 79 ) {
			predikat 	= "B";	
			keterangan	= "Lulus";
			System.out.println("Selamat " +nama+ " predikat yang anda dapatkan " +predikat+ " dan anda dinyatakan " +keterangan);
		} else if ( totalNilai >= 40 && totalNilai <= 59 ) {
			predikat 	= "C";
			keterangan	= "Tidak Lulus";
			System.out.println("Selamat " +nama+ " predikat yang anda dapatkan " +predikat+ " dan anda dinyatakan " +keterangan);
		} else if ( totalNilai >= 20 && totalNilai <= 39 ) {
			predikat 	= "D";
			keterangan	= "Tidak Lulus";
			System.out.println("Selamat " +nama+ " predikat yang anda dapatkan " +predikat+ " dan anda dinyatakan " +keterangan);
		} else if ( totalNilai >= 0 && totalNilai <= 19 ) {
			predikat 	= "E";
			keterangan	= "Tidak Lulus";
			System.out.println("Selamat " +nama+ " predikat yang anda dapatkan " +predikat+ " dan anda dinyatakan " +keterangan);	
		}

	}
}
/*
Created by : Malik Chaudhary
time : 09-05-2018 11:38AM
soal :
    Hari Kamis, Ladies Night

	-Cewek Cantik berusia 21 tahun sampai 30 Tahun
	-Selain Itu tidak Boleh Masuk

*/

import java.util.Scanner;
public class Tugas2Boolean1{
	public static void main(String[] args){
		Scanner cewe = new Scanner(System.in);
		int age;
		double penampilan;
		boolean hasil;

		System.out.print("Usia anda : " );
		age = cewe.nextInt();

		System.out.print("Seberapa tampan anda ? skala 0.0 - 10.0 : " );
		penampilan = cewe.nextDouble();

		hasil = ( age >= 21 && age <= 30 && penampilan <= 8.0);
		System.out.print("apakah boleh masuk ? "+ hasil);

	}
}
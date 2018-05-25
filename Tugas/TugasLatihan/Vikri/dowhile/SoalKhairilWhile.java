/*
	Created By Vikri
	20/05/2018
	18:32
*/
import java.util.Scanner;
import java.util.Random;

public class SoalKhairilWhile{
	public static void main(String[] args) {
		int level, soal, angka1, angka2, hasil, tebak;

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Level: ");
		level = input.nextInt();

		soal = rand.nextInt(100)+1;

		int benar = 0, soal2;
		soal2 = soal;
		do{
			if (level==1) {
				angka1 = rand.nextInt(10)+1;
				angka2 = rand.nextInt(10)+1;

				hasil = angka1+angka2;
				System.out.print(angka1+"+"+angka2+"= ");
				tebak = input.nextInt();
				if (tebak==hasil) {
					benar += 1;
				} else {
					System.out.println("Salah");
				}
			} else if (level==2) {	
				angka1 = rand.nextInt(100)+1;
				angka2 = rand.nextInt(100)+1;

				hasil = angka1+angka2;
				System.out.print(angka1+"+"+angka2+"= ");
				tebak = input.nextInt();
				if (tebak==hasil) {
					benar += 1;
				} else {
					System.out.println("Salah");
				}
			} else if (level==3) {
				angka1 = rand.nextInt(1000)+1;
				angka2 = rand.nextInt(1000)+1;

				hasil = angka1+angka2;
				System.out.print(angka1+"+"+angka2+"= ");
				tebak = input.nextInt();
				if (tebak==hasil) {
					benar += 1;
				} else {
					System.out.println("Salah");
				}
			} else if (level==4) {
				angka1 = rand.nextInt(10000)+1;
				angka2 = rand.nextInt(10000)+1;

				hasil = angka1+angka2;
				System.out.print(angka1+"+"+angka2+"= ");
				tebak = input.nextInt();
				if (tebak==hasil) {
					benar += 1;
				} else {
					System.out.println("Salah");
				}
			} else if (level==5) {
				angka1 = rand.nextInt(100000)+1;
				angka2 = rand.nextInt(100000)+1;

				hasil = angka1+angka2;
				System.out.print(angka1+"+"+angka2+"= ");
				tebak = input.nextInt();
				if (tebak==hasil) {
					benar += 1;
				} else {
					System.out.println("Salah");
				}
			} else if (level==6) {
				angka1 = rand.nextInt(1000000)+1;
				angka2 = rand.nextInt(1000000)+1;

				hasil = angka1+angka2;
				System.out.print(angka1+"+"+angka2+"= ");
				tebak = input.nextInt();
				if (tebak==hasil) {
					benar += 1;
				} else {
					System.out.println("Salah");
				}
			}
			soal--;
		}while(soal>=0);
			int nilai;
			nilai = (benar*100)/soal2;
			if (nilai<=25) {
				System.out.println("\nCoba lagi ya, atau ngulang sd");	
			} else if (nilai>25&&nilai<50) {
				System.out.println("\noke lah masih mending");
			} else if (nilai>=50&&nilai<75) {
				System.out.println("\nSip lah masih diatas standar");
			} else if (nilai>=75&&nilai<=99) {
				System.out.println("\nAnda benar benar matematikawan");
			} else if (nilai==100) {
				System.out.println("\nPerfect!");
			}
	}
}
/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Richa {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int ageDef, ageOld, age, lima, dua, nol;
		double kenaikanGaji, gaji;
		String raise;

		kenaikanGaji = 5.0/100;
		ageDef = 56;
		ageOld = 25;
		lima = 5;
		dua = 2;
		nol = 0;
		gaji = 1500000;

		System.out.println("==================");
 		System.out.println(" Gaji Pak Jokowi");
		System.out.println("==================");

		age = ageDef - ageOld;

		while (age <= ageDef) {

			if (age % lima == nol) {
				System.out.println("Umur: " + age + " tahun");
				System.out.println("Naik pangkat? (y/n)");
				raise = inputKey.next();
				if (raise.equals("y")) {
					gaji = gaji * dua;
					System.out.printf("gaji : %.0f \n", gaji);
				}else {
					gaji = gaji + (kenaikanGaji * gaji);	
				}
				System.out.println();
				System.out.println("-------------------");
			}else {
				if ((ageDef - age) == ageOld) {
					gaji = gaji;
					System.out.println("Umur: " + age + " tahun");
					System.out.println("Naik pangkat? Tidak");
					System.out.printf("gaji : %.0f \n", gaji);
				}else {
					gaji = gaji + (kenaikanGaji * gaji);
					System.out.println("Umur: " + age + " tahun");
					System.out.println("Naik pangkat? Tidak");
					System.out.printf("gaji : %.0f \n", gaji);
				}
				System.out.println();
				System.out.println("-------------------");
			}
			age++;
		}
	}
}
/*
 * File           : AlifharSoalIf1.java
 * Project Name   : Alifhar
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Alifhar
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 3:09:54 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 3:12:34 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class AlifharSoalIf1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double angka, zero, eveNumber, oddNumber;
		boolean bulat;

		zero = 0;
		eveNumber = 1;
		oddNumber = 2;

		System.out.println("=====================================");
		System.out.print("Masukan bilangan: ");
		angka = keyboard.nextDouble();
		System.out.println("=====================================");
		System.out.println("Bilangan tersebut adalah");
		System.out.print("Bilangan ");

		if (angka % oddNumber == eveNumber || angka % eveNumber == zero) {
			System.out.print("bulat ");

			bulat = (angka % oddNumber ) == eveNumber;

			if (bulat) {
				System.out.print("ganjil ");
			}else{
				System.out.print("genap ");
			}
		}else{
			System.out.print("riil ");
		}

		if (angka < zero) {
			System.out.print("negatif ");
		}else {
			System.out.print("positif");
		}

		System.out.println("\n=====================================");

	}
}
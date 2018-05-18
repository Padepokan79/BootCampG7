/*
 * File           : AndrianSoalIf2.java
 * Project Name   : Andrian
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Andrian
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 10:35:16 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 10:35:19 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class AndrianSoalIf2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String name, category="0", note="0";
		double uas, uts, tugas;

		System.out.println("\n================================");
		System.out.print("Nama\t: ");
		name = keyboard.next();
		System.out.print("UTS\t: ");
		uts = keyboard.nextDouble();
		System.out.print("UAS\t: ");
		uas = keyboard.nextDouble();
		System.out.print("Tugas\t: ");
		tugas = keyboard.nextDouble();
		System.out.println("\n================================");

		double grade = (uts*30/100)+(uas*30/100)+(tugas*40/100);

		if (grade < 20) {
		 	category = "E";
		 	note = "Tidak Lulus";
		}
		else if (grade < 40) {
		 	category = "D";
		 	note = "Tidak Lulus";
		}
		else if (grade < 60) {
		 	category = "C";
		 	note = "Tidak Lulus";
		}
		else if (grade < 80) {
		 	category = "B";
		 	note = "Lulus";
		}
		else if (grade <= 100) {
		 	category = "A";
		 	note = "Lulus";
		}

		System.out.println("Selamat "+name+" predikat yang anda dapatkan "+category+" dan anda dinyatakan "+note);
	}
}
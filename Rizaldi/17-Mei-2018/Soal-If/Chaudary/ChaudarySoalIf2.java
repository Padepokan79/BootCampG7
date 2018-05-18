/*
 * File           : ChaudarySoalIf2.java
 * Project Name   : Chaudary
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Chaudary
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 10:51:37 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 10:53:10 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class ChaudarySoalIf2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String name, notVal, addNote;
		int totalLec;
		double mathVal, indVal, engVal, avgVal;

		notVal=" ";
		addNote=" ";
		totalLec=3;
		System.out.println("\n========================================");
		System.out.print("Nama\t\t\t: ");
		name = keyboard.next();
		System.out.print("Nilai Math\t\t: ");
		mathVal = keyboard.nextDouble();
		System.out.print("Nilai Indonesia\t\t: ");
		indVal = keyboard.nextDouble();
		System.out.print("Nilai Inggris\t\t: ");
		engVal = keyboard.nextDouble();

		avgVal = (mathVal+indVal+engVal)/totalLec;
		System.out.printf("\nRata-rata nilai\t\t: %.2f",avgVal);

		if (avgVal < 75) {
			notVal = "Kurang";
			addNote = "Harus mengikuti remedial";
		}
		else if (avgVal < 85) {
			notVal = "Cukup";
			addNote = "Boleh Mengikuti Remedial / Tidak";
		}
		else if (avgVal <= 90) {
			notVal = "Baik";
		}
		else{
			notVal = "Sangat Baik";
		}

		System.out.println("\nKeterangan nilai\t: "+notVal);
		System.out.println("========================================");
		if (avgVal < 85) {
			System.out.println("Keterangan Tambahan\t: "+addNote);
		}

	}
}
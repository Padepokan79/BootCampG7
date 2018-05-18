/*
 * File           : MalikSoalIf2.java
 * Project Name   : Malik
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Malik
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:19:45 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:20:09 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class MalikSoalIf2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String grade;
		int honest, lie, conceit, arrogant;

        grade=" ";
		System.out.println("\n=========================================");
		System.out.print("                                          ");
		System.out.println("\n=========================================");
		System.out.println("Skala Jujur anda\t: ");
		honest = keyboard.nextInt();
		System.out.println("Skala Bohong anda\t: ");
		lie = keyboard.nextInt();
		System.out.println("Skala Sombong anda\t: ");
		conceit = keyboard.nextInt();
		System.out.println("Skala Angkuh anda\t: ");
		arrogant = keyboard.nextInt();
		System.out.println("-------------------------------------------");

		if ((honest >= 8 && lie < 5 && conceit <= 6 && arrogant < 7) || (honest >= 9 && lie <= 2)) {
			grade = "Baik";
		}
		else if (lie < 5 && arrogant < 5 && conceit < 5 && honest < 5) {
			grade = "Kurang baik";
		}
		else if (lie+arrogant+conceit+honest > 35) {
			grade = "Sangat baik";
		}
		else if (lie+arrogant+conceit+honest < 15) {
			grade = "Buruk";
		}
		else {
			grade = "Tidak terdefinisi";
		}

		System.out.println("SELAMAT! anda terdefinisi "+grade+" !");
	}
}
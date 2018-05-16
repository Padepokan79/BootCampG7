/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 11:31
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfMalik2{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String grade=" ";
		int jujur, bohong, sombong, angkuh;

		System.out.println("\n=========================================");
		System.out.print("------------Derected Our Attitude-----------");
		System.out.println("\n=========================================");
		System.out.println("Skala Jujur anda\t: ");
		jujur = key.nextInt();
		System.out.println("Skala Bohong anda\t: ");
		bohong = key.nextInt();
		System.out.println("Skala Sombong anda\t: ");
		sombong = key.nextInt();
		System.out.println("Skala Angkuh anda\t: ");
		angkuh = key.nextInt();
		System.out.println("-------------------------------------------");

		if ((jujur >= 8 && bohong < 5 && sombong <= 6 && angkuh < 7) || (jujur >= 9 && bohong <= 2)) {
			grade = "Baik";
		}
		else if (bohong < 5 && angkuh < 5 && sombong < 5 && jujur < 5) {
			grade = "Kurang baik";
		}
		else if (bohong+angkuh+sombong+jujur > 35) {
			grade = "Sangat baik";
		}
		else if (bohong+angkuh+sombong+jujur < 15) {
			grade = "Buruk";
		}
		else {
			grade = "Tidak terdefinisi";
		}

		System.out.println("SELAMA
			T! anda "+grade+" !");
	}
}
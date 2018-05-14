/*
	Created By Vikri
	09/05/2018
	14:10
*/
import java.util.Scanner;

public class Ex14D2{
	public static void main(String[] args) {
		boolean ladiesNight, ladiesNight2;
		String jenisKelamin;
		int umur, cantik;

		Scanner input = new Scanner(System.in);
		System.out.print("Jenis Kelamin? ");
		jenisKelamin = input.next();

		System.out.print("Umur? ");
		umur = input.nextInt();

		System.out.print("Cantik? ");
		cantik = input.nextInt();

		ladiesNight = jenisKelamin.equals("cewe");
		ladiesNight2 = cantik >= 8 && ladiesNight && umur >= 21 || umur <= 30;

		System.out.println("Boleh Masuk? "+ladiesNight2);
	}
}
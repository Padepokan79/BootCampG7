/*
	Created By Vikri
	09/05/2018
	14:29
*/
import java.util.Scanner;

public class Ex14D4{
	public static void main(String[] args) {
		boolean jombloNight, pria, wanita;
		String jenisKelamin;
		int umur, penampilan;

		Scanner input = new Scanner(System.in);
		System.out.print("Jenis Kelamin? ");
		jenisKelamin = input.next();

		System.out.print("Umur? ");
		umur = input.nextInt();

		System.out.print("Penampilan? ");
		penampilan = input.nextInt();

		pria = jenisKelamin.equals("Pria");
		wanita = jenisKelamin.equals("Wanita");
		
		jombloNight = penampilan >= 8 && umur >= 21 || umur <= 30 && (pria || wanita);

		System.out.println("Boleh Masuk Melodies memori? "+jombloNight);
	}
}
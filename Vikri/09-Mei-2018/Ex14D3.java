/*
	Created By Vikri
	09/05/2018
	14:20
*/
import java.util.Scanner;

public class Ex14D3{
	public static void main(String[] args) {
		boolean melodies, pria, wanita;
		String jenisKelamin;
		int umur, cantik;

		Scanner input = new Scanner(System.in);
		System.out.print("Jenis Kelamin? ");
		jenisKelamin = input.next();

		System.out.print("Umur? ");
		umur = input.nextInt();

		pria = jenisKelamin.equals("Pria");
		wanita = jenisKelamin.equals("Wanita");
		melodies = umur >= 40 && (pria || wanita);

		System.out.println("Boleh Masuk Melodies memori? "+melodies);
	}
}
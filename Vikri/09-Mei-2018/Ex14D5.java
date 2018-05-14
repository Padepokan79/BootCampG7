/*
	Created By Vikri
	09/05/2018
	14:29
*/
import java.util.Scanner;

public class Ex14D5{
	public static void main(String[] args) {
		boolean brondongNight, pria, wanita, syaratPria, syaratCewe;
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

		syaratPria = pria && penampilan <= 8 && umur >= 20 || umur <= 25;
		syaratCewe = wanita && penampilan >= 8 && umur >= 30 || umur <= 45; 
		
		brondongNight = syaratPria || syaratCewe;

		System.out.println("Boleh Masuk Melodies memori? "+brondongNight);
	}
}
/*
	Created By vikri
	13/05/2018
	11:04
*/
import java.util.Scanner;
public class SoalBooleanRyan2{
	public static void main(String[] args) {
		int umur, tinggi;
		String jKelamin;
		boolean kriteria;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Jenis Kelamin: ");
		jKelamin = string.next();

		System.out.print("Umur: ");
		umur = input.nextInt();

		System.out.print("Tinggi: ");
		tinggi = input.nextInt();

		kriteria = (jKelamin.equals("pria") && tinggi > 150) || (jKelamin.equals("wanita") && tinggi > 145) && umur > 12;
		System.out.print("Boleh Naik prosotan? "+kriteria);
	}
}

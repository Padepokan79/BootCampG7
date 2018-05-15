// Created by vikri
// 12/05/2018
// 14:25
import java.util.Scanner;
public class SoalAndrian1{
	public static void main(String[] args) {
		boolean tersortir, masuk1, masuk2;
		String jKelamin, nama;
		double hadiah, parasWajah;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.print("nama : ");
		nama = string.nextLine();

		System.out.print("Jenis Kelamin : ");
		jKelamin = string.next();

		System.out.print("Harga Hadiah : ");
		hadiah = input.nextDouble();

		System.out.print("Paras Wajah : ");
		parasWajah = input.nextDouble();

		masuk1 = parasWajah >= 8.5 && hadiah >= 2000000;
		masuk2 = parasWajah <= 8.5 && hadiah >= 5000000; 
		tersortir = masuk1 || masuk2;

		System.out.println("Boleh ikut pesta? "+tersortir);
	}
}
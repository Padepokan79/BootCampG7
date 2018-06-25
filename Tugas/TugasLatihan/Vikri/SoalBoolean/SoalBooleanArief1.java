// Created by vikri 
// 12/05/2018
// 22:07
import java.util.Scanner;
public class SoalBooleanArief1{
	public static void main(String[] args) {
		boolean ganjil, genap, sortir;
		int platNomer, tanggal;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Tanggal Sekarang : ");
		tanggal = input.nextInt();

		System.out.print("Plat Nomer : ");
		platNomer = input.nextInt();

		tanggal = tanggal%2;
		platNomer = platNomer%2;

		ganjil = tanggal == 1 && platNomer == 1;
		genap = tanggal == 0 && platNomer == 0;
		sortir = ganjil || genap;

		System.out.println("boleh masuk? "+sortir);
	}
}

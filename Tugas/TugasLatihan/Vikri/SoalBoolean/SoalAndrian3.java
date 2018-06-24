// Created by vikri
// 12/05/2018
// 14:35
import java.util.Scanner;
public class SoalAndrian3{
	public static void main(String[] args) {
		boolean tersortir, sortir1, sortir2, sortir3, sortir4;
		String jKelamin, renovasi;
		double luasHektar;
		int lantai, garasi, kolam, flora;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Luas Hektar : ");
		luasHektar = input.nextDouble();

		System.out.print("Bisa Direnovasi : ");
		renovasi = string.next();

		System.out.print("Berapa lantai bisa didirikan : ");
		lantai = input.nextInt();

		System.out.print("garasi bisa berapa mobil : ");
		garasi = input.nextInt();

		System.out.print("Mampu menampung berapa kolam : ");
		kolam = input.nextInt();

		System.out.print("Flora yang bisa ketampung : ");
		flora = input.nextInt();
 
 		sortir1 = luasHektar > 0.3 && renovasi.equals("bisa") && lantai >= 3 && garasi > 3;
 		sortir2 = kolam > 2 && flora > 5;
 		sortir3 = flora > 8 && kolam < 2;
 		sortir4 = luasHektar == 0.7 && renovasi.equals("bisa") && lantai < 3 && garasi > 3;

		tersortir = sortir1 || sortir4 && sortir2 || sortir3;
		System.out.println("\nmasuk rumah kriteria? "+tersortir);
	}
}
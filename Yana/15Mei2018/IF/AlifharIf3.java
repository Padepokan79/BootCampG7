/*
Created by	: Yana
Time		: 15 Mei 2018 09.10
*/

import java.util.Scanner;

public class AlifharIf3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int nilaiA, nilaiB, nilaiC;
		double akar, x1, x2;
		String	jenisAkar, persamaan;

		System.out.println("========================");
		System.out.print("Nilai A: ");
		nilaiA = keyboard.nextInt();
		System.out.print("Nilai B: ");
		nilaiB = keyboard.nextInt();
		System.out.print("Nilai C: ");
		nilaiC = keyboard.nextInt();
		System.out.print("Persamaan kuadratnya adalah " +nilaiA+ "x^2 + " );

		if ( nilaiB < 0) {
			System.out.print("- " + (-nilaiB) + "x ");
		} else if ( nilaiB > 0 ) {
			System.out.print("+ " + (+nilaiB) + "x ");
		}

		if ( nilaiC < 0) {
			System.out.print("- " + (-nilaiC));
		} else if ( nilaiC > 0) {
			System.out.print("+ " + (+nilaiC) + "\n");
		}

		akar = nilaiB * nilaiB - (4 * nilaiA * nilaiC);
		if ( akar == 0) {
			jenisAkar = "Akar Kembar";
			persamaan = "";
		} else if ( akar < 0) {
			x1 = x2 = -nilaiB /(2 * nilaiA);			
			jenisAkar = "Akar Imajiner";
			persamaan = "x1 = " +x1+ " dan x2 = " +x2;
		} else{
			x1 = (-nilaiB - Math.sqrt(akar)) / (2 * nilaiA);
            x2 = (-nilaiB + Math.sqrt(akar)) / (2 * nilaiA);
            jenisAkar = "Akar Berbeda";
            persamaan = "x1 = " +x1+ " dan x2 = " +x2;
		}

		System.out.println("========================");
		System.out.println("Maka didapatkan akar akar dari persamaan tersebut adalah:");
		System.out.println(jenisAkar+ ", dengan");
		System.out.println(persamaan);
		System.out.print("========================");


	}
}

/*
3. Diketahui sebuah persamaan ax^2 + bx + c = 0, dengan a, b dan c adalah konstanta. Carilah akar-akar dari persamaan tersebut dan tentukan jensnya. (akar kembar, akar berbeda, akar imajiner)
===========================================================
nilai a: 1
nilai b: -5
nilai c: 6

persamaan kuadratnya adalah x^2 - 5x + 6 = 0
===========================================================
Maka didapatkan akar akar dari persamaan tersebut adalah:
akar berbeda, dengan
x1 = -2 dan x2 = -3
===========================================================
*/
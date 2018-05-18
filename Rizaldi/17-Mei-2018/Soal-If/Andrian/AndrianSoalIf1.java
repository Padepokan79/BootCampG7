/*
 * File           : AndrianSoalIf1.java
 * Project Name   : Andrian
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Andrian
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 10:33:36 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 10:34:24 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class AndrianSoalIf1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String member;
		int memberPrice, priceA, priceB, priceC, total, piece=0;

		memberPrice = 75;
		priceA = 150;
		priceB = 100;
		priceC = 80;

		System.out.println("\n=========================================");
		System.out.print("Apakah Anda member (Y/N)\t: ");
		member = key.next();
		System.out.print("\nBanyak Lembar yang akan di copy\t: ");
		piece = key.nextInt();
		System.out.println("\n=========================================");

		if (member.equals("Y")) {
			System.out.println("Harga\t= Rp."+memberPrice);
			total = memberPrice*piece;
 			System.out.println("Bayar\t= Rp."+total);
		}
		else if (member.equals("N") && piece > 200) {
			System.out.println("Harga\t= Rp."+priceC);
			total = priceC*piece;
 			System.out.println("Bayar\t= Rp."+total);
		}
		else if (member.equals("N") && piece <= 200 && piece >= 100) {
			System.out.println("Harga\t= Rp."+priceB);
			total = priceB*piece;
 			System.out.println("Bayar\t= Rp."+total);	
		}
		else {
			System.out.println("Harga\t= Rp."+priceA);
			total = priceA*piece;
 			System.out.println("Bayar\t= Rp."+total);	
		}

	}
}
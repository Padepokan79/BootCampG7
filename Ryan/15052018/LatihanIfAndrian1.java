/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 08:43   
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfAndrian1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String member;
		int hargaMember, harga1, harga2, harga3, total, lembar=0;

		hargaMember = 75;
		harga1 = 150;
		harga2 = 100;
		harga3 = 80;

		System.out.println("\n=========================================");
		System.out.print("Apakah Anda member (Y/N)\t: ");
		member = key.next();
		System.out.print("\nBanyak Lembar yang akan di fotocopy\t: ");
		lembar = key.nextInt();
		System.out.println("\n=========================================");

		if (member.equals("Y")) {
			System.out.println("Harga\t= Rp."+hargaMember);
			total = hargaMember*lembar;
 			System.out.println("Bayar\t= Rp."+total);
		}
		else if (member.equals("N") && lembar > 200) {
			System.out.println("Harga\t= Rp."+harga3);
			total = harga3*lembar;
 			System.out.println("Bayar\t= Rp."+total);
		}
		else if (member.equals("N") && lembar <= 200 && lembar >= 100) {
			System.out.println("Harga\t= Rp."+harga2);
			total = harga2*lembar;
 			System.out.println("Bayar\t= Rp."+total);	
		}
		else {
			System.out.println("Harga\t= Rp."+harga1);
			total = harga1*lembar;
 			System.out.println("Bayar\t= Rp."+total);	
		}

	}
}
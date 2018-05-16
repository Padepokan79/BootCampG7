/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Andrian01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		String member;
		int hargaMember, hargaA, hargaB, hargaC, qtyA, qtyB, qtC, qty, hasilA, ratus;
		hargaMember 	= 75;
		hargaA 			= 150;
		hargaB 			= 100;
		hargaC 			= 80; 

		ratus 			= 100;

		System.out.println("========================================");
		System.out.print("Apakah anda member (y/n)? ");
		member 	= key.next();
		System.out.print("Banyak lembar yang akan difotocopy? ");
		qty 	= key.nextInt();
		System.out.println("========================================");
		System.out.println("");


		if (member.equals("y")) {
			hasilA = qty*hargaMember;
			System.out.println("Harga \t: " + hasilA);
		}else{
			if (qty < ratus) {
				hasilA = qty*hargaA;
				System.out.println("Harga \t: " + hasilA);
			}else if (qty >= 100 && qty <= 200) {
				hasilA = qty*hargaB;
				System.out.println("Harga \t: " + hasilA);
			}else if (qty > 200) {
				hasilA = qty*hargaC;
				System.out.println("Harga \t: " + hasilA);
			}else{
				System.out.println("Harga tidak tertera(Gratis)");
			}
		}
	}
}
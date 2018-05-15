/*
	Created By Vikri
	15/05/2018
	10:12
*/
import java.util.Scanner;

public class SoalIfAndrian{
	public static void main(String[] args) {
		int fotokopi;
		String member;
		Scanner input = new Scanner(System.in);

		System.out.print("Apakah Anda Member? ");
		member=input.next();

		System.out.print("Berapa lembar yang ingin di fotokopi? ");
		fotokopi=input.nextInt();

		System.out.println("=======================================");

		if (member.equals("ya")) {
			fotokopi = fotokopi*75;
			System.out.println("Harga \t= Rp. 75");
			System.out.println("Bayar \t= Rp. "+fotokopi);
		} else {
			if (fotokopi<100) {
				fotokopi = fotokopi*150;
				System.out.println("Harga \t= Rp. 150");
				System.out.println("Bayar \t= Rp. "+fotokopi);
			} else if (fotokopi>=100&&fotokopi<=200) {
				fotokopi = fotokopi*100;
				System.out.println("Harga \t= Rp. 100");
				System.out.println("Bayar \t= Rp. "+fotokopi);
			} else if (fotokopi>200) {
				fotokopi = fotokopi*80;
				System.out.println("Harga \t= Rp. 80");
				System.out.println("Bayar \t= Rp. "+fotokopi);
			}
		}
		System.out.println("=======================================");
	}
}
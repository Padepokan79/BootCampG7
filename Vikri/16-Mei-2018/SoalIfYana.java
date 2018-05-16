/*
	Created Vikri
	16/05/2018
	8:05
*/
import java.util.Scanner;
public class SoalIfYana{
	public static void main(String[] args) {
		int uang, bonus, bonus2;
		Scanner input = new Scanner(System.in);
	
		System.out.print("Jumlah uang: ");
		uang = input.nextInt();

		if (uang>=90000&&uang<100000) {
			System.out.println("Budi membeli tas seharga Rp. 60000");
			uang = uang-60000;
			bonus = 10/100*60000;
			System.out.println("\nSisa uang Budi Rp. "+(uang+bonus));
		} else if (uang>=100000&&uang<200000) {
			System.out.println("Budi membeli tas seharga Rp. 60000");
			System.out.println("Budi membeli dompet seharga Rp. 40000");

			bonus = 10/100*60000;
			bonus2 = 10/100*40000;
			uang = uang-(60000+40000);
			System.out.println("\nSisa uang Budi Rp. "+(uang+bonus+bonus2));
		} else if (uang>=200000&&uang<500000) {
			System.out.println("Budi membeli Sepatu sseharga Rp. 120000");
			System.out.println("Budi membeli tas seharga Rp. 60000");

			bonus = 10/100*60000;
			uang = uang-(120000+60000);
			System.out.println("\nSisa uang Budi Rp. "+(uang+bonus));
		} else if (uang>=500000&&uang<1000000) {
			System.out.println("Budi membeli jas seharga Rp. 250000");
			System.out.println("Budi membeli kemeja seharga Rp. 60000");
			System.out.println("Budi membeli dasi seharga Rp. 40000");

			uang = uang-(250000+60000+40000);
			System.out.println("\nSisa uang Budi Rp. "+uang);
		} else {
			System.out.println("\nUang Kurang");
		}
	}
}
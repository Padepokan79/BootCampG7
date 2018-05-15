/*
	Created By Vikri
	15/05/2018
	14:44
*/
import java.util.Scanner;
public class SoalIfVikri1{
	public static void main(String[] args) {
		int janji, mimpin;
		String ballet;

		Scanner string = new Scanner(System.in);

		System.out.print("Jumlah janji kampanye: ");
		janji = string.nextInt();
	
		System.out.print("Pernah memimpin daerah berapa kali: ");
		mimpin = string.nextInt();

		System.out.print("Bakat yang di punya: ");
		ballet = string.next();

		if (janji<=0&&mimpin>=2&&ballet.equals("ballet")) {
			System.out.println("\nLayak jadi pemimpin");
		} else {
			System.out.println("\nTidak layak jadi pemimpin");
		}
	}
}
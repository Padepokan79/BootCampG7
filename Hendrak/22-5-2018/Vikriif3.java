//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 3:18 PM
//Modified by :
import java.util.Scanner;

public class Vikriif3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int janji,memimpin;
		String bakat;

		System.out.print("Berapa kali Janji yang anda buat :");
		janji = keyboard.nextInt();
		System.out.print("Berapa kali anda pernah memimpin :");
		memimpin = keyboard.nextInt();
		System.out.print("Apa bakat terpendam anda :");
		bakat = keyboard.next();

		if(janji == 0 && memimpin >= 2 && bakat.equals("ballet"))
		{
			System.out.println("Anda adalah seorang pemimpin !!!");
		}
		else
			{System.out.println("Anda bukan pemimpin");}
	}
}
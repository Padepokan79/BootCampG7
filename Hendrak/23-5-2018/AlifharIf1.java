//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 9:29 PM
//Modified : 
import java.util.Scanner;
public class AlifharIf1{
	public static void main(String[] args) {
		double bil, temp;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Masukan angka :");
		bil = keyboard.nextDouble();
		
		if(bil > 0)
		{
			if(bil%2 == 0)
			{
				System.out.println(bil + " adalah bilangan genap positif");
			}
			else if(bil%2 == 1)
				{
					System.out.println(bil + " adalah bilangan ganjil positif");
				}
				else
				{
					System.out.println(bil + " adalah bilangan rill positif");
				}

		}
		else
		{
			if(bil%-2 == 0)
			{
				System.out.println(bil + " adalah bilangan genap negatif");
			}
			else if(bil%2 == -1)
				{
					System.out.println(bil + " adalah bilangan ganjil negatif");
				}
				else
				{
					System.out.println(bil + " adalah bilangan rill negatif");
				}

		}

	}

}
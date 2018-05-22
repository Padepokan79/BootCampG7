//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 3:28 PM
//Modified by :
import java.util.Scanner;

public class Andrianif1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String member;
		int lembar;
		double harga=0,bayar=0;

		System.out.println("============================");
		System.out.print("Apakah anda member (Y/N)");
		member = keyboard.next();
		System.out.print("Banyak lembar yang akan difotocopy :");
		lembar = keyboard.nextInt();
		System.out.println("============================");

		harga = lembar * 150;
		if(member.equals("Y"))
		{
			bayar = lembar * 75;
		}
		else
		{	
			if(lembar <100)
			{
				bayar = lembar *150;
			}
			if(lembar >=100 && lembar <=200)
			{
				bayar = lembar * 100;
			}
			if(lembar >200) 
			{
				bayar = lembar * 80;
			}

		}
		System.out.println("Harga Normal: Rp." + harga);
		System.out.println("Harga Bayar : Rp." + bayar);
	}
}
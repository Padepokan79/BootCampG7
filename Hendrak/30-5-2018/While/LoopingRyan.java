//Created ny : Hendra Kurniawan
//Date : 24 Mei 2018 Time : 9:19 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingRyan{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String aksi1;
		int i=1, randPerintah, randhasilP, randhasilC,golP=0,golC=0;

		while(i<=5)
		{
			System.out.println("\nRound " + i);
			System.out.println("==============");
			randPerintah = rand.nextInt(2);
			if(randPerintah==1)
			{
				System.out.print("Tendang Bola :");
				aksi1= keyboard.next();
				if(aksi1.equals("tendang"))
				{
					randhasilP = rand.nextInt(10)+1;
					randhasilC = rand.nextInt(10)+1;
					if(randhasilP>randhasilC)
					{
						System.out.println("GOOLLLL!!!");
						golP+=1;
					}
					else
					{
						System.out.println("Ditepis!!!");
					}
				}
				else
				{
					System.out.println("Kamu Loyo, Bola Ditepis!!");
				}
			}
			else
			{
				System.out.print("Tangkap Bola :");
				aksi1= keyboard.next();
				if(aksi1.equals("tangkap"))
				{
					randhasilP = rand.nextInt(10)+1;
					randhasilC = rand.nextInt(10)+1;
					if(randhasilP>randhasilC)
					{
						System.out.println("TERTANGKAP!!!");
						
					}
					else
					{
						System.out.println("GOOLLLL!!!");
						golC+=1;
					}
				}
				else
				{
					System.out.println("GOOOLLLLL!!! Kamu Loyo");
				}	
			}

			i++;
		}
	
		System.out.println("\n\nScore Akhir ");
		System.out.println("=============");
		System.out.println(golP +" VS "+ golC);
		if(golP > golC)
		{
			System.out.println("Player Menang !!");
		}
		else
		{
			System.out.println(" Computer Menang :((");
		}
	}
}
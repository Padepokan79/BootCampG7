//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 11:23 AM
//Modified :
import java.util.Random;
import java.util.Scanner;

public class PigLikeDiceGame{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int i,j=1;
		int playerDice, computerDice1=0,computerDice2=0,computerDice3=0;
		int playerPoint=0,playerPointTemp=0,computerPoint=0,computerPointTemp=0;
		String lempar;
		System.out.println("Game Start");
		
		while(computerPoint <100&&playerPoint<100)
		{	System.out.println("\nRound Ke  "+ j);
			System.out.println("==============\n");
			i=0;
			
				while(i==0)
				{computerDice1 = rand.nextInt(6)+1;
					computerDice2 = rand.nextInt(6)+1;
					computerDice3 = rand.nextInt(6)+1;
					System.out.println("Dadu Komputer ke 1 :" + computerDice1);
					System.out.println("Dadu Komputer ke 2 :" + computerDice2);
					System.out.println("Dadu Komputer ke 3 :" + computerDice3);
					System.out.println("=======================================");
					i++;
					computerPointTemp=0;
					computerPointTemp =  computerDice1 + computerDice2 + computerDice3;
					System.out.println("Point Komputer Round ini = " + computerPointTemp);
					System.out.println("\n");
					computerPoint += computerPointTemp;
				}
			

			if(computerPoint <100)
			{	lempar ="y";
				while(lempar.equals("y"))
				{
					System.out.println("Player Lempar Dadu");
					playerDice = rand.nextInt(6)+1;
					System.out.println("Dadu Player :" + playerDice);
					System.out.println("=======================================");
					playerPointTemp = playerPoint + playerDice;
					
					if(playerDice == 1)
					{
						playerPointTemp = 0;
						lempar="n";
						System.out.println("Point Player Round Ini= " + playerPointTemp);
			
					}
					else
					{
					System.out.println("Point Player Round Ini = " + playerPointTemp);
					}

					if(playerPoint >=100)
					{
						System.out.println("Player WIN!!!");
					}
					else if(playerDice!=1)
					{
					System.out.print("Lempar Dadu lagi ?(y/n)");
					lempar = keyboard.next();
					}
					System.out.println("\n");
					playerPoint += playerPointTemp;
				}	
			}
			else
			{
					System.out.println("Computer WIN!!!");
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("Computer Point Total : "+computerPoint);
			System.out.println("Player Point Total   : "+playerPoint );
			System.out.println("++++++++++++++++++++++++++++++++++++++");			
			j++;
		}
	}
}
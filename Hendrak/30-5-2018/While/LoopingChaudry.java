//Created ny : Hendra Kurniawan
//Date : 24 Mei 2018 Time : 11:06 AM
//Modified :
import java.util.Scanner;
import java.util.Random;
//
//
//String bandingkan dengan char
public class LoopingChaudry{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		String kalimat,tebak;
		String hurufAcak="";
		int i=0,j=0,nyawaP = 1, nyawaC = 1,round=1,tambahNyawaP=0,tambahNyawaC=0;


		System.out.print("Masukan Kata :");
		kalimat = keyboard.next();

		while(round <=20)
		{	
			System.out.println("Round ke " + round);
			System.out.println("===============");
		
		
			for(int h =0; h < 2 ;h++)
			{
				tambahNyawaP = 0;
				tambahNyawaC = 0;
				 i = kalimat.length();
				 j = rand.nextInt(i);
			  	 

			  	System.out.print(" Tebak huruf : ");
			  	tebak = keyboard.next();
		  		System.out.println("===============");

		  		//kondisi menang bermasalah
			  	if(tebak.charAt(0) == kalimat.charAt(j))
			  	{
			  		tambahNyawaP =1;
			  		System.out.println("Nice!!");
			  	}
			  	else
			  	{
			  		tambahNyawaC =1;
			  		System.out.println(":<<");
			  
			  	}
			  	/*
			  	System.out.println(kalimat.charAt(j));
			  	System.out.println(tebak);
				*/
			}	
			//tambah nyawa
			if(tambahNyawaP == 1)
			{
				nyawaP +=2;
			}
			else if(tambahNyawaC == 1)
			   {
			   		nyawaP -=1;
			  		nyawaC +=2;
			  		
			   }

			if((nyawaP >= 16)||((nyawaP-nyawaC)==6))
			  	{	
			  		if(round<=8)
			  		{
			  			System.out.println("==============");
			  			System.out.println("Cheater");
			  		}
			  		else if(round>8&& round <=11)
			  			{
			  				System.out.println("Nice");
			  				System.out.println("==============");
			  				System.out.println("Player Menang");
			  			}
			  			else if(round>11)
			  			{
			  				System.out.println("==============");
			  				System.out.println("Noob");
			  			}
			  		
			  	}
			  	else if((nyawaC >= 16)||((nyawaC - nyawaP)==6))
			  		{
			  			System.out.println("==============");
			  			System.out.println("Computer Menang");
			  		}
			round++;
		}
		if(round == 20)
		{
			System.out.println("==============");
			System.out.println("Playa Menang!!!! Round 20!!");
		}

	}
}
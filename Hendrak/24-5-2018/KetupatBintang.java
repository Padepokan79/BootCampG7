//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 11:53 PM
//Modified by :
import java.util.Scanner;

public class KetupatBintang{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String kalimat="";
		int batas,k=10,l=9,m,n;

		int i=0,j=0;
		
		for(i=0;i<10;i++)
		{
			for(j=1;j<=20;j++)
			{
				
				if(j==k)
				{
					System.out.print("*");

				}
				if(j!=9 &&j==l)
				{
					System.out.print("*");
				
				}
				
				else
				{
					System.out.print("-");
				}



			}
			k = k - 1;
			l += 1;
			System.out.println("");

		}
		m=2;
		n=10;
		for(i=9;i>0;i--)
		{
			for(j=1;j<=19;j++)
			{
				
				if(j==m)
				{
					System.out.print("*");

				}
				if(j!=9 && j==n+7)
				{
					System.out.print("*");

				}
				
				else
				{
					System.out.print("-");
				}
			}
			m = m + 1;
			n = n -1;
			System.out.println("");

		}


		
	}
}
//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 11:53 PM
//Modified by :
import java.util.Scanner;

public class KomandanBersatu{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String kalimat="Komandan Bersatu";
		int batas,k,l=0,m=0,n;

		System.out.print("Masukan Kalimat : ");
		kalimat = keyboard.nextLine();
		System.out.print("Masukan Batas   : ");
		batas = keyboard.nextInt();
		n = kalimat.length();
		int i=1,j=0;
		
		for(i=1;i<=batas;i++)
		{
			for(j=i;j<=batas*2;j++)
			{
				System.out.print(" ");
			
			}
			for(k=0;k<i;k++)
			{
				if(l<n)
				{
					System.out.print(kalimat.charAt(l));
					l++;
					System.out.print(" ");
				}

			}
			
			System.out.println("");

		}


		
	}
}
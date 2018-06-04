//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 10:22 PM
//Modified by :
import java.util.Scanner;

public class BilanganPrima{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int i,j, batas,prima;

	System.out.print("Masukan Batas : ");
	batas = keyboard.nextInt();

	for (i=1; i<batas;i++)
	{prima=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				prima += 1;
			}
		}
		if(prima == 2)
		{
				System.out.print(i +" ");
		}
	
	}

	}
}
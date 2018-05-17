/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	17.06
	* Updated by:
	*
*/
import java.util.Scanner;

public class Prime{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int batas, rest;

		System.out.print("Batas : ");
		batas=scan.nextInt();

		for(int i=1;i<=batas;i++){
			rest=0;
			for(int j=1;j<=i;j++)
				if(i%j==0)
					rest+=1;
			if(rest==2)
				System.out.print(i+" ");
		}
	}
}
/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	17.29
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ketupat{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int batas;

		System.out.print("Masukkan baris: ");
		batas=scan.nextInt();

		if(batas%2==0)
			System.out.println("gabisa untuk bilangan genap, ini kalo "+(batas+1));

		for(int i=0; i<(batas/2+1); i++){
			for(int j=i; j<(batas/2); j++)
				System.out.print(" ");
			System.out.print("*");
			for(int k=(i*2-1); k>0;k--)
				System.out.print(" ");
			if(i>0)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0; i<(batas/2); i++){
			for(int j=0; j<=i; j++)
				System.out.print(" ");
			System.out.print("*");
			for(int k=i*2; k<((batas/2-1)*2-1);k++)
				System.out.print(" ");
			if(i<(batas/2-1))
				System.out.print("*");
			System.out.println();
		}
	}
}
/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	13.50
	* Updated by:
	*
*/
import java.util.Scanner;

public class OddNumber{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int beg,end;

		System.out.println("Enter Start :");
		beg=scan.nextInt();
		System.out.println("Enter End   :");
		end=scan.nextInt();

		System.out.println("\nResult");
		for(int i=beg; i<=end; i++)
			if(i%2==1)
				System.out.println(i);
	}
}
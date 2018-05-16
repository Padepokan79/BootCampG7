/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	13.58
	* Updated by:
	*
*/
import java.util.Scanner;

public class EvenNumber{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int beg,end;

		System.out.println("Enter Start :");
		beg=scan.nextInt();
		System.out.println("Enter End   :");
		end=scan.nextInt();

		System.out.println("\nResult");
		for(int i=beg; i<=end; i++)
			if(i%2==0)
				System.out.println(i);
	}
}
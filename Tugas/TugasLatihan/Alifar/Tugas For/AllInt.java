/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	13.58
	* Updated by:
	*
*/
import java.util.Scanner;

public class AllInt{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int beg,end;

		System.out.println("Enter Start :");
		beg=scan.nextInt();
		System.out.println("Enter End   :");
		end=scan.nextInt();

		System.out.println("\nResult");
		for(int i=beg; i<=end; i++)
				System.out.println(i);
	}
}
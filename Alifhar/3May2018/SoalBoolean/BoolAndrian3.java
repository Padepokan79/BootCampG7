/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	13.38
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolAndrian3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int flora, garasi, kolam, renovasi;
		double luas;
		boolean boleh;

		System.out.print("\nLuas rumah dalam hektare? ");
		luas=keyboard.nextDouble();
		System.out.print("Mampu direnovasi hingga berapa lantai? ");
		renovasi=keyboard.nextInt();
		System.out.print("Berapa mobil yang dapat ditampung garasi? ");
		garasi=keyboard.nextInt();
		System.out.print("berapa kolam yang dapat dibangun? ");
		kolam=keyboard.nextInt();
		System.out.print("Berapa flora yang dapat ditampung? ");
		flora=keyboard.nextInt();
	
		boleh=( luas>0.3 && (renovasi>=3 || luas>=0.7) && garasi>=3 && (kolam>=2 || flora>=8) && flora>=5 );
		System.out.println("Anto akan membeli rumahnya: "+boleh);
	}
}
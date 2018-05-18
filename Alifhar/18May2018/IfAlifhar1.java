/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	13.06
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfAlifhar1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double bil;
		String stat;

		System.out.println("===============================");
		System.out.print("Masukkan bilangan: ");
		bil=scan.nextDouble();
		System.out.println("===============================");
		System.out.println("Bilangan tersebut adalah");

		if(bil>=0)
			stat="Positif";
		else
			stat="Negatif";
		if(bil%1==0){
			if(bil%2==0)
				System.out.println("Bilangan Bulat Genap "+stat);
			else
				System.out.println("Bilangan Bulat Ganjil "+stat);
		}else{
			System.out.println("Bilangan Riil "+stat);
		}
		System.out.println("===============================");
	}
}
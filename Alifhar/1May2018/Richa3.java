/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	11.05
	* Updated by:
	*
*/

public class Richa3{
	public static void main(String[] args){
		System.out.println("Selisih uang Ani dan Budi adalah 7500.");
		System.out.println("Jika 10% uang Ani diberikan kepada Budi,");
		System.out.println("maka uang Budi menjadi 80% uang Ani semula.");
		System.out.println("Berapa jumlah uang keduanya?");

		double selisih, ani, budi, total;
		selisih=7500;
		/*
		a - b = 7500
		b + 10% a = 80% a

		b = 70% a

		a - 70% a = 7500
		a ( 1 - 70% ) = 7500
		a 0.3 = 7500
		a = 7500/0.3 
		*/

		ani=selisih/0.3;
		budi=0.7*ani;
		total=ani+budi;
		System.out.println("\ntotal uang mereka adalah "+total+" rupiah");
	}
}
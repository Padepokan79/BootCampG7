/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Rizaldi02{
	public static void main(String[] args){
		
		int nilaiLulus, nilaiA, nilaiB, nilaiC, nilaiD, nilaiE, nilaiF, nilaiG, nilaiH;
		boolean hasil, rataA, rataB, rataC, rataD, rataE, rataF, rataG, rataH;
		Scanner key = new Scanner(System.in);

		System.out.print("Nilai mata kuliah A? ");
		nilaiA 	= key.nextInt();

		System.out.print("Nilai mata kuliah B? ");
		nilaiB 	= key.nextInt();

		System.out.print("Nilai mata kuliah C? ");
		nilaiC 	= key.nextInt();

		System.out.print("Nilai mata kuliah D? ");
		nilaiD 	= key.nextInt();

		System.out.print("Nilai mata kuliah E? ");
		nilaiE 	= key.nextInt();

		System.out.print("Nilai mata kuliah F? ");
		nilaiF 	= key.nextInt();

		System.out.print("Nilai mata kuliah G? ");
		nilaiG 	= key.nextInt();

		System.out.print("Nilai mata kuliah H? ");
		nilaiH 	= key.nextInt();

		nilaiLulus = 7;
		rataA	= (nilaiA >= nilaiLulus);
		rataB	= (nilaiB >= nilaiLulus);
		rataC	= (nilaiC >= nilaiLulus);
		rataD	= (nilaiD >= nilaiLulus);
		rataE	= (nilaiE >= nilaiLulus);
		rataF	= (nilaiF >= nilaiLulus);
		rataG	= (nilaiG >= nilaiLulus);
		rataH	= (nilaiH >= nilaiLulus);


		hasil 	= ((rataA && rataC && rataD && rataE) && (rataB || rataF || rataG || rataH) ) ;

		System.out.print("Apakah mahasiswa itu lulus? " + hasil);
		 
	}
}
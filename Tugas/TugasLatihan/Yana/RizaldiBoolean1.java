/*
Create by	: Yana
Time 		: 3 Mei 2018 14.30
Update by	:
*/

import java.util.Scanner;

public class RizaldiBoolean1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double	nilaiA, nilaiB, nilaiC, nilaiD, nilaiE, nilaiF, nilaiG, nilaiH;
		int		minimalLulus, minimalNilai;		
		boolean hasil;


		System.out.print("Nilai matakuliah A: " );
		nilaiA	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah B: ");
		nilaiB	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah C: ");
		nilaiC	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah D: ");
		nilaiD	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah E: ");
		nilaiE	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah F: ");
		nilaiF	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah G: ");
		nilaiG	= keyboard.nextDouble();
		System.out.print("Nilai matakuliah H: ");
		nilaiH	= keyboard.nextDouble();
		// System.out.print("Nilai matakuliah A");
		// System.out.print();
		// System.out.print();

		hasil	= ( ( nilaiA >= 7.0 && nilaiA <= 10.0 && nilaiC >= 7.0 && nilaiC <= 10.0 && nilaiD >= 7.0 && nilaiD <= 10.0 && 
				  nilaiE >= 7.0 && nilaiE <= 10.0 ) && ( 
				  ( nilaiB >= 7.0 && nilaiB <= 10.0 && ( ( nilaiF >= 7.0 && nilaiF <= 10.0 ) || ( nilaiG >= 7.0 && nilaiG <= 10.0 ) || 
				  ( nilaiH >= 7.0 && nilaiH <= 10.0 ) ) ) || 
				  ( nilaiF >= 7.0 && nilaiF <= 10.0 && ( ( nilaiB >= 7.0 && nilaiB <= 10.0 ) || ( nilaiG >= 7.0 && nilaiG <= 10.0 ) || 
				  ( nilaiH >= 7.0 && nilaiH <= 10.0 ) ) ) ||
				  ( nilaiG >= 7.0 && nilaiG <= 10.0 && ( ( nilaiB >= 7.0 && nilaiB <= 10.0 ) || ( nilaiF >= 7.0 && nilaiF <= 10.0 ) ||
				  ( nilaiH >= 7.0 && nilaiH <= 10.0 ) ) ) ||
				  ( nilaiH >= 7.0 && nilaiH <= 10.0 && ( ( nilaiB >= 7.0 && nilaiB <= 10.0 ) || ( nilaiF >= 7.0 && nilaiF <= 10.0 ) ||
				  ( nilaiG >= 7.0 && nilaiG <= 10 ) ) )
				  ) );

		System.out.print("LULUS? " +hasil);

	}
}
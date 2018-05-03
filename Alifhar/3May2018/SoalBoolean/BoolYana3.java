/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.57
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolYana3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		double ipk, algoritma, database, bahasa, rata;
		int semester;
		String kelamin, jenis, status;
		boolean diterima;

		System.out.print("\nJenis Kelamin (pria/wanita): ");
		kelamin=keyboard.next();
		System.out.print("Semester: ");
		semester=keyboard.nextInt();
		System.out.print("Jenis beasiswa (ppa/ppb): ");
		jenis=keyboard.next();
		System.out.print("Ipk Anda: ");
		ipk=keyboard.nextDouble();
		System.out.print("Apakah keluarga tidak mampu (ya/tidak): ");
		status=keyboard.next();
		System.out.print("Nilai mata kuliah algoritma: ");
		algoritma=keyboard.nextInt();
		System.out.print("Nilai mata kuliah database: ");
		database=keyboard.nextInt();
		System.out.print("Nilai mata kuliah bahasa pemrograman: ");
		bahasa=keyboard.nextInt();

		rata=(database+bahasa)/2;

		diterima=( (kelamin.equals("pria")||kelamin.equals("wanita")) && semester>=3 && semester<=5 &&
					( (jenis.equals("ppa") && ipk>=2.75 && status.equals("ya")) || 
					(jenis.equals("ppb") && ipk>=3.0 && algoritma>=8 && rata>=8 ) ) );
		
		System.out.println("Anda diterima beasiswa informatika "+diterima);
	}
}
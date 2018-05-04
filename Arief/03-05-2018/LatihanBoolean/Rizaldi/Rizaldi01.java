/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Rizaldi01{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		// String ;
		int matkulA, matkulB, matkulC, matkulD, matkulE, matkulF, matkulG, matkulH, kkm;
		boolean allowed, biru, mkWajib, nonWajib;

		kkm = 7;

		System.out.println( "Nilai Mahasiswa" );
		System.out.println();

		System.out.print( "Nilai Matkul A : " );
		matkulA = inputKey.nextInt();

		System.out.print( "Nilai Matkul B : " );
		matkulB = inputKey.nextInt();

		System.out.print( "Nilai Matkul C : " );
		matkulC = inputKey.nextInt();

		System.out.print( "Nilai Matkul D : " );
		matkulD = inputKey.nextInt();

		System.out.print( "Nilai Matkul E : " );
		matkulE = inputKey.nextInt();

		System.out.print( "Nilai Matkul F : " );
		matkulF = inputKey.nextInt();

		System.out.print( "Nilai Matkul G : " );
		matkulG = inputKey.nextInt();

		System.out.print( "Nilai Matkul H : " );
		matkulH = inputKey.nextInt();

		mkWajib = (matkulC >= kkm && matkulD >= kkm && matkulE >= kkm && matkulA >= kkm);
		nonWajib = (matkulB >= kkm && matkulF >= kkm && matkulG >= kkm && matkulH >= kkm);

		allowed = ((nonWajib == true || nonWajib == false) && mkWajib == true);

		System.out.println();
		System.out.println( "Memenuhi syarat untuk lulus kuliah? " + allowed );

	}
}

/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Yana03{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		int age, semester, minSemester, maxSemester;
		double ipk, algo, defAlgo, rata, minRata, maxRata, db, pemrograman, ipkPpa, ipkPpb;
		String gender, beasiswa, status;
		boolean allowed, laki, perm, statusMampu, statusTidak, ppa, ppb, tempSemester, tempPpa, tempPpb, tempGender;

		minSemester = 3;
		maxSemester = 5;
		ipkPpa = 2.75;
		ipkPpb = 3.00;
		defAlgo = 8;
		minRata = 8;
		maxRata = 10;

		System.out.println( "Lowongan Pekerjaan" );
		System.out.println();

		System.out.print( "Jenis Kelamin ( \"Laki-laki\" / \"Perempuan\" ) : " );
		gender = inputKey.next();
		laki  = gender.equals("Laki-laki");
		perm  = gender.equals("Perempuan");

		System.out.print( "Masukan semester yang sedang ditempuh : " );
		semester = inputKey.nextInt();

		System.out.print( "Jenis Beasiswa (ppa/ppb): " );
		beasiswa = inputKey.next();
		ppa  = beasiswa.equals("ppa");
		ppb  = beasiswa.equals("ppb");

		System.out.print( "Nilai IPK: " );
		ipk = inputKey.nextDouble();

		System.out.print( "Status (Mampu/Tidak): " );
		status = inputKey.next();
		statusMampu  = status.equals("Mampu");
		statusTidak  = status.equals("Tidak");

		System.out.print( "Nilai Algoritma: " );
		algo = inputKey.nextDouble();

		System.out.print( "Nilai Database: " );
		db = inputKey.nextDouble();

		System.out.print( "Nilai Bahasa Pemrograman: " );
		pemrograman = inputKey.nextDouble();

		rata = (db + pemrograman) / 2;
		tempGender = (laki == true || perm == true);
		tempSemester = (semester == minSemester && semester == maxSemester);
		tempPpa = (ppa == true && (ipk == ipkPpa && statusTidak == true));
		tempPpb = (ppb == true && (ipk == ipkPpb && algo == defAlgo && (rata >= minRata && rata <= maxRata)));

		allowed = (tempGender && tempSemester && ( tempPpa || tempPpb));

		System.out.println( "Memenuhi Syarat? " + allowed );

	}
}

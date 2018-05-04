/*
	 Program     : Boolean Yana 3 / Beasiswa Informatika
     Creator     : Khairil
     Created At  : 3 Mei 2018 16:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanYana3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner another = new Scanner(System.in);
		String inputJK, l, p, y, inputBeasiswa, ppa, ppb, inputStatus, statusY, statusT;
		int inputSemester, tiga, empat, lima;	
		double inputIpk, ipkPpa, ipkPpb, inputNilaiAlgo, nilaiAlgo, inputNilaiDb, nilaiDb, inputNilaiBp, nilaiBp, nilaiRata, nilaiRataMin, nilaiRataMax; 
		boolean qualified;

		System.out.print( "Jenis Kelamin Anda (Pilih L atau P) ?  " );
		inputJK = keyboard.next();		

		System.out.print( "Semester ?  " );
		inputSemester = keyboard.nextInt();		

		System.out.print( "Jenis Beasiswa ?  " );
		inputBeasiswa = keyboard.next();		

		System.out.print( "Status ?  " );
		inputStatus = another.nextLine();

		System.out.print( "IPK ?  " );
		inputIpk = keyboard.nextDouble();

		System.out.print( "Nilai Mata Kuliah Algoritma ?  " );
		inputNilaiAlgo = keyboard.nextDouble(); 

		System.out.print( "Nilai Mata Kuliah Database ?  " );
		inputNilaiDb = keyboard.nextDouble();

		System.out.print( "Nilai Mata Kuliah Pemrograman ?  " );
		inputNilaiBp = keyboard.nextDouble();

		//rata2 database dan program 8 s.d. 10

		l = "L";
		p = "P";
		tiga = 3;
		empat = 4;
		lima = 5;
		ppa = "ppa";
		ppb = "ppb";
		statusY = "mampu";
		statusT = "tidak mampu";
		ipkPpa = 2.75;
		ipkPpb = 3.0;
		nilaiAlgo = 8.0;
		nilaiRata = (inputNilaiDb + inputNilaiBp) / 2;
		nilaiRataMin = 8.0;
		nilaiRataMax = 10.0;
		y = "Y";

		qualified = ( ( inputJK.equals(l) || inputJK.equals(p) ) && ( inputSemester == tiga || inputSemester == empat || inputSemester == lima ) && ( (inputBeasiswa.equals(ppa) && inputIpk >= ipkPpa && inputStatus.equals(statusT) ) || ( inputIpk >= ipkPpb && inputNilaiAlgo >= nilaiAlgo && (nilaiRata >= nilaiRataMin && nilaiRata <= nilaiRataMax)  ) ) );
		System.out.println( "Diterima ?  : " + qualified );		
	}
}
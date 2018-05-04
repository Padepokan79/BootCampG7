/*
	 Program     : Seleksi Olimpiade Matematika
     Creator     : Khairil
     Created At  : 3 Mei 2018 10:50 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class SeleksiOlimMtk {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Scanner another = new Scanner(System.in);
		String gender, selectionYN, domisili, l, p, y, t, bdg;
		double mtk1, mtk2, nilai;
		boolean bisa;

		System.out.print( "Anda Laki-laki atau perempuan ? L / P >>> " );
		gender = keyboard.next();

		System.out.print( "Pernah ikut seleksi Olimpiade ? Ketik Y / T >>> " );
		selectionYN = keyboard.next();

		System.out.print( "Domisili ? >>> " );
		domisili = another.nextLine();

		System.out.print("Nilai Matematika Semester 1 : ");
		mtk1 = keyboard.nextDouble();

		System.out.print("Nilai Matematika Semester 2 : ");
		mtk2 = keyboard.nextDouble();

		nilai = 8.0;
		l = "L";
		p = "P";
		y = "Y";
		t = "T";
		bdg = "Bandung";

		bisa = ( ( gender.equals(l) || gender.equals(p) ) && (selectionYN.equals(t) && domisili.equals(bdg) && (mtk1 >= nilai && mtk2 >= nilai)) );

		System.out.println( "Boleh mengikuti olimpiade Matematika ? " + bisa);
	}	
}

/*
seleksi untuk olimpiade matematika. laki=laki atau perempuan 

yang belum pernah mengikuti seleksi berdomisili bandung memiliki 

nilai matematika di atas atau sama dengan 8 selama 2 semester. 

Domisili kota bisa lebih dari 1 kata
*/
/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;

public class Ex18Drills3 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	int usia, income, usiaAnak, cute, selisih;
	boolean kakek, nenek, ayah, ibu;
	usiaAnak 	= 25;

	System.out.print("Berapa usia anda sekarang? ");
	usia 	= keyboard.nextInt();

	System.out.print("Seberapa menarik diri anda? ");
	cute 	= keyboard.nextInt();

	System.out.print("Berapa penghasilan anda? ");
	income 	= keyboard.nextInt();

	// kakek
	kakek = usia >= 30 && (cute >= 0 || income >= 5000000);
	if ( kakek ) {
		System.out.println("Kakek, menyetujui");
	}else{
		System.out.println("Kakek, tidak menyetujui");
	}

	// nenek
	nenek = usia > 25 && usia < 40 && (income >= 5000000 || cute >= 8);
	if ( nenek ) {
		System.out.println("nenek, menyetujui");
	}else{
		System.out.println("nenek, tidak menyetujui");
	}

	// ibu
	ibu = usia >= 17 && usia < 30 && income >= 5000000 &&  cute >= 8;
	if ( ibu ) {
		System.out.println("ibu, menyetujui");
	}else{
		System.out.println("ibu, tidak menyetujui");
	}

	// ayah
	selisih = usia - usiaAnak;
	ayah = (selisih <= 5 || selisih <= -5 ) && (income >= 5000000 || cute >= 8);
	if ( ayah ) {
		System.out.println("ayah, menyetujui");
	}else{
		System.out.println("ayah, tidak menyetujui");
	}

	if ( (nenek && kakek) || (nenek && ibu) || (nenek && ayah) || (kakek && ayah) || (kakek && ibu) || (ayah && ibu) ) {
		System.out.println("Anda disetujui keluarga dan dapat menikah");
	}else{
		System.out.println("Anda tidak disetujui keluarga dan tidak dapat menikah");
	}
}

}
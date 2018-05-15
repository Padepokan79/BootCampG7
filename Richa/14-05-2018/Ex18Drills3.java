import java.util.Scanner;

public class Ex18Drills3 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner (System.in);
	int umurPerempuan = 25, umurLaki;
	double penampilan, penghasilan;
	boolean ibu, ayah, kakek, nenek;

	System.out.print ("Umur Anda: ");
	umurLaki = keyboard.nextInt ();

	System.out.println ("Penampilan? (Skala 0.0-10.0)");
	penampilan = keyboard.nextDouble ();

	System.out.println ("Penghasilan? (dalam rupiah)");
	penghasilan = keyboard.nextDouble ();

	ibu = (umurLaki < 30 && umurLaki >= 17) && penghasilan > 5000000 && penampilan >= 8.0;
	ayah = (umurLaki-umurPerempuan < 5 && umurLaki-umurPerempuan>-5) && penghasilan > 5000000 && penampilan >= 8.0;
	kakek = umurLaki >= 30 &&  penghasilan > 5000000;
	nenek = (umurLaki > 25 && umurLaki < 40) && (penghasilan > 5000000 || penampilan >= 8.5);

	if (ibu == true) {
		System.out.println ("Ibu, menyetujui");
	}
	else { 
		System.out.println ("Ibu, tidak menyetujui"); }

	if (ayah == true) {
		System.out.println ("Ayah, menyetujui");
	}
	else { 
		System.out.println ("Ayah, tidak menyetujui"); }


	if (kakek == true) {
		System.out.println ("Kakek, menyetujui");
	}
	else { 
		System.out.println ("Kakek, tidak menyetujui"); }

	if (nenek == true) {
		System.out.println ("nenek, menyetujui");
	}
	else { 
		System.out.println ("nenek, tidak menyetujui"); }

	if ((nenek && kakek) || (ibu && ayah) || (nenek && ibu) || (ayah && kakek) || (nenek && ayah) || (kakek && ibu)) {
		System.out.println ("Anda disetujui keluarga dan dapat menikah"); }

	}
}
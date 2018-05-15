import java.util.Scanner;

public class Ex18Drills2 {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner (System.in);
	int umurPerempuan = 25, umurLaki;
	double penampilan, penghasilan;
	boolean ibu, ayah, kakek, nenek;

	System.out.print ("Umur Anda: ");
	umurLaki = keyboard.nextInt ();

	System.out.println ("Penampilan? (Skala 0.0-10.0)");
	penampilan = keyboard.nextDouble ();

	System.out.println ("Penghasilan? (dalam rupiah))");
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

	if (!nenek && !kakek && !ibu && !ayah) {
		System.out.println ("Tidak ada yang menyetujui"); }

	}
}
/*Kakek, sedang mencarikan pasangan untuk cucu perempuannya.
Pasangannya harus berumur minimal 30 tahun, ganteng atau tidak yang penting Kaya.

Ibu, sedang mencarikan pasangan untuk anak perempuannya.
Pasangannya harus berumur mulai dari 17 tahun dan dibawah 30 tahun,
harus kaya dan ganteng

Ayah, sedang mencarikan pasangan untuk anak perempuannya.
Perbedaan umur pasangannya maksimal 5 tahun, 
harus kaya atau ganteng.

nenek => allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );


umur anak perempuan 25

Penampilan 8
Penghasilan 5.000.000 
*/
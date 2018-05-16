import java.util.Scanner;

public class AlifharIF1 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double bilangan, nol, ganjil, genap;
	String positifNegatif = "y" , riilBulat = "y" , ganjilGenap = "y";

	System.out.println("========================");
	System.out.print ("Masukkan bilangan: ");
	bilangan = keyboard.nextDouble ();

	nol = 0;
	genap = 2;
	ganjil = 1;

	if(bilangan > nol) {
		positifNegatif = "positif";
	}
	else {positifNegatif = "negatif"; 
	}

	if (bilangan%genap == ganjil || bilangan%ganjil == nol) {
		riilBulat = "bulat";
		
		if (bilangan%genap == ganjil) {
			ganjilGenap = "ganjil";
		}
		else {ganjilGenap = "genap";
		}
	}
	else {riilBulat = "riil"; ganjilGenap = "";
	}

	System.out.println("========================");
	System.out.println ("Bilangan tersebut adalah");
	System.out.println ("Bilangan " + riilBulat + " " + ganjilGenap + " " + positifNegatif);
	System.out.println("========================");
	}
}

/*1. Buatlah program untuk mencari jenis sebuah bilangan
Jenis bilangan
Positif, negatif --> riil
		 --> bulat --> genap
			   --> ganjil
=====================================
Masukkan bilangan: 39
=====================================
Bilangan tersebut adalah
Bilangan bulat ganjil positif
=====================================
contoh lain: -32.3 --> bilangan riil negatif
	     // 12.00 --> bilangan bulat genap positif */
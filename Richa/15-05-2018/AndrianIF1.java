import java.util.Scanner;

public class AndrianIF1 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double harga = 0, bayar = 0;
	int jmlLembar;
	String membership;


	System.out.println("===============================");
	System.out.print ("Apakah anda member (Y/N): ");
	membership = keyboard.next ();
	System.out.print ("Banyak lembar yang akan di fotocopy: ");
	jmlLembar = keyboard.nextInt ();

	if (membership.equals ("Y")) {
		harga = 75;
		bayar = harga*jmlLembar;
	}
	else {
		if (jmlLembar < 100) {
			harga = 150;
			bayar = harga*jmlLembar; 
		}
		else if (jmlLembar >=100 && jmlLembar <=200) {
			harga = 100;
			bayar = harga*jmlLembar;
		}
		else if (jmlLembar > 200) {
			harga = 80;
			bayar = harga*jmlLembar;
		}
	}

	System.out.println("===============================");
	System.out.println();
	System.out.println("Harga= " + harga);
	System.out.println("Bayar= " + bayar);
	System.out.println("===============================");
}
}


/*1.	Ada tempat fotokopi "Unity Fotocopy" apabila dia pelanggan pada tempat
	itu maka berapa lembar pun banyaknya dia fotokopi di dapat harga
	Rp.75,-.

	tapi jika dia bukan pelanggan maka :
	a. jika dia fotokopi kurang dari 100 lembar maka dapet harga Rp.150,-
	b. jika fotokopi sebanyak 100-200 lembar dapet harga Rp.100,-
	c. tapi jika fotokopi lebih dari 200 lembar dia dapet harga Rp.80,-

output:
==============================================
Apakah anda member (Y/N)		:....
Banyak lembar yang akan di fotocopy	:....
==============================================

Harga 					=
Bayar					= 
============================================== */
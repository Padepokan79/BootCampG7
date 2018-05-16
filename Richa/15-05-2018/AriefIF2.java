import java.util.Scanner;

public class AriefIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	String merek, status = "y";
	double ram, hdd, processor, harga, batasRAM, batasHDD, batasHarga;

	batasHarga = 10000000;
	batasRAM = 8;
	batasHDD = 1000;


	System.out.println("------------------------------------------");
	System.out.println ("	   PORORO LAPTOP AND PC CENTER        ");
	System.out.println("------------------------------------------");

	System.out.print ("Merek (asus/acer/lenovo/toshiba): ");
	merek= keyboard.next ();

	System.out.print ("RAM (GB): ");
	ram= keyboard.nextDouble();

	System.out.print ("HDD (GB): ");
	hdd= keyboard.nextDouble ();

	System.out.print ("Processor (Ghz): ");
	processor = keyboard.nextDouble ();

	System.out.print ("harga: ");
	harga= keyboard.nextDouble ();

	if (ram >= batasRAM && hdd >= batasHDD && processor >= 2.8 && processor <= 3.5 && harga <= batasHarga) {
		status = "Setuju untuk dibeli";
	}
	else if (ram < batasRAM || hdd < batasHDD) {
		status = "Laptop Ngelag";
	}
	else if (merek.equals ("asus") && harga <= batasHarga) {
		status = "Anda Fanboy";
	}
	else if (merek.equals("asus") && harga > batasHarga ) {
		status = "Anda Sultan Fanboy";
	}




	System.out.println ("Status: " + status);
	System.out.println("------------------------------------------");
	System.out.println ("          Semoga Bermanfaat              ");
	System.out.println("------------------------------------------");
}
}


/*2. Laptop Keroro

Keroro ingin membeli laptop baru agar bisa main game high-end terbaru, budget yang ia keluarkan ingin 7.000.000 dan tidak lebih dari 10.000.000 dengan spesifikasi RAM 8GB, HDD 1TB, Kecepatan Processor ada di rentang 2.8 GHz ~ 3.5 GHz, namun ia akan tetap membeli berapapun harganya jika Kecepatan processor setidaknya 4.2 GHz atau merek gaming ternama. disisi lain ia tidak suka laptop dengan spesifikasi RAM lebih sedikit dari 8 GB, atau HDD kurang dari 500GB

OUTPUT
___________________________________________

	PORORO LAPTOP AND PC CENTER
___________________________________________

Merek		:
RAM		:
HDD		:
Processor	:
Harga		:

Status		: Anda Fanboy			>> Jika Merek ternama yang dibeli
		  Setuju untuk dibeli		>> Jika semua terpenuhi
		  Laptop Ngelag			>> Ram / HDD dibawah keinginan
		  Anda Sultan Fanboy		>> Jika Laptop Mahal dan Merk Ternama
___________________________________________

	     Semoga Bermanfaat
___________________________________________ */
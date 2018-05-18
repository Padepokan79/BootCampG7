/*
	 Program     : Soal 1 - Yana
     Creator     : Khairil
     Created At  : 16 Mei 2018 07:55 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class YanaIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String budiMembeli;
		int sembilanPuluhRibu, seratusRibu, duaRatusRibu, limaRatusRibu, inputUang, hargaTas, hargaDompet, hargaSepatu, hargaJas, hargaKemeja, hargaDasi, sisaUang, diskon, totalBelanja;
		System.out.println("=============================");
		System.out.println("Masukkan nominal uang Budi:");
		inputUang = keyboard.nextInt();

		sembilanPuluhRibu = 90000;
		seratusRibu = 100000;
		duaRatusRibu = 200000;
		limaRatusRibu = 500000;

		hargaTas = 60000;
		hargaDompet = 40000;
		hargaSepatu = 120000;
		hargaJas = 250000;
		hargaKemeja = hargaTas + hargaDompet;
		hargaDasi = hargaDompet;

		budiMembeli = "Budi membeli ";

		if(inputUang > sembilanPuluhRibu && inputUang <= seratusRibu) {
			System.out.println(budiMembeli + "tas seharga " + hargaTas);
			totalBelanja = hargaTas - (hargaTas * 10/100);
			sisaUang = inputUang - totalBelanja;
			System.out.println("Sisa uang budi adalah " + sisaUang);			
		}
		else if(inputUang > seratusRibu && inputUang <= duaRatusRibu) {
			System.out.println(budiMembeli + "tas seharga " + hargaTas);
			System.out.println(budiMembeli + "dompet seharga " + hargaDompet);
			totalBelanja = (hargaTas + hargaDompet) - ( (hargaTas + hargaDompet) * 10/100);	
			sisaUang = inputUang - totalBelanja;
			System.out.println("Sisa uang budi adalah " + sisaUang);			
		}
		else if(inputUang > duaRatusRibu && inputUang <= limaRatusRibu) {
			System.out.println(budiMembeli + "tas seharga " + hargaTas);
			System.out.println(budiMembeli + "sepatu seharga " + hargaSepatu);
			totalBelanja = (hargaTas + hargaSepatu) - ( (hargaTas + hargaSepatu) * 10/100);
			sisaUang = inputUang - totalBelanja;
			System.out.println("Sisa uang budi adalah " + sisaUang);			
		}
		else if(inputUang > limaRatusRibu) {
			System.out.println(budiMembeli + "jas seharga " + hargaJas);
			System.out.println(budiMembeli + "kemeja seharga " + hargaKemeja);
			System.out.println(budiMembeli + "dasi seharga " + hargaDasi);
			sisaUang = inputUang - (hargaJas + hargaKemeja + hargaDasi);
			System.out.println("\nSisa uang budi adalah " + sisaUang);
		}
		else {
			System.out.println("Budget di bawah harapan");
		}
	}
}
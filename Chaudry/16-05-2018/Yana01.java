/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Yana01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		String tas, dompet, sepatu, jas;
		double diskon, operasi, kembalian;
		int uangA, uangB, uangC, uangD, inputNominal, hargaTas, hargaDompet, hargaSepatu, hargaJas, hargaKemeja, hargaDasi;	
		tas 	= "tas";
		dompet 	= "dompet";
		sepatu 	= "sepatu";
		jas 	= "jas";	
		uangA 	= 90000;
		uangB 	= 100000;
		uangC 	= 200000;
		uangD 	= 500000;
		hargaTas 	= 60000;
		hargaDompet = 40000;
		hargaSepatu = 120000;
		hargaJas 	= 250000;
		hargaKemeja = hargaTas + hargaDompet;
		hargaDasi 	= hargaDompet;
		diskon 		= 10.0/100;



		System.out.println("============================================");
		System.out.print("Masukan nominal uang Budi : ");
		inputNominal = key.nextInt();
		System.out.println("");

		if ( inputNominal > uangA && inputNominal <= uangB ) {
			System.out.println("Budi membeli Tas seharga Rp. "+hargaTas);
			
			operasi   = hargaTas*diskon;
			operasi   = hargaTas-operasi;
			kembalian = inputNominal - operasi;
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. " + kembalian);
		}
		else if (inputNominal > uangB && inputNominal <= uangC) {
			System.out.println("Budi membeli Tas seharga Rp. "+hargaTas);
			System.out.println("Budi membeli Dompet seharga Rp. "+hargaDompet);
			
			operasi   = (hargaTas+hargaDompet)*diskon;
			operasi   = (hargaTas+hargaDompet) - operasi;
			kembalian = inputNominal - operasi;
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. " + kembalian);
		}
		else if (inputNominal > uangC && inputNominal <= uangD) {
			System.out.println("Budi membeli Tas seharga Rp. "+hargaTas);
			System.out.println("Budi membeli Sepatu seharga Rp. "+hargaSepatu);
			
			operasi   = (hargaTas+hargaSepatu)*diskon;
			operasi   = (hargaTas+hargaSepatu) - operasi;
			kembalian = inputNominal - operasi;
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. " + kembalian);
		}
		else if (inputNominal > uangD) {
			System.out.println("Budi membeli Jas seharga Rp. "+(hargaJas));
			
			System.out.println("Item yang harus dibeli: (Uang mencukupi) ");
			System.out.println("Budi membeli Kemeja seharga Rp. "+(hargaKemeja));
			System.out.println("Budi membeli Dasi seharga Rp. "+(hargaDasi));
			
			operasi   = (hargaJas+hargaKemeja+hargaDasi);
			kembalian = inputNominal - operasi;
			System.out.println("");
			System.out.println("Sisa uang budi adalah Rp. " + kembalian);
		}else{
			System.out.println("Silahkan cari tempat lain :)");
		}

		
		System.out.println("============================================");

	}
}
import java.util.Scanner;

public class RizaldiIF3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double uangRP, uangUSD, kurangBudget, budget, gaji, usd, lama, persentase;

	gaji = 1000000; // dalam rupiah
	budget = 320000; // dalam usd
	usd = 14084;

	System.out.print ("berapa uang Tono: Rp " );
	uangRP = keyboard.nextDouble ();
	uangUSD = uangRP/usd;
	kurangBudget = budget-uangUSD;
	kurangBudget = kurangBudget*usd;

	System.out.println("==============================");

	System.out.printf("uang tono kurang sebesar: Rp %.0f\n", (kurangBudget));
	lama = (kurangBudget/(gaji));
	System.out.printf("lama tono harus menabung : %.0f", lama);
	System.out.println  (" bulan");
	System.out.print ("keterangan : ");

	persentase = (uangUSD/budget) * 100;
	System.out.println ("Persentase uang Tono " + persentase + " %");

	if (uangUSD > (0.9*budget)) {
		System.out.println ("Sabar ton bentar lagi...");
	}
	else if (uangUSD > (0.6*budget)) {
		System.out.println ("jual rumah aja...");
	}

	else if (uangUSD > (0.4*budget)) {
		System.out.println ("bisa pergi, gak usah pulang...");
	}

}
}
	


/*tono ingin membeli tiket liburan ke bulan seharga 320000 usd.
gaji tono perbulan : Rp 1.000.000

inputan :
berapa uang tono            : Rp
====================================================
uang tono kurang sebesar    : Rp
lama tono harus menabung    : bulan
keterangan                  : sebutkan persentase uang tono ke harga tiket + catatan

berapa lama lagi tono harus menabung dari uang gaji bulanan nya ?

- jika uang tono lebih dari 90% dari harga tiket tulis catatan di keterangan " Sabar ton bentar lagi..."
- jika uang tono lebih dari 60% dari harga tiket tulis catatan di keterangan " jual rumah aja..."
- jika uang tono kurang dari 40% dari harga tiket tulis catatan di keterangan " bisa pergi, gak usah pulang..."*/
package soalKangHendra4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *SoalArrayList
 * CreditCard.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 13.06.09 22 Jun 2018
 */
public class CreditCard implements IuranBulanan{
//	ArrayList<String> jenisKartu = new ArrayList<String>(Arrays.asList("Visa Gold", "Master Titanium", "Visa Platinum", "Master Worldmiles"));
	String jenis, pemilik;
	int jumlah;
	public CreditCard(String pemilik, String jenis, int jumlah) {
		this.pemilik = pemilik;
		this.jenis = jenis;
		this.jumlah = jumlah;
	}
	int tagihanPertahun() {
		if (jenis.equalsIgnoreCase("Visa Gold")) {
			return iuranVisaGold*jumlah;
		}
		else if (jenis.equalsIgnoreCase("Master Titanium")) {
			return iuranMasterTitanium*jumlah;
		}
		else if (jenis.equalsIgnoreCase("Visa Platinum")) {
			return iuranVisaPlatinum*jumlah;
		}
		else if (jenis.equalsIgnoreCase("Master WorldMiles")) {
			return iuranMasterWorldMiles*jumlah;
		}
		else {
			System.out.println("Jenis Kartu tidak ditemukan");
			return 0;
		}
	}

}

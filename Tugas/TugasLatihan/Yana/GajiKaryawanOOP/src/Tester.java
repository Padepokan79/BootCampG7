
public class Tester extends Karyawan implements Gapok, Lembur, Tunjangan, Bonus, BPJS{
	double gapok, uangLembur, uangTunjangan, bonus, gajiKotor, bpjsKesehatan, bpjsKetenagakerjaan;
	
	public Tester(String nama, String nik, String penempatan, String posisi, String pengalaman, int masaKerja, int jamLembur, int jumlahTC, boolean married) {
		super(nama, nik, penempatan, posisi, pengalaman);
		getGapok(masaKerja);
		hitungTujangan(married);
		hitungBonus(jumlahTC);
		hitungLembur(jamLembur);
		gajiKotor();
	}
	
	public double getUMK() {
		double umk = 0;
		if (getPenempatan().equalsIgnoreCase("Bandung")) {
			umk = umkBandung;
		}
		else if (getPenempatan().equalsIgnoreCase("Jakarta")) {
			umk = umkJakarta;
		}
		else if (getPenempatan().equalsIgnoreCase("Karawang")) {
			umk = umkKarawang;
		}
		return umk;
	}
	
	public double getGapok(int masaKerja) {
		if (getPengalaman().equalsIgnoreCase("Junior")) {
			if (masaKerja > maxJunior)
				masaKerja = maxJunior;
			gapok = getUMK() * tsJunior[masaKerja];
		}
		else if (getPengalaman().equalsIgnoreCase("Middle")) {
			if (masaKerja > maxMiddle)
				masaKerja = maxMiddle;
			gapok = getUMK() * tsMiddle[masaKerja];
		}
		else if (getPengalaman().equalsIgnoreCase("Senior")) {
			if (masaKerja > maxSenior)
				masaKerja = maxSenior;
			gapok = getUMK() * tsSenior[masaKerja];
		}
		return gapok;
	}
	
	public double hitungLembur(int jamLembur) {
		uangLembur = jamLembur * rumusLembur * (gapok + bonus + uangTunjangan);
		return uangLembur;
	}
	
	@Override
	public double hitungTujangan(boolean married) {
		double ttransport 	= 0;
		double tkeluarga	= 0;
		double tposisi		= 0;
		if (married == true)
			tkeluarga = (tunjanganKeluarga * gapok);
		else
			tkeluarga = 0;
		
		if (getPengalaman().equalsIgnoreCase("Junior")) {
			tposisi = tunjanganJunior;					
		}
		else if (getPengalaman().equalsIgnoreCase("Middle")) {
			tposisi = tunjanganMiddle;					
		}
		else if (getPengalaman().equalsIgnoreCase("Senior")) {
			tposisi = tunjanganSenior;					
		}
		
		if (getPenempatan().equalsIgnoreCase("Jakarta"))
			ttransport = transportasi;
		else
			ttransport = 0;
		return uangTunjangan = tkeluarga + tposisi + ttransport;
	}
	
	public double hitungBonus(int jumlahTC) {
		bonus = jumlahTC/perTS * bonusTs;
		if (bonus > maxBonus) {
			bonus = maxBonus;
		}
		return bonus;
	}
	
	public double gajiKotor() {
		return gajiKotor = gapok + uangLembur + uangTunjangan + bonus;
	}
	
	public double potonganBPJS() {
		bpjsKesehatan 		= gajiKotor * bpjs;
		bpjsKetenagakerjaan = gajiKotor + bpjs;
		return bpjsKesehatan + bpjsKetenagakerjaan;
	}
	
	public String toString() {
		return 	""+super.toString()+
				"\nGaji Pokok : "+String.format("%.0f", gapok)+", Uang Lembur : "+String.format("%.0f", uangLembur)+", Uang Tunjangan : "+String.format("%.0f", uangTunjangan)+", Uang Bonus : "+String.format("%.0f", bonus)+
				"\nGajiKotor : "+String.format("%.0f", gajiKotor)+"\nPotongan BPJS : "+String.format("%.0f", potonganBPJS());	
	}
}

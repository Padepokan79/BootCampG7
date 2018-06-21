
public class SistemAnalis extends Karyawan implements Gapok, Lembur, Tunjangan, BPJS{
	double gapok, uangLembur, uangTunjangan, gajiKotor, bpjsKesehatan, bpjsKetenagakerjaan;
	
	public SistemAnalis(String nama, String nik, String penempatan, String posisi, String pengalaman, int masaKerja, int jamLembur, boolean married) {
		super(nama, nik, penempatan, posisi, pengalaman);
		getGapok(masaKerja);
		hitungTujangan(married);
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
			gapok = getUMK() * saJunior[masaKerja];
		}
		else if (getPengalaman().equalsIgnoreCase("Middle")) {
			if (masaKerja > maxMiddle)
				masaKerja = maxMiddle;
			gapok = getUMK() * saMiddle[masaKerja];
		}
		else if (getPengalaman().equalsIgnoreCase("Senior")) {
			if (masaKerja > maxSenior)
				masaKerja = maxSenior;
			gapok = getUMK() * saSenior[masaKerja];
		}
		return gapok;
	}
	
	public double hitungLembur(int jamLembur) {
		uangLembur = jamLembur * rumusLembur * (gapok + uangTunjangan);
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
	
	public double gajiKotor() {
		return gajiKotor = gapok + uangLembur + uangTunjangan;
	}
	
	public double potonganBPJS() {
		bpjsKesehatan 		= gajiKotor * bpjs;
		bpjsKetenagakerjaan = gajiKotor + bpjs;
		return bpjsKesehatan + bpjsKetenagakerjaan;
	}
	
	public String toString() {
		return 	""+super.toString()+
				"\nGaji Pokok : "+String.format("%.0f", gapok)+", Uang Lembur : "+String.format("%.0f", uangLembur)+", Uang Tunjangan : "+String.format("%.0f", uangTunjangan)+
				"\nGajiKotor : "+String.format("%.0f", gajiKotor)+"\nPotongan BPJS : "+String.format("%.0f", potonganBPJS());		
	}
}

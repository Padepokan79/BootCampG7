import java.util.HashMap;
import java.util.Map;

public class Tester extends Karyawan implements Gapok, Lembur, Tunjangan, Bonus, BPJS, Pph{
	double gapok, uangLembur, uangTunjangan, bonus, gajiKotor, bpjsKesehatan, bpjsKetenagakerjaan, jumlahKeluarga;
	
	public Tester(String nama, String nik, String penempatan, String posisi, String pengalaman, int masaKerja, int jamLembur, int jumlahTC, boolean married) {
		super(nama, nik, penempatan, posisi, pengalaman);
		getGapok(masaKerja);
		hitungTujangan(married);
		hitungBonus(jumlahTC);
		hitungLembur(jamLembur);
		gajiKotor();
	}
	
	public double getUMK() {
		HashMap<String, Double> listGajiKota = new HashMap<String, Double>();
		listGajiKota.put(bdg, umkBandung);
		listGajiKota.put(jkt, umkJakarta);
		listGajiKota.put(krw, umkKarawang);

		double umk = 0;
		for(Map.Entry gajiKota : listGajiKota.entrySet()) {
			if (getPenempatan().equalsIgnoreCase((String) gajiKota.getKey())) {
				umk = (double) gajiKota.getValue();
			}
		}
		return umk;	
	}
	
	public double getGapok(int masaKerja) {
		
		HashMap<String, Integer> listPengalaman = new HashMap<String, Integer>();
		listPengalaman.put(jnr, maxJunior);
		listPengalaman.put(mdl, maxMiddle);
		listPengalaman.put(snr, maxSenior);
		
		if (getPengalaman().equalsIgnoreCase("Junior")) {
			if (masaKerja > maxJunior)
				masaKerja = maxJunior;
			gapok = getUMK() * listTsJunior.get(masaKerja);
		}
		else if (getPengalaman().equalsIgnoreCase("Middle")) {
			if (masaKerja > maxMiddle)
				masaKerja = maxMiddle;
			gapok = getUMK() * listTsMiddle.get(masaKerja);
		}
		else if (getPengalaman().equalsIgnoreCase("Senior")) {
			if (masaKerja > maxSenior)
				masaKerja = maxSenior;
			gapok = getUMK() * listTsSenior.get(masaKerja);
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
		if (married == true) {
			tkeluarga = (tunjanganKeluarga * gapok);
			jumlahKeluarga = 2;
		}else {
			tkeluarga = 0;
			jumlahKeluarga 	= 1;
		}
		
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
		bpjsKetenagakerjaan = gajiKotor * bpjs;
		return bpjsKesehatan + bpjsKetenagakerjaan;
	}
	
	public double pph() {
		double	biayaJabatan 			= 0,
				iuranPensiun 			= 0,
				pengurangan 			= 0,
				penghasilanNetto 		= 0,
				penghasilanNettoTahun	= 0,
				ptkp = 0, pkp = 0,
				pphTahun				= 0,
				tunjanganPPH			= 0;
		
		biayaJabatan 			= gajiKotor * biayaJabatanPPH;
		iuranPensiun			= (gapok + tunjanganKeluarga) * iuranPensiun;
		pengurangan 			= biayaJabatan + iuranPensiun;
		penghasilanNetto		= gajiKotor - pengurangan;
		penghasilanNettoTahun	= penghasilanNetto  * bulan;
		ptkp					= pribadi + ((jumlahKeluarga - penguranganKel)*kawin);
		pkp						= penghasilanNettoTahun - ptkp;
		
		if (pkp < bebasPajak) {
			tunjanganPPH = 0;
		}
		else {
			if (pkp <= batasPKP1) {
				pphTahun = persenBatasPKP1  * pkp ;
			}
			else if (pkp > batasPKP1 && pkp <= batasPKP2) {
				pphTahun = ( persenBatasPKP1 * batasPKP1) + (persenBatasPKP2 * (pkp - batasPKP1));
			}
			else if (pkp > batasPKP2 && pkp <= batasPKP3) {
				pphTahun = ( persenBatasPKP1 * batasPKP1 ) + (persenBatasPKP2 * batasPKP2) + (persenBatasPKP3 * (pkp - batasPKP1 - batasPKP2));
			}
			else if (pkp > batasPKP3) {
				pphTahun = ( persenBatasPKP1 * batasPKP1) + (persenBatasPKP2 * batasPKP2) + (persenBatasPKP3 * batasPKP2) + (persenBatasPKP4 * (pkp - batasPKP1 - batasPKP2 - batasPKP3));
			}
			tunjanganPPH = pphTahun / bulan;
		}
		
		return tunjanganPPH;
	}
	
	public double gaji() {
		return (gajiKotor + bonus - pph() - potonganBPJS() );
	}
	
	public String toString() {
		return 	""+super.toString()+
				"\nGaji Pokok : "+String.format("%.0f", gapok)+", Uang Lembur : "+String.format("%.0f", uangLembur)+", Uang Tunjangan : "+String.format("%.0f", uangTunjangan)+", Uang Bonus : "+String.format("%.0f", bonus)+
				"\nGajiKotor : "+String.format("%.0f", gajiKotor)+"\nPotongan BPJS : "+String.format("%.0f", potonganBPJS())+
				"\nPotongan PPH : "+String.format("%.0f", pph())+
				"\nTake Home Pay : "+String.format("%.0f", gaji());	
	}
}

package PenggajianKaryawan;

import java.util.*;
public class SistemAnalis extends Karyawan implements BasicSalary, Tunjangan, Potongan {
	private double gapok, umk, lembur, bpjsKesehatan, bpjsKetenagakerjaan, potonganPPH;
	private double tunjanganKeluarga=0, tunjanganTransport=0, tunjanganPegawai=0;
	
	public SistemAnalis(String nama, String nik, String penempatan, String pengalaman, int masaKerja, boolean married, int jamLembur) {
		super(nama, nik, penempatan, "Sistem Analis", pengalaman);
		setGapok(masaKerja);
		
		hitungTunjangan(married);
		hitungLembur(jamLembur);
		
		hitungBPJS();
		hitungPPH(married);
	}
	
	public SistemAnalis(String nama, String nik, String penempatan, String pengalaman, int masaKerja, int jamLembur) {
		super(nama, nik, penempatan, "SistemAnalis", pengalaman);
		setGapok(masaKerja);
		
		hitungTunjangan();
		hitungLembur(jamLembur);
		
		hitungBPJS();
		hitungPPH(false);
	}
	
	private void hitungLembur(int jamLembur) {
		lembur=1.5*1.0/173.0*(gapok+getTunjangan())*jamLembur;
	}
	
	public double getTunjangan() {
		return tunjanganKeluarga+tunjanganPegawai+tunjanganTransport;
	}
	
	public void hitungTunjangan(boolean married) {
		
		if(married)
			tunjanganKeluarga=keluarga*gapok;
		
		if(getPengalaman().equalsIgnoreCase("Junior"))
			tunjanganPegawai=tunjanganJunior;
		else if(getPengalaman().equalsIgnoreCase("Middle"))
			tunjanganPegawai=tunjanganMiddle;
		else if(getPengalaman().equalsIgnoreCase("Senior"))
			tunjanganPegawai=tunjanganSenior;
		
		if(getPenempatan().equalsIgnoreCase("Jakarta"))
			tunjanganTransport=transportJakarta;
		
	}
	
	public void hitungTunjangan() {
		
		if(getPengalaman().equalsIgnoreCase("Junior"))
			tunjanganPegawai=tunjanganJunior;
		else if(getPengalaman().equalsIgnoreCase("Middle"))
			tunjanganPegawai=tunjanganMiddle;
		else if(getPengalaman().equalsIgnoreCase("Senior"))
			tunjanganPegawai=tunjanganSenior;
		
		if(getPenempatan().equalsIgnoreCase("Jakarta"))
			tunjanganTransport=transportJakarta;
		
	}

	public void setUMK() {
		HashMap<String, Double> hUmk = new HashMap<String, Double>();
		hUmk.put("Bandung", 3091345.56);
		hUmk.put("Jakarta", 3648035.82);
		hUmk.put("Karawang", 3919291.19);
		for (HashMap.Entry<String, Double> um : hUmk.entrySet()) {
			if(getPenempatan().equalsIgnoreCase(um.getKey())) 
				umk = um.getValue();
		}
	}

	public void setGapok(int masaKerja) {
		setUMK();
		if(getPengalaman().equalsIgnoreCase("Junior")) {
			if(masaKerja>=pgJunior.size())
				masaKerja=pgJunior.size()-1;
			gapok=umk*pgJunior.get(masaKerja);
		}
		else if(getPengalaman().equalsIgnoreCase("Middle")) {
			if(masaKerja>=pgMiddle.size())
				masaKerja=pgMiddle.size()-1;
			gapok=umk*pgMiddle.get(masaKerja);
		}
		else if(getPengalaman().equalsIgnoreCase("Senior")) {
			if(masaKerja>=pgSenior.size())
				masaKerja=pgSenior.size()-1;
			gapok=umk*pgSenior.get(masaKerja);
		}
	}

	double getBruto() {
		return gapok+getTunjangan()+lembur;
	}

	public void hitungBPJS() {
		bpjsKesehatan=bpjs*(gapok+getTunjangan());
		bpjsKetenagakerjaan=bpjs*(gapok+getTunjangan());
	}
	
	public void hitungPPH(boolean married) {
		double biayaJabatan, iuranPensiun, nettoBulan, nettoTahun, ptkp, pkp, pphTahun;
		double[] arrayPKP= {0, 0, 0, 0};
		
		biayaJabatan=jabatan*getBruto();

		iuranPensiun=pensiun*(gapok);
		
		if(married)
			ptkp=wpPribadi+wpKawin;
		else
			ptkp=wpPribadi;
		
		nettoBulan=getBruto()-(biayaJabatan+iuranPensiun);
		nettoTahun=12*nettoBulan;
		
		pkp=nettoTahun-ptkp;
		
		if(pkp>=0 && pkp<=50000000){
			pphTahun=0.05*pkp;
		} else {
			if(pkp>50000000){
				arrayPKP[0]=50000000;
				arrayPKP[1]=pkp-50000000;
			}
			if(pkp>250000000){
				arrayPKP[1]=200000000;
				arrayPKP[2]=pkp-250000000;
			}
			if(pkp>500000000){
				arrayPKP[2]=250000000;
				arrayPKP[3]=pkp-500000000;
			}
			pphTahun=0.05*arrayPKP[0]+0.15*arrayPKP[1]+0.25*arrayPKP[2]+0.3*arrayPKP[3];
		}
		
		potonganPPH=pphTahun/12;

	}

	@Override
	public String toString() {
		return getPosisi()+super.toString() + "\nGaji Pokok\t: Rp. "+ String.format("%.0f", gapok) 
		+ "\nTunjangan Keluarga\t: Rp. " + String.format("%.0f", tunjanganKeluarga) + "\nTunjangan Pegawai\t: Rp. " + String.format("%.0f", tunjanganPegawai) + "\nTunjangan Transport\t: Rp. " + String.format("%.0f", tunjanganTransport)
		+ "\nLembur\t\t: Rp. " + String.format("%.0f", lembur) + "\nGaji Kotor\t: Rp. " + String.format("%.0f", getBruto()) 
		+ "\nBPJS Kesehatan\t: Rp. " + String.format("%.0f", bpjsKesehatan) + "\nBPJS Ketenagakerjaan\t: Rp. " + String.format("%.0f", bpjsKetenagakerjaan) + "\nPotongan PPH\t: Rp. " + String.format("%.0f", potonganPPH) ;
	}

}

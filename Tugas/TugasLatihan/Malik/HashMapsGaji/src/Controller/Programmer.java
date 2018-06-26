package Controller;

import java.util.ArrayList;
import java.util.HashMap;

import Interface.Allowance;
import Interface.BasicSalary;
import Interface.SalaryCuts;

public class Programmer extends Gaji implements BasicSalary, Allowance, SalaryCuts{
	private double 
			lembur = 0, tunjangan = 0, bonus = 0, basicSalary = 0, 
			umk = 0, brutoSalary = 0, potBpjsKes = 0, potBpjsKet, potPph = 0, 
			potBpjs = 0, tunjanganKeluarga = 0, tunjanganTrans = 0, tunjanganKaryawan = 0 ;
	private double[] arrayPkp = {0,0,0,0};
	
	public Programmer(String name, String nik, String penempatan, String pengalaman, int masaKerja, boolean married, int jmlBug, int jam) {
		super(name, nik, penempatan, "Programmer", pengalaman);
		setUmk();
		setBasicSalary(masaKerja);
		hitungTunjangan(married);
		hitungBonus(jmlBug);
		hitungLembur(jam);
		grossSalary();
		bpjsKesehatan();
		bpjsKetenagakerja();
		potonganBpjs();
		potonganPph(married);
	}
	
	@Override
	public void hitungTunjangan(boolean married) {
		if (married == true) {
			tunjanganKeluarga = allowanceFamily*basicSalary; 
		}
		if (getPengalaman().equalsIgnoreCase("Junior")) {
			tunjanganKaryawan = allowanceJunior;
		}else if (getPengalaman().equalsIgnoreCase("Middle")) {
			tunjanganKaryawan = allowanceMiddle;
		}else if (getPengalaman().equalsIgnoreCase("Senior")) {
			tunjanganKaryawan = allowanceSenior;
		}
		if (getPenempatan().equalsIgnoreCase("Jakarta")) {
			tunjanganTrans = allowanceTrans;
		}
		tunjangan = tunjanganKeluarga+tunjanganKaryawan+tunjanganTrans;
	}
	
	public void hitungBonus(int jmlBug) {
		bonus = 20000*jmlBug;
		if (bonus > 500000) {
			bonus = 500000;
		}
	}
	
	public void hitungLembur(int jam) {
		if (jam == 0) {
			lembur = 0;
		}else {
			lembur = (1.5*1.0/173*(basicSalary+bonus+tunjangan))*jam;
		}
	}

	@Override
	public void setUmk() {
		if (getPenempatan().equalsIgnoreCase("Bandung")) {
			umk = umkBandung;
		}else if (getPenempatan().equalsIgnoreCase("Jakarta")) {
			umk =  umkJakarta;
		}else if(getPenempatan().equalsIgnoreCase("Karawang")) {
			umk = umkKarawang;
		}
	}

	@Override
	public void setBasicSalary(int masaKerja) {
		if (getPengalaman().equalsIgnoreCase("Junior") ) {
			if (masaKerja>=arrayPgJunior.size()) {
				masaKerja = arrayPgJunior.size()-1;
			}
			basicSalary = umk*arrayPgJunior.get(masaKerja);
		}else if (getPengalaman().equalsIgnoreCase("Middle")) {
			if (masaKerja>=arrayPgMiddle.size()) {
				masaKerja = arrayPgMiddle.size()-1;
			}
			basicSalary = umk*arrayPgMiddle.get(masaKerja);
		}else if (getPengalaman().equalsIgnoreCase("Senior")) {
			if (masaKerja>=arrayPgSenior.size()) {
				masaKerja = arrayPgSenior.size()-1;
			}
			basicSalary = umk*arrayPgSenior.get(masaKerja);
		}
	}
	
	public void grossSalary() {
		brutoSalary = basicSalary+bonus+tunjangan+lembur; 
	}
	
	@Override
	public void bpjsKesehatan() {
		potBpjsKes = bpjs*(basicSalary+tunjangan);
		
	}

	@Override
	public void bpjsKetenagakerja() {
		potBpjsKet = bpjs*(basicSalary+tunjangan);
		
	}
	
	public void potonganBpjs() {
		potBpjs = potBpjsKes+potBpjsKet;
	}
	
	public void potonganPph(boolean married) {
		double biayaJabatan = 0, iuranPensiun = 0, nettoBulan = 0, 
				nettoTahun = 0, ptkp = 0, pkp = 0, pphTahun = 0;
		
		biayaJabatan = posPph*brutoSalary;
		iuranPensiun = pensiunPph*(basicSalary+tunjanganKeluarga);
		nettoBulan	 = brutoSalary-(biayaJabatan+iuranPensiun);
		nettoTahun   = nettoBulan*12;
		if (married) {
			ptkp 	 = wpPribadi+wpKawin;
		}else {
			ptkp     = wpPribadi;
		}
		pkp 		 = nettoTahun - ptkp;
		
		if (pkp <= 50000000) {
			pphTahun = 0.05*pkp;
		}else {
			if (pkp > 50000000) {
				arrayPkp[0] = 50000000;
				arrayPkp[1] = pkp-50000000;
			}
			if (pkp > 250000000) {
				arrayPkp[1] = 200000000;
				arrayPkp[2] = pkp-250000000;
			}
			if (pkp > 500000000) {
				arrayPkp[2] = 250000000;
				arrayPkp[3] = pkp-500000000;
			}
		pphTahun = 0.05*arrayPkp[0]+0.15*arrayPkp[1]+0.25*arrayPkp[2]+0.3*arrayPkp[3];	
		potPph 	 = pphTahun/12;	
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nGaji Pokok\t: Rp. "+String.format("%.0f", basicSalary)+
				"\nTunjangan\t: Rp. "+String.format("%.0f", tunjangan)+
				"\nBonus\t\t: Rp. "+String.format("%.0f", bonus)+
				"\nLembur\t\t: Rp. "+String.format("%.0f", lembur)+
				"\n\nTunjangan Keluarga : Rp. "+tunjanganKeluarga+
				"\nTunjangan Karyawan : Rp. "+tunjanganKaryawan+
				"\nTunjangan Transport : Rp. "+tunjanganTrans+
				"\nGaji Kotor\t: Rp. "+String.format("%.0f", brutoSalary)+
				"\n\nPotongan Bpjs Kes : Rp. "+String.format("%.0f", potBpjsKes)+
				"\nPotongan Bpjs Ket : Rp. "+String.format("%.0f", potBpjsKet)+
				"\nPotongan PPH : Rp. "+String.format("%.0f", potPph)+
				"\n\nTake Home : Rp. "+String.format("%.0f", (basicSalary-(potBpjs+potPph)))+
				"\n\n========================================";
	}

	
}

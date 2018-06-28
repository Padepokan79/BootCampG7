/*
 * DATE CREATED : 25 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

package Sistem;

import Interface.PengalamanKerja;
import Interface.Potongan;
import Interface.Tunjangan;
import Interface.UmkKota;

public class Tester extends Karyawan implements UmkKota, PengalamanKerja, Tunjangan, Potongan {
	
	private double umk, gapok, gajiBersih, bonus, tunPegawai, tunTransport, tunKeluarga = 0, uangLembur, potBpjs, gajiKotor, nettoBulan, nettoSetahun, biayaJabat, iuranPen, ptkp, pkp, pphSetahun, pphSebulan;
	int lembur, testCase, masaKerja;
	boolean statusKawin;
	double[] arrPkp = new double[4];
	
	public Tester(String nama, String nik, String penempatan, String posisi, String tingkatan, int masaKerja, int testCase, int lembur, boolean statusKawin) {
		super(nama, nik, penempatan, posisi, tingkatan);
		this.masaKerja = masaKerja;
		this.testCase = testCase;
		this.lembur = lembur;
		this.statusKawin = statusKawin;
	}
	
	int getMasaKerja() {
		return masaKerja;
	}
	boolean getStatusKawin() {
		return statusKawin;
	}

	@Override
	public double getUmk() {
		if (getPenempatan().equals("Bandung")) {
			umk = umkBandung;
		
		}else if(getPenempatan().equals("Jakarta")) {
			umk = umkJakarta;
		
		}else if(getPenempatan().equals("Karawang")) {
			umk = umkKarawang;
		}
		return umk;
	}
	
	public double getGapok(int masaKerja) {
		if(getTingkatan().equals("Junior")) {
			if(masaKerja >= arrTsJunior.size()) {
				masaKerja = arrTsJunior.size() - 1;
			}
			gapok = getUmk()*arrTsJunior.get(masaKerja);
			
		}else if(getTingkatan().equals("Middle")) {
			if(masaKerja >= arrTsMiddle.size()) {
				masaKerja = arrTsMiddle.size() - 1;
			}
			gapok = getUmk()*arrTsMiddle.get(masaKerja);
			
		}else if(tingkatan.equals("Senior")) {
			if(masaKerja >= arrTsSenior.size()) {
				masaKerja = arrTsSenior.size() - 1;
			}
			gapok = getUmk()*arrTsSenior.get(masaKerja);
		}
		return Math.round(gapok);
	}
	
	public double getBonus() {
		bonus = (testCase/100)*textCaseFix;
		if(bonus > 500000) {
			bonus = 500000;
		}
		return bonus;
	}
	
	public double getTunPegawai() {
		if(getTingkatan().equals("Junior")) {
			tunPegawai = tunjanganJunior;
			
		}else if(getTingkatan().equals("Middle")) {
			tunPegawai = tunjanganMiddle;
			
		}else if(getTingkatan().equals("Senior")) {
			tunPegawai = tunjanganSenior;
		}
		return tunPegawai;
	}
	
	public double getTunTransport() {
		if(getPenempatan().equals("Jakarta")) {
			tunTransport = tunjanganTransport;
		}
		return tunTransport;
	}
	
	public double getTunKeluarga(boolean status) {
		if(status == true) {
			tunKeluarga = tunjanganKeluarga*getGapok(getMasaKerja());
		}
		return Math.round(tunKeluarga);
	}
	
	public double getUangLembur() {
		uangLembur = ( 1.5 * 1.0/173.0 * (getGapok(getMasaKerja()) + getTunPegawai() + getTunKeluarga(getStatusKawin()) + getTunTransport() + getBonus()) )*lembur;
		return Math.round(uangLembur);
	}
	
	public double getPotBpjs() {
		potBpjs = potBpjsKaryawan*(getGapok(getMasaKerja()) + getTunPegawai() + getTunTransport() + getTunKeluarga(getStatusKawin()));
		return Math.round(potBpjs);
	}
	
	public double getPotPph(boolean statusKawin) {
		
		gajiKotor  = getGapok(getMasaKerja()) + getTunKeluarga(getStatusKawin());
		biayaJabat = biayaJabatan*gajiKotor;
		iuranPen   = iuranPensiun*(getGapok(getMasaKerja()) + getTunKeluarga(getStatusKawin()));
		nettoBulan = gajiKotor - (biayaJabat + iuranPen);
		nettoSetahun  = nettoBulan*12;
		
		if (statusKawin) {
			ptkp = ptkpPribadi + ptkpMenikah;
		
		}else {
			ptkp = ptkpPribadi;
		}
		
		pkp = nettoSetahun - ptkp;
		if(pkp <= 0) {
			pphSebulan = 0;
			
		}else {
			if (pkp <= tarifPph50) {
				pphSetahun = pkp*0.05;
			
			}else {
				if (pkp > tarifPph50) {
					arrPkp[0] = tarifPph50;
					arrPkp[1] = pkp - tarifPph50;
				}
				if (pkp > tarifPph250) {
					arrPkp[1] = tarifPph200;
					arrPkp[2] = pkp - tarifPph250;
				}
				if (pkp > tarifPph500) {
					arrPkp[2] = tarifPph250;
					arrPkp[3] = pkp - tarifPph500;
				}
				pphSetahun = arrPkp[0]*0.05 + arrPkp[1]*0.15 + arrPkp[2]*0.25 + arrPkp[3]*0.3;
			}
			pphSebulan = pphSetahun/12;
		}
		return Math.round(pphSebulan);
	}
	
	public double getGajiBersih() {
		gajiBersih = ( getGapok(getMasaKerja()) + getBonus() + getTunPegawai() + getTunTransport() + getTunKeluarga(getStatusKawin()) + getUangLembur() ) - ( getPotBpjs()*2 + getPotPph(getStatusKawin()) );
		return gajiBersih;
	}
	
	
	
	public void tampilData() {
		super.tampilData();
		System.out.println("Jam Lembur     : "+lembur);
		System.out.println("Fix Bug        : "+testCase);
		System.out.println("Gaji Pokok     : Rp."+getGapok(getMasaKerja()));
		System.out.println("---------------------------------------------");
		System.out.println("Bonus                : Rp."+getBonus());
		System.out.println("Tunjangan Pegawai    : Rp."+getTunPegawai());
		System.out.println("Tunjangan Transport  : Rp."+getTunTransport());
		System.out.println("Tunjangan Keluarga   : Rp."+getTunKeluarga(getStatusKawin()));
		System.out.println("Uang Lembur          : Rp."+getUangLembur());
		System.out.println("---------------------------------------------");
		System.out.println("Pot Bpjs kesehatan         : Rp."+getPotBpjs());
		System.out.println("Pot Bpjs ketenagakerjaan   : Rp."+getPotBpjs());
		System.out.println("Pot Pph                    : Rp."+getPotPph(getStatusKawin()));
		System.out.println("---------------------------------------------");
		System.out.println("Gaji Bersih                : Rp."+getGajiBersih());
	}
	
}

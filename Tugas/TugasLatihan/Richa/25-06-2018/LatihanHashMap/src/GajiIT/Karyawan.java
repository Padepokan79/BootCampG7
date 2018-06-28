package GajiIT;

import java.util.*;

/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

public class Karyawan extends Person implements TunjanganKeluarga, TunjanganPegawai, Bpjs, Lembur, Pph {
	private Boolean isMaried;
	private int masaKerja;
	private String nik, penempatanKerja, lvlKaryawan, bagianKaryawan;
	private Double gapok, tunjTrans, tunjKeluarga,tunjPegawai, totalLembur, bpjs, besarPTKP, besarPKP, pph;

	private double totalPenghasilan; //gapok + tunjangan 

	public Karyawan(String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, boolean isMaried) {
		super(nama);
		this.nik=nik;
		this.lvlKaryawan=lvlKaryawan;
		this.penempatanKerja=penempatanKerja;
		this.masaKerja=masaKerja;
		this.isMaried = isMaried;
	}

	public Karyawan() {
		
	}
	public int getMasaKerja() {
		return masaKerja;
	}
	public void setMasaKerja(int masaKerja) {
		this.masaKerja = masaKerja;
	}
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}
	public String getPenempatanKerja() {
		return penempatanKerja;
	}
	public void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	public String getLvlKaryawan() {
		return lvlKaryawan;
	}
	public void setLvlKaryawan(String lvlKaryawan) {
		this.lvlKaryawan = lvlKaryawan;
	}
	public String getBagianKaryawan() {
		return bagianKaryawan;
	}

	public void setBagianKaryawan(String bagianKaryawan) {
		this.bagianKaryawan = bagianKaryawan;
	}

	public Double getGapok() {
		return gapok;
	}
	public Double getTunjTrans() {
		return tunjTrans;
	}

	@Override
	public String toString() {// method override
		return null;
	}
	
	public Double calculateGapok(double umkLokasi) {// method hitung gapok
		return null;
	}
	public Boolean getIsMaried() {
		return isMaried;
	}
	public void setIsMaried(Boolean isMaried) {
		this.isMaried = isMaried;
	}

	
	public Double calculateTunjTrans() {// method hitunga tunjangan transportasi
		if(getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			tunjTrans=1000000.0;
		}
		else {
			tunjTrans=0.0;
		}
		return tunjTrans;
	}
	
	public double TunjanganPegawai () {
		if(lvlKaryawan.equalsIgnoreCase("junior")) {
			tunjPegawai = tunjJunior;
		}
		else if(lvlKaryawan.equalsIgnoreCase("middle")) {
			tunjPegawai = tunjMiddle;
		}
		else if(lvlKaryawan.equalsIgnoreCase("senior")) {
			tunjPegawai = tunjSenior;
		}
		return tunjPegawai;
	}
	
	public double TunjanganKeluarga (boolean isMaried, double gapok) {
		this.isMaried = isMaried;
		
		if (isMaried == true) {
			tunjKeluarga = besarPersenTunjKeluarga*gapok;
		}
		else {
			tunjKeluarga = 0.0;
		}
		return tunjKeluarga;
	}
	
	public double getTotalPenghsilan(double gapok) {
		totalPenghasilan = gapok + tunjKeluarga + tunjPegawai + tunjTrans;
		return totalPenghasilan;
	}
	
	@Override
	public double bpjs (double totalPenghasilan) {
		this.totalPenghasilan = totalPenghasilan;
		bpjs = besarPersenBpjs*totalPenghasilan;
		return bpjs;
	}
	@Override
	public double lembur (int jamLembur, double gajiSebulan) {
		totalLembur = jamLembur*gajiSebulan*besarLembur;
		return totalLembur;
	}
	
	public double ptkp () {
		if (isMaried == false ) {
			besarPTKP = ptkpAwal;
		}
		else {
			besarPTKP = ptkpAwal+3000000;
		}
		return besarPTKP;
	}
	@Override
	public double pkp(double gajiBersih, double ptkp) {
		totalPenghasilan = gajiBersih;
		besarPTKP = ptkp();
		besarPKP = (totalPenghasilan*12)-besarPTKP;
		return besarPKP;
	}
	
	@Override
	public double pph() {
		double pphSetaun=0.0;
		double pph1=0.05, pph2=0.15, pph3=0.25, pph4 =0.3;
		double pphSetaun1=0, pphSetaun2=0, pphSetaun3=0, pphSetaun4=0;
		
		if (besarPKP> 500000000) {
			pphSetaun = (besarPKP  - 500000000)*pph4;
			pphSetaun = pphSetaun4 + (250000000*pph3) + (200000000*pph2) + (50000000*pph1);
		}
		else if (besarPKP > 250000000 && besarPKP  <= 500000000) {
			pphSetaun = (besarPKP  - 250000000)*pph3;
			pphSetaun = pphSetaun3 + (200000000*pph2) + (50000000*pph1);
		}
		else if (besarPKP > 50000000 && besarPKP  <= 250000000 ) {
			pphSetaun = (besarPKP  - 50000000)*pph2;
			pphSetaun = pphSetaun2 + 50000000*pph1;
		}
		else if (besarPKP > 0 && besarPKP  <= 50000000) {
			pphSetaun = besarPKP *pph1;
		}

		else if (besarPKP  <=0) {
			pph = 0.0;
		}
		pph = pphSetaun/12;
		return pph;
	}
	
	
}

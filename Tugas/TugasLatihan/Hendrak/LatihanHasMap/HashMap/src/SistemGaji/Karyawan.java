/*
Created by : Hendra Kurniawan
Date 	   : 20 Juni 2018
Modified   :	
*/
package SistemGaji;

import java.util.ArrayList;
import java.util.Arrays;

public class Karyawan extends Orang implements Umk{
	
	private String nama, nik, penempatanKerja, tingkatan, posisi, menikah; 
	private String bandung="bandung", jakarta="jakarta", karawang= "karawang";
	private int lamaKerja, anak, lembur;
	private double umk, tnjTransport=0.0;
	ArrayList<String> tempatKerja = new ArrayList<String>(Arrays.asList(bandung, jakarta, karawang));
	
	public Karyawan() {
		
	}
	
	public Karyawan(String nama, String nik, String penempatanKerja) {
		this.nama = nama;
		this.nik = nik;
		this.penempatanKerja = penempatanKerja;
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

	
	public String getTingkatan() {
		return tingkatan;
	}

	public void setTingkatan(String tingkatan) {
		this.tingkatan = tingkatan;
	}

	public String getPosisi() {
		return posisi;
	}

	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}

	

	public int getLamaKerja() {
		return lamaKerja;
	}

	
	
	public void setLamaKerja(int lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	
	
	public String getMenikah() {
		return menikah;
	}

	public void setMenikah(String menikah) {
		this.menikah = menikah;
	}

	
	
	public int getAnak() {
		return anak;
	}

	public void setAnak(int anak) {
		this.anak = anak;
	}

	public double getUmk() {
		return umk;
	}

	public double hitungUmk(String penempatanKerja) {
		if(penempatanKerja.equals(bandung)) {
			umk = listUmk.get(0);
			return umk;
		}
		else if(penempatanKerja.equals(jakarta)) {
			umk = listUmk.get(1);
			tnjTransport = 1000000.0;
			return umk;
		}
		else if(penempatanKerja.equals(karawang)) {
			umk = listUmk.get(2);
			return umk;
		}
		else {
			return 0 ;
		}
	}
	
	
	public int getLembur() {
		return lembur;
	}

	public void setLembur(int lembur) {
		this.lembur = lembur;
	}

	@Override
	public String toString() {
		
		return "Nama : " + nama
				+"\nNik : " + getNik()
				+"\nTempat Kerja : " + getPenempatanKerja()
				+"\nUmk : " + hitungUmk(penempatanKerja)
				+"\nMenikah : " + getMenikah()
				+"\nAnak    : " + getAnak()
				;
	}
	
}

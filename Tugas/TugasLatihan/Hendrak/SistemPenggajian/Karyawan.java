package SistemPenggajianKaryawanIT;

public class Karyawan implements Umk{
	private String nama, nik, posisi, tingkatan, penempatan,menikah;
	private int lamaKerja, lembur, jmlAnak;
	private double umk,gapok;
	
	public Karyawan() {
		
	}
	
	public Karyawan(String nik, String nama , String penempatan, String tingkatan) {
		this.nama = nama;
		this.nik = nik;
		this.penempatan = penempatan;
		this.tingkatan = tingkatan;
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

	public String getPenempatan() {
		return penempatan;
	}

	public void setPenempatan(String penempatan) {
		this.penempatan = penempatan;
	}

	public int getLamaKerja() {
		return lamaKerja;
	}

	public void setLamaKerja(int lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	public int getLembur() {
		return lembur;
	}

	public void setLembur(int lembur) {
		this.lembur = lembur;
	}

	public String getNama() {
		return nama;
	}

	public String getNik() {
		return nik;
	}
	
	
	public String getMenikah() {
		return menikah;
	}

	public void setMenikah(String menikah) {
		this.menikah = menikah;
	}


	public double getUmk() {
		return umk;
	}

	public void setUmk(double umk) {
		this.umk = umk;
	}

	public void setGapok(double gapok) {
		this.gapok = gapok;
	}

	public double getGapok() {
		return gapok;
	}
	
	public int getJmlAnak() {
		return jmlAnak;
	}

	public void setJmlAnak(int jmlAnak) {
		this.jmlAnak = jmlAnak;
	}
	
	public double getUmk(String penempatan) {
		if(penempatan.equals("bandung")) {
			umk = umkBandung;
			return umk;	
		}
		else if(penempatan.equals("jakarta")) {
			umk = umkJakarta;
			return umk;	
		}
		else if(penempatan.equals("karawang")) {
			umk = umkKarawang;
			return umk;
		}
		else {
			return 0;
		}
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String toString() {
		return  "\nNIK        : " + nik +
				"\nNama       : " + nama +
				"\nTingkatan  : " + tingkatan +
				"\nLama Kerja : " + lamaKerja +
				"\nPenempatan : " + penempatan +
				"\nLembur     : " + lembur +
				"\nMenikah    : " + menikah +
				"\nUmk        : " + umk  
				;
	}
}

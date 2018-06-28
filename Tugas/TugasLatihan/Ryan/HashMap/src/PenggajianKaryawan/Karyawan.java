package PenggajianKaryawan;

import java.util.Map;

public abstract class Karyawan implements BasicSalary{
	private String nama, nik, penempatan, posisi, pengalaman;
	
	public Karyawan() {}
	public Karyawan(String nama, String nik, String penempatan, String posisi, String pengalaman) {
		this.nama=nama;
		this.nik=nik;
		this.penempatan=penempatan;
		this.posisi=posisi;
		this.pengalaman=pengalaman;
	}
	
	public String getPenempatan() {
		return penempatan;
	}
	
	public String getPosisi() {
		return posisi;
	}
		
	public String getPengalaman() {
		return pengalaman;
	}

	public String toString() {
		return "\nNama\t\t: " + nama + "\nNIK\t\t: " + nik + "\nPenempatan\t: " + penempatan + "\nPosisi\t\t: " + posisi
				+ "\nPengalaman\t: " + pengalaman+" "+posisi;
	}
	
}

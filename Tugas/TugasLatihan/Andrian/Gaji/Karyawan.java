package Gaji;

public class Karyawan extends Person implements Umk {
	private String nama, penempatanKerja, posisi, grade;
	private int nik, masaKerja;
	private double gapok;
	private double[] arrayUmk;
	
	public Karyawan () {
	}
	public Karyawan (String nama, String penempatanKerja, int nik) {
		name = nama;
		this.penempatanKerja = penempatanKerja;
		this.nik = nik;
//		this.posisi = posisi;
//		this.masaKerja = masaKerja;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getPenempatanKerja() {
		return penempatanKerja;
	}
	public void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	public String getPosisi() {
		return posisi;
	}
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public int getMasaKerja() {
		return masaKerja;
	}
	public void setMasaKerja(int masaKerja) {
		this.masaKerja = masaKerja;
	}
	public double getGapok() {
		return gapok;
	}
	public void setGapok(double gapok) {
		this.gapok = gapok;
	}
	public double[] getArrayUmk() {
		return arrayUmk;
	}
	public void setArrayUmk(double[] arrayUmk) {
		this.arrayUmk = arrayUmk;
	}
	public void printAbstract() {
		System.out.println("Name : "+name);
	}
	@Override
	public String setUmkKerja(String posisi, String grade) {
		this.posisi = posisi;
		this.grade = grade;
		if (posisi.equals("Programmer")&& grade.equalsIgnoreCase("junior")) {
			arrayUmk  = arrayPgJunior;
		} else if (posisi.equals("Programmer")&& grade.equalsIgnoreCase("Middle")) {
			arrayUmk  = arrayPgMiddle;
		} else if (posisi.equals("Programmer")&& grade.equalsIgnoreCase("Senior")) {
			arrayUmk  = arrayPgSenior;
		}
		return this.posisi;
	}
	
	@Override
	public double setUmkKerja(int msk) {
		if (msk > arrayUmk.length-1) {
			masaKerja = arrayUmk.length-1;
		} else {
			masaKerja = msk;
		}
		return masaKerja;
	}
	
	@Override
	public double setUmkKerja(String penempatanKerja) {
		double indexKerja = arrayUmk[masaKerja];
		if (penempatanKerja.equalsIgnoreCase("Bandung")) {
			gapok = umkBandung * indexKerja;
		} else if (penempatanKerja.equalsIgnoreCase("Jakarta")) {
			gapok = umkJakarta * indexKerja;
		} else if (penempatanKerja.equalsIgnoreCase("Karawang")) {
			gapok = umkKarawang * indexKerja;
		}
		return 0;
	}

	public String toString (){
		return "Nama : "+name+"\nNIK : "+nik+"\nPenempatan Kerja : "+penempatanKerja+
				"\nPosisi : "+posisi+"\nMasa Kerja : "+masaKerja+" Tahun\nGaji pokok : "+gapok;
	}
	
}

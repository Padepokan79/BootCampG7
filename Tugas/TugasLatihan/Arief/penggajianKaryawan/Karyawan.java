package penggajianKaryawan;

public class Karyawan extends Person implements Umk{
	private String nama, penempatanKerja, posisi, grade;
	private int nik, masKer;
	private double gapok, indexing;
	private double[] arrayUmk;
	
	public Karyawan () {
	}
//	public Karyawan (String nama, String penempatanKerja, int nik, String posisi, int masKer) {
	public Karyawan (String nama, int nik) {
		name = nama;
		this.nik = nik;
//		this.posisi = posisi;
//		this.masKer = masKer;
	}
	
	double getGapok() {
		return gapok;
	}
	void setNama(String nama) {
		this.nama = nama;
	}
	
	String getPenempatanKerja() {
		return penempatanKerja;
	}
	void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	void setNik(int nik) {
		this.nik = nik;
	}
	
	int getMasKerja() {
		return masKer;
	}
	void setMasKerja(int msk) {
		this.masKer = msk;
	}
	
	String getPosisi() {
		return posisi;
	}
	void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	
	String getGrade() {
		return grade;
	}
	void setGrade(String Grade) {
		this.grade = Grade;
	}
	
	void printAbstract() {
		System.out.println("Name : "+name);
	}
	
	public String setUmkKerja(String pss, String grade) {
		posisi = pss;
		if (posisi.equalsIgnoreCase("Programmer") && grade.equalsIgnoreCase("Junior")) {
			arrayUmk = pgJunior; 
		} else if (posisi.equalsIgnoreCase("Programmer") && grade.equalsIgnoreCase("Middle")) {
			arrayUmk = pgMiddle; 
		} else if (posisi.equalsIgnoreCase("Programmer") && grade.equalsIgnoreCase("Senior")) {
			arrayUmk = pgSenior; 
		} else if (posisi.equalsIgnoreCase("Analis") && grade.equalsIgnoreCase("Junior")) {
			arrayUmk = saJunior; 
		} else if (posisi.equalsIgnoreCase("Analis") && grade.equalsIgnoreCase("Middle")) {
			arrayUmk = saMiddle; 
		} else if (posisi.equalsIgnoreCase("Analis") && grade.equalsIgnoreCase("Senior")) {
			arrayUmk = saSenior; 
		} else if (posisi.equalsIgnoreCase("Tester") && grade.equalsIgnoreCase("Junior")) {
			arrayUmk = tsJunior; 
		} else if (posisi.equalsIgnoreCase("Tester") && grade.equalsIgnoreCase("Middle")) {
			arrayUmk = tsMiddle; 
		} else if (posisi.equalsIgnoreCase("Tester") && grade.equalsIgnoreCase("Senior")) {
			arrayUmk = tsSenior; 
		} else {
			System.out.println("Go Somwhere Else");
		}
		return posisi;
	}
	
	public double setUmkKerja(int msk) {
		if (msk > arrayUmk.length-1) {
			masKer = arrayUmk.length-1;
			System.out.println("Masa kerja maks: " + masKer);
		}else {
			masKer = msk;
		}
		return masKer;
	}
	
//	@Override
	public double setUmkKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
		indexing = arrayUmk[masKer];
		if (penempatanKerja.equalsIgnoreCase("Bandung")) {
			gapok = umkBandung * indexing;
		} else if (penempatanKerja.equalsIgnoreCase("Jakarta")) {
			gapok = umkJakarta * indexing;
		} else if (penempatanKerja.equalsIgnoreCase("Karawang")) {
			gapok = umkKarawang * indexing;
		} else {
			System.out.println("PENGANGGURAN");
		}
		return gapok;
	}
	
	public String toString (){
		return "Nama : " + name + "\nNIK : " + nik + "\nPenempatan Kerja : " + penempatanKerja + "\nGaji pokok : " + gapok +
				"\nPosisi " + posisi + " Masa Kerja " + masKer;
	}

}

package backend;

public class Karyawan extends Person implements Umk{
	private String nama, penempatanKerja, posisi;
	private int nik, masKer;
	private double gapok, index;
	private double[] arrayUmk;
	
	public Karyawan () {
		
	}
	
	public Karyawan (String nama, String penempatanKerja, int nik) {
		name = nama;
		this.penempatanKerja = penempatanKerja;
		this.nik = nik;
//		this.posisi = posisi;
//		this.masKer = masKer;
	}
	
//	void setGapok(double gapok) {
//		this.gapok = gapok;
//	}
	
	double getGapok() {
		return gapok;
	}
	void setNama(String nama) {
		this.nama = nama;
	}
	
	void setPenempatanKerja(String penempatanKerja) {
		this.penempatanKerja = penempatanKerja;
	}
	void setNik(int nik) {
		this.nik = nik;
	}
	
	void printAbstract() {
		System.out.println("Name : "+name);
	}
	
//	@Override
	public String setUmkKerja(String pss, String grade) {
		posisi = pss;
		if(posisi.equalsIgnoreCase("Programmer")) {
			if(grade.equalsIgnoreCase("Junior")) {
				arrayUmk = pgJunior;				
			}
			else if(grade.equalsIgnoreCase("Middle")) {
				arrayUmk = pgMiddle;
			}
			else if(grade.equalsIgnoreCase("Middle")) {
				arrayUmk = pgSenior;
			}
		}
		else if(posisi.equalsIgnoreCase("Analis")) {
			if(grade.equalsIgnoreCase("Junior")) {
				arrayUmk = saJunior;				
			}
			else if(grade.equalsIgnoreCase("Middle")) {
				arrayUmk = saMiddle;
			}
			else if(grade.equalsIgnoreCase("Middle")) {
				arrayUmk = saSenior;
			}
		}
		else if(posisi.equalsIgnoreCase("Tester")) {
			if(grade.equalsIgnoreCase("Junior")) {
				arrayUmk = tsJunior;				
			}
			else if(grade.equalsIgnoreCase("Middle")) {
				arrayUmk = tsMiddle;
			}
			else if(grade.equalsIgnoreCase("Middle")) {
				arrayUmk = tsSenior;
			}
		}
		else {
			System.out.println("Yooo");
		}
		return posisi;
	}	
	
	public double setUmkKerja(int msk) {
		if(msk > arrayUmk.length) {
			masKer = arrayUmk.length-1;
		}
		else {
			masKer = msk;
		}
		return masKer;
	}
	
//	@Override
	public double setUmkKerja(String penempatanKerja) {
		index = arrayUmk[masKer];
		if (penempatanKerja.equalsIgnoreCase("Bandung")) {
			gapok = umkBandung * index;	
		} else if (penempatanKerja.equalsIgnoreCase("Jakarta")) {
			gapok = umkJakarta * index;	
		} else if (penempatanKerja.equalsIgnoreCase("Karawang")) {
			gapok = umkKarawang * index;
		} else {
			System.out.println("PENGANGGURAN");
		}
		return gapok;
	}

	public String toString (){
		return "Nama : "+name+"\nNIK : "+nik+"\nPenempatan Kerja : "+penempatanKerja+"\nGaji pokok : "+ (double)gapok +
				"\nPosisi " + posisi + "\nMasa Kerja " + masKer + " tahun";
	}
}

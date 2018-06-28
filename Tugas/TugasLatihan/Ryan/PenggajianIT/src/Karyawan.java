import java.beans.ConstructorProperties;

public class Karyawan implements Pph{
	private int nik,lamaKerja,lembur;
	private String nama,penempatan,posisi;
	private double gapok,tunjangan=0;
	
	
	public Karyawan() {
		
	}
	
	public Karyawan(String nama, int nik, String posisi, String penempatan, int lamaKerja) {
		this.nama = nama;
		this.nik = nik;
		this.posisi = posisi;
		this.penempatan = penempatan;
		this.setLamaKerja(lamaKerja);
	}
	////////////////////
	double setUmk () {
		if (penempatan.equals("Bandung")) {
			setGapok(bandung);
		}
		else if(penempatan.equals("Jakarta")) {
			setGapok(jakarta);
			setTunjangan(1000000);
		}
		else if(penempatan.equals("Karang")) {
			setGapok(karawang);
		}
		return getGapok();
	}
	public void setGapok(double gapok) {
		this.gapok = gapok;
	}
	public double getGapok() {
		return gapok;
	}
	int getLamaKerja() {
		return lamaKerja;
	}
	void setLamaKerja(int lamaKerja) {
		this.lamaKerja = lamaKerja;
	}
	double getTunjangan() {
		return tunjangan;
	}
	double setTunjangan(double tunjangan) {
		return this.tunjangan = this.tunjangan + tunjangan;
	}


}

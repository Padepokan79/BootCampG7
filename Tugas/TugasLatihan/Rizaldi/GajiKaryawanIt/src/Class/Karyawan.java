package Class;

public class Karyawan extends Person{
	private Double lembur;
	private Boolean isMaried;
	private int masaKerja;
	private String nik, penempatanKerja, lvlKaryawan, kawin;
	private Double gapok, tunjTrans;
	private Double[]	umkLocation	= {3091345.56, 3648035.0, 3919291.19};
	
	public Karyawan(String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, String kawin) {
		super(nama);
		this.nik=nik;
		this.lvlKaryawan=lvlKaryawan;
		this.penempatanKerja=penempatanKerja;
		this.masaKerja=masaKerja;
		this.kawin = kawin;
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
	public Double getGapok() {
		return gapok;
	}
	public Double getTunjTrans() {
		return tunjTrans;
	}
	public Double[] getUmkLocation() {
		return umkLocation;
	}
	@Override
	public String toString() {// method override
		return null;
	}
	
	public Double calculateGapok() {// method hitung gapok
		return null;
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
	
}

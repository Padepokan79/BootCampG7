public class Karyawan extends Person implements SistemInformasi {
	private String nama, nik, penempatanKerja;
	private double umk;
	
	public Karyawan() {
		
	}
	public Karyawan(String nama, String nik) {
		this.nama 	= nama;
		this.nik 	= nik;
	}
	
	String getNama() {
		return nama;
	}
	String getNik() {
		return nik;
	}
	
	void setPenempatanKerja(String tmptKerja) {
		penempatanKerja 	= tmptKerja;
	}
	String getPenempatanKerja() {
		return penempatanKerja;
	}
	
	@Override
	public double getUmk(String penempatan) {
		if (penempatan.equals("Bandung")) {
			umk = umkBandung;
		
		}else if(penempatan.equals("Jakarta")) {
			umk = umkJakarta;
		
		}else if(penempatan.equals("Karawang")) {
			umk = umkKarawang;
		}
		
		return umk;
	}
	
	public void tampilData() {
		System.out.println("Nama   : "+getNama());
		System.out.println("NIK    : "+getNik());
		System.out.println("Tempat : "+getPenempatanKerja());
	}
}

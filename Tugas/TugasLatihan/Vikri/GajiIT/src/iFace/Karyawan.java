package iFace;

public class Karyawan extends Person{
	private String nik, penempatan, tingkatan, bagian;
	private int lama, arr;
	double gajiPokok, umr;
	boolean cekKeluarga;
	
	double gajiPgJun[] = {100, 120, 150};
	double gajiPgMid[] = {170, 180, 210};
	double gajiPgSen[] = {250, 270, 280};
	
	double gajiSAJun[] = {120, 130, 160};
	double gajiSAMid[] = {180, 190, 220};
	double gajiSASen[] = {270, 290, 300};
	
	double gajiTSJun[] = {110, 120, 150};
	double gajiTSMid[] = {180, 190, 220};
	double gajiTSSen[] = {260, 270, 280};
	
/*	
 	String kota[] = {"Jakarta", "Karawang", "Bandung"};
	String Tingkatan[] = {"Junior", "Middle", "Senior"};
	String Bagian[] = {"PG", "SA", "TS"};
*/
	public Karyawan(String nama, String nik, String penempatan, String bagian, String tingkatan, int lama, boolean cekKeluarga) {
		super(nama);
		this.nik = nik;
		this.penempatan = penempatan;
		this.bagian = bagian;
		this.tingkatan = tingkatan;
		this.lama = lama;
	}
	
	public boolean isCekKeluarga() {
		return cekKeluarga;
	}

	public void setCekKeluarga(boolean cekKeluarga) {
		this.cekKeluarga = cekKeluarga;
	}

	double getGajiPokok() {
		return gajiPokok;
	}
	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	
	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getPenempatan() {
		return penempatan;
	}

	public void setPenempatan(String penempatan) {
		this.penempatan = penempatan;
	}

	public String getTingkatan() {
		return tingkatan;
	}

	public void setTingkatan(String tingkatan) {
		this.tingkatan = tingkatan;
	}

	public String getBagian() {
		return bagian;
	}

	public void setBagian(String bagian) {
		this.bagian = bagian;
	}

	public int getLama() {
		return lama;
	}

	public void setLama(int lama) {
		this.lama = lama;
	}
	
	public double getUmr() {
		return umr;
	}

	public void setUmr(double umr) {
		this.umr = umr;
	}
	
	int lama() {
		lama = lama/2;
		if(lama > 2)
			lama = 2;
		return lama;
	}
	void gajiBagian() {
		if(bagian.equals("PG")) {
			if(tingkatan.equals("Junior")) {
				gajiPokok = getUmr() * (gajiPgJun[lama()]/100);
				setGajiPokok(gajiPokok);
			} else if(tingkatan.equals("Middle")) {
				gajiPokok = getUmr() * (gajiPgMid[lama()]/100);
				setGajiPokok(gajiPokok);
			} else {
				gajiPokok = getUmr() * (gajiPgSen[lama()]/100);
				setGajiPokok(gajiPokok);
			}
		} else if (bagian.equals("SA")) {
			if(tingkatan.equals("Junior")) {
				gajiPokok = getUmr() * (gajiSAJun[lama()]/100);
			} else if(tingkatan.equals("Middle")) {
				gajiPokok = getUmr() * (gajiSAMid[lama()]/100);
			} else {
				gajiPokok = getUmr() * (gajiSASen[lama()]/100);
			}
		} else {
			if(tingkatan.equals("Junior")) {
				gajiPokok = getUmr() * (gajiTSJun[lama()]/100);
			} else if(tingkatan.equals("Middle")) {
				gajiPokok = getUmr() * (gajiTSMid[lama()]/100);
			} else {
				gajiPokok = getUmr() * (gajiTSSen[lama()]/100);
			}
		}
	}
	double GajiPokok() {
		if(penempatan.equals("Jakarta")) {
			setUmr(3648035);
			setPenempatan(penempatan);
			gajiBagian();
		} else if (penempatan.equals("Karawang")) {
			setUmr(3919291);
			setPenempatan(penempatan);
			gajiBagian();
		} else {
			setUmr(3091345);
			setPenempatan(penempatan);
			gajiBagian();
		}
		return gajiPokok;
	}
	@Override
	String getName() {
		return nama;
	}
	@Override
	public String toString() {
		return 	"Nama\t\t: "+nama+"\n"+
				"Nik\t\t: "+nik+"\n"+
				"Penempatan\t: "+getPenempatan()+"\n"+
				"Tingkatan\t: "+tingkatan+"\n"+
				"Lama\t\t: "+lama+"\n";
	}
}

//Created by vikri
//08/06/2018

package gajiIt;

public class Karyawan extends Person implements TunjanganPotongan{
	private String nik, penempatan, tingkatan, bagian;
	private int lama, arr;
	double gajiPokok, umr;
	boolean cekKeluarga;
	
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
				gajiPokok = getUmr() * (pgJun.get(lama())/100.0);
				setGajiPokok(gajiPokok);
			} else if(tingkatan.equals("Middle")) {
				gajiPokok = getUmr() * (pgMid.get(lama())/100.0);
				setGajiPokok(gajiPokok);
			} else {
				gajiPokok = getUmr() * (pgSen.get(lama())/100.0);
				setGajiPokok(gajiPokok);
			}
		} else if (bagian.equals("SA")) {
			if(tingkatan.equals("Junior")) {
				gajiPokok = getUmr() * (SAJun.get(lama())/100.0);
			} else if(tingkatan.equals("Middle")) {
				gajiPokok = getUmr() * (SAMid.get(lama())/100.0);
			} else {
				gajiPokok = getUmr() * (SASen.get(lama())/100.0);
			}
		} else {
			if(tingkatan.equals("Junior")) {
				gajiPokok = getUmr() * (TSJun.get(lama())/100.0);
			} else if(tingkatan.equals("Middle")) {
				gajiPokok = getUmr() * (TSMid.get(lama())/100.0);
			} else {
				gajiPokok = getUmr() * (TSSen.get(lama())/100.0);
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
		setGajiPokok(gajiPokok);
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

	@Override
	public double lembur(double gaji, double lama) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tunjanganPegawai(String tingkatan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tunjanganKeluarga(double gaji, boolean cek) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double bonus(double fix) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pPH(double gaji) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double bKesehatan(double gaji) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double bKetenagakerjaan(double gaji) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tTransport(String penempatan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return 0;
	}
}

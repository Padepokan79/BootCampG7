
public abstract class Karyawan {
	String nama, nik, penempatan, posisi, pengalaman;
//	double[] umk = {3000000, 3600000, 3900000};

	public Karyawan(String nama, String nik, String penempatan, String posisi, String pengalaman) {
		super();
		this.nama 		= nama;
		this.nik 		= nik;
		this.penempatan = penempatan;
		this.posisi		= posisi;
		this.pengalaman = pengalaman;
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
		return "Nama : "+nama+", NIK : "+nik+", Penempatan : "+penempatan+", Posisi : "+posisi+", Pengalaman : "+pengalaman;
	}
	
}

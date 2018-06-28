package Controller;

public abstract class Gaji {
	public String name, nik, penempatan, posisi, pengalaman;
	
	public Gaji(String name, String nik, String penempatan, String posisi, String pengalaman) {
		this.name 		= name;
		this.nik 		= nik;
		this.penempatan = penempatan;
		this.posisi 	= posisi;
		this.pengalaman = pengalaman;
	}
	
	public String getPengalaman() {
		return pengalaman;
	}
	
	public String getPenempatan() {
		return penempatan;
	}
	
	public String toString() {
		return "Nama\t\t: "+name+"\nNik\t\t: "+nik+"\nPenempatan\t: "+penempatan+"\nPosisi\t\t: "+posisi+"\nPengalaman\t: "+pengalaman+" "+posisi;
	}
}

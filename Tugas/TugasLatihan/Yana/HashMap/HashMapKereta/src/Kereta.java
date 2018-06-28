/*
 Created by 	: Yana NY
 Time 			: 25 Juni 2018 10.22
 */

public class Kereta {
	private	String 	kelas;
	private int		hari,
					hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	private double	harga;
	
	public Kereta() {
	}
	
	public Kereta(String kelas, int hari) {
		this.kelas = kelas;
		this.hari = hari;
	}
	
	public Kereta(String kelas, double harga, int hari) {
		this.kelas 	= kelas;
		this.harga	= harga;
		this.hari 	= hari;
	}
	
	public Kereta(String kelas, double harga, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.kelas 	= kelas;
		this.harga	= harga;
		this.hari1 	= hari1;
		this.hari2 	= hari2;
		this.hari3 	= hari3;
		this.hari4 	= hari4;
		this.hari5 	= hari5;
		this.hari6 	= hari6;
		this.hari7 	= hari7;
	}
	
	public String getKelas() {
		return kelas;
	}

	public int getHari() {
		return hari;
	}

	public double getHarga() {
		return harga;
	}

	public int getHari1() {
		return hari1;
	}

	public int getHari2() {
		return hari2;
	}

	public int getHari3() {
		return hari3;
	}

	public int getHari4() {
		return hari4;
	}

	public int getHari5() {
		return hari5;
	}

	public int getHari6() {
		return hari6;
	}

	public int getHari7() {
		return hari7;
	}

	/*
	public double getHarga() {
		if (kelas.equalsIgnoreCase(ekonomi)) {
			hargaTiket = hargaEkonomi;
		}
		else if (kelas.equalsIgnoreCase(bisnis)) {
			hargaTiket = hargaBisnis;
		}
		
		return hargaTiket;
	}
	*/
	public String hasil() {
		return "Kelas : "+kelas+ ", harga : " ;
	}
}

/*
 Created by 	: Yana NY
 Time 			: 21 Juni 2018 09.25
 */

public class Kereta {
//	private String 	kelas, ekonomi="Ekonomi", bisnis="Bisnis", executive="Executive";
	private	String 	kelas;
	private int		hari,
					hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	private double	harga;
//	private double 	hargaTiket, hargaEkonomi=18000, hargaBisnis=35000, hargaExecutive=80000;
//	private int[] 	penumpangEkonomi = {120, 100, 50, 30, 20, 150, 110};
	
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

/*
PT.Kereta Api dengan jalur Bandung Bekasi
Ada 3 jenis Gerbong:
Kereta Gerbong Ekonomi Dengan Harga Ticket 18000
Kereta Gerbong Bisnis Dengan Harga Ticket 35000
Kereta Gerbong Executive Dengan Harga Ticket 80000

Jumlah Penumpang Kereta Ekonomi:
hari ke1 120, ke-2 100, ke-3 50, ke-4 30,ke-5 20, ke-6 150, ke-7 110.

Jumlah Penumpang Kereta Bisnis:
hari ke1 50, ke-2 15, ke-3 13, ke-4 10,ke-5 20, ke-6 55, ke-7 60,

Jumlah Penumpang Kereta Executive
hari ke1 40, ke-2 21, ke-3 11, ke-4 16,ke-5 12, ke-6 35, ke-7 40,

Hitunglah Besar Pemasukan untuk Kereta Jalur Bandung-Bekasi 
Setiap Harinya dan Total Pemasukan Selama 7 Hari.

*buatkan Class dari Keretanya untuk dipakai 
sebagai objek nantinya. dan Harga Ticket harus di Private.
*/
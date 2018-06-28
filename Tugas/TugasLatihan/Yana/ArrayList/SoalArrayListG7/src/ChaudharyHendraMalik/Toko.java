package ChaudharyHendraMalik;

public class Toko {
	private String 	namaBarang;
	private double	hargaBarang;
	private int 	hari, hari1, hari2, hari3, hari4, hari5, hari6, hari7, m2 = 2, m3 = 1, m4 = 2; // m untuk penambahan/pengurangan item 
	
	public Toko() {
	}
	
	public Toko(String namaBarang, double hargaBarang, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.namaBarang 	= namaBarang;
		this.hargaBarang	= hargaBarang;
		this.hari1			= hari1;
		this.hari2			= hari2;
		this.hari3			= hari3;
		this.hari4			= hari4;
		this.hari5			= hari5;
		this.hari6			= hari6;
		this.hari7			= hari7;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public double getHargaBarang() {
		return hargaBarang;
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
	
	public double pendapatanHarian(int hari) {
		if (hari == 1) {
			return hargaBarang * hari1;
		}
		else if (hari == 2) {
			return hargaBarang * hari2;
		}
		else if (hari == 3) {
			return hargaBarang * hari3;
		}
		else if (hari == 4) {
			return hargaBarang * hari4;
		}
		else if (hari == 5) {
			return hargaBarang * hari5;
		}
		else if (hari == 6) {
			return hargaBarang * hari6;
		}
		else if (hari == 7) {
			return (hargaBarang * (hari7)) - (hargaBarang * (hari7) * 20.0 /100.0);
		}
		return 0;
	}
	
	public double pendapatanHarian2(int hari) {
		if (hari == 1) {
			return hargaBarang * (hari1+m2);
		}
		else if (hari == 2) {
			return hargaBarang * (hari2+m2);
		}
		else if (hari == 3) {
			return hargaBarang * (hari3+m2);
		}
		else if (hari == 4) {
			return hargaBarang * (hari4+m2);
		}
		else if (hari == 5) {
			return hargaBarang * (hari+m2);
		}
		else if (hari == 6) {
			return hargaBarang * (hari6+m2);
		}
		else if (hari == 7) {
			return (hargaBarang * (hari7+m2)) - (hargaBarang * (hari7+m2) * 20.0 /100.0);
		}
		return 0;
	}
	
	public double pendapatanHarian3(int hari) {
		if (hari == 1) {
			return hargaBarang * (hari1+m2-m3);
		}
		else if (hari == 2) {
			return hargaBarang * (hari2+m2-m3);
		}
		else if (hari == 3) {
			return hargaBarang * (hari3+m2-m3);
		}
		else if (hari == 4) {
			return hargaBarang * (hari4+m2-m3);
		}
		else if (hari == 5) {
			return hargaBarang * (hari5);
		}
		else if (hari == 6) {
			return hargaBarang * (hari6+m2-m3);
		}
		else if (hari == 7) {
			return (hargaBarang * (hari7+m2-m3)) - (hargaBarang * (hari7+m2-m3) * 20.0 /100.0);
		}
		return 0;
	}
	
	public double pendapatanHarian4(int hari) {
		if (hari == 1) {
			if (hari1 <= 2) {
				hari1 	= 2;
			}
			return hargaBarang * (hari1-m4);
		}
		else if (hari == 2) {
			if (hari2 <= 2) {
				hari2 	= 2;
			}
			return hargaBarang * (hari2-m4);
		}
		else if (hari == 3) {
			if (hari3 <= 2) {
				hari3 	= 2;
			}
			return hargaBarang * (hari3-m4);
		}
		else if (hari == 4) {
			if (hari4 <= 2) {
				hari4 	= 2;
			}
			return hargaBarang * (hari4-m4);
		}
		else if (hari == 5) {
			return hargaBarang * hari5;
		}
		else if (hari == 6) {
			if (hari6 <= 2) {
				hari6 	= 2;
			}
			return hargaBarang * (hari6-m4);
		}
		else if (hari == 7) {
			if (hari7 <= 2) {
				hari7 	= 2;
			}
			return (hargaBarang * (hari7-m4)) - (hargaBarang * (hari7-m4) * 20.0 /100.0);
		}
		return 0;
	}
	
	int minggu1() {
		return hari1 + hari2 + hari3 + hari4 + hari5 + hari6 + hari7;
	}
	
	int minggu2() {
		return hari1+m2 + hari2+m2 + hari3+m2 + hari4+m2 + hari5 + hari6+m2 + hari7+m2;
	}
	
	int minggu3() {
		return hari1+m2-m3 + hari2+m2-m3 + hari3+m2-m3 + hari4+m2-m3 + hari5 + hari6+m2-m3 + hari7+m2-m3;
	}
	
	int minggu4() {
		if (hari1 <=2)
			hari1 = 2;
		if (hari2 <=2)
			hari2 = 2;
		if (hari3 <=2)
			hari3 = 2;
		if (hari3 <=2)
			hari3 = 2;
		if (hari4 <=2)
			hari4 = 2;
		if (hari6 <=2)
			hari6 = 2;
		if (hari7 <=2)
			hari7 = 2;
		return hari1-m4 + hari2-m4 + hari3-m4 + hari4-m4 + hari5 + hari6-m4 + hari7-m4;
	}
}

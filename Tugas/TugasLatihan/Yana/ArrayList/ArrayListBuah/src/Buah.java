
public class Buah {

	private String 	namaBuah, namaHari;
	private double 	hargaBuah;
	private int		hari, hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	
	public Buah() {
	}
	
	public Buah(String namaBuah, double hargaBuah, int hari) {
		this.hari 		= hari;
		this.namaBuah	= namaBuah;
		this.hargaBuah	= hargaBuah;
	}
	
	public Buah(String namaBuah, double hargaBuah, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
//		this.hari 		= hari;
		this.namaBuah	= namaBuah;
		this.hargaBuah	= hargaBuah;
		this.hari1 		= hari1;
		this.hari2 		= hari2;
		this.hari3 		= hari3;
		this.hari4 		= hari4;
		this.hari5 		= hari5;
		this.hari6 		= hari6;
		this.hari7 		= hari7;
	}

	public String getNamaBuah() {
		return namaBuah;
	}

	public double getHargaBuah() {
		return hargaBuah;
	}

	public int getHari() {
		return hari;
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
			return hargaBuah * hari1;
		}
		else if (hari == 2) {
			return hargaBuah * hari2;
		}
		else if (hari == 3) {
			return hargaBuah * hari3;
		}
		else if (hari == 4) {
			return hargaBuah * hari4;
		}
		else if (hari == 5) {
			return hargaBuah * hari5;
		}
		else if (hari == 6) {
			return hargaBuah * hari6;
		}
		else if (hari == 7) {
			return hargaBuah * hari7;
		}
		return 0;
	}
	
    int checkDays(String nHari) {
        if (nHari.equalsIgnoreCase("Senin")) {
                hari=0;
        } else if (nHari.equalsIgnoreCase("Selasa")) {
                hari=1;
        } else if (nHari.equalsIgnoreCase("Rabu")) {
                hari=2;
        } else if (nHari.equalsIgnoreCase("Kamis")) {
                hari=3;
        } else if (nHari.equalsIgnoreCase("Jumat")) {
                hari=4;
        } else if (nHari.equalsIgnoreCase("Sabtu")) {
                hari=5;
        } else if (nHari.equalsIgnoreCase("Minggu")) {
                hari=6;
        }
        return hari;
    }

    String checkDaily(int hr) {
        if (hr == 1) {
                return "Senin";
        }else if (hr == 2) {
                return "Selasa";
        }else if (hr == 3) {
                return "Rabu";
        }else if (hr == 4) {
                return "Kamis";
        }else if (hr == 5) {
                return "Jumat";
        }else if (hr == 6) {
                return "Sabtu";
        }else if (hr == 7) {
                return "Minggu";
        }
        return namaHari;
    }

}

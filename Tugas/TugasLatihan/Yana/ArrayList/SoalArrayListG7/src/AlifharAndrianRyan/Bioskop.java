package AlifharAndrianRyan;

public class Bioskop {
	private String	jenisTiket;
	private	double	hargaTicket, hargaWeekdays, hargaWeekend;
	private int		kapasitas, hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	
	public Bioskop() {
	}
	
	public Bioskop(String jenisTiket, double hargaWeekdays, double hargaWeekend, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.jenisTiket 	= jenisTiket;
		this.hargaWeekdays 	= hargaWeekdays;
		this.hargaWeekend 	= hargaWeekend;
		this.hari1 			= hari1;
		this.hari2 			= hari2;
		this.hari3 			= hari3;
		this.hari4 			= hari4;
		this.hari5 			= hari5;
		this.hari6 			= hari6;
		this.hari7 			= hari7;
	}

	public String getJenisTiket() {
		return jenisTiket;
	}

	public double getHargaWeekdays() {
		return hargaWeekdays;
	}

	public double getHargaWeekend() {
		return hargaWeekend;
	}

	public int getKapasitas() {
		return kapasitas;
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
			return hargaWeekdays * hari1;
		}
		else if (hari == 2) {
			return hargaWeekdays * hari2;
		}
		else if (hari == 3) {
			return hargaWeekdays * hari3;
		}
		else if (hari == 4) {
			return hargaWeekdays * hari4;
		}
		else if (hari == 5) {
			return hargaWeekdays * hari5;
		}
		else if (hari == 6) {
			return hargaWeekend * hari6;
		}
		else if (hari == 7) {
			return hargaWeekend * hari7;
		}
		return 0;
	}
	
	public double tiketHarian(int hari) {
		if (hari == 1) {
			return hari1;
		}
		else if (hari == 2) {
			return hari2;
		}
		else if (hari == 3) {
			return hari3;
		}
		else if (hari == 4) {
			return hari4;
		}
		else if (hari == 5) {
			return hari5;
		}
		else if (hari == 6) {
			return hari6;
		}
		else if (hari == 7) {
			return hari7;
		}
		return 0;
	}
}

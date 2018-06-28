package bioskop;

public class Cinema {
	String jenisTiket, hari;
	int  kapasitas, hargaWeekdays, hargaWeekend, day, day1, day2, day3, day4, day5, day6, day7, harga, tiket;

	public Cinema() {
		// TODO Auto-generated constructor stub
	}
	
	public Cinema(String jt, int hrgWD, int hrgWE, int dy1, int dy2, int dy3, int dy4, int dy5, int dy6, int dy7) {
		jenisTiket = jt;
		hargaWeekdays = hrgWD;
		hargaWeekend = hrgWE;
		day1 = dy1;
		day2 = dy2;
		day3 = dy3;
		day4 = dy4;
		day5 = dy5;
		day6 = dy6;
		day7 = dy7;
	}
	
	int daily(int day) {
		if(day == 1) {
			return hargaWeekdays * day1;
		}else if (day == 2) {
			return hargaWeekdays * day2;
		}else if (day == 3) {
			return hargaWeekdays * day3;
		}else if (day == 4) {
			return hargaWeekdays * day4;
		}else if (day == 5) {
			return hargaWeekdays * day5;
		}else if (day == 6) {
			return hargaWeekend * day6;
		}else if (day == 7) {
			return hargaWeekend * day7;
		}
		return 0;
	}
	
	int daily() {
		return harga = day1 + day2 + day3 + day4 + day5 + day6 + day7;
	}
	
	int dailyTiket(int day) {
		if(day == 1) {
			return day1;
		}else if (day == 2) {
			return day2;
		}else if (day == 3) {
			return day3;
		}else if (day == 4) {
			return day4;
		}else if (day == 5) {
			return day5;
		}else if (day == 6) {
			return day6;
		}else if (day == 7) {
			return day7;
		}
		return 0;
	}
	
	int dailyTiket() {
		return tiket = day1 + day2 + day3 + day4 + day5 + day6 + day7;
	}
	
	int checkDays(String hari) {
		if (hari.equalsIgnoreCase("Senin")) {
			day=0;
		} else if (hari.equalsIgnoreCase("Selasa")) {
			day=1;
		} else if (hari.equalsIgnoreCase("Rabu")) {
			day=2;
		} else if (hari.equalsIgnoreCase("Kamis")) {
			day=3;
		} else if (hari.equalsIgnoreCase("Jumat")) {
			day=4;
		} else if (hari.equalsIgnoreCase("Sabtu")) {
			day=5;
		} else if (hari.equalsIgnoreCase("Minggu")) {
			day=6;
		}
		return day;
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
		return hari;
	}
	
	int totalTiket() {
		return tiket = (day1 + day2 + day3 + day4 + day5) * hargaWeekdays + (day6 + day7) * hargaWeekend;
	}
	
	void tiketing(String jt) {
		if (jt.equalsIgnoreCase("Reguler")) {
			tiket = totalTiket();
			System.out.println(tiket);
		} else if (jt.equalsIgnoreCase("Starium")) {
			tiket = totalTiket();
			System.out.println(tiket);
		} else if (jt.equalsIgnoreCase("SweetBox")) {
			tiket = totalTiket();
			System.out.println(tiket);
		} else if (jt.equalsIgnoreCase("Velvet")) {
			tiket = totalTiket();
			System.out.println(tiket);
		}
	}

}

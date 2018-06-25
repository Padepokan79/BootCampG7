package amazon;

public class Toko {
	private int harga, day1, day2, day3, day4, day5, day6, day7, max;
	private String namaBarang, hari;

	public Toko() {
		// TODO Auto-generated constructor stub
	}
	
	public Toko(String nmb, int hrg, int dy1, int dy2, int dy3, int dy4, int dy5, int dy6, int dy7) {
		namaBarang = nmb;
		harga = hrg;
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
			return harga * day1;
		}else if (day == 2) {
			return harga * day2;
		}else if (day == 3) {
			return harga * day3;
		}else if (day == 4) {
			return harga * day4;
		}else if (day == 5) {
			return harga * day5;
		}else if (day == 6) {
			return harga * day6;
		}else if (day == 7) {
			return (harga * day7) - ((harga * day7)*20/100);
		}
		return 0;
	}
	
	int daily3(int day) {
		if(day == 1) {
			return harga * (day1+1);
		}else if (day == 2) {
			return harga * (day2+1);
		}else if (day == 3) {
			return harga * (day3+1);
		}else if (day == 4) {
			return harga * (day4+1);
		}else if (day == 5) {
			return harga * (day5);
		}else if (day == 6) {
			return harga * (day6+1);
		}else if (day == 7) {
			return (harga * (day7+1)) - ((harga * (day7+1))*20/100);
		}
		return 0;
	}
	
	int daily4(int day) {
		if(day == 1) {
			if (day1<=2) {
				day1=2;
			}
			return harga * (day1-2);
		}else if (day == 2) {
			if (day2<=2) {
				day2=2;
			}
			return harga * (day2-2);
		}else if (day == 3) {
			if (day3<=2) {
				day3=2;
			}
			return harga * (day3-2);
		}else if (day == 4) {
			if (day4<=2) {
				day4=2;
			}
			return harga * (day4-2);
		}else if (day == 5) {
			return harga * (day5);
		}else if (day == 6) {
			if (day6<=2) {
				day6=2;
			}
			return harga * (day6-2);
		}else if (day == 7) {
			if (day7<=2) {
				day7=2;
			}
			return (harga * (day7-2)) - ((harga * (day7-2))*20/100);
		}
		return 0;
	}
	
	int daily() {
		return harga = day1 + day2 + day3 + day4 + day5 + day6 + day7;
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
	
	int week1() {
		return harga = day1 + day2 + day3 + day4 + day5 + day6 + day7;
	}
	
	int week2() {
		return harga = (day1+2) + (day2+2) + (day3+2) + (day4+2) + (day5) + (day6+2) + (day7+2);
	}
	
	int week3() {
		return harga = (day1+1) + (day2+1) + (day3+1) + (day4+1) + (day5) + (day6+1) + (day7+1);
	}
	
	int week4() {
		if (day1<=2) {
			day1=2;
		}
		if (day2<=2) {
			day2=2;
		}
		if (day3<=2) {
			day3=2;
		}
		if (day4<=2) {
			day4=2;
		}
		if (day6<=2) {
			day6=2;
		}
		if (day7<=2) {
			day7=2;
		}
		return harga = (day1-2) + (day2-2) + (day3-2) + (day4-2) + (day5) + (day6-2) + (day7-2);
	}
	
	void maximalize(int totFanta, int totTaro, int totClear, int totTisu, int totMagnum, int max) {
		if(totFanta == max) {
			System.out.println("Maksimal Fanta sebanyak " + max);
		} else if (totTaro == max) {
			System.out.println("Maksimal Taro sebanyak " + max);
		} else if (totClear == max) {
			System.out.println("Maksimal Sampo Clear sebanyak " + max);
		} else if (totTisu == max) {
			System.out.println("Maksimal Tissuee sebanyak " + max);
		} else if (totMagnum == max) {
			System.out.println("Maksimal Ice Crfeam magnum sebanyak " + max);
		}
	}


}

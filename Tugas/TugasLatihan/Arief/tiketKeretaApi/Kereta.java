/*
Date Created	: 21 June 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
package tiketKeretaApi;

public class Kereta {
	private int hrgTiket;
	int penumpang1, penumpang2,penumpang3,penumpang4, penumpang5, penumpang6, penumpang7, passenger, day, harian,
	totPemasukan;
	private String kelas;

	public Kereta() {
		// TODO Auto-generated constructor stub
	}
	
	public Kereta(String kls, int hrg, int pnpDay1, int pnpDay2, int pnpDay3, int pnpDay4, int pnpDay5, int pnpDay6, int pnpDay7) {
		kelas = kls;
		hrgTiket = hrg;
		penumpang1 = pnpDay1;
		penumpang2 = pnpDay2;
		penumpang3 = pnpDay3;
		penumpang4 = pnpDay4;
		penumpang5 = pnpDay5;
		penumpang6 = pnpDay6;
		penumpang7 = pnpDay7;
	}
	
	public Kereta(int pnpDay1, int pnpDay2, int pnpDay3, int pnpDay4, int pnpDay5, int pnpDay6, int pnpDay7) {
			penumpang1 = pnpDay1;
			penumpang2 = pnpDay2;
			penumpang3 = pnpDay3;
			penumpang4 = pnpDay4;
			penumpang5 = pnpDay5;
			penumpang6 = pnpDay6;
			penumpang7 = pnpDay7;
		}

	public int getHrgTiket() {
		return hrgTiket;
	}

	public void setHrgTiket(int hrgTiket) {
		this.hrgTiket = hrgTiket;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	
	int daily(int day) {
		if(day == 1) {
			return hrgTiket * penumpang1;
		}else if (day == 2) {
			return hrgTiket * penumpang2;
		}else if (day == 3) {
			return hrgTiket * penumpang3;
		}else if (day == 4) {
			return hrgTiket * penumpang4;
		}else if (day == 5) {
			return hrgTiket * penumpang5;
		}else if (day == 6) {
			return hrgTiket * penumpang6;
		}else if (day == 7) {
			return hrgTiket * penumpang7;
		}
		return 0;
	}
	
	int daily() {
		return hrgTiket = penumpang1 + penumpang2 + penumpang3 + penumpang4 + penumpang5 + penumpang6 + penumpang7;
	}

}
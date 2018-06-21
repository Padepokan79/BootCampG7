package PerhitunganPenghasilanKereta;

public class Kereta {
	private int[] hargaTiket= {18000, 35000, 80000};
	int hari1,hari2,hari3,hari4,hari5,hari6,hari7;
	public Kereta() {
		
	}
	public Kereta(int hari1,int hari2,int hari3,int hari4,int hari5,int hari6,int hari7) {
		this.hari1 = hari1;
		this.hari2 = hari2;
		this.hari3 = hari3;
		this.hari4 = hari4;
		this.hari5 = hari5;
		this.hari6 = hari6;
		this.hari7 = hari7;
	}

	public int[] getHargaTiket() {
		return hargaTiket;
	}
	
	public int getHargaPerHari(int harike, int i) {
		int getHargaPerHari=0;
			if(harike == 1) {
				getHargaPerHari = hari1*getHargaTiket()[i];
			}
			else if(harike == 2) {
				getHargaPerHari = hari2*getHargaTiket()[i];
			}
			else if(harike == 3) {
				getHargaPerHari = hari3*getHargaTiket()[i];
			}
			else if(harike == 4) {
				getHargaPerHari = hari4*getHargaTiket()[i];
			}
			else if(harike == 5) {
				getHargaPerHari = hari5*getHargaTiket()[i];
			}
			else if(harike == 6) {
				getHargaPerHari = hari6*getHargaTiket()[i];
			}
			else if(harike == 7) {
				getHargaPerHari = hari7*getHargaTiket()[i];
			}
		
		return getHargaPerHari;
	}
}

/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalRizaldiKhairilRicha;

public class TiketBioskop {
	String kelasTiket;
	int tiketSenin, tiketSelasa, tiketRabu, tiketKamis, tiketJumat, tiketSabtu, tiketMinggu;
	private int hargaTiket, hargaWeekEns; 
	
	public TiketBioskop() {
		
	}
	public TiketBioskop(int tiketSenin, int tiketSelasa, int tiketRabu, int tiketKamis, int tiketJumat, int tiketSabtu, int tiketMinggu) {
		this.tiketSenin = tiketSenin;
		this.tiketSelasa = tiketSelasa;
		this.tiketRabu = tiketRabu;
		this.tiketKamis = tiketKamis;
		this.tiketJumat = tiketJumat;
		this.tiketSabtu = tiketSabtu;
		this.tiketMinggu = tiketMinggu;
	}
	public TiketBioskop(String kelasTiket, int hargaTiket, int tiketSenin, int tiketSelasa, int tiketRabu, int tiketKamis, int tiketJumat, int tiketSabtu, int tiketMinggu) {
		this.kelasTiket = kelasTiket;
		this.hargaTiket = hargaTiket;
		this.hargaWeekEns = hargaTiket+10000;
		this.tiketSenin = tiketSenin;
		this.tiketSelasa = tiketSelasa;
		this.tiketRabu = tiketRabu;
		this.tiketKamis = tiketKamis;
		this.tiketJumat = tiketJumat;
		this.tiketSabtu = tiketSabtu;
		this.tiketMinggu = tiketMinggu;
	}
	
	int getHargaTiket() {
		return hargaTiket;
	}
	int getHargaWeekEns() {
		return hargaWeekEns;
	}
}

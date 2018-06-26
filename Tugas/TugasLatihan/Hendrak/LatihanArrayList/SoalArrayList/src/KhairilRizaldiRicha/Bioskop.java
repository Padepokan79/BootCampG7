package KhairilRizaldiRicha;

public class Bioskop {
	private int hargaTiket;
	String kelasTiket;
	int tiketTerjual,terjualHari1,terjualHari2,terjualHari3,terjualHari4,terjualHari5,terjualHari6,terjualHari7, maxTiket;
	
	public Bioskop() {
		
	}
	
	public Bioskop(String kelasTiket, int hargaTiket,int terjualHari1,int terjualHari2,int terjualHari3,int terjualHari4,int terjualHari5,int terjualHari6,int terjualHari7, int maxTiket) {
		this.kelasTiket = kelasTiket;
		this.hargaTiket = hargaTiket;
		this.terjualHari1 = terjualHari1;
		this.terjualHari2 = terjualHari2;
		this.terjualHari3 = terjualHari3;
		this.terjualHari4 = terjualHari4;
		this.terjualHari5 = terjualHari5;
		this.terjualHari6 = terjualHari6;
		this.terjualHari7 = terjualHari7;
		this.maxTiket = maxTiket;
	}

	public int getHargaTiket() {
		return hargaTiket;
	}
}

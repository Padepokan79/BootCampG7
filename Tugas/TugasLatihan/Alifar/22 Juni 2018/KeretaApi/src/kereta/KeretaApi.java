package kereta;

public class KeretaApi {
	private int harga;
	private String gerbong;
	private int hari1, hari2, hari3, hari4, hari5, hari6, hari7;
		
	public KeretaApi(String gerbong, int harga, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.gerbong = gerbong;
		this.harga = harga;
		this.hari1 = hari1;
		this.hari2 = hari2;
		this.hari3 = hari3;
		this.hari4 = hari4;
		this.hari5 = hari5;
		this.hari6 = hari6;
		this.hari7 = hari7;
	}
	
	String getGerbong() {
		return gerbong;
	}
	
	int pemasukan(int hari) {
		if(hari==1)
			return harga*hari1;
		else if(hari==2)
			return harga*hari2;
		else if(hari==3)
			return harga*hari3;
		else if(hari==4)
			return harga*hari4;
		else if(hari==5)
			return harga*hari5;
		else if(hari==6)
			return harga*hari6;
		else if(hari==7)
			return harga*hari7;
		else
			return 0;
	}
	
	int pemasukan() {
		return harga*(hari1+hari2+hari3+hari4+hari5+hari6+hari7);
	}
}

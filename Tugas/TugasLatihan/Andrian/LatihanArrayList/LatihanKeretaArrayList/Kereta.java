package LatihanKeretaArrayList;
/* 	
 * Date 		: 21/6/2018    
 * Time 		: 08:37:39
 * Create by 	: Muhamad Rifan Andrian
 * Edited by 	: 	
*/
public class Kereta {
	private int harga;
	private int ekonomiPerhari, bisnisPerhari, eksekutifPerhari, penumpangEkonomi, penumpangBisnis, penumpangEksekutif;
	int penumpanghari1, penumpanghari2, penumpanghari3, penumpanghari4, penumpanghari5, penumpanghari6, penumpanghari7;
	
	
	
	public Kereta () {
	}
	
	public Kereta (int harga, int penumpanghari1, int penumpanghari2, int penumpanghari3, int penumpanghari4, int penumpanghari5, int penumpanghari6, int penumpanghari7) {
		this.harga = harga;
		this.penumpanghari1 = penumpanghari1;
		this.penumpanghari2 = penumpanghari2;
		this.penumpanghari3 = penumpanghari3;
		this.penumpanghari4 = penumpanghari4;
		this.penumpanghari5 = penumpanghari5;
		this.penumpanghari6 = penumpanghari6;
		this.penumpanghari7 = penumpanghari7;
	}
	
	int pendapatanPerhari(int hari) {
		if (hari==1) {
			return harga*penumpanghari1;			
		}
		else if (hari==2) {
			return harga*penumpanghari2;			
		}
		else if (hari==3) {
			return harga*penumpanghari3;			
		}
		else if (hari==4) {
			return harga*penumpanghari4;			
		}
		else if (hari==5) {
			return harga*penumpanghari5;			
		}
		else if (hari==6) {
			return harga*penumpanghari6;			
		}
		else if (hari==7) {
			return harga*penumpanghari7;			
		}
		else
			return 0;
	}
	
	int getHarga() {
		return harga;
	}
	
	int getHargaTotal() {
		return harga*(penumpanghari1+penumpanghari2+penumpanghari3+penumpanghari4+penumpanghari5+penumpanghari6+penumpanghari7);
	}
	
	
	

}

/*
Created by : Hendra Kurniawan
Date 	   : 21 Juni 2018  Time : 9:31 AM
Modified   :	
*/
package Kereta;

public class Kereta {
	public int hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	public String jenisKereta;
	private int hargaTicket;

	public Kereta() {
		
	}
	
	public Kereta(String jenisKereta,int hargaTicket, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.jenisKereta = jenisKereta;
		this.hargaTicket = hargaTicket;
		this.hari1 = hari1;
		this.hari2 = hari2;
		this.hari3 = hari3;
		this.hari4 = hari4;
		this.hari5 = hari5;
		this.hari6 = hari6;
		this.hari7 = hari7;
	}
	
	public int getHargaTicket() {
		return hargaTicket;
	}

	
}
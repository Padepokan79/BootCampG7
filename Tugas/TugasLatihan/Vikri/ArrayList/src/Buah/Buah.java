package Buah;

import java.util.ArrayList;

public class Buah {
	private String namaBuah;
	private int hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	public String getNamaBuah() {
		return namaBuah;
	}
	public void setNamaBuah(String namaBuah) {
		this.namaBuah = namaBuah;
	}
	public int getHari1() {
		return hari1;
	}
	public void setHari1(int hari1) {
		this.hari1 = hari1;
	}
	public int getHari2() {
		return hari2;
	}
	public void setHari2(int hari2) {
		this.hari2 = hari2;
	}
	public int getHari3() {
		return hari3;
	}
	public void setHari3(int hari3) {
		this.hari3 = hari3;
	}
	public int getHari4() {
		return hari4;
	}
	public void setHari4(int hari4) {
		this.hari4 = hari4;
	}
	public int getHari5() {
		return hari5;
	}
	public void setHari5(int hari5) {
		this.hari5 = hari5;
	}
	public int getHari6() {
		return hari6;
	}
	public void setHari6(int hari6) {
		this.hari6 = hari6;
	}
	public int getHari7() {
		return hari7;
	}
	public void setHari7(int hari7) {
		this.hari7 = hari7;
	}
	public double getHargaBuah() {
		return hargaBuah;
	}
	public void setHargaBuah(double hargaBuah) {
		this.hargaBuah = hargaBuah;
	}
	private double hargaBuah;
	
	public Buah(String namaBuah) {
		this.namaBuah = namaBuah;
	} 
	public Buah(String namaBuah, double hargaBuah) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
	}
	public Buah(String namaBuah, double hargaBuah, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
		this.hari1 = hari1;
		this.hari2 = hari2;
		this.hari3 = hari3;
		this.hari4 = hari4;
		this.hari5 = hari5;
		this.hari6 = hari6;
		this.hari7 = hari7;
	}
	
	
}

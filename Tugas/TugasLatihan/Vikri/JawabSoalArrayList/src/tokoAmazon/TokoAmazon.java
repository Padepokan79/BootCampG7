// Created By Vikri
// 22/06/2018

package tokoAmazon;

public class TokoAmazon {
	private String namaBarang;
	private int harga, hari1, hari2, hari3, hari4, hari5, hari6, hari7;
	public TokoAmazon(){
		
	}
	public TokoAmazon(String namaBarang, int harga, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7){
		this.namaBarang = namaBarang;
		this.harga = harga;
		this.hari1 = hari1;
		this.hari2 = hari2;
		this.hari3 = hari3;
		this.hari4 = hari4;
		this.hari5 = hari5;
		this.hari6 = hari6;
		this.hari7 = hari7;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public void setHari1(int hari1) {
		this.hari1 = hari1;
	}
	public void setHari2(int hari2) {
		this.hari2 = hari2;
	}
	public void setHari3(int hari3) {
		this.hari3 = hari3;
	}
	public void setHari4(int hari4) {
		this.hari4 = hari4;
	}
	public void setHari5(int hari5) {
		this.hari5 = hari5;
	}
	public void setHari6(int hari6) {
		this.hari6 = hari6;
	}
	public void setHari7(int hari7) {
		this.hari7 = hari7;
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public int getHarga() {
		return harga;
	}
	public int getHari1() {
		return hari1;
	}
	public int getHari2() {
		return hari2;
	}
	public int getHari3() {
		return hari3;
	}
	public int getHari4() {
		return hari4;
	}
	public int getHari5() {
		return hari5;
	}
	public int getHari6() {
		return hari6;
	}
	public int getHari7() {
		return hari7;
	}
	
	int week1() {
		return harga = getHari1()+getHari2()+getHari3()+getHari4()+getHari5()+getHari6()+getHari7();
	}
	int week2() {
		return harga = getHari1()+getHari2()+getHari3()+getHari4()+getHari5()+getHari6()+getHari7()+(2*6);
	}
	int week3() {
		return harga = getHari1()+getHari2()+getHari3()+getHari4()+getHari5()+getHari6()+getHari7()+(1*6);
	}
	int week4() {
		if(getHari1()<1) {
			setHari1(2);
		} else if(getHari2()<1) {
			setHari2(2);
		} else if(getHari3()<1) {
			setHari3(2);
		} else if(getHari4()<1) {
			setHari4(2);
		} else if(getHari5()<1) {
			setHari5(2);
		} else if(getHari6()<1) {
			setHari6(2);
		} else if(getHari7()<1) {
			setHari7(2);
		} 
		return harga = getHari1()-2+getHari2()-2+getHari3()-2+getHari4()-2+getHari5()-2+getHari6()-2+getHari7()-2;
	}
}

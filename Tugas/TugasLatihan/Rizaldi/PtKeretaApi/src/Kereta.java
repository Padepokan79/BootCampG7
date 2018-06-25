
public class Kereta {
	
	
	String gerbong;
	int qtyPass1, qtyPass2, qtyPass3, qtyPass4, qtyPass5, qtyPass6, qtyPass7;
	private Double harga;

	public Kereta() {
		
	}
	
	public Kereta(String gerbong, Double harga, int qtyPass1, int qtyPass2, int qtyPass3, int qtyPass4, int qtyPass5, int qtyPass6, int qtyPass7) {
		this.gerbong=gerbong;
		this.harga=harga;
		this.qtyPass1=qtyPass1;
		this.qtyPass2=qtyPass2;
		this.qtyPass3=qtyPass3;
		this.qtyPass4=qtyPass4;
		this.qtyPass5=qtyPass5;
		this.qtyPass6=qtyPass6;
		this.qtyPass7=qtyPass7;
	}

	public String getGerbong() {
		return gerbong;
	}

	public void setGerbong(String gerbong) {
		this.gerbong = gerbong;
	}

	public int getQtyPass1() {
		return qtyPass1;
	}

	public void setQtyPass1(int qtyPass1) {
		this.qtyPass1 = qtyPass1;
	}

	public int getQtyPass2() {
		return qtyPass2;
	}

	public void setQtyPass2(int qtyPass2) {
		this.qtyPass2 = qtyPass2;
	}

	public int getQtyPass3() {
		return qtyPass3;
	}

	public void setQtyPass3(int qtyPass3) {
		this.qtyPass3 = qtyPass3;
	}

	public int getQtyPass4() {
		return qtyPass4;
	}

	public void setQtyPass4(int qtyPass4) {
		this.qtyPass4 = qtyPass4;
	}

	public int getQtyPass5() {
		return qtyPass5;
	}

	public void setQtyPass5(int qtyPass5) {
		this.qtyPass5 = qtyPass5;
	}

	public int getQtyPass6() {
		return qtyPass6;
	}

	public void setQtyPass6(int qtyPass6) {
		this.qtyPass6 = qtyPass6;
	}

	public int getQtyPass7() {
		return qtyPass7;
	}

	public void setQtyPass7(int qtyPass7) {
		this.qtyPass7 = qtyPass7;
	}

	public Double getHarga() {
		return harga;
	}

	public void setHarga(Double harga) {
		this.harga = harga;
	}
	public void totalPemasukkan(int totalQtyPass) {
		totalQtyPass=getQtyPass1()+getQtyPass2()+getQtyPass3()+getQtyPass4()+getQtyPass5()+getQtyPass6()+getQtyPass7();
	}
	
	
}

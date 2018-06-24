package rrv;

import java.util.Scanner;

public class Pakaian {
	
	Scanner inputKey = new Scanner(System.in);

	private String ukuran, jenisBahan;

	public Pakaian() {
		// TODO Auto-generated constructor stub
	}
	
	public Pakaian(String ukuran, String jenisBahan) {
		this.ukuran = ukuran;
		this.jenisBahan = jenisBahan;
	}
	
	String getUkuran() {
		return ukuran;
	}
	
	void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}
	
	String getJenisBahan() {
		return jenisBahan;
	}
	
	void setJenisBahan(String jenisBahan) {
		this.jenisBahan = jenisBahan;
	}
	
	String printPakaian() {
		return "Pakaian dengan ukuran " + ukuran + ", dibuat dari bahan " + jenisBahan; 
	}
}

package soalYana;

import java.util.ArrayList;

public class Object {
	ArrayList<String> namaHari=new ArrayList<String>();
	private String namaBarang;
	private int hargaBarang;
	
	public Object(String namaBarang, int hargaBarang, String...nama) {
		this.namaBarang=namaBarang;
		this.hargaBarang=hargaBarang;
		for(String hari:nama)
			namaHari.add(hari);
	}
	
	String getNama() {
		return namaBarang;
	}
	
	int getHargaBarang() {
		return hargaBarang;
	}
}

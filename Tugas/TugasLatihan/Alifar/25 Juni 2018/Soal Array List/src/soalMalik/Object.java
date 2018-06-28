package soalMalik;

import java.util.HashMap;
import java.util.Map;

public class Object {
	private String nama;
	private int harga;
	HashMap<String, Integer> hari=new HashMap<String, Integer>();
	
	public Object(String nama, int harga, HashMap<String, Integer> hari) {
		this.nama=nama;
		this.harga=harga;
		this.hari=hari;
	}
	
	String getNama() {
		return nama;
	}
	
	int hitung(int tambah) {
		tambahMinggu(tambah);
		int total=0;
		double promo=0.8;
		for(Map.Entry<String, Integer> h:hari.entrySet()) {
			if(!h.getKey().equals("Minggu"))
				total+=h.getValue()*harga;
			else
				total+=h.getValue()*harga*promo;
		}
		tambahMinggu(-tambah);
		return total;
	}
	
	int hitung(String day) {
		boolean check=false;
		for(Map.Entry<String, Integer> h:hari.entrySet()) {
			if(h.getKey().equalsIgnoreCase(day))
				check=true;
		}
		if(check)
			return hari.get(day)*harga;
		else
			return 0;
	}
	
	int getTotalItem(int tambah) {
		tambahMinggu(tambah);
		int total=0;
		for(Map.Entry<String, Integer> h:hari.entrySet())
			total+=h.getValue();
		tambahMinggu(-tambah);
		return total;
	}
	
	void tambahMinggu(int tambah) {
		for(Map.Entry<String, Integer> jumlah: hari.entrySet())
			hari.put(jumlah.getKey(), jumlah.getValue()+tambah);
	}
}

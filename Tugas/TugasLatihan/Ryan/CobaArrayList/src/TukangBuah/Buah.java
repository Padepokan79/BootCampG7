package TukangBuah;

import java.util.ArrayList;
import java.util.Arrays;

public class Buah {
	
	private int hargaBuah;
	private String namaBuah;
	
	ArrayList<Integer> terjual = new ArrayList<Integer>();
	
	public Buah(String namaBuah, int hargaBuah, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
		terjual.addAll(Arrays.asList(hari1,hari2,hari3,hari4,hari5,hari6,hari7));
	}
	int penghasilanHarian(String hari) {
		if (hari.equalsIgnoreCase("senin")) {
			return 0;}
		else if (hari.equalsIgnoreCase("selasa")) {
			return 1;}
		else if (hari.equalsIgnoreCase("rabu")) {
			return 2;}
		else if (hari.equalsIgnoreCase("kamis")) {
			return 3;}
		else if (hari.equalsIgnoreCase("jumat")) {
			return 4;}
		else if (hari.equalsIgnoreCase("sabtu")) {
			return 5;}
		else if (hari.equalsIgnoreCase("minggu")) {
			return 6;}
		else {
			return 0;
		}
	}
	int penghasilanMingguan() {
		int total=0;
		for (Integer perhari : terjual) {
			total = total+perhari;
		}
		return total*hargaBuah;
	}
	public String getNamaBuah() {
		return namaBuah;
	}
	public int getHargaBuah() {
		return hargaBuah;
	}

}

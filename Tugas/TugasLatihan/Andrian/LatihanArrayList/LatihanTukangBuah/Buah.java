package LatihanTukangBuah;

import java.util.ArrayList;
import java.util.Arrays;

public class Buah {
	private String namaBuah;
	private int hargaBuah;
	ArrayList<Integer> terjual = new ArrayList<Integer>();
	
	public Buah(String kindOfFruite, int FruitPrice, int day1, int day2, int day3, int day4, int day5, int day6, int day7) {
		namaBuah = kindOfFruite;
		hargaBuah = FruitPrice;
		terjual.addAll(Arrays.asList(day1, day2, day3, day4, day5, day6, day7));
	}

	int daily(int day) {
//		if (day.equalsIgnoreCase("senin"))
//			return terjual.get(0)*hargaBuah;
//		else if (day.equalsIgnoreCase("selasa"))
//			return terjual.get(1)*hargaBuah;
//		else if (day.equalsIgnoreCase("selasa"))
//			return terjual.get(2)*hargaBuah;
//		else if (day.equalsIgnoreCase("rabu"))
//			return terjual.get(3)*hargaBuah;
//		else if (day.equalsIgnoreCase("kamis"))
//			return terjual.get(4)*hargaBuah;
//		else if (day.equalsIgnoreCase("jumat"))
//			return terjual.get(5)*hargaBuah;
//		else if (day.equalsIgnoreCase("sabtu"))
//			return terjual.get(6)*hargaBuah;
//		else if (day.equalsIgnoreCase("minggu"))
//			return terjual.get(7)*hargaBuah;
		return terjual.get(day)*hargaBuah;
	}
	
	int totalBuah() {
		int total=0;
		for (Integer perhari:terjual)
			total+=perhari;
		return total;
	} 
	
	int incomeWeekly() {
		int total=0;
		for (Integer perhari:terjual)
			total+=perhari;
		return total*hargaBuah;
	}

	public String getNamaBuah() {
		return namaBuah;
	}

	public int getHargaBuah() {
		return hargaBuah;
	}
	
	
}

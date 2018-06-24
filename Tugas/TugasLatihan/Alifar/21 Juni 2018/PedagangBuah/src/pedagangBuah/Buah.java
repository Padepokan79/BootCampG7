package pedagangBuah;

import java.util.ArrayList;
import java.util.Arrays;

public class Buah {
	private String fruitName;
	private int price;
	ArrayList<Integer> terjual=new ArrayList<Integer>();
	
	public Buah(String name, int cost, int senin, int selasa, int rabu, int kamis, int jumat, int sabtu, int minggu) {
		fruitName=name;
		price=cost;
		terjual.addAll(Arrays.asList(senin, selasa, rabu, kamis, jumat, sabtu, minggu));
	}
	
	int daily(int num) {
			return terjual.get(num)*price;
	}
	
	int weekly() {
		int total=0;
		for(Integer perhari:terjual)
			total+=perhari;
		return total*price;
	}
	
	int getTotalFruit() {
		int total=0;
		for(int jml:terjual)
			total+=jml;
		return total;
	}

	String getFruitName() {
		return fruitName;
	}
	
	int getPrice() {
		return price;
	}
}

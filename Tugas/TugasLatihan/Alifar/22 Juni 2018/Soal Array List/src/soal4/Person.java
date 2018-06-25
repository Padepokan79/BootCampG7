package soal4;

import java.util.ArrayList;

public class Person {
	private String nama;
	ArrayList<CreditCard> card=new ArrayList<CreditCard>();
	
	public Person(String nama, CreditCard...card) {
		this.nama=nama;
		for(CreditCard each:card)
			this.card.add(each);
	}
	
	String getNama(){
		return nama;
	}
	
}

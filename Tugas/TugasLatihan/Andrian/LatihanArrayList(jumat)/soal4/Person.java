/**
 * 
 */
package soal4;

import java.util.ArrayList;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 2:07:08 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class Person {
	private String nama;
	ArrayList<CreditCard> kartu= new ArrayList<CreditCard>();
	
	public Person (String nama, CreditCard...kartu) {
		this.nama=nama;
		for (CreditCard each:kartu) {
			this.kartu.add(each);
		}
	}
	
	String getNama() {
		return nama;
	}

}

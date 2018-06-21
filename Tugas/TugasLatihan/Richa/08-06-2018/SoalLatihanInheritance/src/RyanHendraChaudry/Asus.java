/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 11.27 AM
Updated by			:
Updated Date/hour	:
*/

package RyanHendraChaudry;

public class Asus extends Laptop {
	
	private char game;
	public Asus () {
		
	}
	public Asus (String nama, int harga, double ukuranLayar, int ukuranRAM, int ukuranHardisk, String merk, String processor, double clockSpeed, char game) {
		super(nama, harga, ukuranLayar, ukuranRAM, ukuranHardisk, merk, processor, clockSpeed);
		this.game = game;
		
	}
	
	char getGame () {
		return game;
	}
	
	public String toString () {
		return super.toString() + " Laptop gaming? " + game;
	}
}

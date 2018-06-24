/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 10.00 AM
Updated by			:
Updated Date/hour	:
*/

package RyanHendraChaudry;

public class BurungKenari extends Unggas {
	private char terbang; 
	
	public BurungKenari () {
		
	}
	
	public BurungKenari (String name, String featherColor, String respi, int ageLife, int size, int eggTime, String voice, char tbr) {
		super(name, featherColor, respi, ageLife, size, eggTime, voice);
		terbang = tbr;
		
	}

	char getTerbang () {
		return 'N';
	}

	
}

/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 3.03 PM
Updated by			:
Updated Date/hour	:
*/

package AndrianAriefKhairil;

public class Buah {
	private String tipe, biji;
	
	public Buah () {
		
	}
	public Buah (String tipe, String biji) {
		this.tipe = tipe;
		this.biji = biji;
	}
	
	String getTipe () {
		return tipe;
	}
	String getBiji () {
		return biji;
	}
	
	String printBuah () {
		return "Buah dengan tipe " + tipe + " dan memiliki biji " + biji;
	}
}

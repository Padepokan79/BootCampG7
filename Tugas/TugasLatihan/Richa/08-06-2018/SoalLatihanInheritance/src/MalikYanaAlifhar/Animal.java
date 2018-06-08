/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 3.36 PM
Updated by			:
Updated Date/hour	:
*/

package MalikYanaAlifhar;

public class Animal {
	private String jenisHewan, caraGerak;

	
	public Animal () {
		
	}
	public Animal (String jenisHewan, String caraGerak) {
		this.jenisHewan = jenisHewan;
		this.caraGerak = caraGerak;
	}
	
	String getJenisHewan () {
		return jenisHewan;
	}
	String getCaragerak () {
		return caraGerak;
	}
	
	String printAnimal () {
		return "Hewan berjenis " + jenisHewan + " dan bergerak dengan cara " + caraGerak;
	}
	
}

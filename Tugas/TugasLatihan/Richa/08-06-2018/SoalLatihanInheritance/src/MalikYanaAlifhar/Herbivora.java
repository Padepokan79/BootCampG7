/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 3.36 PM
Updated by			:
Updated Date/hour	:
*/

package MalikYanaAlifhar;

public class Herbivora extends Animal {
	private String namaHewan, caraMemangsa;
	
	public Herbivora () {
		
	}
	public Herbivora (String jenisHewan, String caraGerak, String namaHewan, String caraMemangsa) {
		super (jenisHewan, caraGerak);
		this.namaHewan = namaHewan;
		this.caraMemangsa = caraMemangsa;
	}
	
	String getNamaHewan () {
		return namaHewan;
	}
	
	String getCaraMemangsa () {
		return caraMemangsa;
	}
	
	String printAnimal () {
		return super.printAnimal() + ".Nama hewan = " + namaHewan + " cara memangsanya dengan cara " + caraMemangsa;
	}
}


/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 06.30 PM
Updated by			:
Updated Date/hour	:
*/

package AndrianAriefKhairil;

public class Kanker {
	private String klasifikasi, faktorResiko;
	
	public Kanker () {
		
	}
	public Kanker (String klasifikasi, String faktorResiko) {
		this.klasifikasi = klasifikasi;
		this.faktorResiko = faktorResiko;
	}
	
	String getKlasifikasi () {
		return klasifikasi;
	}
	String getFaktorResiko () {
		return faktorResiko;
	}
	
	String printKanker () {
		return "Ini adalah penyakit kanker dengan klasifikasi " + klasifikasi + " dan faktor resiko " + faktorResiko;
	}
}

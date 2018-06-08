/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 11.47 AM
Updated by			:
Updated Date/hour	:
*/
package MalikYanaAlifhar;

public class Atlet {

	private int tinggi, berat, usia;
	private String nama, jenisKelamin, id;
	
	public Atlet () {
		
	}
	
	public Atlet (int height, int weight, int age, String name, String gender, String id) {
		tinggi = height;
		berat = weight;
		usia = age;
		nama = name;
		jenisKelamin = gender;
		this.id = id;
	}
	
	int getTinggi () {
		return tinggi;
	}
	int getBerat () {
		return berat;
	}
	int getAge () {
		return usia;
	}
	String getName () {
		return nama;
	}
	String getgender () {
		return jenisKelamin;
	}
	String getID () {
		return id;
	}
	String printAtlet () {
		return "Atlet dengan tinggi "  + tinggi + " berat " + berat + " usia " + usia + " bernama " + nama + ", " + jenisKelamin + " id: " + id;
	}
	
}

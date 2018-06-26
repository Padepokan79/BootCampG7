package GajiIT;
/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

public abstract class Person {
	private String nama;
	
	
	public Person() {
		
	}
	public Person(String nama) {
		this.nama = nama;
	}
	
	// setter getter
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public abstract String toString();
	
}

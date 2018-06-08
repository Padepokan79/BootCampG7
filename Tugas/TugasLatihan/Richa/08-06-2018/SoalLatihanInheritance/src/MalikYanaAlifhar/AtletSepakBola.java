/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 11.47 AM
Updated by			:
Updated Date/hour	:
*/

package MalikYanaAlifhar;

public class AtletSepakBola extends Atlet {
	private String posisi;
	private int power, stamina, accuracy, speed;
	private int gol, jarakLari;
	
	public AtletSepakBola () {
		
	}
	
	public AtletSepakBola (int tinggi, int berat, int usia, String nama, String jenisKelamin, String id, String posisi, int power, int stamina, int accuracy, int speed) {
		super (tinggi, berat, usia, nama, jenisKelamin, id);
		this.posisi= posisi;
		this.power = power;
		this.stamina = stamina;
		this.accuracy = accuracy;
		this.speed = speed;
	}
	
	String getPosisi () {
		return posisi;
	}
	void setPosisi (String pos) {
		posisi = pos;
	}
	int getPower () {
		return power;
	}
	void setPower (int pow) {
		power = pow;
	}
	int getStamina () {
		return stamina;
	}
	void setStamina (int stam) {
		stamina = stam;
	}
	int getAcc () {
		return accuracy;
	}
	void setAcc (int acc) {
		accuracy = acc;
	}
	int getSpeed () {
		return speed;
	}
	void setSpeed (int sp) {
		speed = sp;
	}
	
	
	String latihanTendang (int jmlTendang)   {
		gol = jmlTendang;
		jmlTendang = 10-(power+accuracy)/2;
	}
	String latihanLari (int jarak)  {
		jarakLari = jarak;
		jarak = 10-(speed+stamina)/2;
	}
	

}

package Malik;

import java.util.Random;

public class Football extends Athlete {
	private Athlete athlete;
	private String posisi;
	private int power, stamina, accurasy, speed;
	Random rand = new Random();
	
	public Football() {
		
	}
	public Football(Athlete athlete, String posisi, int power, int stamina, int accurasy, int speed) {
		this.athlete 	= athlete;
		this.posisi 	= posisi;
		this.power 		= power;
		this.stamina 	= stamina;
		this.accurasy 	= accurasy;
		this.speed 		= speed;
	}
	
	String getPosisi() {
		return posisi;
	}
	int getPower() {
		return power;
	}
	int getStamina() {
		return stamina;
	}
	int getAccurasy() {
		return accurasy;
	}
	int getSpeed() {
		return speed;
	}
	
	String latihanTendangan(int jmlTendang) {
		int gol 	= 0, jmlGol = 0, hasil = 0;
		
		for(int index = 0; index < jmlTendang; index++) {
			gol  	= (power + accurasy)/2;
			hasil 	= rand.nextInt(10-gol);
		}
		
		if(hasil < 2) {
			jmlGol += 1;
		}
		
		return "Banyak gol yang masuk "+jmlGol;
	}
	
	public String toString() {
		return 
				"Posisi   : "+posisi+"\n"+
				"Power    : "+power+"\n"+
				"Stamina  : "+stamina+"\n"+
				"Accurasy : "+accurasy+"\n"+
				"Speed    : "+speed+"\n";
	}
}

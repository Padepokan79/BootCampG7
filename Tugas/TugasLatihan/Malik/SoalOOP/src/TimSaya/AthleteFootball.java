package TimSaya;

import java.util.Random;
public class AthleteFootball {
	Random rand = new Random();
	private Athlete atlet;
	private String posisi;
	private int power, stamina, accuracy, speed, random=0, waktu;
	
	
	public AthleteFootball() {
		// TODO Auto-generated constructor stub
	}
	
	public AthleteFootball(Athlete atlet, String posisi, int power, int stamina, int accuracy, int speed) {
		this.atlet 		= atlet;
		this.posisi 	= posisi;
		this.power 		= power;
		this.stamina 	= stamina;
		this.accuracy 	= accuracy;
		this.speed 		= speed;
	}
	
	int latihanTendang(int jmlTendang) {
		int proses = 10-((power-accuracy)/2);
		random = rand.nextInt(proses);
		return random;
	}
	
	void latihanLari(int jarak) {
		if (speed == 1) {
			for (; jarak > 0; jarak -= 2) {
				stamina -= 1;
				
				
			}
		}else if (speed == 2) {
			
		}else if (speed == 3) {
			
		}else if (speed == 4) {
			
		}else if (speed == 5) {
			
		}else if (speed == 6) {
			
		}else if (speed == 7) {
			
		}else if (speed == 8) {
			
		}else if (speed == 9) {
			
		}else if (speed == 10) {
			
		}	
	}
	
	
	
	

}

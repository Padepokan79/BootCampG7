package amy;

import java.util.Random;

class AthleteFootball {
	private Athlete athlete;
	private Random rand;
	private String posisi;
	private int power, stamina, accuracy, speed;

	public AthleteFootball(Athlete athlete, String posisi, int power, int stamina, int accuracy, int speed) {
		this.athlete = athlete;
		this.posisi = posisi;
		this.power = power;
		this.stamina = stamina;
		this.accuracy = accuracy;
		this.speed = speed;
	}
	
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	
	String getPosisi() {
		return posisi;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	int getPower() {
		return power;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	int getStamina() {
		return stamina;
	}
	
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	int getAccuracy() {
		return accuracy;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return speed;
	}
	
	int latihanTendang(int jumTendang) {
		int goal = 0;
		int jumGoal = 0;
		
		for(int count=0; count < jumTendang; count++) {
			goal = (power + accuracy) / 2;
			int randeum = rand.nextInt(10-goal);
			if(randeum < 2) {
				goal = 1;
				jumGoal+=goal;
			}
			else {
				goal = 0;
				jumGoal+=goal;
			}
		}
		
		return jumGoal;
	}
	
//	int latihanLari(int jarak) {
//		speed = 2;
//		for(int counting=1; counting <= stamina; counting++) {
//			if(counting == 1) {
//				speed = 2;
//			}
//			else {
//				speed+= 0.8;
//			}
//		}
//		
//		if(stamina == 0) {
//			speed -= (0.3*speed);
//		}
//		
//		return speed;
//	}
}

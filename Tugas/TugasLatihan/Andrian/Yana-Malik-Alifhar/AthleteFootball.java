package yma;
import java.util.*;
public class AthleteFootball {
	Random rand = new Random();
	private int power, stamina, accuracy, speed, jmlTendang, jarak;
	private Athlete atlet;
	private String posisi;
	
	public AthleteFootball() {}
	public AthleteFootball(Athlete athlete, String posisi, int power, int stamina, int accuracy,
			int speed) {
		setAtlet(athlete);
		this.setPosisi(posisi);
		this.power = power;
		this.stamina = stamina;
		this.accuracy = accuracy;
		this.speed = speed;
	}
	public Athlete getAtlet() {
		return atlet;
	}
	public void setAtlet(Athlete atlet) {
		this.atlet = atlet;
	}
	public String getPosisi() {
		return posisi;
	}
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	public int getPower() {
		return power;
	}
	int getStamna() {
		return stamina;
	}
	int getAccuracy() {
		return accuracy;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int jmlhTendang (int tendang) {
		int jmlhGol=0;
		for (int index = 0; index<tendang; index++) {
			int gol = (power+accuracy)/2;
			int res = rand.nextInt(10-gol);
			if (res<2) {
				gol=1;
				jmlhGol+=gol;
			}
			else {
				gol=0;
				jmlhGol+=gol;
			}
		}
		return jmlhGol;
	}
	
	int latihanLari (int jarak) {
		double kecepatan=2;
		int waktu=0;
		if (speed==1) {
			kecepatan = 2;
			
		}
		else {
			for (int index = 1; index<=speed; index++) {
				kecepatan+=0.8;
			}			
		}
		return waktu;
	}
	
	public String toString() {
		return atlet.toString()+"\n\nPower "+power+"\nStamina "+stamina+"\nAccuracy "+accuracy+
				"\nSpeed "+speed+"\n\nPosisi "+posisi;
	}
	

}

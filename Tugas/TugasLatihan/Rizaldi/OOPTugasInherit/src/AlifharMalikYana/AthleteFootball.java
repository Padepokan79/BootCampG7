package AlifharMalikYana;

public class AthleteFootball extends Athlete{
	String posisi;
	int power, accuracy, stamina;
	private int speed;
	public AthleteFootball() {
		
	}
	public AthleteFootball(int tinggi, int berat, int usia, String nama, String jnsKelamin, String id, String posisi, int power, int accuracy, int stamina, int speed) {
		super(tinggi, berat, usia, nama, jnsKelamin, id);
		this.posisi = posisi;
		this.power = power;
		this.accuracy = accuracy;
		this.stamina = stamina;
		this.setSpeed(speed);
	}
	// getter
	String getPosisi() {
		return posisi;
	}
	int getPower() {
		return power;
	}
	int getAcc() {
		return accuracy;
	}
	int getStam() {
		return stamina;
	}
	int getSpeed() {
		return speed;
	}
	// setter
	void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	void setPower(int power) {
		this.power = power;
	}
	void setAcc(int accuracy) {
		this.accuracy = accuracy;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	// method
	
}

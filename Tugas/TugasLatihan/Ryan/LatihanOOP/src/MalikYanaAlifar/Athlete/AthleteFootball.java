package MalikYanaAlifar.Athlete;
import java.util.Random;

public class AthleteFootball extends Athlete{
	Random rand = new Random();
	private String posisi;
	private int power, stamina, accuracy, speed;
	private Athlete athlete;
	
	public AthleteFootball(Athlete athlete, String posisi, int power, int stamina, int accuracy, int speed) {
		this.athlete = athlete;
		this.posisi = posisi;
		this.power = power;
		this.stamina = stamina;
		this.accuracy = accuracy;
		this.speed = speed;
	}
	
	String latihanTendang(int jmlTendang) {
		jmlTendang = rand.nextInt(10)+1;
		return "Jumlah Tendangan : "+jmlTendang;
	}
	String latihanLari(int jarak) {
		jarak = rand.nextInt(10)+1;
		return "Jarak berlari : "+jarak+" km";
	}
	
	public String toString() {
		return athlete.toString()+
				"\nPosisi : "+posisi+
				"\nPowr : "+power+
				"\nStamina : "+stamina+
				"\nAccuracy : "+accuracy+
				"\nSpeed : "+speed+"\n"+
				latihanTendang(0)+"\n"+
				latihanLari(0);
	}

}

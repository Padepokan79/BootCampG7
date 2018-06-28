package AlifharMalikYana;

import java.util.Random;
public class FootballPlayer extends Athlete {
	Random random = new Random();
	private String 	posisi;
	private Athlete	athlete = new Athlete();
	private int		power, stamina, accuracy, speed;
	
	public FootballPlayer() {
	}
	
	public FootballPlayer(String posisi, int power, int stamina, int accuracy, int speed, Athlete athlete) {
		this.posisi 	= posisi;
		this.power		= power;
		this.stamina	= stamina;
		this.accuracy	= accuracy;
		this.speed 		= speed;
		this.athlete	= athlete;
	}
	
	int latihanMenendang(int jumlahTendang) {
		int gol 	= 0;
		int jmlGol	= 0;
		for(int loop=0; loop<jumlahTendang; loop++) {
			gol 	= (accuracy + stamina)/2;
			int hasil = random.nextInt(10-gol);
			if (hasil < 2) {
				gol 	= 1;
				jmlGol	+= gol;
			}
			else {
				gol		= 0;
				jmlGol	+= gol;
			}
		}
		return jmlGol;
	}
	
	String tampilFottbalPlayer() {
		return ""+athlete.tampilAthlete()+", Posisi : "+posisi+", Power : "+power+", Stamina "+stamina+", Akurasi : "+accuracy+", Speed : "+speed+"";
	}
}

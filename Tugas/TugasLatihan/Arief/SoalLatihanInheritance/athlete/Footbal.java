package athlete;

import java.util.*;

public class Footbal extends Atlit{
	
	Random rand = new Random();
	Atlit atl = new Atlit();;
	String posisi;
	int power, stamina, accuracy, speed;

	public Footbal() {
		// TODO Auto-generated constructor stub
	}
	
	public Footbal(Atlit atl, String posisi, int power, int stamina, int accuracy, int speed) {
		 this.atl = atl;
		 this.posisi = posisi;
		 this.power = power;
		 this.stamina = stamina;
		 this.accuracy = accuracy;
		 this.speed = speed;
	}
	
	int latihanTendang(int jmlTendang) {
		return jmlTendang;
	}
	
	int latihanLari(int jarak) {
		return jarak;
	}
	
	int jmlhTendang (int tendang) {
		int jmlhGol=0;
		for (int index = 0; index<tendang; index++) {
			int gol = (power+accuracy)/2;
			int rest = rand.nextInt(10-gol);
			if (rest<2) {
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
	
	String printAtlit() {
		return atl.printAtlit() + "\nposisi " + posisi + " power " + power + " stamina " + stamina + " acc " + accuracy + " speed " + speed;
	}

}

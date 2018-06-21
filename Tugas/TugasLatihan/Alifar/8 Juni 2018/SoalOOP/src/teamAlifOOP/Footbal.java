package teamAlifOOP;

public class Footbal {
	private Athlete atlit;
	private String posisi;
	private int power, speed, accuracy, stamina;
	
	public Footbal(Athlete atlit, String posisi, int power, int speed, int accuracy, int stamina) {
		this.atlit=atlit;
		this.posisi=posisi;
		this.power=power;
		this.accuracy=accuracy;
		this.speed=speed;
		this.stamina=stamina;
	}
	
	String tendang(int jml) {
		int goal=0;
		for(int tendang=0; tendang<jml; tendang++) {
			double chance=Math.random()*(10-(power+accuracy)/2);
			if (chance<2)
				goal++;
		}
		return "gol "+goal+" dari "+jml+ " tendangan";
	}
	
	double kecepatan() {
		return 2+(speed-1)*0.8;
	}
	
	String lari(int jarak) {
		double waktu=0;
		int sisa=jarak-stamina*2;
		sisa=sisa*1000; //diubah ke meter
		jarak=jarak*1000; //diubah ke meter
		double kecepatan=kecepatan();
		if(sisa<=0) {
			waktu+=jarak/kecepatan;
		}
		else {
			waktu+=(jarak-sisa)/kecepatan;
			waktu+=sisa/(0.3*kecepatan);
		}
		waktu/=60;
		return "waktu yang dihabiskan adalah "+waktu+" menit";
	}

	@Override
	public String toString() {
		return "Footbal [atlit=" + atlit + ", posisi=" + posisi + ", power=" + power + ", speed=" + speed
				+ ", accuracy=" + accuracy + ", stamina=" + stamina + "]";
	}
	
}

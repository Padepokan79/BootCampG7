package rrv2;

public class Flu extends Penyakit{
	
	String gejala, bagianYangDiserang, stadium, namaPenyakit;
	Double biayaPengobatan;
	Penyakit pny = new Penyakit();
	
	public Flu() {
		// TODO Auto-generated constructor stub
	}
	
	public Flu(Penyakit pny, String gejala, String bagianYangDiserang, String stadium, String namaPenyakit, Double biayaPengobatan) {
		this.gejala = gejala;
		this.bagianYangDiserang = bagianYangDiserang;
		this.stadium = stadium;
		this.namaPenyakit = namaPenyakit;
		this.biayaPengobatan = biayaPengobatan; 
	}
		
	String getStadium() {
		return stadium;
	}
	
	void stage(String stadium) {
		if (stadium.equals("tidakBahaya")) {
			biayaPengobatan = 50000 - (50000 * 10.0/100);
//			System.out.println("Biaya Pengobatan 50.000");
		} else if (stadium.equals("sedang")) {
			biayaPengobatan += 550000 - (550000 * 20.0/100);
//			System.out.println("Biaya Pengobatan 550.000");
		} else if (stadium.equals("kronis")) {
			biayaPengobatan += 1500000 - (1500000 * 30.0/100);;
//			System.out.println("Biaya Pengobatan 1.500.000");
		}
	}
	
	String printPnykt() {
		return "Gejala " + gejala + " bagian " + bagianYangDiserang +
				" stadium " + stadium + " nama " + namaPenyakit + " biaya " + biayaPengobatan +
				" "; 
	}
}

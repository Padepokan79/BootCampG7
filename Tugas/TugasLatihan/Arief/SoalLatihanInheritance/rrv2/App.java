package rrv2;

public class App {

	public static void main(String[] args) {
		Penyakit pny = new Penyakit('Y');
		Flu fl = new Flu(pny, "Demam Tinggi", "Telinga", "kronis", "Bisul", 0.0);
		
		fl.stage(fl.getStadium());
		System.out.println(fl.printPnykt());
	}

}

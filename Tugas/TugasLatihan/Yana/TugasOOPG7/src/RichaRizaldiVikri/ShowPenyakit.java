package RichaRizaldiVikri;

public class ShowPenyakit {
	public static void main(String[] args) {
			
		Penyakit penyakit = new Penyakit("Anak", "Demam", "THT", "Bahaya");
		Flue flue = new Flue(penyakit, "BPJS", 60000);
		
		System.out.println("\nPENYAKIT");
		System.out.println(penyakit.tampilPenyakit());
		System.out.println("Keparahan : "+penyakit.getKeparan());
		System.out.println("\nFLUE");
		System.out.println(flue.tampilFlue());
		System.out.println("Keparahan : "+flue.keparahan());
		System.out.println("Diskon asuransi : "+flue.getDiskon());
	}	
}

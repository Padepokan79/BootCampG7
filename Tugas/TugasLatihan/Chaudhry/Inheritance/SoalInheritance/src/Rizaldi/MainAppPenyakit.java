package Rizaldi;

public class MainAppPenyakit {

	public static void main(String[] args) {
		Penyakit ps = new Penyakit("Asam urat", "Sakit Saraf", "Saraf", "sedang", 'y');
		Flue flu = new Flue("Flue", "batuk", "hidung", "tidak bahaya", 't', "Cair");
		Maag mag = new Maag("Maag", "sakit perut", "Lambung", "kronis", 't');
		
		System.out.println("");
		System.out.println(ps.toString());
		
		System.out.println("");
		System.out.println(flu.toString());

		System.out.println("");
		System.out.println(mag.toString());

	}

}

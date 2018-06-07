package bootcamp;

public class G7 {
	String nama, jenisKelamin, status;
	double beratBadan, tinggiBadan;
	
	public G7 () {
		
	}
	
	public G7 (String name, String gender, String stat, double bb, double tb) {
		nama = name;
		jenisKelamin= gender;
		status = stat;
		beratBadan = bb;
		tinggiBadan= tb;
		
	}
	
	void g7 (String name, String gender, String stat, double bb, double tb) {
		nama = name;
		jenisKelamin= gender;
		status = stat;
		beratBadan = bb;
		tinggiBadan= tb;
	}
	
	void greeting ( ) {
		System.out.println("Halo nama saya " + nama + " seorang " + jenisKelamin + " yang sedang " + status + " dengan berat badan " + beratBadan + " kg dan tinggi badan " + tinggiBadan + " cm");
	}

}

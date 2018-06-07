package ObjekDisekitar;

public class G7 {
	String nama, gender, status;
	Double bBadan, tBadan;
	
	public G7() {
		
	}
	
	public G7(String name, String jKelamin, String stat, Double berat, Double tinggi){
		nama = name;
		gender = jKelamin;
		status = stat;
		bBadan = berat;
		tBadan = tinggi;
	}
	
	void g7() {
		nama = "Vikri";
		gender = "Pria";
		status = "Single";
		bBadan = 52.5;
		tBadan = 136.0;
		System.out.println("Halo nama Saya "+nama+" saya seorang "+gender+" \nyang sedang "+status+" dengan "+bBadan+" Kg, dan tinggi badan "+tBadan+" Cm.");
	}	
	
	void greet() {
		System.out.println("Halo nama Saya "+nama+" saya seorang "+gender+" \nyang sedang "+status+" dengan "+bBadan+" Kg, dan tinggi badan "+tBadan+" Cm.");
	}
	
}


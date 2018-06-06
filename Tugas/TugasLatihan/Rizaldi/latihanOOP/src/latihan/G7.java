package latihan;

public class G7 {
	String name, gender, status;
	Double height, weight;
	public G7() {// construct default
		
	}
	public G7(String nama, String jenisKelamin, String statusKawin, Double berat, Double tinggi) {
		name	=nama;
		gender	=jenisKelamin;
		status	=statusKawin;
		height	=berat;
		weight	=tinggi;
	}
	
	void greeting() {
		System.out.println("Hallo saya "+name+" saya seorang "+gender+" yang sedang "+status+".\nberat badan "+weight+" kg.\nTinggi "+height+" cm.");
	}
	void insertData() {
		name	="rian";
		gender	="cowok";
		status	="kawin";
		height	=123.4;
		weight	=12.5;
	}
}

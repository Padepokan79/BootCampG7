package teamrOOP;

public class Flue {
	private String gejala, bagianDiserang;
	private Penyakit Penyakit=new Penyakit();
	
	public Flue(String gejala, String bagianDiserang, teamrOOP.Penyakit penyakit) {
		super();
		this.gejala = gejala;
		this.bagianDiserang = bagianDiserang;
		Penyakit = penyakit;
	}
	
	@Override
	public String toString() {
		return "Flue [gejala=" + gejala + ", bagianDiserang=" + bagianDiserang + ", Penyakit=" + Penyakit + "]";
	}
	
}

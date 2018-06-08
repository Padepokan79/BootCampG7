package teamrOOP;

public class PenyakitPApp {
	public static void main(String[] args) {
		Penyakit p=new Penyakit("Flue", "Kronis", "bpjs");
		Flue f=new Flue("Panas", "Hidung", p);

		p.harga();
		p.bpjs();
		System.out.println(p.toString());
		System.out.println(f.toString());
	}
}

package ControllerElektronik;

public class Proyektor {
	public int kecerahan, berat;
	public String warna, model;
	public int[] arrayUkuran = new int[3];
	
	public Proyektor() {
		
	}
	
	public Proyektor(int kecerahan, int berat, String warna, String model, int[] array) {
		this.kecerahan = kecerahan;
		this.berat = berat;
		this.warna = warna;
		this.model = model;
		arrayUkuran = array;
	}
	
	public void inisialProyektor(int kecerahan, int berat, String warna, String model, int[] array) {
		this.kecerahan = kecerahan;
		this.berat = berat;
		this.warna = warna;
		this.model = model;
		arrayUkuran = array;
	}
	
	public void tampilProyektor() {
		System.out.println("Model proyektor      : "+model);
		System.out.println("Warna proyektor      : "+warna);
		System.out.println("Kecerahan proyektor  : "+model);
		System.out.println("Berat proyektor      : "+berat+" Kg");
		System.out.print("Ukuran proyektor       : ");
		for(int ukuran : arrayUkuran) {
			System.out.print(ukuran+" ");
		}
		
		
	}
	
}

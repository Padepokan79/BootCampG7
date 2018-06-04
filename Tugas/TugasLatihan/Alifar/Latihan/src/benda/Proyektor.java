package benda;

public class Proyektor {
	String warna, model;
	int kecerahan, berat;
	int[] ukuran=new int[3];
	
	public Proyektor() {}
	public Proyektor(String color, String design, int brightness, int weight, int[] size) {
		warna=color;
		model=design;
		kecerahan=brightness;
		berat=weight;
		for(int add=0; add<size.length; add++)
			ukuran[add]=size[add];
	}

	void init(String color, String design, int brightness, int weight, int[] size) {
		warna=color;
		model=design;
		kecerahan=brightness;
		berat=weight;
		for(int add=0; add<size.length; add++)
			ukuran[add]=size[add];
	}
	
	void disp() {
		System.out.println("Proyektor "+model);
		System.out.println("warna     : "+warna);
		System.out.println("Kecerahan : "+kecerahan);
		System.out.println("Berat     : "+berat);
		System.out.println("Ukuran    : "+ukuran[0]+" x "+ukuran[1]+" x "+ukuran[2]);
	}
}

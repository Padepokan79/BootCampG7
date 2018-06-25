package geometry;

public class Lingkaran {
	double jari2, area, perimeter, height, tube, sphere;
	
	
	public Lingkaran() {
		
	}
	public Lingkaran(Double r) {
		jari2	= r;
	}
	
	void areaCircle(double r) {// luas lingkaran
		double area=3.14*(r*r);
		System.out.println("Luas lingkaran adalah : "+area);
	}
	void perimeterCircle(double r) {// keliling lingkaran 
		double perimeter=2*3.14*r;
		System.out.println("Keliling lingkaran adalah : "+perimeter);
	}
	void tubeCircle(double jari2, double height) {// volume tabung		
		double tube=3.14*(jari2*jari2)*height;
		System.out.println("Volume tabung adalah : "+tube);
	}
	void ballCirle(double jari2) {// volume bola
		double sphere=((4/3)*3.14*(jari2*jari2*jari2));
		System.out.println("Volume bola adalah : "+sphere);
	}
}

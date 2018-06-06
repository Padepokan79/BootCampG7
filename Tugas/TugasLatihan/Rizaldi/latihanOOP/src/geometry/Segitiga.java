package geometry;

public class Segitiga {
	double length, area, alas, height, perimeter, side;// variable 
	public Segitiga() {// constructor
		
	}
	
	void areaTriangle(double alas, double height) {// method
		double area=(1/2)*alas*height;
		System.out.println("Luas Segitiga adalah : "+area);
	}
	void perimeterTriangle(double side) {
		double perimeter=side+side+side;
		System.out.println("Keliling Segitiga adalah : "+perimeter);
	}
}

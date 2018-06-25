package geometry;

public class Persegi {
	
	Double square, length, wide, area, side, perimeter, volume, height;
	public Persegi() {
		
	}
	public Persegi(Double panjang) {
		length	= panjang;
	}
	void areaSquare(double side) {// luas persegi
		double area=side*side;
		System.out.println("Luas persegi adalah : "+area);
	}
	void perimeterSquare(double side) {// keliling persegi
		double perimeter=4*side;
		System.out.println("Keliling persegi adalah : "+perimeter);
	}
	void areaRectangle(double wide, double length) {// luas persegi panjang
		double area=wide*length;
		System.out.println("Luas persegi panjang adalah : "+area);
	}
	void perimeterRectangle(double wide, double length) {// keliling persegi panjang
		double perimeter=2*(wide*length);
		System.out.println("Keliling persegi panjang adalah : "+perimeter);
	}
	void cubeVolume(double side) {// volume kubus
		double volume=side*side*side;
		System.out.println("Volume Kubus adalah : "+volume);
	}
	void rectVolume(double wide, double height, double length) {// volume balok
		double volume=wide*height*length;
		System.out.println("Volume Balok adalah : "+volume);
	}
}

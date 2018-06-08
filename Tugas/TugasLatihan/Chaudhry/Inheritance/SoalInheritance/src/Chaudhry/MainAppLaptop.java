package Chaudhry;

public class MainAppLaptop {

	public static void main(String[] args) {
		Apple apple = new Apple("Apple X", 7800000, 15.7, 8, 500, "Apple", "Intel Core i7", 3.1);
		Asus asus = new Asus("Asus A70065", 6400000, 14, 4, 300, "Asus", "Intel Core i5", 2.1);
		
		System.out.println("");
		System.out.println(apple.toString());
		apple.forGaming();
		
		System.out.println("");
		System.out.println(asus.toString());
		asus.forOffice();
	}

}

package rhc1;

class LaptopApp {

	public static void main(String[] args) {
		Laptop laptop = new Laptop("Apple");
		System.out.println( laptop.printLaptop() );
		System.out.println();
		Apple apple = new Apple(laptop, "Apple Macbook Pro", "Intel Core i7 7th Gen", 8, 1024, 15.4, 3.7);
		System.out.println( apple.printApple() );
	}

}

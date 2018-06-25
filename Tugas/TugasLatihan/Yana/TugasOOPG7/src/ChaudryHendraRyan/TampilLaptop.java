package ChaudryHendraRyan;

public class TampilLaptop {

	public static void main(String[] args) {
		Laptop 	laptop = new Laptop(5000000, 14.5, "Intel", 4, 500, 9);
		Asus	asus 	= new Asus("Windows XP", "ASUS", laptop);
		
		System.out.println("\nLAPTOP");
		System.out.println(laptop.tampilLapto());
		System.out.println("\nASUS");
		System.out.println(asus.tampilAsus());
	}

}

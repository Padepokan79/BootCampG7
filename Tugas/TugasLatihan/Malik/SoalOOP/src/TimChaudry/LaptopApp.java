package TimChaudry;

public class LaptopApp {

	public static void main(String[] args) {
		Laptop lp = new Laptop("Asus", "Intel Core i7", 10000000, 3, 500, 14.5, 2.6);
		Asus   as = new Asus(lp, "AS1243", "Windows");
		
		System.out.println();
		System.out.println("======================");
		System.out.println("         LAPTOP");
		System.out.println("======================");
		System.out.println();
		System.out.println(lp.tampilLapto());
		System.out.println();
		
		System.out.println();
		System.out.println("======================");
		System.out.println("         ASUS");
		System.out.println("======================");
		System.out.println();
		System.out.println(as.tampilAsus());
		
		System.out.println(as.mengetik());
		System.out.println(as.gaming());
		
		

	}

}

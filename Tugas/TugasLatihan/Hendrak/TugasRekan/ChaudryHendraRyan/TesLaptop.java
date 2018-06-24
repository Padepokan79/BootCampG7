package ChaudryHendraRyan;

public class TesLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asus as = new Asus("Asus RRXXX", "Asus", "Corei23", 17.0, 3.3, 79999999, 10, 100);
		Apple ap = new Apple("Apple MalangXX", "Apple", "corei10", 17.0, 1.6, 8000000, 4, 1);

		System.out.println(as.toString());
		as.gaming();
		
		System.out.println();
		
		System.out.println(ap.toString());
		ap.mengetik();
	}

}

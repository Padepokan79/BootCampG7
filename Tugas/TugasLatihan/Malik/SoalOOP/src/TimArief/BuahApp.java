package TimArief;

public class BuahApp {

	public static void main(String[] args) {
		Buah 	 b1 = new Buah("Tunggal","Daging");
		BuahNaga b2 = new BuahNaga(b1, "Buah Naga", 100000, "Manis", "Merah", "Cucuk tidak tajam tapi seperti daun serta halus", "Vitamin K");
		
		System.out.println();
		System.out.println("====================");
		System.out.println("        BUAH");
		System.out.println("====================");
		System.out.println();
		System.out.println(b1.toBuah());

		System.out.println();
		System.out.println("====================");
		System.out.println("     BUAH NAGA");
		System.out.println("====================");
		System.out.println();
		System.out.println(b2.tampilBuahNaga());
	}

}

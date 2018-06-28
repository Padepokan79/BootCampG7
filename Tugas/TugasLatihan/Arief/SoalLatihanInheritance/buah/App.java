package buah;

public class App {

	public static void main(String[] args) {
		 Buah buah1 = new Buah("Tunggal", "Berdaging");
		 Naga ng = new Naga(buah1, "Dragon", 14000.0, "Semu Manis", "Kuning", "Berumbai", "Vitamin C");
		 
		 System.out.println(ng.printBuah());
	}

}

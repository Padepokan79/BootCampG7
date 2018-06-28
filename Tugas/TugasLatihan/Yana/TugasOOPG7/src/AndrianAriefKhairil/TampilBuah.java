package AndrianAriefKhairil;

public class TampilBuah {
	public static void main(String[] args) {
		Buah 		buah 	= new Buah("Tunggal", "Daging");
		BuahNaga 	buahNaga= new BuahNaga(buah, "Buah Naga", "Manis", "Merah", "Keras", "Vitamin C", 20000);
		
		System.out.println("\nBUAH");
		System.out.println(buah.tampilBuah());
		System.out.println("\nBUAH NAGA");
		System.out.println(buahNaga.tampilBuahNaga());
	}
}

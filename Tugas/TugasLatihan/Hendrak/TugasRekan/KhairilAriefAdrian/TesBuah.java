package KhairilAriefAdrian;

public class TesBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Buah bh = new Buah("Jeruk", "Buah berdaging", "Banyak biji", "Manis", "Orange", "Kasar", "Vitamin C", 10000);
		Mangga mg = new Mangga("Mangga Simanalagi", "Buah berdaging", "Biji Tunggal", "Manis", "Hijau" , "Lembut", "Vitamin C", 20000);
		Jeruk jk = new Jeruk("Jeruk Bali", "Buah berdaging", "Biji Banyak", "manis", "orange", "kasar", "Vitamin C", 20000);
		
		
		System.out.println(bh.toString());
		bh.Kenyang();
		bh.regenerasi();
		bh.menurunkanTekananDarah();
		System.out.println();
		
		System.out.println(mg.toString());
		System.out.println(jk.toString());
	}

}

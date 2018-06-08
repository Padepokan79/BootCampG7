package ChaudryHendraRyan;

public class TesUnggas {
	
	public static void main(String[] args) {
		Unggas ug = new Unggas("Ayam Cemani", "Hitam", "Paru-paru", "kukuruyuk", 5 , 20, 21);
		Gagak gk = new Gagak("Gagak Hitam", "Hitam", "Paru-paru", "Gak gak gak!!!", 3, 15, 21);
		Ayam ay = new Ayam(ug);
		
		System.out.println(gk.toString());
		gk.terbang();
		gk.bunyi();
		
		System.out.println();
		
		System.out.println(ay.toString());
	
	}
}

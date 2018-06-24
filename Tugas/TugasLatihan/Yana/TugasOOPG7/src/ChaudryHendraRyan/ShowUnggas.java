package ChaudryHendraRyan;

public class ShowUnggas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unggas unggas = new Unggas("Paru-paru", "Ya");
		BurungUnta burungUnta = new BurungUnta("Burung Unta", "Hitam", "2 Tahun", "2 Minggu", unggas);
		
		System.out.println("\nUNGGAS");
		System.out.println(unggas.tampilUanggas());
		System.out.println("\nBURUNG UNTA");
		System.out.println(burungUnta.tampilUnggas());
		System.out.println("Tingkahlaku : "+burungUnta.terbang());
	}

}

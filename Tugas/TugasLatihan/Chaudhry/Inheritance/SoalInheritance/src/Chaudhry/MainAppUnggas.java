package Chaudhry;

public class MainAppUnggas {

	public static void main(String[] args) {
		BurungUnta bu = new BurungUnta("Burung Unta", "Hitam", "Paru-Paru", 40, 2.5, 40, "Okokokok", 65);
		BurungGagak bg = new BurungGagak("Burung Gagak", "Hitam", "Paru-Paru dan kantong udara", 15, 0.78, 21, "oooaaaakkk", 12);
		
		System.out.println("");
		System.out.println(bu.toString());
		bu.tidakTerbang();
		
		System.out.println("");
		System.out.println(bg.toString());
		bg.bisaTerbang();
	}

}

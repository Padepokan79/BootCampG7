package teamAriefOOP;

public class BuahApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buah b1=new Buah("Tunggal", "Daging");
		BuahNaga b2=new BuahNaga(b1, "Buah Naga", 100000, "asem", "biru", "berduri tumpul", "Vitamin K");
		
		System.out.println("Buah 1");
		System.out.println(b1.tampilan());
		
		System.out.println("Buah Naga 1");
		System.out.println(b2.tampil());
		
	}

}

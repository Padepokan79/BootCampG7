package teamAlifOOP;

public class PlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete play1=new Athlete("Deo", "11523", "laki-laki", 21, 180);
		Footbal f1=new Footbal(play1, "fowrward", 5, 10, 7, 2);
		
		System.out.println(f1.toString());
		System.out.println(f1.tendang(10));
		System.out.println(f1.lari(1));
	}

}

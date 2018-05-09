public class LatihanSoalAndrian{
	public static void main(String[] args) {
		int beras, berat, today, yesterday, ty, sisa;
		beras = 12;
		berat = 50;
		today = 175;
		yesterday = 120;
		ty = today + yesterday;
		ty = (12*50)-ty;
		sisa = ty/50;

		System.out.println("Sisa beras adalah: "+sisa);
	}	
}
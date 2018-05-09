public class LatihanSoalYana2{
	public static void main(String[] args) {
		double pers1, pers2, pers3, pers, jk, nm, total;
		
		pers1 = 300;
		pers2 = 200;
		pers3 = 250;

		pers = pers1+pers2+pers3;
		jk = pers1+pers2;
		jk = jk/100;
		jk = jk*120;

		nm = pers3/100;
		nm = nm*60;

		total = jk+nm;

		System.out.println("Waktu Jarak tempuh adalah: " +(int)total+ " Detik");
	}
}
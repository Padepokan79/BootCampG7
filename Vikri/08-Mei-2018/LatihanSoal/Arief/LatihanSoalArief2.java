// created by vikri
// 08/5/2018
public class LatihanSoalArief2{
	public static void main(String[] args) {
		int toko, helmA, helmB, helmC, total, minggu;
		toko = 5;
		helmA = 250000;
		helmB = 50000;
		helmC = 650000;
		minggu = 7;
		total = helmA+helmB+helmC;
		total = total*minggu;
		total = total*toko;

		System.out.println("Dalam satu minggu: Rp. "+total);
	}
}
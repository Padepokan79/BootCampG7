public class LatihanSoalYana{
	public static void main(String[] args) {
		int uang, uangBagi, kelereng, jualKelereng, laba, sisa;
		
		uang = 20000;
		kelereng = 10;
		jualKelereng = 4;

		uangBagi = uang/2;
		kelereng = uangBagi/kelereng;
		laba = kelereng*20/100;

		sisa = (kelereng+laba)*jualKelereng;
		sisa = sisa + uangBagi;

		System.out.println("Jumlah uang ijal saat ini adalah: Rp. " +sisa);
	}
}
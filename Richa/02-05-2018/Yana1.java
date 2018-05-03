public class Yana1 {
	public static void main (String[] args) {

		double laba, uang, kelereng, sisa;
		uang = 20000; // uang ijal mula-mulai
		kelereng = ((uang/2)/10); //harga satu kelereng
		sisa = uang- (10*kelereng); //uang yang tidak digunakan untuk membeli kelereng
		laba = 0.2;

		uang = ((kelereng*(1+laba)*4) + sisa);

		System.out.println ("Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah\nuangnya untuk membeli 10 butir kelereng.\nkemudian Ijal menjual 4 butir\nkelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya.\nBerapakan jumlah uang Ijal saat ini?");
		System.out.println ("Jadi, uang Ijal menjadi Rp." + uang);

	}
}
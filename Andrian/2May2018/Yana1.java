/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Yana1 {
		public static void main( String[] args ){
			double uangijal,belikelereng,kelereng,labakelereng,jumlahuangijal;

			uangijal = 20000.0;
			belikelereng = 10000.0;
			kelereng = 10000.0/10.0;
			labakelereng = kelereng * (20.0/100.0);
			jumlahuangijal = uangijal - belikelereng + (labakelereng*4.0) + (kelereng*4);

			System.out.println("Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah\nuangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 butir\nkelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya.\nBerapakan jumlah uang Ijal saat ini?");
			System.out.println("Jumlah uang ijal adalah " + jumlahuangijal);
		} 
	}
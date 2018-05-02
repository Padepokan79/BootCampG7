/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	08:37
	* Updated by:
	*
*/

public class Arief3{
	public static void main(String[] args){
		System.out.println("Us pergi kepasar membeli beberapa lauk.");
		System.out.println("Satu bungkus tahu harganya Rp. 3.000, tempe satu potong seharga Rp. 4.500, dan kangkung Rp. 1.000 per ikatnya.");
		System.out.println("Jika Uus belanja tahu 4 bungkus, tempe 8 potong, dan kangkung 3 ikat,");
		System.out.println("berapa uang yang harus dibayarkan oleh Uus?");

		int tahu, tempe, kangkung, bayar;
		tahu=3000; tempe=4500; kangkung=1000;

		bayar=tahu*4+tempe*8+kangkung*3;
		System.out.println("\nRp "+bayar);
	}
}
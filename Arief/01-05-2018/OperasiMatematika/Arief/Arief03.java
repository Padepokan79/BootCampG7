/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
public class Arief03{
	public static void main( String[] args){
	int tahu, tempe, kangkung, bayar;

	tahu = 3000;
	tempe = 4500;
	kangkung = 1000;

	tahu = tahu * 4;
	tempe = tempe * 8;
	kangkung = kangkung* 3;
	bayar = tahu + tempe + kangkung;


	System.out.println("Us pergi kepasar membeli beberapa lauk. Satu bungkus tahu \n" + 
						"harganya Rp. 3.000, tempe satu potong seharga Rp. 4.500, \n" +
						" dan kangkung Rp. 1.000 per ikatnya. Jika Uus belanja \n" +
						"tahu 4 bungkus, tempe 8 potong, dan kangkung 3 ikat, \n" +
						"berapa uang yang harus dibayarkan oleh Uus?\n");

	System.out.println("Uang yang harus dibayarkan Uus = " + tahu + " + " + tempe + " + " + kangkung + " = " + bayar);

	}
}
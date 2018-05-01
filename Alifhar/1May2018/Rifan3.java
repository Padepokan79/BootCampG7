/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	13.49
	* Updated by:
	*
*/

public class Rifan3{
	public static void main(String[] args){
		System.out.println("Harga dua buah apel dan satu buah jeruk adalah Rp. 3.400,");
		System.out.println("Harga satu apel dan dua jeruk adalah Rp. 4.100,");
		System.out.println("Berapa harga satu buah apel dan satu buah jeruk ?");

		int apel, jeruk;
		/*
		2a + 1j = 3400 | 4a + 2j = 6800
		1a + 2j = 4100 | 1a + 2j = 4100
		---------------------------------
		                 3a = 2700
		                  a = 900

		900 + 2j = 4100
		      2j = 3200
		       j = 1600
		*/
		apel=900; jeruk=1600;
		System.out.println("\nHarga satu apel adalah Rp. "+apel+" dan jeruk Rp. "+jeruk);
	}
}
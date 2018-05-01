/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Andrian3 {
		public static void main( String [] args ) {
			int apel,jeruk;

			/*2apel + 1 jeruk = 3.400
			  1apel + 2 jeruk = 4.100 
			  
			  2a + 1b = 3400 | 4a + 2b = 6800
			  1a + 2b = 4100 | 1a + 2b = 4100
			  ==============================
			                       3a = 2700

			  */

			apel = 2700 / 3;
			jeruk = 3400 - (2*apel);

			System.out.println("Harga dua buah apel dan satu buah jeruk adalah Rp. 3.400,\nHarga satu apel dan dua jeruk adalah Rp. 4.100,\nBerapa harga satu buah apel dan satu buah jeruk ?");
			System.out.println("harga apel adalah " + apel + " dan harga jeruk adalah " + jeruk );
		}
	}
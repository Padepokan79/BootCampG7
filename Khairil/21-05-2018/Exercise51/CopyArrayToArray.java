/*
	 Program     : Latihan Array - Copy Array to Array
     Creator     : Khairil
     Created At  : 21 Mei 2018 14:57 PM     
     Updated By  : 
     Update Date : 
*/
public class CopyArrayToArray {
	public static void main( String[] args ) {

		int [] angka = {1, 4, 2, 5, 7, 10};
		int [] number = new int[angka.length];

		System.out.println("============================================");
		
		for( int index = 0; index < angka.length; index++) {
			number[index] = angka[index];
			if(index % 2 == 1) {
				System.out.print(number[index] + "...");				
			}
			// System.out.print(number[index] + "...");
		}

		System.out.println();
		System.out.println("============================================");

		for( int arrayNumber : angka ) {
			System.out.print(arrayNumber + "...");
		}

		System.out.println();		
		System.out.println("============================================");
	}
}	
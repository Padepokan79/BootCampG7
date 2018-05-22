/*
	 Program     : Tugas Array - 8
     Creator     : Khairil
     Created At  : 22 Mei 2018 01:33 AM     
     Updated By  : 
     Update Date : 
*/
public class CopyArrayToArray1 {
	public static void main( String[] args ) {

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int[arr1.length];

		System.out.println("============================================");
		
		for( int index = 0; index < angka.length; index++) {
			arr2[index] = arr1[index];
			System.out.print(arr2[index] + "...");
		}

		System.out.println("============================================");
	}
}	

//Copy isi arr1 ke arr2
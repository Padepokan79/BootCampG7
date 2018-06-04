//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 11:19 AM
//Modified :
public class Array12{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int[10];

		System.out.print("Array 1 : ");
		for(int i=1 ; i < arr1.length; i++){
			System.out.print(" " + arr1[i]);
		}

		System.out.print("\nArray 3 : ");
		for(int i=1 ; i < arr1.length; i++){
			System.out.print(" " + arr3[i]);
		}

		System.out.print("\nArray 4 : ");
		for(int i=1 ; i < arr1.length; i++){
			arr4[i] = arr1[i] + arr3[i];
			System.out.print(" " + arr4[i]);
		}

	}
}
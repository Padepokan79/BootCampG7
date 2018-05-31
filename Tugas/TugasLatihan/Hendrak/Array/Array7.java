//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 8:46 PM
//Modified :
public class Array7{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int[10];
		int i = 0;

		System.out.print("Data Array 1 :");
		for( i = 0; i<arr1.length; i++){
			System.out.print(" " + arr1[i]);
		}

		System.out.print("\nData Array 2 :");
		for( i = 0; i<arr2.length; i++){
			System.out.print(" " + arr2[i]);
		}

		//copy arr1 ke arr2
		for( i = 0; i < arr1.length; i++){
			arr2[i]=arr1[i];
		}

		System.out.print("\nData Array 2 yang telah di Copy:");
		for( i = 0; i<arr2.length; i++){
			System.out.print(" " + arr2[i]);
		}
	}
}
//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 10:34 AM
//Modified :

public class Array11{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr3 = { 2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int ketemu=0;

		System.out.print("Array 1 : ");
		for(int i = 0; i <arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		System.out.print("Array 3 : ");
		for(int i = 0; i <arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
		System.out.println("Bilangan yang sama :");
		for(int i=0; i < arr1.length; i++){
			for(int j=0; j < arr3.length; j++){
				if(arr1[i] == arr3[j]){
					System.out.print(arr1[i] + " ");
				}
			}
		}

	}
}
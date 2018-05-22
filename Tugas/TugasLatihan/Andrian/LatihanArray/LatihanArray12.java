/* 	Date 		: 22/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray12 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr1 = {25,14,56,15,36,56,77,18,29,49};
			int [] arr3 = {2,39,47,14,36,56,57,49,43,79};
			int nilaiSama= 0;

			System.out.println("Nilai array adalah :");

			for (int i : arr1) {
				System.out.print(i+" ");				
			}
			System.out.println();

			System.out.println("Nilai array 3 adalah :");

			for (int i : arr3) {
				System.out.print(i+" ");				
			}

			System.out.println();
			System.out.println("Dan nilai sama adalah : ");

			for (int index = 0; index < arr1.length; index++) {
				for (int indexA = 0; indexA < arr3.length; indexA++) {
					if (arr1[index]==arr3[indexA]) {
						nilaiSama = arr3[indexA];
		 
						System.out.print(nilaiSama+" ");	
					}
					
				}
			}

		}
	}
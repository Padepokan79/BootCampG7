/* 	Date 		: 22/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray11 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr1 = {25,14,56,15,36,56,77,18,29,49};
			int [] arr3 = {2,39,47,14,36,56,57,49,43,79};
			int nilaiSama= 0;

			System.out.println("Nilai array adalah :");

			for (int i : arr) {
				System.out.print(i+" ");				
			}

			System.out.println();
			System.out.println("Dan nilai sama adalah : ");

			for (int index = 0; index < arr.length; index++) {
				for (int indexA = index+1; indexA < arr.length; indexA++) {
					if (arr[index]==arr[indexA]) {
						nilaiSama = arr[indexA]; 
						
						System.out.print(nilaiSama+" ");
					
					}
				}
			}
			
		}
	}
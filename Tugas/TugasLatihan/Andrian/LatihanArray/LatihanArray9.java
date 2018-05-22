/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray9 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr = {25,14,56,15,36,56,77,18,29,49};
			int nilaiMin= arr[0];

			System.out.println("Nilai array adalah :");

			for (int i : arr) {
				System.out.print(i+" ");				
			}

			System.out.println();
			System.out.println("Dan nilai terendahnya adalah : ");

			for (int index = 0; index < arr.length; index++) {
				if (arr[index]<nilaiMin) {
					nilaiMin = arr[index]; 
				}
			}
				System.out.print(nilaiMin+" ");
			
		}
	}
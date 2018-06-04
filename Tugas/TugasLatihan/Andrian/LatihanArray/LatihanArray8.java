/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray8 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr1 = {25,14,56,15,36,56,77,18,29,49};
			int [] arr2 = new int [arr1.length];


			for (int index=0; index < arr1.length; index++) {
				arr2[index] = arr1[index];
			}

			for (int jojo : arr2) {
				System.out.println("nilai arr2 adalah : ");
				System.out.println(jojo+" ");
			}	

			
		}
	}
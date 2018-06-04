/* 	Date 		: 22/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray15 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr1 = {25,14,56,15,36,56,77,18,29,49};
			int [] arr3 = {2,39,47,14,36,56,57,49,43,79};
			int [] arr4 = new int[arr1.length];
			int temp, greater;

			System.out.println("Nilai array adalah :");

			for (int i : arr1) {
				System.out.print(i+" ");				
			}

		/*
			for (int index1=0; index1<arr1.length; index1++){
				greater = 0;
				for (int index2 =0; index2 < arr1.length; index2++ ) {
					if (arr1[index1]>arr1[index2]) {
						greater++;
					}
				}
				while (arr4[greater] == arr1[index1]) {
					greater++;
				}
				arr4[greater]=arr1[index1];
			}

			for (greater=0; greater<arr4.length; greater++) {
				System.out.print(arr4[greater]+" ");
			}




		}
	}

			*/


			System.out.println("Nilai array 3 adalah :");

			for (int index = 0; index < arr1.length; index++) {
				for (int indexA = index+1; indexA < arr1.length; indexA++) {
					
					if (arr1[index] > arr1[indexA] ) {
						temp = arr1[indexA];
						arr1[indexA] = arr1[index];
						arr1[index] = temp;
						
					}
				}

				System.out.print(arr1[index]+" ");	
				
			}
		}
	}
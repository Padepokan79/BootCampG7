/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray6 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr = {25,14,56,15,36,56,77,18,29,49};
			int indexHapus=0 ;

			/*for (int i : arr) {
				System.out.print(i+" ");
			}

			System.out.println();
			System.out.print("Masukan index mana yang akan di hapus :");
			indexHapus = key.nextInt();

			arr[indexHapus] = arr[arr.length-1];
			int newArr [] = new int[arr.length-1];

			for (int i=0; i<newArr.length; i++) {
				newArr[i] = arr[i];
				System.out.print(newArr+" ");
			}*/


			for (int index = 0; index < arr.length; index++) {
				System.out.print(arr[index]+" ");
			}
			System.out.println();
			System.out.print("Masukan index mana yang akan di hapus :");
			indexHapus = key.nextInt();
			arr[indexHapus] = arr[arr.length-1];
			
			int[] newArr = new int[arr.length-1];
			System.out.println("Nilai setelah dihapus");
			for (int index=0; index<newArr.length; index++){
				newArr[index] = arr [index];
				System.out.print(newArr[index]+" ");
			}
			
		}
	}
/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr = {25,14,56,15,36,56,77,18,29,49};
			int toFind;
			int cek=1;

			System.out.print("Orders :");
			for (int num : arr ) {
				System.out.print(num + " ");
			}
			System.out.println();

			System.out.print("Which order to find? ");
			toFind = key.nextInt();

			for (int num : arr ) {
				if (num == toFind) {
					System.out.println(num + " found.");
					cek = 0;
				}
			}
			System.out.println();

			if (cek==1) {
				System.out.println(toFind +" NOt exist");
			}

		}
	}
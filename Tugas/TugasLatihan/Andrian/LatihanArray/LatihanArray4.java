/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray4 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr = {25,14,56,15,36,56,77,18,29,49};
			int sum=0, angka=0;

			System.out.print("Masukan angka :");
			angka = key.nextInt();
			
			for (int index = 0; index < arr.length; index++) {
				if (angka==arr[index]) {
					System.out.println(angka +" found. index "+sum);
				}
				sum++;
			}

		}
	}
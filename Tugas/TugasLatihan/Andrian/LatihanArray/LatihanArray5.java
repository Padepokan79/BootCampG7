/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanArray5 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int [] arr = new int []{25,14,56,15,36,56,77,18,29,49};
			int angka=0, indexGanti=0;

			for (int index = 0; index < arr.length; index++) {
				System.out.print(arr[index]+" ");
			}
			System.out.println();
			System.out.print("Masukan angka :");
			angka = key.nextInt();
			System.out.print("Masukan index mana yang akan di ganti");
			indexGanti = key.nextInt();

			if (indexGanti>-1 && indexGanti<arr.length) {
				arr[indexGanti]=angka;
			}
			else {
				System.out.println("Invalid input !");
			}

			for (int hasilAkhir:arr) {

				System.out.print(hasilAkhir+" ");
			}
			
		}
	}
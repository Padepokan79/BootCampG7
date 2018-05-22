/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	/*import java.util.Scanner;

	public class LatihanArray7 {
		public static void main(String[] args) {
			int [] arr = {25,14,56,15,36,56,77,18,29,49};
			int indexHapus=0 ;


			for (int index = 1; index < arr.length; index++) {
				if (arr[index]<min) {
					min=arr[i];
				}
				System.out.print(arr[index]+" ");
			}
			System.out.println();
			System.out.print("Masukan angka :");
			angka = key.nextInt();
			System.out.print("Masukan index mana yang akan ditambahkan : ");
			indexTambah = key.nextInt();

			for (int index=0; index<)

			for (int indexAkhir=indexHapus ; indexAkhir< arr.length ; indexAkhir++) {
				arr[indexAkhir]=arr[indexAkhir+1];
			}
			int[] newArr = new int[arr.length-1];
			System.out.println("Nilai setelah dihapus");
			for (int index=0; index<newArr.length; index++){
				newArr[index] = arr [index];
				System.out.print(newArr[index]+" ");
			}
			
		}
	}*/

	import java.util.Scanner;
	public class LatihanArray7 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int pos, numberBaru;
			int [] arr = {25,14,56,15,36,56,77,18,29,49}, newArr = new int[arr.length+1]; 
			int sisa=0;

			for (int i : arr) {
				System.out.print(i+" ");
			}

			System.out.println();
			System.out.print("Enter the position where you want to insert element: ");
			numberBaru = key.nextInt();
			System.out.print("Enter the element you want to insert: ");
			pos = key.nextInt();

/*
			for (int index=0; index < newArr.length ; index++) {
				if (index==pos) {
					newArr[index] = numberBaru;
				}
				else {
					newArr[index] = arr[sisa];
					sisa++;
				}
			}

			for (int index : newArr ) {
				System.out.print(index+" ");
			}


	*/

			
			for(int index = arr.length; index >= (pos-1); index--) {
				arr[index+1] = arr[index];
			}

			arr[pos-1] = numberBaru;
			for (int index:arr) {
				System.out.print(index+" ");
			}
			System.out.println(index+" ");

			System.out.println("After inserting:");

			for(int index = 0; index < newArr.length; index++) {
				if (index == )
			}

		}
	}
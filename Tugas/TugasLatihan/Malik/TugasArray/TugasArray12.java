/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 9:46M
Soal NO 11:
int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
int[] arr2 = new int[10];
int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
int[] arr4 = new int[10];

10. Tampilkan bilangan2 yang duplikasi pada arr1
11. Tampilkan bilangan2 yang sama2 ada di arr1 dan arr3
12. Jumlahkan elemen arr1 dan arr3 simpan pada arr4
13. Tukar nilai antara dua posisi pada arr1
14. Mengurutkan nilai pada arr1

*/
public class TugasArray12{
	public static void main(String[] args){
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		System.out.print("Array 1 : ");
		for (int arrSatu : arr1) {
			System.out.print(arrSatu+" ");
		}
			System.out.println();
		System.out.print("Array 3 : ");
		for (int arrTiga : arr3) {
			System.out.print(arrTiga+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Array duplikat : ");
		for (int a=0; a<arr1.length; a++ ) {
			for (int b=0; b<arr3.length; b++) {
				if ( arr1[a] == arr3[b] ) {
					System.out.print(arr1[a]+" ");
				}
			}
		}	
	}
}
/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 10:34M
Soal NO 14:
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
import java.util.Scanner;
public class TugasArray15{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arrbaru = new int[arr1.length];
		int nol=0, satu=1;
		System.out.print("Array 1 : ");
		for (int arrSatu : arr1) {
			System.out.print(arrSatu+" ");
		}
		System.out.println();

		System.out.println("Array Pengurutan : ");
		
		System.out.print("Array duplikat : ");
		
		 int temp = 0;
        for (int a = 0; a < arr1.length; a++) {
            for (int b = a + 1; b < arr1.length; b++) {
                if (arr1[a] > arr1[b]) {
                    temp = arr1[b];
                    arr1[b] = arr1[a];
                    arr1[a] = temp;
                }
            }
        }
        for (int a = 0; a < arr1.length; a++) {
            System.out.print(arr1[a]+" ");
        }	
	}
}
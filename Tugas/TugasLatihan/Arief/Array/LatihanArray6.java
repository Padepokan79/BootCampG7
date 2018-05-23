/*
Date Created	: 21 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArrayEnam {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49},
				arrx = new int [arr1.length-1];
		int number, posisi, y=0;

		for ( int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.print("Input posisi yang dihapus: ");
		posisi = keyboard.nextInt();

        for(int x = 0; x < arr1.length ; x++){
            if(posisi != x){
               arrx[y] = arr1[x];
                y++;
            }
        }
        
        System.out.println("Array setelah di sisipkan");

		for ( int p : arrx) {
			System.out.print(p + " ");
		}
		System.out.println();

	}
}

// Hapus suatu posisi dari arr1

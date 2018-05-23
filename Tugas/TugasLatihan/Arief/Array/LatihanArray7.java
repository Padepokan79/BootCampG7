/*
Date Created	: 22 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class LatihanArrayTujuh {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] 	arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49},
				arrx = new int [arr1.length+1];
		int number, posisi, y=0;

		System.out.print("Arr1 : ");
		for ( int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.print("Input Angka baru: ");
		number = keyboard.nextInt();

		System.out.print("Input posisi yang disisipkan: ");
		posisi = keyboard.nextInt()-1;

        for(int x = 0; x < arrx.length ; x++){
            if(posisi == x){
                arrx[x] = number;
            }else{
                arrx[x] = arr1[y];
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

// Sisip suatu bilangan pada posisi tertentu pada arr1
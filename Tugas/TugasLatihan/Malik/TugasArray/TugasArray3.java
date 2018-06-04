/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 3:26PM
Soal :
int [] arr1 = {25,14,56,15,36,56,77,18,29,49}

- Hitung jumlah dan rata rata dari arr1 di atas
- Apakah suatu bilangan ada di arr1 atau tidak
- suatu bilangan ada di poisisi/index keberapa d arr1
- terima nilai dan ubah nilai u/ suatu posisi pada arr1

*/
import java.util.Scanner;
public class TugasArray3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int toFind, index=0;
		
		System.out.print("Cari angka berapa ? : ");
		toFind = keyboard.nextInt();
		
		boolean ketemu = false;
		for ( int num : arr1 ) {
			if ( num == toFind ) {
				ketemu = true;
				for (int a=0; a<arr1.length; a++) {
					if ( arr1[a] == toFind ) {
						index+= a;
					}
				}
				System.out.println( num + " found \nPada index ke "+index);
			}
		}
		if ( ketemu == false ) {
			System.out.println("not found");
		}

	}
}
		
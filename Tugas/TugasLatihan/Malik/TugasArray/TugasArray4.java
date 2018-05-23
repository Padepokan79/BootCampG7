/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 3:39PM
Soal NO 3:
int [] arr1 = {25,14,56,15,36,56,77,18,29,49}

- Hitung jumlah dan rata rata dari arr1 di atas
- Apakah suatu bilangan ada di arr1 atau tidak
- suatu bilangan ada di poisisi/index keberapa d arr1
- terima nilai dan ubah nilai u/ suatu posisi pada arr1

*/
import java.util.Scanner;
public class TugasArray4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int toFind, index=0;
		
		System.out.print("Masukan angka berapa ? : ");
		toFind = keyboard.nextInt();
		
		
		for (int a=0; a<arr1.length; a++) {
			if ( arr1[a] == toFind ) {
				index+= a;
			}
		}
		System.out.println("Pada index ke "+index);
			

	}
}
		
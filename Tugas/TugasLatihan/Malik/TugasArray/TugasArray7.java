/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 7:55PM
Soal NO 6:
int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
int[] arr2 = new int[10];
int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
int[] arr4 = new int[10];

1. Hitung jumlah dan rata-rata dari arr1 di atas
2. Apakah suatu bilangan ada di arr1 atau tidak?
3. Suatu bilangan ada di-posisi/index ke berapa di arr1?
4. Terima nilai dan ubah nilai u/ suatu posisi pada arr1
5. Hapus suatu posisi dari arr1
6. Sisip suatu bilangan pada posisi tertentu pada arr1
7. Copy isi arr1 ke arr2
8. Tampilkan nilai minimum arr1
9. Tampilkan nilai maksimum arr1

*/
import java.util.Scanner;
public class TugasArray7{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int angka, posisi, res=0;
		int[] arrbaru = new int[arr1.length+1];
		
		System.out.println();
		System.out.print("arr1 = {25,14,56,15,36,56,77,18,29,49}");
		System.out.println();
		System.out.print("Masukan angka yang ingin ditambah  : ");
		angka = keyboard.nextInt();
		System.out.print("Masukan index yang ingin ditambah  : ");
		posisi = keyboard.nextInt();
		
		for (int a=0; a<arrbaru.length; a++) {
			if ( a == posisi ) {
				arrbaru[a] = angka;
			}else{
				arrbaru[a] = arr1[res];
				res++;
			}
		}

		for (int b : arrbaru) {
			System.out.print(b+" ");	
		}
	}
}
		
/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 3:41PM
Soal NO 4:
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
public class TugasArray5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int angka, posisi;
		
		System.out.println();
		System.out.print("arr1 = {25,14,56,15,36,56,77,18,29,49}");
		System.out.println();
		System.out.print("Masukan angka yang ingin diubah  : ");
		angka = keyboard.nextInt();
		System.out.print("Masukan posisi yang ingin diubah : ");
		posisi = keyboard.nextInt();
		
		for (int a=0; a<arr1.length; a++) {
			arr1[posisi-1] = angka;
		}

		System.out.print("Array = { ");
		for (int a : arr1 ) {
			System.out.print(a+" ");
		}
		System.out.print("}");
		System.out.println();

		
	}
}
		
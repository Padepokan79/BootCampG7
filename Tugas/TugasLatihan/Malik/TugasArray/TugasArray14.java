/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 10:11M
Soal NO 13:
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
public class TugasArray14{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49,100};
		int nol=0, angkaSatu=0, angkaDua=0, indexSatu, indexDua;
		System.out.print("Array 1 : ");
		for (int arrSatu : arr1) {
			System.out.print(arrSatu+" ");
		}
		System.out.println();

		System.out.print("Masukan index pertama : ");
		indexSatu = scan.nextInt();
		System.out.print("Masukan index kedua   : ");
		indexDua = scan.nextInt();
		System.out.println();

		System.out.println("Array Penukaran : ");
		
		angkaSatu 	= arr1[indexSatu];
		angkaDua 	= arr1[indexDua];

		for (int a=nol; a<arr1.length; a++ ) {
			arr1[indexSatu] = angkaDua;
			arr1[indexDua]  = angkaSatu;
		}
			
		for (int c : arr1) {
				System.out.print(c+" ");
			}	
	}
}
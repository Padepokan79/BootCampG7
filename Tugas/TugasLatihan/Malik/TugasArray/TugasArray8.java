/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 7:40PM
Soal NO 7:
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
public class TugasArray8{
	public static void main(String[] args){
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] arr2 = new int[10];

		for (int a=0; a<arr1.length; a++) {
			arr2[a] = arr1[a];
		}

		for (int angka : arr2) {
			System.out.println(angka);
		}
	}
}
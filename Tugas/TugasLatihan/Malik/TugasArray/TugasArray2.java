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
public class TugasArray2{
	public static void main(String[] args){
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int jumlah=0, rata = 0;
		
		for (int a = 0; a<arr1.length; a++ ) {
			jumlah += arr1[a];
		}
		rata = jumlah/arr1.length; 

		System.out.println("Jumlah Array di atas : "+jumlah);
		System.out.println("Rata-rata Array di atas : "+rata);



	}
}
//Created by : Hendra Kurniawan
//Date : 26 Mei 2018 Time : 6:12 PM
//Modified :
public class Array1{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int[10];
		int [] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int[10];
		int jumlah=0; 
		double rata2=0;

		//Hitung jumlah dan rata-rata dari arr1
		for( int i =0; i < arr1.length;i++){
			jumlah += arr1[i];
		}
		rata2 = jumlah/arr1.length;
		System.out.println("Jumlah Array 1 adalah    : "+jumlah);
		System.out.println("Rata-rata Array 1 adalah : "+rata2); 
	}
}
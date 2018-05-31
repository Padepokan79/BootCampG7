//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 10:46 PM
//Modified :
public class Array8{
	public static void main(String[] args) {
		int [] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int i, nilaiMinimum=arr1[0];

		System.out.print("Data Array 1 : ");
		
		//cari nilai minimum di arr1
		for(i = 0; i < arr1.length; i++){
			System.out.print(" " + arr1[i]);
			
		} 

		for(i = 1; i < arr1.length; i++){
			if(arr1[i] < nilaiMinimum ){
				nilaiMinimum = arr1[i];
			}
		} 
		System.out.println("\nNilai Minimum : " + nilaiMinimum);
	}
}
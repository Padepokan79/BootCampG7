//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 8:04 AM
//Modified :

public class Array9{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 36, 56, 77, 18, 29, 49};
		int i = 0,nilaiMaksimum;

		nilaiMaksimum = arr1[0];
		System.out.print("Data Array 1 : ");
		for(i = 0; i < arr1.length; i++){
			System.out.print(" " + arr1[i]);
			if(arr1[i] > nilaiMaksimum){
				nilaiMaksimum = arr1[i];
			}
		}System.out.println("\nNilai maksimum = "+ nilaiMaksimum);

	}
}
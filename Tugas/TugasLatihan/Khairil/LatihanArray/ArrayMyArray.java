/*
	 Program     : Tugas Array - 2
     Creator     : Khairil
     Created At  : 21 Mei 2018 15:19 PM     
     Updated By  : 
     Update Date : 
*/
class ArrayMyArray {
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int jumArr, rata2;

		jumArr = 0;

		for( int index = 0; index < arr1.length; index++ ) {
			jumArr = jumArr + arr1[index];
		}

		rata2 = jumArr / arr1.length;

		System.out.println("Rata-rata Nilai Array " + rata2);
		System.out.println("Jumlah Nilai Array " + jumArr);
	}
} 


//Hitung jumlah dan rata-rata dari arr1 di atas
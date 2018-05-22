/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class LatihanArray2 {
		public static void main(String[] args) {
			int [] arr = {25,14,56,15,36,56,77,18,29,49};
			int sum=0, mean=0;

			for (int index : arr ){
				sum += index;
			}
			System.out.println("Jumlah tersebut adalah "+sum);
			System.out.println("Rata-rata tersebut adalah "+(sum/arr.length));
		}
	}
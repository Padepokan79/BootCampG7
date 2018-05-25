/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class LatihamArray1 {
		public static void main(String[] args) {
			int[] angka = {1,4,2,5,7,10};

			int[] number = new int[angka.length];

			for (int index=0 ; index < angka.length; index++) {
				number[index] = angka[index];					////index bertujuan untuk memindahkan angka satu persatu
			}

			for (int number1 : number) {
				System.out.println("Number adalah "+number1);
			}
	
		}
	}
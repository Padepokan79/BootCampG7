/* 	Date 		: 18/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class TugasDoWhile2 {
		public static void main(String[] args) {
			int kue=200, waktu=(8*60)+30, banyakKue=3, lamaTerjual=15;

			do {
				kue -=3;
				waktu -=15;
				System.out.println("Sisa "+kue);
			} while (waktu>=0);
		}
	}
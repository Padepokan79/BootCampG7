/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
public class TugasFor1 {
	public static void main(String[] args) {
		int kue=200, waktu, banyakKue=3, lamaTerjual=15;

		for ( waktu=(8*60)+30 ; waktu>=0; waktu-=lamaTerjual) {
			kue-=banyakKue;
			System.out.println(kue);
			}

		System.out.print(kue);
		}

	}
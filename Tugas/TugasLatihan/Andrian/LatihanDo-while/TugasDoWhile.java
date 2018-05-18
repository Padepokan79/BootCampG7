/* 	Date 		: 18/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasDoWhile {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);

			int angkaPertama=1, angkaTerakhir=100 ;

			do {
				if (angkaPertama%4==0 || angkaPertama%2==1) {
					System.out.print(angkaPertama+" ");
				}
				angkaPertama +=1;

			} while (angkaPertama <= angkaTerakhir);



		}
	}
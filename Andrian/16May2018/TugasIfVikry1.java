/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfVikry1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int istri, anak;

			System.out.print("Jumlah istri : ");
			istri = key.nextInt();
			System.out.print("Jumlah anak : ");
			anak = key.nextInt();

			if (istri==1 && anak>2){
				System.out.print("Cucu mendapatkan mobil dari oma");
			}
			else if (istri>1 && anak==1){
				System.out.print("Cucu mendapatkan mobil dari oma");
			}
			else {
				System.out.print("kapan kamu nikah cu! ");
			}
		}
	}
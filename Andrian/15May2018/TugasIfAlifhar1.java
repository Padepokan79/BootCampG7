/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfAlifhar1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double bilangan, rillBulat, genapGanjil;
			boolean positif, negatif;
			
			System.out.println("==========================================");
			System.out.println("Masukan bilangan:");
			bilangan = key.nextDouble();
			System.out.println("==========================================");
			System.out.println("Bilangn tersebut adalah");

			positif = bilangan > 0;
			negatif = bilangan < 0;
			rillBulat = bilangan%1;
			genapGanjil = bilangan%2;

			if (bilangan>0) {
				if (rillBulat%1==0) {
					if (genapGanjil%2==0) {
						System.out.print("Bilangan bulat genap positif");
					}
					else {
						System.out.print("Bilangan bulat ganjil positif");
					}
				}
				else{
					System.out.print("bilangan rill positif");
				}
			}
			if (bilangan<0) {
				if (rillBulat%1==0) {
					if (genapGanjil%2==0) {
						System.out.print("Bilangan bulat genap negatif");
					}
					else {
						System.out.print("Bilangan bulat ganjil negatif");
					}
				}
				else{
					System.out.print("bilangan rill negatif");
				}
			}
		}
	}
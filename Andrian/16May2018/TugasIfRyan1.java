/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfRyan1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double mobil1=30, mobil2=35, mobil3=45, bensin1=15, 
				bensin2=10, bensin3=20, jarak, time1,time2,time3,
				gas1, gas2, gas3;
			String mobil, liter;


			System.out.print("\nMasukan Jarak yang diinginkan: ");
			jarak = key.nextInt();

			time1 = (jarak/mobil1); gas1 = (jarak/bensin1);
			time2 = (jarak/mobil2); gas2 = (jarak/bensin2);
			time3 = (jarak/mobil3); gas3 = (jarak/bensin3);

			System.out.println("mobil 1 dengan waktu "+(jarak/mobil1)+" jam dan bensin sebanyak "+(jarak/bensin1)+" liter");
			System.out.println("mobil 2 dengan waktu "+(jarak/mobil2)+" jam dan bensin sebanyak "+(jarak/bensin2)+" liter");
			System.out.println("mobil 3 dengan waktu "+(jarak/mobil3)+" jam dan bensin sebanyak "+(jarak/bensin3)+" liter");
			
			
			if ( time1<time2 ) {
				mobil = "mobil 1";
			}
			else if ( time2<time3 ) {
				mobil = "mobil 2";
			}
			else {
				mobil ="mobil 3";
			}

			if ( gas1<gas2 ) {
				liter = "mobil 1";
			}
			else if ( gas2<gas3 ) {
				liter = "mobil 2";
			}
			else {
				liter ="mobil 3";
			}

			System.out.print("\nDan kami menyrankan menggunakan : "+mobil);
		}
	}
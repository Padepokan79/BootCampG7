/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfChaudary3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int jalanKaki, naikSepedah, naikMotor, naikMobil, naikHelikopter, jarak;

			System.out.println("===========================================");
			System.out.println("     PERJALANANKU MENUJU TEMPAT KERJA :)");
			System.out.println("===========================================");
			System.out.println();
			System.out.print("Masukan jarak rumah dengan perusahaan: ");
			jarak = key.nextInt();


			System.out.println("Perjalanan yang tersedia untuk anda :");
			if (jarak<35){
				System.out.println("jalan kaki");
			}
			else if (jarak<72){
				System.out.println("jalan kaki, naik sepeda");
			}
			else if (jarak<100){
				System.out.println("jalan kaki, naik sepedah, naik motor");
			}
			else if (jarak<150){
				System.out.println("jalan kaki, naik sepedah, naik motor, naik mobil");
			}
			else {
				System.out.println("jalan kaki, naik sepedah, naik motor, naik mobil, naik helikopter");
			}


		}
	}
/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfArif2 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int ram, hdd, harga;
			double processor;
			String merek, status;

			System.out.println("============================================");
			System.out.println();
			System.out.println("        PORORO LAPTOP AND PC CENTER");
			System.out.println();
			System.out.println("============================================");
			System.out.println();
			System.out.print("Merek\t\t:");
			merek = key.next();
			System.out.print("RAM(GB)\t\t:");
			ram = key.nextInt();
			System.out.print("HDD(GB)\t\t:");
			hdd = key.nextInt();
			System.out.print("Processor\t\t:");
			processor = key.nextDouble();
			System.out.print("Harga\t\t:");
			harga = key.nextInt();


			System.out.println();

			if ( merek.equals("keroro") && harga>100000000 ) {
				status = "Anda Sultan Fanboy";
			}
			else if ( merek.equals("keroro") ) {
				status = "Anda Fanboy";
			}
			else if ( processor>=4.2 ){
				status = "Gamming nerd";
			}
			else if ( ram<8 || hdd>500 ) {
				status = "Laptop Ngelag";
			}
			else if ( ram>=8 && hdd>=1000 && (processor>=2.8&&processor<=3.5) ) {
				status = "Setuju untuk dibeli";
			}
			else {
				status = "Ndak jadi mas !";
			}

			System.out.println("Status\t\t: "+status);
			System.out.println("==============================================");
			System.out.println("	           Semoga Bermanfaat");
			System.out.println("==============================================");
		}
	}
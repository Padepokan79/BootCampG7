/* 	Date 		: 18/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/

	import java.util.Scanner;

	public class PrFor3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
				int barisAtas, isi, spasi, n, tingkat;

				System.out.println("Jumlah Tingkatan :");
				tingkat = key.nextInt();

				n = tingkat/2 ;

				for (barisAtas=0; barisAtas<n+1; barisAtas++) {
					for (spasi=0; spasi<n-barisAtas; spasi++) {
						System.out.print(" ");
					}
					for (isi=0; isi<=2*barisAtas; isi++) {
						if (barisAtas==0 || isi==0 || isi==2*barisAtas) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				System.out.println();
				}

				for (barisAtas=n-1; barisAtas>=0; barisAtas--) {
					for (spasi=0; spasi<n-barisAtas; spasi++) {
						System.out.print(" ");
					}
					for (isi=0; isi<=2*barisAtas; isi++) {
						if (barisAtas==0 || isi==0 || isi==2*barisAtas) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				System.out.println();
				}
		}
	}

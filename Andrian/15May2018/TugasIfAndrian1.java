/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfAndrian1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			String member="";
			int bayar, jumlah;

			System.out.print("Apakah anda member (y/n): ");
			member = key.next();
			if (member.equals("Y")||member.equals("y")) {
				System.out.print("Jumlah fotocopy: ");
				jumlah = key.nextInt();
				bayar = 75*jumlah;
				System.out.println("Jumlah Fotocopy = "+jumlah);
				System.out.println("bayar = "+bayar);
			}
			else {
				System.out.print("Jumlah fotocopy = ");
				jumlah = key.nextInt();
				if (jumlah >= 200) {
					bayar = 85*jumlah;
					System.out.println("Jumlah Fotocopy = "+jumlah);
					System.out.println("bayar = "+bayar);
				}
				else if (jumlah >= 100) {
					bayar = 100*jumlah;
					System.out.println("Jumlah Fotocopy = "+jumlah);
					System.out.println("bayar = "+bayar);
				}
				else {
					bayar = 150*jumlah;
					System.out.println("Jumlah Fotocopy = "+jumlah);
					System.out.println("bayar = "+bayar);
				}
			}
		}
	}
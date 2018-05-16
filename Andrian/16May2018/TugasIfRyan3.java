/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	




	ayah ingin membeli burung dengan spesifikasi berkicau 3x sehari, warna merah campur biru, harga 300ribu
   setiap ada yang bisa berkicau 2x lebih dari sehari, ayah bisa membeli 1,5x/2x tambahan kicau dari harga yang ditawarkan diatas

	*/
	import java.util.Scanner;

	public class TugasIfRyan3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int harga, bayar=300000;
			double kicau, sisakicau;
			String  warna1, warna2;

			System.out.print("Seberapa sering burung berkicau dalam sehari \t: ");
			kicau = key.nextInt();
			System.out.print("Warna dasar burung \t\t\t\t: ");
			warna1 = key.next();
			System.out.print("Warna lain dari burung tersebut \t\t: ");
			warna2 = key.next();
			System.out.print("Harga burung \t\t\t\t\t: ");
			harga = key.nextInt();
			System.out.println("===============================================");

			if (kicau>=3 && (warna1.equals("biru") && warna2.equals("merah") || warna2.equals("biru") && warna1.equals("merah")) ) {
			 	sisakicau = (kicau-3)/2;
			 		if (harga<=(bayar+(bayar*(0.5*sisakicau)))) {
			 			System.out.println("Burung diibeli");
					}
					else {
						System.out.println("burung tidak dibeli");
					}
			}
			else {
				System.out.println("burung tidak dibeli");
			}
			
		}
	}
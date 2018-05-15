/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfRicha1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int ppL=2170000, ppB=3780000, ppS= 1200000, ppT=4760000, hotelL=255000,
					hotelB=305000, hotelS=335000, hotelT=355000, makanL=75000, makanB=55000, 
					makanS=85000, makanT=105000, snorkling=250000, belanja=300000, uStudio=360000,
					ski=325000, teman, hari, budget, hargaS, hargaT, hargaB, hargaL;
			String nama, optional;

			System.out.println("========WELCOME TO TRAVEL 79.com==========");
			System.out.println();
			System.out.println("Tentukan dengan mudah destinasi terbaikmu!");
			System.out.print("Nama\t\t:");
			nama = key.nextLine();
			System.out.print("Berapa orang yang ikut travel bersamamu\t?");
			teman = key.nextInt();
			System.out.print("Berapa hari kamu akan pergi\t?");
			hari = key.nextInt();
			System.out.print("Budget kamu berapa, "+nama+"\t\t: ");
			budget = key.nextInt();


			hargaL = ppL*teman + (teman+(teman%2))/2*hotelL*hari + teman*makanL*hari;
			hargaB = ppB*teman + (teman+(teman%2))/2*hotelB*hari + teman*makanB*hari;
			hargaS = ppS*teman + (teman+(teman%2))/2*hotelS*hari + teman*makanS*hari;
			hargaT = ppT*teman + (teman+(teman%2))/2*hotelT*hari + teman*makanT*hari;

			if (budget>hargaT) {
				System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah tokyo");
				if ( (budget-hargaT)>ski ) {
					System.out.println("Apakah kamu ingin ski? (Y/N)");
					optional = key.next(); 
					if (optional.equals("Y")||optional.equals("y") {
						System.out.println("Total yang harus kamu bayar untuk ke tokyo adalah "+(hargaT+(ski*teman)));
					}
					else {
						System.out.println("Total yang harus kamu bayar untuk ke tokyo adalah "+hargaT);
					}
				}
				else {
						System.out.println("Total yang harus kamu bayar untuk ke tokyo adalah "+hargaT);
					}
			}
			else if (budget>hargaB) {
				System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah bangkok");
				if ( (budget-hargaB)>belanja ) {
					System.out.println("Apakah kamu ingin belanja? (Y/N)");
					optional = key.next(); 
					if (optional.equals("Y")||optional.equals("y") {
						System.out.println("Total yang harus kamu bayar untuk ke bangkok adalah "+(hargaB+(belanja*teman)));
					}
					else {
						System.out.println("Total yang harus kamu bayar untuk ke bangkok adalah "+hargaB);
					}
				}
				else {
						System.out.println("Total yang harus kamu bayar untuk ke tokyo adalah "+hargaB);
					}
			}
			else if (budget>hargaL) {
				System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah lombok");
				if ( (budget-hargaL)>snorkling ) {
					System.out.println("Apakah kamu ingin snorkling? (Y/N)");
					optional = key.next(); 
					if (optional.equals("Y")||optional.equals("y") {
						System.out.println("Total yang harus kamu bayar untuk ke Lombok adalah "+(hargaL+(snorkling*teman)));
					}
					else {
						System.out.println("Total yang harus kamu bayar untuk ke Lombok adalah "+hargaL);
					}
				}
				else {
						System.out.println("Total yang harus kamu bayar untuk ke tokyo adalah "+hargaL);
					}
			}
			else if (budget>hargaS) {
				System.out.println("Destinasi rekomendasi kami untuk "+nama+" adalah singapura");
				if ( (budget-hargaS)>uStudio ) {
					System.out.println("Apakah kamu ingin ski? (Y/N)");
					optional = key.next(); 
					if (optional.equals("Y")||optional.equals("y") {
						System.out.println("Total yang harus kamu bayar untuk ke singapura adalah "+(hargaS+(uStudio*teman)));
					}
					else {
						System.out.println("Total yang harus kamu bayar untuk ke singapura adalah "+hargaS);
					}
				}
				else {
						System.out.println("Total yang harus kamu bayar untuk ke tokyo adalah "+hargaS);
					}
			}
			else {
				System.out.println("Gagal: (Mohon maaf kami tidak menemukan pilihan destinasi yang sesuai)");
			}
			
		}
	}
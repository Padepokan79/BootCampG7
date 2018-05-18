/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfVikry2{
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int mtk, agama, kkmMtk=72, kkmAgama=75, utang;
			String nama, spp;

			System.out.print("Sebutkan nama anda\t: ");
			nama = key.next();
			System.out.print("Masukan nilai mtk\t: ");
			mtk = key.nextInt();
			System.out.print("Masukan nilai agama\t: ");
			agama = key.nextInt();
			System.out.print("Apakah spp anda lunas\t: ");
			spp = key.next();
			System.out.print("Masukan hutang pembangunan\t: ");
			utang = key.nextInt();

			if ( !(nama.equals("andi")) && mtk>=kkmMtk && agama>=kkmAgama) {
				System.out.print("Yeay! anda naik kelas..");
			}
			else if ( spp.equals("lunas") && utang==0 ) {
					System.out.print("Yeay! anda naik kelas..");
			}
			else {
				System.out.print("Nope, Naik kelsa tahun depan..");
			}

		}
	}
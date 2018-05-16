/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfArif1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int plat, tanggal, jenis, kapasitas;
			String hariLibur, izin, pengawalan, status;

			System.out.println("============================================");
			System.out.println();
			System.out.println("Jalan Bebas Hambatan dan Kenangan PasoePati");
			System.out.println();
			System.out.println("============================================");
			System.out.println();
			System.out.print("plat nomor\t\t:");
			plat = key.nextInt();
			System.out.print("Tanggal\t\t:");
			tanggal = key.nextInt();
			System.out.print("Hari Libur (y/n)\t\t:");
			hariLibur = key.next();
			System.out.print("Jenis Kendaraan berdasarkan jumlah roda\t:");
			jenis = key.nextInt();
			System.out.print("Kapasitas Mesin\t\t:");
			kapasitas = key.nextInt();
			System.out.print("Surat izin (y/n)\t\t:");
			izin = key.next();
			System.out.print("Pengawalan (y/n)\t\t:");
			pengawalan = key.next();

			System.out.println();

			if ( hariLibur.equals("y")||hariLibur.equals("Y") ) {
				status = "Bebas masuk hari libur";
			}
			else if ( (izin.equals("y")||izin.equals("Y")) && (pengawalan.equals("y")||pengawalan.equals("Y")) )
				status = "Persyaratan anda terpenuhi";
			else {
				if (jenis == 2 && kapasitas<1000) {
					status = "Kendaraan Roda 2 Dilarang Masuk";
				}
				else if (tanggal%2 == plat%2) {
					status = "Diijinkan Memasuki toll";
				}
				else if (plat%2==0){
					status = "Khusus kendaraan dengan plat ganjil";
				}
				else{
					status = "Khusus kendaraan dengan plat genap";
				}
			}

			System.out.println("Status\t\t: "+status);
			System.out.println("==============================================");
			System.out.println("	     Semoga Selamat Sampai Tujuan");
			System.out.println("==============================================");
		}
	}
/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanYana1{
		public static void main (String[]args){
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);
			int umur, umurminimum;
			String jenisK, pendidikan, keahlian, pengalaman;
			boolean hasil;

			umurminimum = 23 ;

			System.out.println("Jenis kelamin(laki-laki/perempuan): ");
			jenisK = key.next();

			System.out.println("Umur: ");
			umur = key.nextInt();

			System.out.println("Pendidikan terakhir (S1/S2/S3): ");
			pendidikan = key.next();

			System.out.println("keahlian: ");
			keahlian = key1.nextLine();

			System.out.println("Memiliki pengalaman(ya/tidak) ? ");
			pengalaman = key.next();

			hasil = jenisK.equals("laki-laki") && umur>=umurminimum && (pendidikan.equals("S1") || pendidikan.equals("S2") || pendidikan.equals("S3")) && (keahlian.equals("java dan angularjs")||keahlian.equals("java dan php")) && pengalaman.equals("ya");

			System.out.println("Apakah anda diterima: " +hasil);

		}
	}
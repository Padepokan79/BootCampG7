/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanYana2{
		public static void main (String[]args){
			Scanner key = new Scanner(System.in);
			int umur;
			String jenisK, pendidikan, akreditasi;
			double ipk, ipkminimum, ipks1, ipks2;
			boolean hasil;

			ipkminimum = 3.25 ;

			System.out.println("Jenis kelamin(laki-laki/perempuan): ");
			jenisK = key.next();

			System.out.println("Umur: ");
			umur = key.nextInt();

			System.out.println("Pendidikan terakhir (S1/S2/S3): ");
			pendidikan = key.next();

			System.out.println("IPK S1: ");
			ipks1 = key.nextDouble();

			System.out.println("IPK S2: ");
			ipks2 = key.nextDouble();


			System.out.println("Akreditasi kampus: ");
			akreditasi = key.next();

			ipk = ( ipks1 + ipks2 ) /2;

			hasil = (jenisK.equals("laki-laki")||jenisK.equals("perempuan"))  && pendidikan.equals("S2") && ipk>=ipkminimum && (akreditasi.equals("A")||akreditasi.equals("B"));

			System.out.println("Apakah anda diterima: " +hasil);

		}
	}
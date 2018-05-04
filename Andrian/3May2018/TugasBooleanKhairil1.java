/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanKhairil1{
		public static void main(String [] args ){
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);

			int nilaiMat, nilaiMatMinimum;
			String jenisKelamin, domisili,seleksi;
			boolean hasil;

			nilaiMatMinimum = 8;

			System.out.println("Masukan jenis kelamin (pria/wanita): ");
			jenisKelamin = key.next();

			System.out.println("pernah mengikuti seleksi(ya/tidak)?  ");
			seleksi = key.next();	

			System.out.println("Daerah domisili  ");
			domisili = key1.nextLine();

			System.out.println("Nilai matematika selama 2 semester :  ");
			nilaiMat = key.nextInt();


			hasil = seleksi.equals("tidak") && (domisili.equals("kota bandung") || domisili.equals("bandung")) && nilaiMat>=nilaiMatMinimum;

			System.out.println("Jika true maka anda berhak mengikuti seleksi, dan false untuk sebaliknya, jawabannya adalah " + hasil);

		}
	}

	//Nilai MTK harus ada 2 (semester 1 dan semester 2)
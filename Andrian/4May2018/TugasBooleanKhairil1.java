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

			int nilaiMat1, nilaiMat2,nilaiMatTotal, nilaiMatMinimum;
			String jenisKelamin, domisili,seleksi;
			boolean hasil;

			nilaiMatMinimum = 8;

			System.out.println("Masukan jenis kelamin (pria/wanita): ");
			jenisKelamin = key.next();

			System.out.println("pernah mengikuti seleksi(ya/tidak)?  ");
			seleksi = key.next();	

			System.out.println("Daerah domisili  ");
			domisili = key1.nextLine();

			System.out.println("Nilai matematika semester 1:  ");
			nilaiMat1 = key.nextInt();

			System.out.println("Nilai matematika semester 2:  ");
			nilaiMat2 = key.nextInt();

			nilaiMatTotal = (nilaiMat1+nilaiMat2)/2;
			hasil = seleksi.equals("tidak") && (domisili.equals("kota bandung") || domisili.equals("bandung")) && nilaiMatTotal>=nilaiMatMinimum;

			System.out.println("Jika true maka anda berhak mengikuti seleksi, dan false untuk sebaliknya, jawabannya adalah " + hasil);

		}
	}
/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanKhairil3 {
		public static void main( String [] args ){
			Scanner key = new Scanner(System.in);
			String tiket, jenisKelamin;
			int penerbangan,syaratT,syaratPria,syaratwanita;
			boolean hasil;

			syaratPria = 20;
			syaratwanita = 15;
			syaratT = 30;

			System.out.println("Jenis tiket yang anda miliki :");
			tiket = key.next();

			System.out.println("jenis kelamin anda(pria/wanita): ");
			jenisKelamin = key.next();

			System.out.println("Minimal penerbangan anda: ");
			penerbangan = key.nextInt();

			hasil = tiket.equals("T") && penerbangan>=syaratT || tiket.equals("D") && jenisKelamin.equals("pria") && penerbangan>=syaratPria || tiket.equals("D") && jenisKelamin.equals("wanita") && penerbangan>=syaratwanita || tiket.equals("F") && jenisKelamin.equals("pria") && penerbangan>=syaratPria || tiket.equals("F") && jenisKelamin.equals("wanita") && penerbangan>=syaratwanita ;

			System.out.println("Anda di perbolehkan memasuki bisnis lounge " + hasil );
		}
	}
/* 	Date 		: 2/5/2018    
	Time 		: 10:56:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex9Drills3 {
		public static void main (String[] args){
			Scanner keyboard = new Scanner(System.in);
			Scanner keyboardInteger = new Scanner(System.in);
			String namaDepan, namaBelakang, tempatLahir,tanggalLahir, bulanLahir, alamat, kecamatan, kota, provinsi, hasil;
			int tahunLahir, kodePos, umur, tahunSekarang;

			tahunSekarang = 2018; 

			System.out.println("Selamat Datang, silahkan masukan data diri anda");
			System.out.print("Silahkan masukan nama depan anda : ");
			namaDepan = keyboard.next();

			System.out.print("Silahkan masukan nama belakang anda : ");
			namaBelakang = keyboard.next();

			System.out.print("Silahkan masukan tempat lahir anda anda : ");
			tempatLahir = keyboard.next();

			System.out.print("Silahkan masukan tanggal lahir anda : ");
			tanggalLahir = keyboardInteger.nextLine();
			
			System.out.print("Silahkan masukan tahun lahir anda : ");
			tahunLahir = keyboard.nextInt();

			System.out.print("\nSilahkan masukan alamat anda : ");
			alamat = keyboardInteger.nextLine();

			System.out.print("Silahkan masukan kecamatan anda : ");
			kecamatan = keyboardInteger.nextLine();

			System.out.print("Silahkan masukan kota/kabupaten anda : ");
			kota = keyboardInteger.nextLine();

			System.out.print("Silahkan masukan provinsi anda : ");
			provinsi = keyboardInteger.nextLine();

			System.out.print("Silahkan masukan kode pos anda : ");
			kodePos = keyboard.nextInt();


			umur = tahunSekarang - tahunLahir;
			hasil = namaDepan + " " +namaBelakang+", "+ umur + " tahun. Lahir di " +tempatLahir+ ", " + tanggalLahir + " " + tahunLahir + "\n" + "Beralamat di " +alamat+ ", " + kecamatan + " " + kota + " " + provinsi + "\n" + "Kode Pos " +kodePos;

			System.out.println("=====================================================");
			System.out.println("=                REGISTRASI BERHASIL                =");
			System.out.println("=====================================================");
			System.out.println("\n\nSelamat Datang,\n\n" + hasil );
			System.out.println("\n\nTerimaksaih sudah bergabung bersama kami");
			 

		}
	}
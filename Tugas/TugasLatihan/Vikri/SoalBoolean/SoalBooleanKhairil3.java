/*
	Created By vikri
	13/05/2018
	21:42 
*/
import java.util.Scanner;

class SoalBooleanKhairil3 {
	public static void main(String[] args ) {
		String kelas, subKelas, jKelamin;
		int penerbangan;
		boolean bisnis;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Kelas : " );
		kelas = input.next();

		System.out.print("Sub Kelas A-Z: " );
		subKelas = string.next();

		System.out.print("Jenis Kelamin: " );
		jKelamin = string.next();

		System.out.print("Penerbangan : " );
		penerbangan = input.nextInt();

		bisnis =  kelas.equals("bisnis")  
						&& (( subKelas.equals("D") || subKelas.equals("F") ) || 
						(subKelas.equals("T") && penerbangan >= 30) ) && 
						(( jKelamin.equals("pria") && penerbangan >= 20 ) || 
						( jKelamin.equals("wanita") && penerbangan >= 15 ) );

		System.out.println( "Boleh Masuk?  " + bisnis);
	}	
}
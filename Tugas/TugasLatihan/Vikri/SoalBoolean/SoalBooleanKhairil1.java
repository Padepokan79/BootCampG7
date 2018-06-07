/*
	Created Vikri
	13/05/2018
	20:43
*/
import java.util.Scanner;

class SoalBooleanKhairil1{
	public static void main(String[] args ) {
		boolean kriteria;
		String jKelamin, seleksi, domisili;
		double mtk1, mtk2;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jenis Kelamin? " );
		jKelamin = string.next();

		System.out.print("Pernah ikut seleksi? " );
		seleksi = string.next();

		System.out.print("Domisili? ");
		domisili = input.nextLine();

		System.out.print("Nilai MTK Sem 1: ");
		mtk1 = string.nextDouble();

		System.out.print("Nilai MTK Sem 2: ");
		mtk2 = string.nextDouble();

		kriteria = (jKelamin.equals("pria") || jKelamin.equals("wanita")) && seleksi.equals("ya") && domisili.equals("bandung") && (mtk1 >= 8 && mtk2 >= 8);
		System.out.println( "Boleh ikut ? " + kriteria);
	}	
}
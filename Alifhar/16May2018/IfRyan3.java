/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	09.58
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfRyan3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String warna1, warna2;
		int kicau, temp;
		double harga, rest, bayar=300000;

		System.out.println("Spesifikasi Burung");
		System.out.print("Kicau per hari : ");
		kicau=scan.nextInt();
		System.out.print("Warna 1        : ");
		warna1=scan.next();
		System.out.print("Warna 2        : ");
		warna2=scan.next();
		System.out.print("harga          : ");
		harga=scan.nextInt();

		System.out.println();
		if(kicau>=3 && ((warna1.equals("merah") && warna2.equals("biru")) || (warna1.equals("biru") && warna2.equals("merah")))){
			temp=(kicau-3)/2;
			if( harga<=(bayar+bayar*(0.5*temp)) )
				System.out.println("Burung dibeli");
			else
				System.out.println("Burung tidak dibeli");
		}
		else
			System.out.println("Burung tidak dibeli");
	}
}
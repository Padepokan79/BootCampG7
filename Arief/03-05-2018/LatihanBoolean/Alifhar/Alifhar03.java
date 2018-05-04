/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Alifhar03{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		String rambut, pensil;
		int soal, benar, salah, kosong, defBenar, defSalah, defKosong, totnilai, minNilai, rapi, defRapi;
		boolean allowed, pensil2B, pendek, disiplin;

		defBenar = 4;
		defSalah = -1;
		defKosong = 0;
		defRapi = 8;
		minNilai = 130;

		System.out.println( "Ujian Matematika" );
		System.out.println();

		System.out.print( "Jawaban benar : " );
		benar = inputKey.nextInt();

		System.out.print( "Jawaban salah : " );
		salah = inputKey.nextInt();

		System.out.print( "Jawaban kosong : " );
		kosong = inputKey.nextInt();

		totnilai = ((benar * defBenar) + (salah * defSalah) + (kosong * defKosong));

		System.out.print( "Pensil yang digunakan (HB/2B/3B/4B/5B/6B): " );
		pensil = inputKey.next();
		pensil2B = pensil.equals("2B");

		System.out.print( "Skala kerapian (0 sampai 10): " );
		rapi = inputKey.nextInt();

		System.out.print( "Rambut (pendek/panjang): " );
		rambut = inputKey.next();
		pendek = rambut.equals("pendek");

		disiplin = (pensil2B == true && pendek == true && (rapi >= defRapi));
		allowed = (totnilai > minNilai) && disiplin;

		System.out.println();
		System.out.println("+----------------------------------------------+");
		System.out.println("|Total nilai: " + totnilai + "                         |");
		System.out.println("|Kedisplinan: " + disiplin + "                           |");
		System.out.println("|Anda lulus: " + allowed + "                           |");
		System.out.println("+----------------------------------------------+");

	}
}

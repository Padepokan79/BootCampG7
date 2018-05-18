/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 3:28PM
soal :

No HP Berdasarkan FengShui

0 khusus, special, langka,
1 satu, satu-satunya, diri sendiri,
2 mudah, gampang, tidak sulit
3 menemukan, mendapatkan, hidup,
4 mati, miskin, susah,
5 Tidak akan, tidak pernah, tidak bisa
6 Menuju, akan
7 Tepat, hoki, atau bisa disebut juga ketuhanan
8 Makmur
9 Sukses

Maksukan No HP anda:
089686446002

0 khusus, special, langka,
8 Makmur
9 Sukses
6 Menuju, akan
8 Makmur
6 Menuju, akan
4 mati, miskin, susah,
4 mati, miskin, susah,
6 Menuju, akan
0 khusus, special, langka,
0 khusus, special, langka,
2 mudah, gampang, tidak sulit

*/
import java.util.Scanner;

public class SoalTugas9{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);

		int jml, angka;
		String no;
		

		System.out.print("Masukan No Hp anda : ");
		no = num.next();

		jml = no.length();

		for ( angka = 0; angka < jml; angka++ ) {


			if ( no.charAt(angka) == '0' ) {
				System.out.println("0 Khusu, special, langka");
			}else if ( no.charAt(angka) == '1' ) {
				System.out.println("1 satu, satu-satunya, diri sendiri");
			}else if ( no.charAt(angka) == '2' ) {
				System.out.println("2 mudah, gampang, tidak sulit");
			}else if ( no.charAt(angka) == '3' ) {
				System.out.println("3 menemukan, mendapatkan, hidup");
			}else if ( no.charAt(angka) == '4' ) {
				System.out.println("4 mati, miskin, susah");
			}else if ( no.charAt(angka) == '5' ) {
				System.out.println("5 Tidak akan, tidak pernah, tidak bisa");
			}else if ( no.charAt(angka) == '6' ) {
				System.out.println("6 Menuju, akan");
			}else if ( no.charAt(angka) == '7' ) {
				System.out.println("7 Tepat, hoki, atau bisa disebut juga ketuhanan");
			}else if ( no.charAt(angka) == '8' ) {
				System.out.println("8 Makmur");
			}else if ( no.charAt(angka) == '9' ) {
				System.out.println("9 Sukses");
			}

		}


	}
}

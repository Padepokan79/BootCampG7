/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 10:03AM
update		: 15-05=2018 8:28PM

Soal :

Ada tempat fotokopi "Unity Fotocopy" apabila dia pelanggan pada tempat
	itu maka berapa lembar pun banyaknya dia fotokopi di dapat harga
	Rp.75,-.

	tapi jika dia bukan pelanggan maka :
	a. jika dia fotokopi kurang dari 100 lembar maka dapet harga Rp.150,-
	b. jika fotokopi sebanyak 100-200 lembar dapet harga Rp.100,-
	c. tapi jika fotokopi lebih dari 200 lembar dia dapet harga Rp.80,-

output:
==============================================
Apakah anda member (Y/N)		:....
Banyak lembar yang akan di fotocopy	:....
==============================================

Harga 					=
Bayar					= 
============================================== 
*/
import java.util.Scanner;
public class AndrianIf1{
	public static void main(String[] args){

		Scanner fotokopi = new Scanner(System.in);
		String member;
		int lembar, ratus, duaratus;
		double minHarga, bayar, minHargaTiga, minHargaDua, minHargaSatu;

		minHarga 		= 75;
		minHargaSatu 	= 150;
		minHargaDua 	= 100;
		minHargaTiga 	= 80;
		ratus 			= 100;
		duaratus 		= 200;

		System.out.println("==============================");
		System.out.print("Apakah anda member (Y/N)	: ");
		member = fotokopi.next();
		System.out.print("Banyak lembar yang akan di fotocopy 	: ");
		lembar = fotokopi.nextInt();
		System.out.println("==============================");

		if ( member.equals("Y") ) {
			bayar = minHarga*lembar;
			System.out.println("Harga\t\t\t= Rp. 75 ");
			System.out.println("Bayar\t\t\t= Rp. "+bayar);
		}else{
			if ( lembar > duaratus ) {
				bayar = minHargaTiga*lembar;
				System.out.println("Harga\t\t\t= Rp. "+minHargaTiga);
				System.out.println("Bayar\t\t\t= Rp. "+bayar);
			}else if ( lembar <= ratus && lembar >=ratus ) {
				bayar = minHargaDua*lembar;
				System.out.println("Harga\t\t\t= Rp. "+minHargaDua);
				System.out.println("Bayar\t\t\t= Rp. "+bayar);
			}else if ( lembar < ratus ) {
				bayar = minHargaSatu*lembar;
				System.out.println("Harga\t\t\t= Rp. "+minHargaSatu);
				System.out.println("Bayar\t\t\t= Rp. "+bayar);
			}
		}
	}
}
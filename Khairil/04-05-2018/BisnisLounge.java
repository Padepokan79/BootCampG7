/*
	 Program     : Bisnis Lounge
     Creator     : Khairil
     Created At  : 3 Mei 2018 12:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BisnisLounge {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Scanner another = new Scanner(System.in);
		String ecoClass, bisClass, chooseClass, subClass, classD, classF, classT, gender, l, p;
		int frekuensi, tigaPuluh, duaPuluh, limaBelas;
		boolean bisnisLounge;

		System.out.print( "Kelas Penerbangan ? Ketik Bisnis atau Ekonomi : " );
		chooseClass = keyboard.next();

		System.out.print( "Jenis Sub Kelas ? Pilihan A - Z : " );
		subClass = keyboard.next();

		System.out.print( "Jenis Kelamin Anda ? Pilihan L / P : " );
		gender = keyboard.next();

		System.out.print( "Frekuensi Penerbangan : " );
		frekuensi = keyboard.nextInt();

		ecoClass = "Ekonomi";
		bisClass = "Bisnis";
		classD   = "D";
		classF   = "F";
		classT   = "T";
		l = "L";
		p = "P";
		tigaPuluh = 30;
		duaPuluh = 20;
		limaBelas = 15;

		bisnisLounge = ( chooseClass.equals(bisClass) && !chooseClass.equals(ecoClass) )  && (( subClass.equals(classD) || subClass.equals(classF) ) || (subClass.equals(classT) && frekuensi >= tigaPuluh) ) && (( gender.equals(l) && frekuensi >= duaPuluh ) || ( gender.equals(p) && frekuensi >= limaBelas ) );

		System.out.println( "Boleh Masuk Bisnis Lounge ?  " + bisnisLounge);
	}	
}

/*
di bandara husein penumpang yang diperbolehkan masuk ke bisnis 

lounge adalah pemegang tiket pesawat kelas bisnis yang memiliki 

kelas D atau F (kelas T dengan syarat laki/perempuan terbang 30x)

baik untuk laki-laki terbang 20x dan perempuan terbang 15x.
*/
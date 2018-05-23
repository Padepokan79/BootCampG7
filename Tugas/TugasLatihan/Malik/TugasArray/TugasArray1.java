/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 2:45PM
Soal :
int [] angka = {1,4,2,5,7,10}

copy isi array pada angka ke array number
kemudian tampilkan isi dari array number 
*/
public class TugasArray1{
	public static void main(String[] args){
		int[] angka = {1,4,2,5,7,10};
		int[] number = new int[angka.length];

		for (int a = 0; a<angka.length; a++ ) {
			number[a] = (angka[a]);
		}

		for (int a : number ) {
			System.out.println(a);
		}


		//// view bila ganjil
		int[] angka = {1,4,2,5,7,10};
		int[] number = new int[angka.length];

		for (int a = 0; a<angka.length; a++ ) {
			if ( angka[a]%2 == 1 ) {
				number[a] = (angka[a]);
			}
		}

		for (int a : number ) {
			System.out.println(a);
		}

	}
}
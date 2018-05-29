/*
Create By 	: Malik Chaudhary
Time Create : 2018-05-29 9:09AM
Soal 		:

Sisip suatu bilangan pada posisi tertentu pada array Number1
{2, 39, 47, 14, 36, 56, 57, 49, 43, 79};

Batasan:
-input posisi tidak boleh lebih dari 10.
-input posisi tidak boleh kurang dari 1.
-input hanya dapat menerima angka.

Petunjuk:
- if else
- looping for
- do while
- while
- array

Hasil yang diinginkan:
Deretan number : 
2 39 47 14 36 56 57 49 43 79

Masukan Angka yang mau disisipkan: 30
Sisipkan pada posisi ke :

2 39 47 14 36 30 56 57 49 43 79

Sisipkan pada posisi ke: -3
Maaf, input posisi tidak boleh kurang dari 1.
Silahkan input kembali.

Sisipkan pada posisi ke: 15
Maaf, input posisi tidak boleh lebih dari 10.

Masukan Angka yang mau disisipkan: asd
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.

Sisipkan pada posisi ke: asd
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.
*/
import java.util.Scanner;
public class QuizLimaMalik{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arrayNumber   = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] arrayBaru 	= new int[arrayNumber.length+1]; 
		String angkaString, posisiString;
		int posisi,angka,minPosisi, maxPosisi;

		minPosisi 	= 1;
		maxPosisi 	= 10;
		posisi 		= 0;

		System.out.println();
		System.out.println("Deretan Number : ");
		for (int number:arrayNumber) {
			System.out.print(number+" ");
		}
		System.out.println();
		System.out.print("Masukan angka yang mau disisipkan : ");
		angkaString = scan.next();

		do{
			if ( !angkaString.matches("([0-9])*") ) {
				System.out.println();
				System.out.println("Maaf, inputan harus berupa angka ");
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Masukan angka yang mau disisipkan : ");
				angkaString = scan.next();
			}
		}while( !angkaString.matches("([0-9])*"));

		System.out.print("Sisipkan pada posisi ke : ");
		posisiString = scan.next();

		do{	
			if ( !posisiString.matches("([0-9])*") ) {
				System.out.println();
				System.out.println("Maaf, input posisi harus berupa angka ");
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Sisipkan pada posisi ke : ");
				posisiString = scan.next();
			}
			if ( posisiString.matches("([0-9])*") ) {
				posisi = Integer.parseInt(posisiString);
				if ( posisi < minPosisi ) {
					System.out.println();
					System.out.println("Maaf, input posisi tidak boleh kurang dari 1 ");
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Sisipkan pada posisi ke : ");
					posisiString = scan.next();
				}else if ( posisi > maxPosisi ) {
					System.out.println();
					System.out.println("Maaf, input posisi tidak boleh kurang dari 10 ");
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Sisipkan pada posisi ke : ");
					posisiString = scan.next();
				}
				
			}
		}while( posisi < minPosisi || posisi > maxPosisi || !posisiString.matches("([0-9])*"));
		

		angka  = Integer.parseInt(angkaString);
		posisi = Integer.parseInt(posisiString);
		int indexArrayNumber = 0;
		for (int indexSatu=0; indexSatu<arrayBaru.length; indexSatu++) {
			if ( indexSatu+1 == posisi ) {
				arrayBaru[indexSatu] = angka;
			}else{
				arrayBaru[indexSatu] = arrayNumber[indexArrayNumber];
				indexArrayNumber++;
			}
			
		}
		System.out.println();
		System.out.println("hasil Deretan Number : ");
		for (int number:arrayBaru) {
			System.out.print(number+" ");
		}

	}
}
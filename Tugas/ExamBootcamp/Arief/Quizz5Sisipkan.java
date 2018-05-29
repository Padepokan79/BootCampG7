/*
Date Created	: 29 May 2018, 09:08:19 AM
Date Done		: 29 May 2018, 09:46:19 AM
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class Quizz5Sisipkan {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		int[] 	Number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79},
				arrayBaru = new int[Number1.length+1];

		String angka, posisi;
		int validation, validate, angkaInt, posisiInt, nol, satu, indexing, minPosisi, maxPosisi;

		indexing = nol = posisiInt = angkaInt = validate = 0;
		minPosisi = satu = validation = 1;
		maxPosisi = 10;
		

		angka = posisi = "";


		System.out.println("Deretan data didalam array Number : ");
		for ( int cetak : Number1) {
			System.out.print(cetak + " ");
		}
		System.out.println();

		do{
			System.out.println();
        	System.out.print("Masukan Angka yang mau disisipkan: ");
	        angka = inputKey.nextLine();
	        System.out.println();
	        if (angka.matches("[0-9-]+")) {
				angkaInt = Integer.parseInt(angka);
				do{
					System.out.print("Sisipkan pada posisi ke: ");
					posisi = inputKey.nextLine();
			        System.out.println();
					if (posisi.matches("[0-9-]+")) {
						posisiInt = Integer.parseInt(posisi);
			        	if (posisiInt < minPosisi) {
			        		System.out.println("Maaf, input posisi tidak boleh kurang dari 1.");
			        		System.out.println("Silahkan Input Kembali");
			        		System.out.println();
			        		validate = nol;
			        	}else if (posisiInt > maxPosisi) {
			        		System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
			        		System.out.println("Silahkan Input Kembali");
			        		System.out.println();
			        		validate = nol;
			        	}else {

			        		validate++;
			        	}
		        	}else{
			        	System.out.println("Maaf, input yang diterima hanya berupa angka.");
			        	System.out.println("Silahkan Input Kembali");
			        	System.out.println();
			        	validate = nol;
		        	}
		        } while (validate < validation);
	        }else {
	        	System.out.println("Maaf, input yang diterima hanya berupa angka.");
	        	System.out.println("Silahkan Input Kembali");
	        	System.out.println();
	        	validate = nol;
	        }
		}while (validate < validation);

		
		posisiInt-=satu;

        for(int index = nol; index < arrayBaru.length ; index++){
            if(posisiInt == index){
                arrayBaru[index] = angkaInt;
            }else{
                arrayBaru[index] = Number1[indexing];
                indexing++;
            }
        }
        
        System.out.println("Array setelah di sisipkan: ");

		for ( int print : arrayBaru) {
			System.out.print(print + " ");
		}
		System.out.println();

	}
}

/*
5.Sisip suatu bilangan pada posisi tertentu pada array Number1
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
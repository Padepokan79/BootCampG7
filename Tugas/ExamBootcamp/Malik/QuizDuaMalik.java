/*
Create By 	: Malik Chaudhary
Time Create : 2018-05-29 12:42PM
Soal 		:

Buatlah sebuah fungsi yang mengeluarkan tampilan segitiga Paskal (Pascal Triangle) dengan jumlah baris berdasarkan input dari user.

Petunjuk:
- if else
- looping for
- do while
- while
- array*
- recursive function*
*Jika dibutuhkan

Batasan:
- User input tidak boleh kurang dari 2
- User input tidak boleh lebih dari 20
- User input hanya menerima angka

Hasil yang diinginkan: 
Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 9
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 1
Maaf, jumlah baris tidak boleh kurang dari 2.
Silahkan input kembali.

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : 54
Maaf, jumlah baris tidak boleh lebih dari 20.
Silahkan input kembali.

Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : test
Maaf, input yang diterima hanya berupa angka.
Silahkan input kembali.
=====================================================


*/
import java.util.Scanner;
public class QuizDuaMalik{
	public static void main(String[] args){
		int indexBaris,indexKolom, minInput, maxInput, jmlBarisInt;
        String jmlBaris;
        Scanner scan = new Scanner(System.in);
      	
        minInput 	= 2;
        maxInput 	= 20;
        jmlBarisInt = 0;

        System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
        jmlBaris = scan.next();

        do{
        	if ( !jmlBaris.matches("([0-9])*") ) {
        		System.out.println();
				System.out.println("Maaf, input yang diterima harus berupa angka ");
				System.out.println("Silahkan input kembali.");
				System.out.println();
				System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
        		jmlBaris = scan.next();
        	}
        	if ( jmlBaris.matches("([0-9]*)") ) {
        		jmlBarisInt = Integer.parseInt(jmlBaris);
        		if ( jmlBarisInt < minInput ) {
        			System.out.println();
					System.out.println("Maaf, input tidak boleh kurang dari 2 ");
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
	        		jmlBaris = scan.next();
        		}else if( jmlBarisInt > maxInput ){
        			System.out.println();
					System.out.println("Maaf, input tidak boleh lebih dari 20 ");
					System.out.println("Silahkan input kembali.");
					System.out.println();
					System.out.print("Jumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
	        		jmlBaris = scan.next();
        		}
        	}

        }while( jmlBarisInt < minInput || jmlBarisInt > maxInput || !jmlBaris.matches("([0-9])*") );

        int[][]arrayPascal = new int[100][100];
        for(indexBaris=1; indexBaris<=jmlBarisInt; indexBaris=indexBaris+1){
            for(indexKolom=jmlBarisInt; indexKolom>indexBaris; indexKolom=indexKolom-1){
                System.out.print("");
            }
            for(indexKolom=1; indexKolom<=indexBaris; indexKolom++){
                if(indexBaris==0||indexKolom==indexBaris){
                    arrayPascal[indexBaris][indexKolom]=1;
                    System.out.print(" "+arrayPascal[indexBaris][indexKolom]+" ");
                }
                else{
                    arrayPascal[indexBaris][indexKolom] = arrayPascal[indexBaris-1][indexKolom-1] + arrayPascal[indexBaris-1][indexKolom];
                    if(arrayPascal[indexBaris][indexKolom]>99)
                        System.out.print(" "+arrayPascal[indexBaris][indexKolom]+" ");
                    else if(arrayPascal[indexBaris][indexKolom]>9)
                        System.out.print(" "+arrayPascal[indexBaris][indexKolom]+" ");
                    else
                        System.out.print(" "+arrayPascal[indexBaris][indexKolom]+" ");
                }
            }
            System.out.println();
        }

	}
}
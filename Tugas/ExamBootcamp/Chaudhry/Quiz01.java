/*
	DATE CREATED      : 29 MEI 2018
	TIME START        : 08.28
	TIME FINISH       : 09.20
	AUTHOR            : NURDHIAT CHAUDHARY MALIK
*/	
import java.util.Scanner;
import java.util.Random;
public class Quiz01{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner key	= new Scanner(System.in);

		int minInput, maxInput, satu, nilaiKetigaFibonacci, operasiFibonacci, nol, nilaiAwalFibonacci, conversi;
		String inputAngka;
		minInput 					= 5;
		maxInput 					= 100; 
		satu 						= nilaiAwalFibonacci = 1;
		nilaiKetigaFibonacci 		= 2;
		nol  						= conversi = operasiFibonacci = 0;

		do{
			System.out.println("");
			System.out.print("Input Angka Fibonacci yang akan ditampilkan : ");
			inputAngka = key.nextLine();
			
			if (inputAngka.matches("[0-9]*")) {
				conversi = Integer.parseInt(inputAngka);

				if (conversi < minInput) {
					System.out.println("Maaf jumlah urutan angka tidak boleh kurang dari 5.");
				}
				else if (conversi > maxInput) {
					System.out.println("Maaf jumlah urutan angka tidak boleh lebih dari 100.");
				}
			}
			else if (!inputAngka.matches("[0-9]*")) {
					System.out.println("Maaf inputan yang diterima hanya berupa angka");
			}

		}while(conversi < minInput || conversi > maxInput|| !inputAngka.matches("[0-9]*") );


				int[] arrFibonaci = new int[conversi];
				arrFibonaci[0] = nilaiAwalFibonacci;
				arrFibonaci[1] = nilaiAwalFibonacci;

				for (int index = nilaiKetigaFibonacci; index < conversi; index++) {
					arrFibonaci[index] = arrFibonaci[index - 1] + arrFibonaci[index - 2];
				}

				System.out.println("Jumlah urutan angka Fibonacci yang akan ditampilkan : "+inputAngka);
				for (int index2 = nol; index2 < conversi; index2++) {
					System.out.print(arrFibonaci[index2]+", ");
				}


	}
}
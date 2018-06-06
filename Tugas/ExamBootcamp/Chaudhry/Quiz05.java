/*
	DATE CREATED      : 29 MEI 2018
	TIME START        : 11.40
	TIME FINISH       : 12.16
	AUTHOR            : NURDHIAT CHAUDHARY MALIK
*/	
import java.util.Scanner;
import java.util.Random;
public class Quiz05{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner key	= new Scanner(System.in);

		int conversiAngka, conversiPosisi, maxInput, minInput, indexArray;
		String inputAngka, inputPosisi;

		conversiAngka = conversiPosisi = 0;
		maxInput 	= 10;
		minInput 	= 1;
		int[] number1 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] number2 = new int[number1.length + 1];

		do{
			System.out.println("");
			System.out.print("Masukan angka yang mau disisipkan : ");
			inputAngka = key.nextLine();
			
			if (inputAngka.matches("[0-9]*")) {
				conversiAngka  = Integer.parseInt(inputAngka);
			}
			else if (!inputAngka.matches("[0-9]*")) {
					System.out.println("Maaf inputan yang diterima hanya berupa angka");
			}
	
		}while(!inputAngka.matches("[0-9]*") );


		do{
			System.out.println("");
			System.out.print("Sisipkan pada posisi ke : ");
			inputPosisi = key.nextLine();
			
			if (inputPosisi.matches("[0-9]*")) {
				conversiPosisi = Integer.parseInt(inputPosisi);

				if (conversiPosisi >= maxInput) {
					System.out.println("Maaf input tidak boleh lebih dari 10.");
				}
				else if (conversiPosisi < minInput) {
					System.out.println("Maaf input tidak boleh kurang dari 1.");
				}
			}
			else if (!inputPosisi.matches("[0-9]*")) {
					System.out.println("Maaf inputan yang diterima hanya berupa angka");
			}
	
		}while(conversiPosisi > maxInput || conversiPosisi < minInput || !inputPosisi.matches("[0-9]*") );

		
		System.out.println("");



		indexArray = 0;
		for (int index = 0; index < number2.length; index++) {
			if (conversiPosisi == (index+1)) {
				number2[index] = conversiAngka;
			}
			else{
				number2[index] = number1[indexArray];
				indexArray++;
			}

		}

		System.out.println("");
		for (int show : number2) {
			System.out.print(show+" ");					
		}				

	}
}
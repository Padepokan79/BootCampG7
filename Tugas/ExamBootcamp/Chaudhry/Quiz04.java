/*
	DATE CREATED      : 29 MEI 2018
	TIME START        : 09.20
	TIME FINISH       : 13.10
	AUTHOR            : NURDHIAT CHAUDHARY MALIK
*/	
import java.util.Scanner;
import java.util.Random;
public class Quiz04{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner key	= new Scanner(System.in);

		int conversi, minInput, maxInput, nol, tampungArray;
		String inputAngka;

		minInput 	= 1;
		nol 	 	= conversi = tampungArray = 0;
		maxInput 	= 10;
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		do{
			System.out.println("");
			System.out.print("Shift ke kiri sebanyak : ");
			inputAngka = key.nextLine();
			
			if (inputAngka.matches("[0-9]*")) {
				conversi = Integer.parseInt(inputAngka);

				if (conversi >= maxInput) {
					System.out.println("Maaf jumlah pergeseran tidak boleh lebih dari 10.");
				}
				else if (conversi < minInput) {
					System.out.println("Maaf jumlah pergeseran tidak boleh kurang dari 1.");
				}
			}
			else if (!inputAngka.matches("[0-9]*")) {
					System.out.println("Maaf inputan yang diterima hanya berupa angka");
			}
	
		}while(conversi > maxInput || conversi < minInput  || !inputAngka.matches("[0-9]*") );

		System.out.println("");
		System.out.println("");
		System.out.println("Shift ke kiri sebanyak "+inputAngka);
		for (int hapus = minInput; hapus <= conversi ; hapus++) {
			
			//25, 14, 56, 15, 36, 56, 77, 18, 29, 49

			tampungArray = deretAngka[0];
			for (int index = 0; index < deretAngka.length; index++) {
				if (index < deretAngka.length - 1) {

					deretAngka[index] = deretAngka[index + 1];
				}
				else if (index >= deretAngka.length - 1) {
					deretAngka[deretAngka.length - 1] = tampungArray;
				}

			}

		}

		System.out.println("");
		for (int show : deretAngka) {
			System.out.print(show+" ");
		}

	}
}
/*
	DATE CREATED      : 29 MEI 2018
	TIME START        : 12.33
	TIME FINISH       : 12.59
	AUTHOR            : NURDHIAT CHAUDHARY MALIK
*/	
import java.util.Scanner;
import java.util.Random;
public class Quiz02{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner key	= new Scanner(System.in);

		int conversiBaris, minBaris, maxBaris, barisAwal, spasiAwal, angkaNol, angkaSatu, maxValue;
		int angkaSembilan, spasi, baris;
		String inputBaris;
		int[][] arrayPascal = new int[100][100];

		minBaris 		= 2;
		maxBaris 		= 20; 
		conversiBaris 	= angkaNol = 0;
		barisAwal 		= spasiAwal = angkaSatu = 1;
		maxValue 		= 99;
		angkaSembilan 	= 9;

		do{
			System.out.println("");
			System.out.print("Jumlah baris untuk segitiga paskal yang akan tampil : ");
			inputBaris = key.nextLine();
			
			if (inputBaris.matches("[0-9]*")) {
				conversiBaris = Integer.parseInt(inputBaris);

				if (conversiBaris < minBaris) {
					System.out.println("Maaf jumlah baris tidak boleh kurang dari 2.");
				}
				else if (conversiBaris > maxBaris) {
					System.out.println("Maaf jumlah baris tidak boleh lebih dari 20.");
				}
			}
			else if (!inputBaris.matches("[0-9]*")) {
					System.out.println("Maaf inputan yang diterima hanya berupa angka");
			}

		}while(conversiBaris < minBaris || conversiBaris > maxBaris || !inputBaris.matches("[0-9]*") );

				
		for (baris = barisAwal; baris <= conversiBaris; baris = baris  + 1) {
			
			// for (spasi = conversiBaris; spasi > baris; spasi = spasi - 1) {
			// 	System.out.print(" ");
			// }
			for (spasi = spasiAwal; spasi <= baris; spasi++) {
				if (baris == angkaNol || spasi == baris) {
					arrayPascal[baris][spasi] = angkaSatu;
					System.out.print(" "+arrayPascal[baris][spasi]+" ");
				}
				else{
					arrayPascal[baris][spasi] = arrayPascal[baris - 1][spasi - angkaSatu] + arrayPascal[baris - angkaSatu][spasi];
                    if(arrayPascal[baris][spasi] > maxValue){
                        System.out.print("  "+arrayPascal[baris][spasi]+" ");
                    }
                    else if(arrayPascal[baris][spasi] > angkaSembilan){
                        System.out.print("  "+arrayPascal[baris][spasi]+"  ");
                    }
                    else{
                        System.out.print("  "+arrayPascal[baris][spasi]+"   ");
                    }
				}
			}

			System.out.println("");

		}


	}
}
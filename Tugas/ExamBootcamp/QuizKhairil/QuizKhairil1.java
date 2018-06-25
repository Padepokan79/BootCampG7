/*
	 Program     : Quiz
     Creator     : Khairil
     Created At  : 29 Mei 2018 08:28 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

class QuizKhairil1 {
	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		int index, indexInt, minIndex, maxIndex;
		double fibonacci;
		String inputIndex;
		boolean validation = false;

		minIndex = 5;
		maxIndex = 100;
		indexInt = 0;
		fibonacci = 0.0;


		while(validation == false) {
			System.out.print("Jumlah urutan angka yang diinginkan : ");
			inputIndex = inputA.nextLine();
			System.out.println();

			if(inputIndex.matches("[0-9-]+")) {
				indexInt = Integer.parseInt(inputIndex);
				if(indexInt < minIndex) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.");
					System.out.println("Silahkan input kembali.");
					validation = false;					
				}
				else if(indexInt > maxIndex) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.");
					System.out.println("Silahkan input kembali.");
					validation = false;									
				}
				else {
					validation = true;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
				validation = false;										
			}
		}

		Double [] fibo = new Double[indexInt];

		fibo[0] = fibo[1] = 1.0;

		for(index = 2; index < fibo.length; index++) {
			fibo[index] = fibo[index-1] + fibo[index-2];
		}

		for(index = 0; index < fibo.length; index++) {
			fibonacci = fibo[index];
			if(index < fibo.length-1) {
				System.out.printf("%.0f",fibo[index]);
				System.out.print(", ");							
			}
			else {
				System.out.printf("%.0f",fibo[index]);					
			}
		}

		System.out.println();
	}
}
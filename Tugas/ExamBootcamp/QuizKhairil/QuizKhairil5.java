/*
	 Program     : Quiz
     Creator     : Khairil
     Created At  : 29 Mei 2018 08:58 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

class QuizKhairil5 {
	public static void main(String[] args) {
		Scanner inputB = new Scanner(System.in);
		String posisi;
		int inputSisip, posisiInt, flip, indexMin, indexMax;
		Boolean valid = false;

		indexMin = 1;
		indexMax = 10;
		inputSisip = 0;
		flip = 0;

		int [] arrayNum1 = {2,39,47,14,36,56,57,49,43,79};

		int [] arraySisip = new int[arrayNum1.length+1];

		while(valid == false) {
			System.out.print("Sisipkan pada posisi ke: ");
			posisi = inputB.next();
			if(posisi.matches("[0-9-]+")) {
				posisiInt = Integer.parseInt(posisi);
				inputSisip = posisiInt - 1;
				if(inputSisip < indexMin) {
					System.out.println("Maaf, input posisi tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali.");
					valid = false;
				}
				else if(inputSisip > indexMax) {
					System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");
					System.out.println("Silahkan input kembali.");
					valid = false;					
				}
				else {
					valid = true;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
				valid = false;									
			}
		}


		for(int index= 0 ; index < arrayNum1.length; index++) {
			if(index < arrayNum1.length-1 ) {
				System.out.print(arrayNum1[index] + ", ");			
			}
			else {
				System.out.print(arrayNum1[index]);	
			}
		}

		System.out.println();


		arrayNum1[inputSisip] = 0;

		for(int index = 0; index < arrayNum1.length; index++) {
			for( int index1 = 0; index1 < arraySisip.length; index1++) {
				arraySisip[index] = arrayNum1[index];
				if(index == inputSisip) {
					flip = arrayNum1[inputSisip];
					arrayNum1[inputSisip] = arrayNum1[index];
					arrayNum1[index] = flip;
					flip++;
				}
			}
			if(index < arraySisip.length-2 ) {
				System.out.print(arraySisip[index] + ", ");			
			}
			else {
				System.out.print(arraySisip[index]);	
			}
		}

		System.out.println();
	}
}
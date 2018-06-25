/*
	 Program     : Quiz
     Creator     : Khairil
     Created At  : 29 Mei 2018 08:28 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

class QuizKhairil4 {
	public static void main(String[] args) {
		Scanner inputC = new Scanner(System.in);
		String inputShift;
		int shift, minShift, maxShift, slot;
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Boolean allow = false;

		minShift = 0;
		maxShift = 10;
		shift = 0;

		while(allow == false) {
			System.out.print("Shift kiri sebanyak : ");
			inputShift = inputC.next();
			if(inputShift.matches("[0-9-]+")) {
				shift = Integer.parseInt(inputShift);
				if(shift < minShift) {
					System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali.");
					allow = false;
				}
				else if(shift > maxShift) {
					System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.");
					System.out.println("Silahkan input kembali.");
					allow = false;					
				}
				else {
					allow = true;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
				allow = false;									
			}
		}

		for(int index=0; index < deretAngka.length; index++) {
			if(index < deretAngka.length-1) {
				System.out.print(deretAngka[index] + ", ");			
			}
			else {
				System.out.print(deretAngka[index]);
			}
		}	

		System.out.println();	

		for(int index=0; index < deretAngka.length; index++) {
			if(index < shift) {
				slot = deretAngka[index];
				deretAngka[index] = deretAngka[shift];
				deretAngka[shift] = slot;
				slot++;
			}
			if(index < deretAngka.length-1) {
				System.out.print(deretAngka[index] + ", ");			
			}
			else {
				System.out.print(deretAngka[index]);
			}
		}

		System.out.println();
	}
}
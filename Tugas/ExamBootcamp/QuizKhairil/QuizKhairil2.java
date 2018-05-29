/*
	 Program     : Quiz
     Creator     : Khairil
     Created At  : 29 Mei 2018 10:34 AM     
     Updated By  : 
     Update Date : 
*/

import java.util.Scanner;

class QuizKhairil2 {
	public static void main(String[] args) {
		Scanner inputE = new Scanner(System.in);
		Boolean split = false;
		String inputBaris;
		int vertikal, horizontal, baris, kolom, minInputan, maxInputan; //baris x kolom y && vert baris horz kolom

		minInputan = 2;
		maxInputan = 20;
		baris = 0;

		while(split == false) {
			System.out.print("Jumlah baris untuk segitiga pascal yang akan ditampilkan : ");
			inputBaris = inputE.next();
			vertikal = 0;
			horizontal = 0;

			if(inputBaris.matches("[0-9-]+")) {
				baris = Integer.parseInt(inputBaris);
				if(baris < minInputan) {
					System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali.");
					split = false;
				}
				else if(baris > maxInputan) {
					System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");
					System.out.println("Silahkan input kembali.");
					split = false;					
				}
				else {
					split = true;
				}				
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
				split = false;
			}
		}

		vertikal = horizontal = 0;
		kolom = baris;
		int [][] dongle = new int [baris][kolom];

		for(vertikal=0; vertikal<baris; vertikal++) {
			for(horizontal=0; horizontal<kolom; horizontal++) {
				if(( vertikal+horizontal ) >= (baris - 1)) {
					if( (vertikal+horizontal == (baris-1)) || (horizontal == (baris - 1))) {
						dongle[vertikal][horizontal] = 1;
					}
					else {
						dongle[vertikal][horizontal] = ((dongle[vertikal-1][horizontal]) + dongle[vertikal-1][horizontal+1]);	
					}
					System.out.print(dongle[vertikal][horizontal]+ " ");
				}
			}
			System.out.println();
		}
	}
}
/*
	 Program     : Tugas For While - Malik
     Creator     : Khairil
     Created At  : 20 Mei 2018 07:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class MalikForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random num = new Random();

		int inputPencil, pencil, guessPencil, chance, maxChances, point, pointInc, satu, addChance;

		satu = 1;
		point = 0;
		pointInc = 10;
		chance = 5;
		maxChances = 1;
		addChance = 1;

		while(chance >= 1 || point >= pointInc && addChance == 1) {
			System.out.println("Input Jumlah pensil : ");
			inputPencil = keyboard.nextInt();

			pencil = num.nextInt(inputPencil)+satu;
			System.out.println("Input Tebakan pensil : ");
			guessPencil = keyboard.nextInt();

			if(guessPencil == pencil) {
				System.out.println("Tebakan benar !!");
				chance++;
				point+=pointInc;
				System.out.println("Point yang dikumpulkan " + point);
				System.out.println("Kesempatan anda sekarang " + chance);				
			}
			else if(guessPencil != pencil) {
				System.out.println("Tebakan salah !!");
				chance--;
				System.out.println("Kesempatan anda tinggal " + chance);
				
				if(chance == 0) {
					System.out.println("Kesempatan anda habis");
					if(point >= pointInc) {
						System.out.println("Anda ingin menukar 10 poin untuk satu kesempatan ?");
						System.out.println("1. Tukar -- 2. Tidak");
						addChance = keyboard.nextInt();
						if(addChance == 1 && maxChances == 0) {
							chance = 0;
							chance++;
							point-=pointInc;
						}										
					}
					else {
						System.out.println("Poin tidak cukup menambah kesempatan");
						System.out.println("Permainan Berakhir");
						System.out.println("Score Terakhir anda : " + point);
					}
				}				
			}
		}

		System.out.println("Permainan Berakhir");
		System.out.println("Score Terakhir anda : " + point);
	}
}
/*
 * File           : KhairilLooping.java
 * Project Name   : Khairil
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Khairil
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.comp
 * File Created   : Tuesday, 29th May 2018 6:53:02 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 6:53:15 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;
import java.util.Random;

public class KhairilLooping{
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random random = new Random();

		int	qtyQuestion, level, question, number1, number2, comp, player, qtyCorrect, percent;

        qtyCorrect=0;
		number1=0;
        number2=0;
        question=0;

		System.out.print("Masukkan Level (1-6): ");
		level = inputKey.nextInt();
		System.out.print("Masukkan jumlah Soal (1-100): ");
		qtyQuestion = inputKey.nextInt();
		System.out.println();

		do{
			question ++;

			if (level == 1) {
				number1 = random.nextInt(10)+1;
				number2 = random.nextInt(10)+1;
			}
			else if (level == 2) {
				number1 = random.nextInt(90)+11;
				number2 = random.nextInt(90)+11;
			}
			else if (level == 3) {
				number1 = random.nextInt(900)+101;
				number2 = random.nextInt(900)+101;
			}
			else if (level == 4) {
				number1 = random.nextInt(9000)+1001;
				number2 = random.nextInt(9000)+1001;
			}
			else if (level == 5) {
				number1 = random.nextInt(90000)+10001;
				number2 = random.nextInt(90000)+10001;
			}
			else if (level == 6) {
				number1 = random.nextInt(900000)+100001;
				number2 = random.nextInt(900000)+100001;
			}

			System.out.println("Pertanyaan ke " + question);
			System.out.print(number1 + " + " + number2 + " = ");
			comp	= number1 + number2;
			player = inputKey.nextInt();
			if (player == comp) {
				qtyCorrect += 1;
			}

		} while (question < qtyQuestion);

		percent	= qtyCorrect * 100 / qtyQuestion;

		System.out.println();
		System.out.println("Jumlah Soal benar: " + qtyCorrect);

		if (percent < 25) {
			System.out.println("Coba lagi ya! atau ngulang SD nya");
		}
		else if (percent >= 25 && percent < 50) {
			System.out.println("OKE lah masih mending");			
		}
		else if (percent >= 50 && percent < 75) {
			System.out.println("Sip lah masih di atas standar");			
		}
		else if (percent >= 75 && percent < 99) {
			System.out.println("Anda benar-benar matematikawan");			
		}
		else if (percent == 100) {
			System.out.println("PURRFECT!");			
		}
	}
}
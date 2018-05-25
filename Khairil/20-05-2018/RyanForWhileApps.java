/*
	Program     : Tugas For While - Ryan
	Creator     : Khairil
	Created At  : 20 Mei 2018 15:00 PM     
	Updated By  : 
	Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class RyanForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random setNum = new Random();

		String inputTendang, inputTangkap;
		int satu, round, maxRound, kick, kickMax, penendang, komputer, pointpenendang, pointkomputer, totalpoinPenendang, totalpoinKomputer;

		satu = 10;

		System.out.println("====== Adu Penalti =======");
		System.out.println();
		System.out.println("Penendang pertama     : Player");
		System.out.println("Penendang pertama     : Komputer");
		System.out.println("============================");
		System.out.println();
		System.out.println("Let's Start");
		System.out.println();
		System.out.println("♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂♂");

		kickMax = 2;
		pointpenendang = 0;
		pointkomputer = 0;
		totalpoinPenendang = 0;
		totalpoinKomputer = 0;
		round = 1;
		maxRound = 5;
		
		while(round <= maxRound) {
			System.out.println("Round ke " + round);
			System.out.println("=============================");

			kick = 1;
			while(kick <= kickMax) {

				penendang = setNum.nextInt(satu);
				komputer = setNum.nextInt(satu);

				if(kick == 1) {
					System.out.println("Jika Siap menendang, masukkan (tendang)");
					inputTendang = keyboard.next();

					System.out.println(penendang + " vs " + komputer);

					if(inputTendang.equals("tendang")) {
						if(penendang > komputer) {
							System.out.println("GOAAAAAALL!!");
							pointpenendang++;
						}
						else if(penendang == komputer) {
							System.out.println("Ketangkap Bolanya. Sayang sekali");
							pointkomputer++;
						}
						else if(penendang < komputer){
							System.out.println("Tendangan Meleset Jauh!!");
							pointkomputer++;
						}
					}
					else {
						penendang = 0;
						komputer = 0;
						System.out.println("Salah menendang ternyata menendang sukma...");
						pointkomputer++;
					}
				}

				else if(kick == 2) {
					System.out.println("Jika Siap menangkap, masukkan (tangkap)");
					inputTangkap = keyboard.next();				

					System.out.println(penendang + " vs " + komputer);

					if(inputTangkap.equals("tangkap")) {
						if(penendang > komputer) {
							System.out.println("TERTANGKAP BOLANYA! BAGUS!!");
							pointpenendang++;
						}
						else if(penendang == komputer) {
							System.out.println("Yah kebobolan deh gawangnya");
							pointkomputer++;
						}
						else if(penendang < komputer){
							System.out.println("Diterjang tendangan PHP komputer. Ckckckck");
							pointkomputer++;
						}
					}
					else {
						penendang = 0;
						komputer = 0;
						System.out.println("Salah menangkap. Yang ditangkap kok mantan?");
						pointkomputer++;
					}
				}
				kick++;


				System.out.println("Player " + pointpenendang + " Komputer " + pointkomputer);
			}
			round++;
		}

		if(pointpenendang > pointkomputer) {
			System.out.println("Selamat Anda Menang !!!");
		}
		else if(pointpenendang < pointkomputer) {
			System.out.println("Sayang Sekali kalah. Jangan Khawatir... masih ada kesempatan");	
		}
		else if(pointpenendang == pointkomputer) {
			System.out.println("Kerja bagus tim!! Draw tidak apa-apa. Jangan menyerah ya.");
		}
	}
}
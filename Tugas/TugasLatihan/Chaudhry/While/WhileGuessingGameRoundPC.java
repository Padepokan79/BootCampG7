/*
	DATE CREATED : 17 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;
public class WhileGuessingGameRoundPC{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		String inputKata;
		int pointPC, pointRoundPc, pointSementara, pointPlayer, angkaPlayer, angkaRand1, angkaRand2, angkaRand3, jmlRound, angka, angkaRound, round, benar, salah;
		
		angkaRound = 1;
		jmlRound = 1;
		round = 1;
		pointPC = 0;
		pointRoundPc = 0;
		pointPlayer = 0;
		

		while(pointPlayer < 100 && pointPC < 100){
			pointSementara = 0;

			// komputer
			System.out.println("");
			System.out.println("Round "+round);
			System.out.println("Giliran PC :");

				angkaRand1 = rand.nextInt(6) + 1;
				System.out.println("Dadu PC 1: "+angkaRand1);
				angkaRand2 = rand.nextInt(6) + 1;
				System.out.println("Dadu PC 2: "+angkaRand2);
				angkaRand3 = rand.nextInt(6) + 1;
				System.out.println("Dadu PC 3: "+angkaRand3);

			pointPC   = (angkaRand1 + angkaRand2 + angkaRand3); 
			System.out.println("Point Round PC : "+pointPC); 
			pointRoundPc   = pointRoundPc + pointPC; 
			System.out.println("Point Total PC : "+pointRoundPc);
			System.out.println("");
			System.out.println("");


			if (pointPC < 100) {
				angkaPlayer = rand.nextInt(6) + 1;
				System.out.println("Dadu Anda   : "+angkaPlayer);
				pointPlayer = pointPlayer + angkaPlayer;
				if (angkaPlayer == 1 && angkaPlayer > 0) {
					pointPlayer = pointPlayer - 1;
					System.out.println("Point Total : "+pointPlayer);
				}
				System.out.println("Point Total     : " +(pointPlayer));
				System.out.print("Main lagi (ya/tidak) ? ");
				inputKata 	= keyboard.next();
				while (angkaPlayer != 1 && inputKata.equals("ya")) {
					
					if (inputKata.equals("ya")) {
						angkaPlayer = rand.nextInt(6) + 1;
						System.out.println("Dadu Anda   : "+angkaPlayer);

						if (angkaPlayer == 1) {
							pointSementara = 0;
							System.out.println("Point sementara "+pointSementara);
						}else{
							pointSementara = pointSementara + angkaPlayer;
							System.out.println("Point sementara : "+pointSementara);
						}
					}else{
						pointPlayer = pointPlayer + pointSementara;
					}

					System.out.print("Main lagi (ya/tidak) ? ");
					inputKata 	= keyboard.next();
				}
			}


				// angkaPlayer = rand.nextInt(6) + 1;
				// System.out.println("Dadu Anda: "+angkaPlayer);
					
				// if (angkaPlayer == 1 && angkaPlayer > 0) {
				// 	pointPlayer = pointPlayer - 1;
				// 	System.out.println("Point Anda : " + pointPlayer);
				// 	System.out.println("");
				// }else{
				// 	pointPlayer += angkaPlayer;
				// 	System.out.println("Point Anda : " + pointPlayer);
				// 	System.out.println("");
				// }

				// angka = 1;
				// while(angka < 100){
				// 	// Player
				// 	System.out.print("Giliran anda  : (ya/tidak) ");
				// 	inputKata 	= keyboard.next();
				// 	System.out.println("");
					
				// 		if (inputKata.equals("ya")) {
				// 			angkaPlayer = rand.nextInt(6) + 1;
				// 			System.out.println("Dadu Anda: "+angkaPlayer);
							
				// 			if (angkaPlayer == 1) {
				// 				pointSementara = 0;
				// 				System.out.println("Point Round anda : "+pointSementara);
				// 				angka = angka + 100;
				// 			}else{
								
				// 				if (pointPlayer >= 100) {
				// 					System.out.println("KAMUUU MENANG");
				// 					jmlRound = jmlRound + 100;
				// 				}else{
				// 					pointSementara = pointPlayer + angkaPlayer;
				// 					System.out.println("Point Sementara anda : "+pointSementara);
				// 				}
				// 			}

				// 		}else if(inputKata.equals("tidak")){
				// 			pointPlayer = pointSementara;
				// 			System.out.println("Point Total anda : "+pointPlayer);
				// 			System.out.println("");
				// 			pointSementara = 0;
				// 			angka = angka + 100;
				// 		}
					
				// 	angka = angka + 1;
				// }
			

			round++;
			pointPC = pointPC + pointRoundPc;
			pointPlayer = pointPlayer + pointPlayer;
			if (pointPC >= 100) {
				System.out.println("KOMPUTER MENANG");
			}else if (pointPlayer >= 100) {
				System.out.println("KAMUUUU MENANG");
				
			}
		}




	}
}
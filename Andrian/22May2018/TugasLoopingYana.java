/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
	
1. Saat ini Budi mempunyai 200 butir kelereng, dan akan bertambah 20 butir setiap  menit.
	Sedangkan saat ini Man mempunyai 10 butir kelereng dan akan bertambah 40 butir setiap menit. 
	Pada waktu yang sama Tono memiliki kelereng 500 butir dan setiap menit akan bertambah sebanyak nilai dadu yang dikocok Tono. 
	Pada saat jumlah kelereng Man mengejar jumlah kelereng Budi, kelereng Tono juga akan bertambah sebanyak jumlah kelereng Budi saat itu.
	Pada menit berapakah jumlah kelereng Man akan mengejar jumlah kelereng Tono?

-Tono mengocok dadu sebanyak 2 kali.
-pertama saat kelerengnya berjumlah 500 butir,
-kedua saat setelah jumlah kelereng Man mengejar jumlah kelereng Budi
*gunakan random dan perulangan dowhile
*/
	
	import java.util.Scanner;
	import java.util.Random;

	public class TugasLoopingYana {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Random rand = new Random();

			int kelerengTono=500, kelerengBudi=200, kelerengMan=10, diceNumber=0, pertumbuhanKelerengTono=0, 
				pertumbuhanKelerengBudi=20, pertumbuhanKelerengMan=40, waktu=1;
			String kocok;
			System.out.println("====================================================");
			System.out.println("                WELCOME TO THE GAME                 ");
			System.out.println("====================================================");
			System.out.println("Saat ini budi memiliki kelereng "+kelerengBudi);
			System.out.println("Saat ini man memiliki kelereng "+kelerengMan);
			System.out.println("saat ini tono memilki kelereng "+kelerengTono);
			System.out.println("kocok (y/t) ?");
			kocok = key.next();

			if (kocok.equals("y")) {
				diceNumber = rand.nextInt(6)+1;
				System.out.println("angka yang didapat "+diceNumber);
			}
			else {
				pertumbuhanKelerengTono = 0;
			}
			
			while (kelerengMan<=kelerengBudi) {
				System.out.println();
				System.out.println("menit ke "+waktu);
				System.out.println();
				pertumbuhanKelerengTono+=diceNumber;
				kelerengTono+=diceNumber;
				kelerengBudi+=pertumbuhanKelerengBudi;
				kelerengMan+=pertumbuhanKelerengMan;
				System.out.println("Saat ini budi memiliki kelereng "+kelerengBudi);
				System.out.println("Saat ini man memiliki kelereng "+kelerengMan);
				System.out.println("saat ini tono memilki kelereng "+kelerengTono);

				waktu++;
				}

			System.out.println("kocok (y/t) ?");
			kocok = key.next();

			if (kocok.equals("y")) {
				diceNumber = rand.nextInt(6)+1;
				System.out.println("angka yang didapat "+diceNumber);
			}
			else {
				pertumbuhanKelerengTono = 0;
			}

			kelerengTono += kelerengBudi;

			while (kelerengMan<=kelerengTono) {
				System.out.println();
				System.out.println("menit ke "+waktu);
				System.out.println();
				pertumbuhanKelerengTono+=diceNumber;
				kelerengTono+=diceNumber;
				kelerengBudi+=pertumbuhanKelerengBudi;
				kelerengMan+=pertumbuhanKelerengMan;
				System.out.println("Saat ini budi memiliki kelereng "+kelerengBudi);
				System.out.println("Saat ini man memiliki kelereng "+kelerengMan);
				System.out.println("saat ini tono memilki kelereng "+kelerengTono);

				waktu++;
			}


		}
	}
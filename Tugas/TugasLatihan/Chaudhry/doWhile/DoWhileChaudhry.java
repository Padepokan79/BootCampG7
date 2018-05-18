/*
	DATE CREATED : 18 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileChaudhry{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand 	 = new Random();
		char huruf;
		int kesempatan, rondeMax, selisih, benarPlayer, benarKomputer, angka, rondeAwal, angkaRound, angkaRand, round, benar, salah;
		String inputHuruf;
		angkaRound = rondeAwal = 1;
		kesempatan = 2;
		benarPlayer = benarKomputer = 1;
		selisih = 0;

		rondeMax  = 20;



		while(rondeAwal <= rondeMax && benarPlayer < 16 && benarKomputer < 16){

			System.out.println("Ronde : "+(angkaRound++));
			angka = 1;
			huruf = (char) (rand.nextInt(26)+'A');
			System.out.println("Huruf : "+huruf);

			while(angka <= kesempatan){

				System.out.print("Tebak huruf Alphabet :   ");
				inputHuruf 	= keyboard.next();

				if (inputHuruf.charAt(0) == huruf) {
					System.out.println("=========================");
					System.out.println("TEBAKAN BENAR :)");
					angka = kesempatan;
					benarPlayer += 2;
					System.out.println("Nyawa anda : " + benarPlayer);
					System.out.println("Nyawa PC   : " + benarKomputer);
					System.out.println("=========================");
				}
				else{
					if (angka == kesempatan) {
						System.out.println("=========================");
						System.out.println("TEBAKAN SALAH!!");
						benarPlayer -= 1;
						benarKomputer += 2;
						System.out.println("Nyawa anda : "+benarPlayer);
						System.out.println("Nyawa PC   : "+ benarKomputer);	
						System.out.println("=========================");
					}else{
						System.out.println("Coba lagi :)");
					}
				}

				angka = angka + 1;
			}

			if (benarPlayer < 0) {
				System.out.println("Anda sudah tidak memiliki nyawa :( ");
				System.out.println("Dan dinyatakan kalah :( ");
			}
			if (benarPlayer >= 16 || benarKomputer >= 16) {
				System.out.println("");

				if (benarPlayer >= 16) {
					if (rondeAwal <= 8) {
						System.out.println("Keterangan : CHEATER");
					}
					else if (rondeAwal > 8 && rondeAwal <= 11) {
						System.out.println("Keterangan : NICE");
					}
					else if (rondeAwal > 11) {
						System.out.println("Keterangan : NOOB");
					}
				}else{
					System.out.println("Keterangan : Malu maluin kalah sama Komputer :( ");
				}
			}

			rondeAwal = rondeAwal + 1;
		}

			


	}
}
/*
	Created By vikri
	18/05/2018
	15:01
*/
import java.util.Scanner;
import java.util.Random;

public class SoalRyanWhile{
	public static void main(String[] args) {
		int penalti, hasil, randTangkap, randTendang;
		String prnth;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();
		penalti = 1;
		hasil = 0;
		while(penalti<6){
			System.out.print("Masukan Perintah: ");
			prnth=string.next();

			if (prnth.equals("tendang")) {
				randTendang = rand.nextInt();
				randTangkap = rand.nextInt();
				if (randTendang>randTangkap) {
					hasil += 1;
					System.out.println("Pinalti Masuk");
				} else {
					System.out.println("Bola Tertangkap / Pinalti Gagal");
				}
			} else if(prnth.equals("tangkap")){
				randTendang = rand.nextInt();
				randTangkap = rand.nextInt();
				if (randTangkap>randTendang) {
					hasil += 1;
					System.out.println("Bola Berhasil Tertangkap");
				} else {
					System.out.println("Pinalti Masuk/tangkapan gagal");
				}
			} else {
				randTendang = rand.nextInt();
				if (randTendang<0) {
					hasil += 1;
					System.out.println("Salah Perintah tapi kamu menang");
				} else {
					System.out.println("Salah Perintah kamu kalah	");
				}
			}
			penalti++;
		}
		if (hasil >= 3 ) {
			System.out.println("\nU win with score : "+hasil);
		} else {
			System.out.println("\nU Lose with score : "+hasil);
		}
	}	
}
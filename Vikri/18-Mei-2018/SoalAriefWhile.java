/*
	Created By Vikri
	20/05/2018
	12:45
*/
import java.util.Scanner;
import java.util.Random;
public class SoalAriefWhile{
	public static void main(String[] args) {
		int batu, gunting, kertas, kadal, spock;
		int simbol, tentuan;
		String symbol;

		Scanner string = new Scanner(System.in);
		Random rand = new Random();

		batu = 1;
		gunting = 2;
		kertas = 3;
		kadal = 4;
		spock = 5;

		int menang1 = 0, menang3 = 0;
		int	pertandingan = 1;
		String simbol2;
		do{
			System.out.println("\nRound "+pertandingan);
			int ronde = 1;
			int menang2 = 0;
			do{
				System.out.print("Pilih Symbol: ");
				symbol = string.next();

				if (symbol.equals("batu")) {
					simbol = rand.nextInt(5)+1;
					tentuan = simbol+batu;

					if (simbol==1) {
						simbol2 = "Batu";
						System.out.println("Batu VS "+simbol2);
					} else if (simbol==2) {
						simbol2 = "Gunting";
						System.out.println("Batu VS "+simbol2);
					} else if (simbol==3) {
						simbol2 = "Kertas";
						System.out.println("Batu VS "+simbol2);
					} else if (simbol==4) {
						simbol2 = "Kadal";
						System.out.println("Batu VS "+simbol2);
					} else if (simbol==5) {
						simbol2 = "Spock";
						System.out.println("Batu VS "+simbol2);
					} 

					if (tentuan%2==1){
						System.out.println("kamu menang");
						menang1 += 1;
						menang2 += 1;
					} else {
						System.out.println("kamu kalah");
					}
				} else if (symbol.equals("gunting")) {
					simbol = rand.nextInt(5)+1;
					tentuan = simbol+gunting;
					if (simbol==1) {
						simbol2 = "Batu";
						System.out.println("Gunting VS "+simbol2);
					} else if (simbol==2) {
						simbol2 = "Gunting";
						System.out.println("Gunting VS "+simbol2);
					} else if (simbol==3) {
						simbol2 = "Kertas";
						System.out.println("Gunting VS "+simbol2);
					} else if (simbol==4) {
						simbol2 = "Kadal";
						System.out.println("Gunting VS "+simbol2);
					} else if (simbol==5) {
						simbol2 = "Spock";
						System.out.println("Gunting VS "+simbol2);
					} 
					if (tentuan==5||tentuan==6){
						System.out.println("kamu menang");
						menang1 += 1;
						menang2 += 1;
					} else {
						System.out.println("kamu kalah");
					}
				} else if (symbol.equals("kertas")) {
					simbol = rand.nextInt(5)+1;
					tentuan = simbol+kertas;
					if (simbol==1) {
						simbol2 = "Batu";
						System.out.println("Kertas VS "+simbol2);
					} else if (simbol==2) {
						simbol2 = "Gunting";
						System.out.println("Kertas VS "+simbol2);
					} else if (simbol==3) {
						simbol2 = "Kertas";
						System.out.println("Kertas VS "+simbol2);
					} else if (simbol==4) {
						simbol2 = "Kadal";
						System.out.println("Kertas VS "+simbol2);
					} else if (simbol==5) {
						simbol2 = "Spock";
						System.out.println("Kertas VS "+simbol2);
					} 
					if (tentuan==4||tentuan==8){
						System.out.println("kamu menang");
						menang1 += 1;
						menang2 += 1;
					} else {
						System.out.println("kamu kalah");
					}
				} else if (symbol.equals("kadal")) {
					simbol = rand.nextInt(5)+1;
					tentuan = simbol+kadal;
					if (simbol==1) {
						simbol2 = "Batu";
						System.out.println("Kadal VS "+simbol2);
					} else if (simbol==2) {
						simbol2 = "Gunting";
						System.out.println("Kadal VS "+simbol2);
					} else if (simbol==3) {
						simbol2 = "Kertas";
						System.out.println("Kadal VS "+simbol2);
					} else if (simbol==4) {
						simbol2 = "Kadal";
						System.out.println("Kadal VS "+simbol2);
					} else if (simbol==5) {
						simbol2 = "Spock";
						System.out.println("Kadal VS "+simbol2);
					} 
					if (tentuan==9||tentuan==7){
						System.out.println("kamu menang");
						menang1 += 1;
						menang2 += 1;
					} else {
						System.out.println("kamu kalah");
					}
				} else if (symbol.equals("spock")) {
					simbol = rand.nextInt(5)+1;
					tentuan = simbol+spock;
					if (simbol==1) {
						simbol2 = "Batu";
						System.out.println("Spock VS "+simbol2);
					} else if (simbol==2) {
						simbol2 = "Gunting";
						System.out.println("Spock VS "+simbol2);
					} else if (simbol==3) {
						simbol2 = "Kertas";
						System.out.println("Spock VS "+simbol2);
					} else if (simbol==4) {
						simbol2 = "Kadal";
						System.out.println("Spock VS "+simbol2);
					} else if (simbol==5) {
						simbol2 = "Spock";
						System.out.println("Spock VS "+simbol2);
					} 
					if (tentuan==6||tentuan==8){
						System.out.println("kamu menang");
						menang1 += 1;
						menang2 += 1;
					} else {
						System.out.println("kamu kalah");
					}
				} else {
					System.out.println("Tidak diketahui");
					ronde -= 1;
				}
				ronde++;
			}while(ronde<=5);
				if (menang2>=4) {
					System.out.println("you win round "+pertandingan);
					menang3 += 1;
				} else {
					System.out.println("you lose round "+pertandingan);
				}
			pertandingan++;
		}while(pertandingan<=3);
		System.out.println("");
		if (menang3==3) {
			System.out.println("GODSPEED");
		} else if (menang3==2) {
			System.out.println("Palladins");
		} else if (menang3==1) {
			System.out.println("Knight");
		} else if (menang1>=10) {
			System.out.println("Enthusiast");
		} else if (menang1>=8&&menang1<10) {
			System.out.println("Peserta");
		} else {
			System.out.println("Ingin-tahu saja");
		}
	}
}
/*
	Created By Vikri
	16/05/2018
	10:02
*/
import java.util.Scanner;
public class SoalIfRizaldi2{
	public static void main(String[] args) {
		int  dribble, speed, bodyBalance, jump, sPower, accuracy, stamina;
		boolean kelebihan ,cb, wing, str, pelatih, cadangan, wasit;

		Scanner input = new Scanner(System.in);

		System.out.print("Skill Dribble: ");
		dribble = input.nextInt();

		System.out.print("Skill speed: ");
		speed = input.nextInt();

		System.out.print("Skill body balance: ");
		bodyBalance = input.nextInt();

		System.out.print("Skill jump: ");
		jump = input.nextInt();

		System.out.print("Skill Shooting Power: ");
		sPower = input.nextInt();

		System.out.print("Skill accuracy: ");
		accuracy = input.nextInt();

		System.out.print("Skill stamina: ");
		stamina = input.nextInt();

		kelebihan = dribble>2||speed>10||bodyBalance>10||jump>10&&sPower>10||accuracy>10||stamina>10;
		cb = stamina>=8&&bodyBalance>9&&jump>=7&&(speed>=7||stamina==10);
		wing = speed>9&&dribble>9&&stamina>=8;
		str = (stamina>=8&&accuracy==10&&sPower>8)||(stamina>=8&&jump>=9&&speed>=9&&bodyBalance>=9);
		pelatih = dribble==10&&speed==10&&bodyBalance==10&&jump==10&&sPower==10&&accuracy==10&&stamina<4;
		cadangan = dribble==10&&speed==10&&bodyBalance==10&&jump==10&&sPower==10&&accuracy==10&&stamina<8&&stamina>=4;
		wasit = dribble<=2&&speed>2&&bodyBalance<2&&jump<10&&sPower<2&&accuracy<2&&stamina<2;

		if (cb) {
			System.out.print("Posisi yang cocok Adalah: Center Back");
		} else if (wing) {
			System.out.print("Posisi yang cocok Adalah: Winger");
		} else if (str) {
			System.out.print("Posisi yang cocok Adalah: Striker");
		} else if (pelatih) {
			System.out.print("Posisi yang cocok Adalah: pelatih");
		} else if (cadangan) {
			System.out.print("Posisi yang cocok Adalah: cadangan");
		} else if (wasit) {
			System.out.print("Posisi yang cocok Adalah: wasit");
		} else {
			System.out.print("Posisi yang cocok Adalah: Jadi supporter");
		}
	}
}
/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
public class Rizaldi02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int dribble, dribbleMin, speed, speedMin, balance, balanceMin, jump, jumpMin, power, powerMin,
			acc, accMin, stamina, staminaMin, cb, wing, striker, coach, deadMeat, referee, referee2;
		String position;

		System.out.print("skill dribble    :");
		dribble = inputKey.nextInt();

		System.out.print("speed           :");
		speed = inputKey.nextInt();

		System.out.print("body balance    :");
		balance = inputKey.nextInt();

		System.out.print("jump            :");
		jump = inputKey.nextInt();

		System.out.print("shooting power  :");
		power = inputKey.nextInt();

		System.out.print("accuracy        :");
		acc = inputKey.nextInt();

		System.out.print("stamina         :");
		stamina = inputKey.nextInt();

		coach = dribble = speed = balance = jump = power = acc;
		deadMeat = dribble = speed = balance = jump = power = acc;
		referee = dribble = balance = jump = power = acc;
		referee2 = speed = stamina;

		System.out.print("Posisi yang cocok : ");

		if (balance > 9 && jump >= 7 && speed >= 7 && stamina == 10) {
			System.out.print("Center Back");
		}else if (speed > 9 && dribble > 9) {
			System.out.print("WInger");
		}else if ((acc == 10 && power > 8)||(jump >= 9 && speed >= 9 && balance >= 9)) {
			System.out.print("Striker");
		}else if (coach == 10 && stamina < 4) {
			System.out.print("Pelatih");
		}else if ((deadMeat > 9)&&(stamina < 8)) {
			System.out.print("Cadangan Mati");
		}else if ((referee < 2) && (referee2 > 2)) {
			System.out.print("Wasit");
		}else {
			System.out.print("Anda tidak diterima");
		}
	}
}
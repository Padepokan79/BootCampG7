/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfRizaldi2 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int skillDrible, speed, bodybalance, jump, shootingPower,
				accuracy, stamina;

			System.out.println("skala nilai 1 sd 10");
			System.out.println("Inputan");
			System.out.print("Skill Drible \t\t: ");
			skillDrible = key.nextInt();
			System.out.print("speed \t\t\t: ");
			speed = key.nextInt();
			System.out.print("Body balance \t\t: ");
			bodybalance = key.nextInt();
			System.out.print("Jump \t\t\t: ");
			jump = key.nextInt();
			System.out.print("Shooting Power \t\t: ");
			shootingPower = key.nextInt();
			System.out.print("Accuracy \t\t: ");
			accuracy = key.nextInt();
			System.out.print("Stamina \t\t: ");
			stamina = key.nextInt();

			System.out.println("=============================");

			if ( bodybalance>9 && jump>=7 && speed>=7 && stamina==10 ){
				System.out.print("Center Back");
			}
			if (skillDrible==10 && speed==10 && bodybalance==10 && jump==10 && shootingPower==10 && accuracy==10 && stamina<4) {
				System.out.print("Pelatih");
			}
			if (stamina<8) {
				System.out.print("Cadangan Mati");
			}
			if ( speed>9 && skillDrible>9 ) {
				System.out.print("Winger");
			}
			if ( (accuracy==10 && shootingPower>8) || (jump>=9 && speed>=9 && bodybalance>=9) ) {
				System.out.print("Striker");
			}
			if (skillDrible<2  && bodybalance<2 && jump<2 && shootingPower<2 && accuracy<2 ){
				System.out.print("Wasit");
			}
		}
	}
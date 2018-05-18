/*
	DATE CREATED 	: 17 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Rizaldi02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		double inputSkill, inputSpeed, inputBody, inputJump, inputShooting, inputAccurasy, inputStamina;


		System.out.println("==================================");
		System.out.print("Skill drible      : ");
		inputSkill 	= key.nextDouble();

		System.out.print("Speed             : ");
		inputSpeed 	= key.nextDouble(); 

		System.out.print("Body balance      : ");
		inputBody 	= key.nextDouble();

		System.out.print("Jump              : ");
		inputJump 	= key.nextDouble();

		System.out.print("Shooting Power    : ");
		inputShooting 	= key.nextDouble();

		System.out.print("Accuracy          : ");
		inputAccurasy 	= key.nextDouble();

		System.out.print("Stamina           : ");
		inputStamina 	= key.nextDouble();
		System.out.println("==================================");
		

		if (inputBody > 9 && inputJump >= 7 && inputSpeed >= 7 || inputStamina == 10) {
			
			if (inputSkill > 9 && inputSpeed > 9 && inputBody > 9 && inputJump > 9 && inputShooting > 9 && inputAccurasy > 9 && inputStamina < 8) {
				if (inputSkill == 10 && inputSpeed == 10 && inputBody == 10 && inputJump == 10 && inputShooting == 10 && inputAccurasy == 10 && inputStamina < 4) {
					System.out.println("Posisi yang cocok adalah : Pelatih");
				}else{
					System.out.println("Posisi yang cocok adalah : Cadangan mati");
				}
			}else{
				System.out.println("Posisi yang cocok adalah : Center Back");
			}
		}
		else if (inputSpeed > 9 && inputSkill > 9) {
			System.out.println("Posisi yang cocok adalah : Winger");
		}
		else if ((inputAccurasy == 10 && inputShooting > 8) || (inputJump >= 9 && inputSpeed >= 9 && inputBody >= 9)) {
			System.out.println("Posisi yang cocok adalah : Striker");
		}
		else if (inputSkill < 2 && inputSpeed >= 2 && inputBody < 2 && inputJump < 2 && inputShooting < 2 && inputAccurasy < 2 && inputStamina >= 2) {
			System.out.println("Posisi yang cocok adalah : Wasit");
		}

		System.out.println("==================================");



	}
}
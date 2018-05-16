/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	08.50
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfRizaldi2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String posisi="";
		double skill, speed, bal, jump, shot, acc, stam;

		System.out.println("====================================");
		System.out.print("Skill drible   : ");
		skill=scan.nextDouble();
		System.out.print("Speed          : ");
		speed=scan.nextDouble();
		System.out.print("Body balance   : ");
		bal=scan.nextDouble();
		System.out.print("Jump           : ");
		jump=scan.nextDouble();
		System.out.print("Shooting power : ");
		shot=scan.nextDouble();
		System.out.print("Accuracy       : ");
		acc=scan.nextDouble();
		System.out.print("Stamina        : ");
		stam=scan.nextDouble();
		System.out.println("====================================");

		if((bal>9 && jump>=7 && speed>=7) || stam==10)
			posisi+="Center Back\n\t\t\t";
		if(speed>9 && skill>9)
			posisi+="Winger\n\t\t\t";
		if((acc==10 && shot>8) || (jump>=9 && speed>=9 && bal>=9))
			posisi+="Striker\n\t\t\t";
		if(skill==10 && speed==10 && bal==10 && jump==10 && shot==10 && acc==10 && stam<4)
			posisi+="Pelatih\n\t\t\t";
		if(skill>9 && speed>9 && bal>9 && jump>9 && shot>9 && acc>9 && stam<8)
			posisi+="Cadangan Mati\n\t\t\t";
		if(skill<2 && speed>2 && bal<2 && jump<2 && shot<2 && acc<2 && stam>2)
			posisi+="Wasit\n\t\t\t";
		
		System.out.println("Posisi yang cocok adalah : "+posisi);
	}
}
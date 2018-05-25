//Created by:Hendra Kurniawan 
//Date: 19 Mei 2018 Time:8:46 AM
//Modified by :
import java.util.Scanner;

public class BrondongNight{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String gender;
		double penampilan;
		int age;
		boolean izin;

		System.out.print( "Masukan jenis kelamin kamu(cewek/cowok) ? ");
		gender = keyboard.next();
		System.out.print( "Berapa usia kamu ? ");
		age = keyboard.nextInt();
		System.out.print( "Seberapa menarik penampilanmu(skala 1 sampai 10) ? ");
		penampilan = keyboard.nextDouble();

		 
		izin = ( (gender.equals("cewek") && age >= 30 && age <=45 && penampilan >= 8 && penampilan <= 10) || (gender.equals("cowok") && age >=20 && age <=25 && penampilan <= 7 && penampilan >=1));
		System.out.println( "Izin ?" + izin);
	}
}
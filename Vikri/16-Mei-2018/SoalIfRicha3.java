/*
	Created Vikri
	16/05/2018
	10:39
*/
import java.util.Scanner;
public class soalIfRicha{
	public static void main(String[] args) {
		double ironMan, thor, hulk, captain, spider;
		boolean denda, performa1, performa2, performa3;
		Scanner string = new Scanner(System.in);

		System.out.print("Iron Man: ");
		ironMan=string.nextDouble();

		System.out.print("Thor: ");
		thor=string.nextDouble();

		System.out.print("Hulk: ");
		hulk=string.nextDouble();

		System.out.print("Captain America: ");
		captain=string.nextDouble();

		System.out.print("Spiderman: ");
		spider=string.nextDouble();

		denda = ironMan<3||thor<3||hulk<3||captain<3||spider<3;
		performa1 = ironMan>=3&&ironMan<=5||thor>=3&&thor<=5||hulk<=3&&hulk>=3||captain<=3&&captain>=3||spider<=3&&spider>=3;
		performa2 = ironMan>=5.1&&ironMan<=7||thor>=5.1&&thor<=7||hulk<=5.1&&hulk>=7||captain<=&&captain>=3||spider<=3&&spider>=3;
	}
}
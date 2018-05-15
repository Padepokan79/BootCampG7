// vikri
// 14/05/2018
// 9:40
import java.util.Scanner;

public class Ex18D3{
	public static void main(String[] args) {
		int age, minUmur;
		double income, cute;
		boolean kake, nene, ibu, ayah;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();

		System.out.println("Enter your yearly income: ");
		income = keyboard.nextInt();

		System.out.println("How cute are you, on a scale from 0.0 to 10.0: ");
		cute = keyboard.nextDouble();

		if (age >= 30 && income >= 5000000) {
			System.out.println("Kakek Menyetujui");
		} else {
			System.out.println("Kakek Tidak Menyetujui");
		}

		if (age >= 17 && age <= 30 && income >= 5000000 && cute >= 8) {
			System.out.println("ibu Menyetujui");
		} else {
			System.out.println("ibu Tidak Menyetujui");
		}

		minUmur = age - 25;
		if (minUmur <= 5 && income >=5000000 && cute>=8&&cute<=10) {
			System.out.println("ayah Menyetujui");
		} else {
			System.out.println("ayah Tidak Menyetujui");
		}

		if ( age > 25 && age < 40 && ( income > 5000000 || cute >= 8.5 && cute <= 10)) {
			System.out.println("Nene Menyetujui");
		} else {
			System.out.println("Nene tidak Menyetujui");
		}

		kake = age >= 30 && income >= 5000000;
		ibu = age >= 17 && age <= 30 && income >= 5000000 && cute >= 8;
		ayah = minUmur <= 5 && income >=5000000 && cute>=8&&cute<=10;
		nene =  age > 25 && age < 40 && ( income > 5000000 || cute >= 8.5 && cute <= 10);
		
		if ( (kake&&(ayah||ibu||nene)) || (nene&&(kake||ibu||ayah)) || (ibu&&(ayah||kake||nene)) || (ayah&&(kake||ibu||nene)) ) {
			System.out.println("\nAnda disetujui Menikah");
		} else {
			System.out.println("\nAnda tidak disetujui Menikah");
		}
	}
}
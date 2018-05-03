/* 	Date 		: 2/5/2018    
	Time 		: 10:56:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex9Drills2 {
		public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			double pound,inchi,tinggi,berat,bmi,feet,inchifromfeet,totalinchi;

			System.out.print("Your height in feet: ");
			feet = keyboard.nextDouble();

			System.out.print("Your height in inchies: ");
			inchi = keyboard.nextDouble();

			System.out.print("Your Weight in pound: ");
			pound = keyboard.nextDouble();

			inchifromfeet = feet * 12;
			totalinchi = inchi + inchifromfeet;

			tinggi = totalinchi*0.0254;
			berat = pound*0.45;

			bmi = berat / (tinggi*tinggi);

			System.out.print("Your BMI is " + bmi);

		}
	}
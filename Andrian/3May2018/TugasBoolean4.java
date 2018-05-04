/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBoolean4 {
		public static void main(String [] args){
			Scanner keyboard = new Scanner(System.in);
			int usia, usiaminimum, usiamaksimum, usiaminimum2, usiamaksimum2;
			double cantik;
			String gender;
			boolean hasil;

			usiaminimum = 30;
			usiamaksimum = 45;
			usiaminimum2 = 20;
			usiamaksimum2 = 25;
			
			System.out.print("Sebutkan gender anda(cewek/cowok)? ");
			gender = keyboard.next();

			System.out.print("Berapa usia anda? ");
			usia = keyboard.nextInt();

			System.out.print("Seberapa cantik anda dari skala 0.0 hingga 10.0 ?");
			cantik = keyboard.nextDouble();

			hasil = (gender.equals("cewek") && (usia >= usiaminimum && usia <= usiamaksimum ) && cantik >= 8.0 ) || (gender.equals("cowok") && (usia >= usiaminimum2 && usia <= usiamaksimum2 ) && cantik < 8.0 );

			System.out.println("jika true maka anda boleh masuk selain itu dilarang, hasil: " + hasil);
		}
	}
/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBoolean3 {
		public static void main(String [] args){
			Scanner keyboard = new Scanner(System.in);
			int usia, usiaminimum, usiamaksimum;
			double cantik;
			String gender;
			boolean hasil;

			usiaminimum = 21;
			usiamaksimum = 30;
			
			System.out.print("Sebutkan gender anda(cewek/cowok)? ");
			gender = keyboard.next();

			System.out.print("Berapa usia anda? ");
			usia = keyboard.nextInt();

			System.out.print("Seberapa cantik anda dari skala 0.0 hingga 10.0 ?");
			cantik = keyboard.nextDouble();

			hasil = ((gender.equals("cewek")||gender.equals("cowok")) && (usia >= usiaminimum && usia <= usiamaksimum ) && cantik >= 8.0 );

			System.out.println("jika true maka anda boleh masuk selain itu dilarang, hasil: " + hasil);
		}
	}
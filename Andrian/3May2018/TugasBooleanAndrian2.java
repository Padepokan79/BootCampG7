/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanAndrian2 {
		public static void main(String [] args){
			Scanner keyboard = new Scanner(System.in);
			int usia, usiaminimum, penghasilanMinimum, gaji;
			double tinggi, tinggipria, tinggiwanita;
			String gender,ktp;
			boolean hasil;

			penghasilanMinimum = 3000000;
			usiaminimum = 25;
			tinggipria = 160;
			tinggiwanita = 153;
			
			System.out.print("Sebutkan gender anda(cewek/cowok)? ");
			gender = keyboard.next();

			System.out.print("Berapa usia anda? ");
			usia = keyboard.nextInt();

			System.out.println("Apakah anda memilik KTP(ya/tidak)? ");
			ktp = keyboard.next();

			System.out.println("Berapa tinggi badan anda? ");
			tinggi = keyboard.nextDouble();

			System.out.print("Berapa penghasilan anda selama 1 bulan? ");
			gaji = keyboard.nextInt();


			hasil = ( gender.equals("cowok") && usia >= usiaminimum && ktp.equals("ya") && tinggi >= tinggipria && gaji >= penghasilanMinimum ) || ( gender.equals("cewek") && usia >= usiaminimum && ktp.equals("ya") && tinggi >= tinggiwanita && gaji >= penghasilanMinimum );

			System.out.println("jika true maka anda boleh masuk selain itu dilarang, hasil: " + hasil);
		}
	}
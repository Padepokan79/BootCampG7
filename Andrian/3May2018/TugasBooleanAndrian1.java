/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanAndrian1 {
		public static void main(String [] args){
			Scanner keyboard = new Scanner(System.in);
			int usia, nilaihadiah, nilaihadiah1, nilaihadiah2;
			double cantik;
			String gender;
			boolean hasil;

			nilaihadiah1 = 5000000;
			nilaihadiah2 = 20000000;
			
			System.out.print("Sebutkan gender anda(cewek/cowok)? ");
			gender = keyboard.next();

			System.out.print("Berapa usia anda? ");
			usia = keyboard.nextInt();

			System.out.print("Seberapa cantik atau gantengkah anda dari skala 0.0 hingga 10.0 ?");
			cantik = keyboard.nextDouble();

			System.out.print("Sebutkan harga hadiah yang dibawa: ");
			nilaihadiah = keyboard.nextInt();

			hasil = ( nilaihadiah>nilaihadiah1 && cantik >= 8.0 ) || (nilaihadiah>nilaihadiah2 && cantik < 8.0 );

			System.out.println("jika true maka anda boleh masuk selain itu dilarang, hasil: " + hasil);
		}
	}
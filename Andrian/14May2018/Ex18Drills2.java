/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner ;

	public class Ex18Drills2 {
		public static void main(String[] args) {
			Scanner key = new Scanner (System.in);
			int age,ageWanita,ageMinimumKakek,ageMinimumNenek,ageMinimumIbu,ageMinimumAyah,ageMaksimumNenek,ageMaksimumAyah,income,incomeMin;
			double allure,allureMin;
			boolean restuNenek, restuKakek, restuIbu, restuAyah;

			ageWanita = 25;
			ageMinimumKakek = 30;
			ageMinimumNenek = 25;
			ageMinimumIbu = 17;
			ageMinimumAyah = 5;
			ageMaksimumNenek = 40;
			ageMaksimumAyah = 5;
			allureMin = 8.0;
			incomeMin = 5000000;

			System.out.print("Berapa usia anda? ");
			age = key.nextInt();

			System.out.print("Seberapa besar penampilan anda dari skala 0.0 hingga 10.0 ?");
			allure = key.nextDouble();

			System.out.print("Seberapa besar penghasilan anda ?");
			income = key.nextInt();

			restuNenek =  age > 25 && age < 40 && (income > 50000 || allure >= allureMin);
			restuKakek = age >= ageMinimumKakek && allure >= allureMin ;
			restuIbu = (age >= 17 && age < 30 ) && (income > incomeMin && allure > allureMin );
			restuAyah = (age <= ageWanita+5 && age >= ageWanita-5) && (income > incomeMin && allure > allureMin);


			if ( restuNenek ) {
				System.out.println("Ya, kamu disukai loh sama neneknya");
			}
			else {
				System.out.println("No !, neneknya udah ga suka loh");
			}

			if ( restuKakek ) {
				System.out.println("Ya, kamu disukai loh sama kakeknya");
			}
			else {
				System.out.println("No !, kakeknya udah ga suka loh");
			}

			if ( restuIbu ) {
				System.out.println("Ya, kamu disukai loh sama Ibunya");
			}
			else {
				System.out.println("No !, Ibunya udah ga suka loh");
			}

			if ( restuAyah ) {
				System.out.println("Ya, kamu disukai loh sama Ayahnya");
			}
			else {
				System.out.println("No !, Ayahnuya udah ga suka loh");
			}

			if ( !restuNenek && !restuKakek && !restuIbu && !restuAyah) {
				System.out.println("Anda tidak disetujui");
			}

		}
	}
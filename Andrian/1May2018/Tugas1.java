/* 	Date 		: 1/5/2018    
	Time 		: 08:25:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Tugas1 {
		public static void main( String [] args ) {
			int sallary, rcallwn, fctnallwn, taperumcont;
			double famssallwn, cldrnallwn, brtsallary, rtrmcont, fctnexpnscnt, nettosallary, pph, ttlallwn, tkhmpy, sallarycut;

			sallary = 2456700;
			famsallwn = sallary * (10.0/100.0);
			cldrnallwn = (sallary * (2.0/100.0))*2;
			fctnallwn = 500000;
			rcallwn = (13000 * 10)*4;
			ttlallwn = bscsallwn + cldrnallwn + fctnallwn + rcallwn;
			brtsallary = sallary + bscsallwn + cldrnallwn + fctnallwn + rcallwn;
			rtrmcont = brtsallary * (4.75/100.0);
			fctnexpnscnt = brtsallary * (5.0/100.0);
			taperumcont = 10000;
			sallarycut = rtrmcont + fctnexpnscnt + taperumcont;
			nettosallary = brtsallary - rtrmcont - fctnexpnscnt - taperumcont;
			pph = nettosallary * (5/100.0);
			tkhmpy = nettosallary - pph;


			System.out.println( "=====================================");
			System.out.println( "NAMA : Budi Anto\nNIP  : 19020390209" );
			System.out.println( "=====================================");
			System.out.println( "Basic Salary		: " + sallary + "\nTotal Allowance		: " + ttlallwn );
			System.out.println( "=====================================");
			System.out.println( "Bruto Salary		: " + brtsallary);
			System.out.println( "=====================================");
			System.out.println();
			System.out.println( "Salary Cut		: " + sallarycut);
			System.out.println( "=====================================");
			System.out.println( "Netto Salary		: " + nettosallary );
			System.out.println(); 
			System.out.println( "=====================================");
			System.out.println( "PPH Salary		: " + pph );
			System.out.println();
			System.out.println( "Take Home Pay       	:" + tkhmpy);
			System.out.println( "=====================================");
		}
	}
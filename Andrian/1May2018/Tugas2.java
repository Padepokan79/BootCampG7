/* 	Date 		: 1/5/2018    
	Time 		: 08:25:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Tugas2 {
		public static void main( String [] args ){
			double bonus, trnsprt, nol, umkbdg, umkjkt, gjpokokbdg, gjpokokjkt, tnjngnkshtnbdg, tnjngnkshtnjkt, lmbrbdg, lmbrjkt, pph, tkhmpy1, tkhmpy2, tkhmpy3, tkhmpyttl;

			umkbdg = 3091345.56;
			gjpokokbdg = umkbdg * (120.0/100.0);
			umkjkt = 3648035.0;
			gjpokokjkt = umkjkt * (120.0/100.0);
			tnjngnkshtnbdg = (2.0/100.0) * gjpokokbdg;
			tnjngnkshtnjkt = (2.0/100.0) * gjpokokjkt;
			bonus = 500000.0;
			lmbrbdg = 1.5 * (1.0/173.0) * gjpokokbdg;
			lmbrjkt = 1.5 * (1.0/173.0) * gjpokokjkt;
			trnsprt = 750000.0;
			nol = 0.0;


			//Bulan April
			System.out.println( " Sallary Bulan April" );
			System.out.println( "******************************" );
			System.out.println( " Nama : Nurman" );
			System.out.println( " Posisi : Programmer" );
			System.out.println( "******************************" );
			System.out.printf( " Gaji Pokok	: %.2f\n",gjpokokbdg);
			System.out.printf( " T. Kesehatan	: %.2f\n",tnjngnkshtnbdg );
			System.out.printf( " Bonus		: %.2f\n",bonus*2 );
			System.out.printf( " Lembur		: %.2f\n",lmbrbdg*10);
			System.out.println();
			pph = (gjpokokbdg + bonus*2 + tnjngnkshtnbdg + (lmbrbdg*10)) * (5.0/100.0);
			System.out.printf( " PPH		: %.2f\n ",pph );
			System.out.println( "===============================" );
			tkhmpy1 = (gjpokokbdg + tnjngnkshtnbdg + (bonus*2) + (lmbrbdg*10)) - pph;
			System.out.printf( " Take Home Pay	: %.2f\n ",tkhmpy1);
			System.out.println( "===============================" );

			//Bulan Mei
			System.out.println( "\n\n Sallary Bulan Mei" );
			System.out.println( "******************************" );
			System.out.println( " Nama : Nurman" );
			System.out.println( " Posisi : Programmer" );
			System.out.println( "******************************" );
			System.out.printf( " Gaji Pokok	: %.2f\n ",gjpokokbdg);
			System.out.printf( " T. Kesehatan	: %.2f\n ",tnjngnkshtnbdg );
			System.out.printf( " Bonus		: %.2f\n ",nol );
			System.out.printf( " Lembur		: %.2f\n ",lmbrbdg*5);
			System.out.println();
			pph = (gjpokokbdg + nol + tnjngnkshtnbdg + (lmbrbdg*5))*(5.0/100.0);
			System.out.printf( " PPH		: %.2f\n ",pph );
			System.out.println( "===============================" );
			tkhmpy2 = (gjpokokbdg + tnjngnkshtnbdg + nol + (lmbrbdg*5)) - pph;
			System.out.printf( " Take Home Pay	: %.2f\n ",tkhmpy2);
			System.out.println( "===============================" );

			//Bulan Juni
			System.out.println( "\n\n Sallary Bulan Juni" );
			System.out.println( "******************************" );
			System.out.println( " Nama : Nurman" );
			System.out.println( " Posisi : Programmer" );
			System.out.println( "******************************" );
			System.out.printf( " Gaji Pokok	: %.2f\n ",gjpokokjkt);
			System.out.printf( " T. Kesehatan	: %.2f\n ",tnjngnkshtnjkt );
			System.out.printf( " Bonus		: %.2f\n ",bonus );
			System.out.printf( " Lembur		: %.2f\n ",lmbrjkt*12);
			System.out.println();
			pph = (gjpokokjkt + bonus + tnjngnkshtnjkt + trnsprt + (lmbrjkt*12)) * (5.0/100.0);
			System.out.printf( " PPH		: %.2f\n ",pph );
			System.out.println( "===============================" );
			tkhmpy3 = (gjpokokjkt + tnjngnkshtnjkt + bonus + trnsprt + (lmbrjkt*12)) - pph;
			System.out.printf( " Take Home Pay	: %.2f\n ",tkhmpy3);
			System.out.println( "===============================" );

			//Total Gaji selama 3 bulan
			tkhmpyttl = tkhmpy1 + tkhmpy2 +tkhmpy3;
			System.out.printf( "\n\n Take Home Pay	: %.2f\n ",tkhmpyttl);
		}
	}

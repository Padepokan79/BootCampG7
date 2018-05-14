/*
	Data Created 	= 07 Mei 2018
	Author			= Nurdhiat Chaudhary Malik
*/
public class Hendra02{
	public static void main(String[] args){

		double gajiPokok, bonusJuni, projectJuni, gajiTotalJuni, gajiBulanJuni, totalLemburJuni, lemburJuni, totalLemburMei, gajiBulanMei, lemburMei, gajiTotalMei, gajiBulanApril, gajiTotalApril, pph, projectApril, lemburApril, totalLemburApril, bonusApril, umk, totalGajiPokok, tunjanganKesehatan, totalTunjangan, uangBonus, uangLembur, tunjanganTransport; 

			// gaji pokok
			umk 		= 3000000; // menigkuti tempat kerja
			gajiPokok 	= 120.0/100;
			totalGajiPokok = umk*gajiPokok;
		
		//tunjangan kesehatan
		tunjanganKesehatan 	= 2.0/100;
		totalTunjangan 		= totalGajiPokok*tunjanganKesehatan;
			tunjanganTransport 	= 750000; // jika diluar bandung
			uangBonus 	= 500000; // untuk setiap project
			projectApril= 2;
			bonusApril 	= uangBonus*projectApril;

			projectJuni = 1;
			bonusJuni 	= uangBonus*projectJuni;
		uangLembur 	= 1.5*1/173*totalGajiPokok; // per jam
		lemburApril = 10;
		totalLemburApril = uangLembur*lemburApril;

		lemburMei 	= 5;
		totalLemburMei = uangLembur*lemburMei;

		lemburJuni 	= 12;
		totalLemburJuni= uangLembur*lemburJuni;
		
		//potongan
		gajiBulanApril 	= totalGajiPokok + bonusApril + totalLemburApril + totalTunjangan;
		pph 		= 5.0/100;
		gajiTotalApril = gajiBulanApril*pph;

		gajiBulanMei 	= totalGajiPokok + totalLemburMei + totalTunjangan;
		gajiTotalMei 	= gajiBulanMei*pph;

		gajiBulanJuni 	= totalGajiPokok + bonusJuni + totalLemburJuni + totalTunjangan + tunjanganTransport;
		gajiTotalJuni 	= gajiBulanJuni*pph;



		/*
			Gaji Perbulan didapat dari jumlah 
			Gaji Pokok, Bonus, Lembur, Tunjangan Kesehatan, Tunjangan Transportasi
		*/

		System.out.println( "Salary Bulan April" );
		System.out.println( "*******************************" );
		System.out.println( "Nama : Nurwan                  " );
		System.out.println( "Posisi : Programmer            " );
		System.out.println( "*******************************" );
		System.out.println( "Gaji Pokok \t: " + totalGajiPokok );
		System.out.println( "T.Kesehatan \t: " + totalTunjangan );
		System.out.println( "Bonus \t\t: " + bonusApril );
		System.out.println( "Lembur \t\t: " + totalLemburApril );
		System.out.println();
		System.out.println( "PPH \t\t: " + gajiTotalApril );
		System.out.println( "===============================" );
		System.out.println( "Take Home Pay \t: "  );
		System.out.println( "===============================" );

		System.out.println();
		System.out.println();

		System.out.println( "Salary Bulan Mei" );
		System.out.println( "*******************************" );
		System.out.println( "Nama : Nurwan                  " );
		System.out.println( "Posisi : Programmer            " );
		System.out.println( "*******************************" );
		System.out.println( "Gaji Pokok \t: " + totalGajiPokok );
		System.out.println( "T.Kesehatan \t: " + totalTunjangan );
		System.out.println( "Bonus \t\t: " );
		System.out.println( "Lembur \t\t: " + totalLemburMei );
		System.out.println();
		System.out.println( "PPH \t\t: " + gajiTotalMei );
		System.out.println( "===============================" );
		System.out.println( "Take Home Pay \t: "  );
		System.out.println( "===============================" );

		System.out.println();
		System.out.println();

		System.out.println( "Salary Bulan Juni" );
		System.out.println( "*******************************" );
		System.out.println( "Nama : Nurwan                  " );
		System.out.println( "Posisi : Programmer            " );
		System.out.println( "*******************************" );
		System.out.println( "Gaji Pokok \t: " + totalGajiPokok );
		System.out.println( "T.Kesehatan \t: " + totalTunjangan );
		System.out.println( "Bonus \t\t: " + bonusJuni );
		System.out.println( "Lembur \t\t: " + totalLemburJuni );
		System.out.println();
		System.out.println( "PPH \t\t: " + gajiTotalJuni );
		System.out.println( "===============================" );
		System.out.println( "Take Home Pay \t: "  );
		System.out.println( "===============================" );
	}
}
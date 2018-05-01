public class SoalLatihanHendra2 {
	public static void main (String[] args) {

		double umk, pokok, kes, bonus, lembur, trans, pph, gajiApr, gajiAprtot, gajiMei, gajiMeitot, gajiJun, gajiJuntot, pay, umkjkt, pokokjkt, kesjkt, lemburjkt;

		umk = 3091345.56;
		umkjkt = 3648035;
		pokok= 1.2*umk;
		pokokjkt = 1.2* umkjkt;
		kes = 0.02*pokok;
		kesjkt = 0.02*pokokjkt;
		bonus = 500000; //per project
		lembur = 1.5*(0.0057803)*pokok; //uang lembur per jam
		lemburjkt= 1.5*(0.0057803)*pokokjkt;
		trans = 750000; //jika pergi ke luar bandung
		pph = 0.05; // dalam persen

		//Bulan April
		gajiApr = pokok + kes + (bonus*2) + (lembur*10); //sebelum pph
		gajiAprtot = gajiApr - (pph*gajiApr); 

		//Bulan Mei 
		gajiMei = pokok + kes + (lembur*5); //sebelum pph
		gajiMeitot = gajiMei - (pph*gajiMei);

		//Bulan juni 
		gajiJun = pokokjkt + kesjkt + trans + (lemburjkt*12) + bonus; //sebelum pph
		gajiJuntot = gajiJun - (pph*gajiJun);

		pay = gajiAprtot + gajiMeitot + gajiJuntot;



		System.out.println ();
		System.out.println (); 
		System.out.println("Salary Bulan April                   ");
		System.out.println("*************************************");
		System.out.println("NAMA : Nurwan                        ");
		System.out.println("Posisi : Programmer                  ");
		System.out.println("*************************************");
		System.out.println("Gaji Pokok 	: " + Math.ceil(pokok)    );
		System.out.println("T.Kesehatan	: " + Math.ceil(kes)      );
		System.out.println("Bonus       : " + (bonus*2)           );
		System.out.println("Lembur      : " + Math.ceil((lembur*10)));
		System.out.println("                                     ");
		System.out.println("PPH     : " + Math.ceil(gajiApr*0.05) );
		System.out.println("=====================================");
  		System.out.println("Take Home Pay	: " + Math.ceil(gajiAprtot));
  		System.out.println("=====================================");

  		System.out.println ();
		System.out.println (); 
		System.out.println("Salary Bulan Mei                     ");
		System.out.println("*************************************");
		System.out.println("NAMA : Nurwan                        ");
		System.out.println("Posisi : Programmer                  ");
		System.out.println("*************************************");
		System.out.println("Gaji Pokok 	: " + Math.ceil(pokok)    );
		System.out.println("T.Kesehatan	: " + Math.ceil(kes)      );
		System.out.println("Bonus       : " + (bonus*0)           );
		System.out.println("Lembur      : " + Math.ceil((lembur*5)));
		System.out.println("                                     ");
		System.out.println("PPH     : " + Math.ceil(gajiMei*0.05) );
		System.out.println("=====================================");
  		System.out.println("Take Home Pay	: " + Math.ceil(gajiMeitot));
  		System.out.println("=====================================");
  		
  		System.out.println ();
		System.out.println (); 
		System.out.println("Salary Bulan Juni                    ");
		System.out.println("*************************************");
		System.out.println("NAMA : Nurwan                        ");
		System.out.println("Posisi : Programmer                  ");
		System.out.println("*************************************");
		System.out.println("Gaji Pokok 	: " + Math.ceil(pokokjkt)    );
		System.out.println("T.Kesehatan	: " + Math.ceil(kesjkt)      );
		System.out.println("Bonus       : " + (bonus*1)           );
		System.out.println("Lembur      : " + Math.ceil((lemburjkt*12)));
		System.out.println("Transportasi: " + (trans)             );
		System.out.println("                                     ");
		System.out.println("PPH     : " + Math.ceil((gajiJun*0.05)));
		System.out.println("=====================================");
  		System.out.println("Take Home Pay	: " + Math.ceil(gajiJuntot));
  		System.out.println("=====================================");
  		System.out.println ();
  		System.out.printf("Take Home Pay Nurwan selama tiga bulan adalah %.2f rupiah ", pay );

	}
}

/*
 * File           : MalikSoalIf1.java
 * Project Name   : Malik
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Malik
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:00:24 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:01:14 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class MalikSoalIf1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String option, month; 
		int januari, februari, maret, april, mei, juni, juli, agustus, september, oktober, november, desember, hari, daySuperMonth, weekSuperMonth;

        januari=31;
        februari=28;
        maret=31;
        april=30;
        mei=31;
        juni=30;
        juli=31;
        agustus=31;
        september=30;
        oktober=31;
        november=30;
        desember=31;

		System.out.println("\n===============================");
		System.out.print("          Super-Month         ");
		System.out.println("\n===============================");
		System.out.print("Apa yang ingin anda tentukan(nama bulan/jumlah hari) :");
		option = keyboard.nextLine();

		if (option.equals("nama bulan")) {
			System.out.print("Ketikan nama bulan (januari sd desember) : ");
			month = keyboard.next();

            // januari ============
			if (month.equals("januari")) {
				weekSuperMonth = januari/7;
				daySuperMonth = januari%7;

				System.out.println("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// februari ===========
			else if(month.equals("februari")){
			    weekSuperMonth=februari/7;
			    daySuperMonth=februari%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// maret ===========
			else if(month.equals("maret")){
			    weekSuperMonth=maret/7;
			    daySuperMonth=maret%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// april ===========
			else if(month.equals("april")){
			    weekSuperMonth=april/7;
			    daySuperMonth=april%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// mei ===========
			else if(month.equals("mei")){
			    weekSuperMonth=mei/7;
			    daySuperMonth=mei%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// juni ===========
			else if(month.equals("juni")){
			    weekSuperMonth=juni/7;
			    daySuperMonth=juni%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// juli ===========
			else if(month.equals("juli")){
			    weekSuperMonth=juli/7;
			    daySuperMonth=juli%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// agustus ===========
			else if(month.equals("agustus")){
			    weekSuperMonth=agustus/7;
			    daySuperMonth=agustus%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// september ===========
			else if(month.equals("september")){
			    weekSuperMonth=september/7;
			    daySuperMonth=september%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// oktober ===========
			else if(month.equals("oktober")){
			    weekSuperMonth=oktober/7;
			    daySuperMonth=oktober%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// november ===========
			else if(month.equals("november")){
			    weekSuperMonth=november/7;
			    daySuperMonth=november%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			// desember ===========
			else if(month.equals("desember")){
			    weekSuperMonth=desember/7;
			    daySuperMonth=desember%7;

			    System.out.print("jumlah minggu = "+weekSuperMonth+" minggu\nJumlah Hari = "+daySuperMonth+" hari");
			}
			else {
				System.out.println("Punten ngadambel we bulan nyalira");
			}
		}
		else if(option.equals("jumlah hari")){
			System.out.print("Ketikan Jumlah hari : ");
			hari = keyboard.nextInt();
			if (hari == 31) {
				System.out.println("Jumlah bulan 31 hari : januari, maret, mei, juli, agustus, oktober, desember");
			}
			else if (hari == 30) {
				System.out.println("Jumlah bulan 30 hari : april, juni, november");		
			}
			else if (hari == 28){
				System.out.println("Jumlah bulan 28 hari : februari");	
			}
			else{
				System.out.println("Tidak ada bulan dengan jumlah "+hari+" hari");
			}
		}

	}
}
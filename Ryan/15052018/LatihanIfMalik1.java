/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 10:22
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfMalik1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String pilihan, bulan; 
		int januari = 31, februari = 28, maret = 31, april = 30, 
		mei = 31, juni = 30, juli = 31, agustus = 31, september = 30,
		oktober = 31, november = 30, desember = 31;
		int hari;


		System.out.println("\n===============================");
		System.out.print("---------Super Month-----------");
		System.out.println("\n===============================");
		System.out.print("Apa yang ingin anda tentukan(nama bulan/jumlah hari) :");
		pilihan = key.nextLine();

		if (pilihan.equals("nama bulan")) {
			System.out.print("Ketikan nama bulan (januari-desember) : ");
			bulan = key.next();

			if (bulan.equals("januari")) {
				int superMonthMinggu = januari/7;
				int superMonthHari = januari%7;

				System.out.println("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// desember ===========
			else if(bulan.equals("desember")){
			    int superMonthMinggu=desember/7;
			    int superMonthHari=desember%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// november ===========
			else if(bulan.equals("november")){
			    int superMonthMinggu=november/7;
			    int superMonthHari=november%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// oktober ===========
			else if(bulan.equals("oktober")){
			    int superMonthMinggu=oktober/7;
			    int superMonthHari=oktober%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// september ===========
			else if(bulan.equals("september")){
			    int superMonthMinggu=september/7;
			    int superMonthHari=september%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// agustus ===========
			else if(bulan.equals("agustus")){
			    int superMonthMinggu=agustus/7;
			    int superMonthHari=agustus%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// juli ===========
			else if(bulan.equals("juli")){
			    int superMonthMinggu=juli/7;
			    int superMonthHari=juli%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// juni ===========
			else if(bulan.equals("juni")){
			    int superMonthMinggu=juni/7;
			    int superMonthHari=juni%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// mei ===========
			else if(bulan.equals("mei")){
			    int superMonthMinggu=mei/7;
			    int superMonthHari=mei%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// april ===========
			else if(bulan.equals("april")){
			    int superMonthMinggu=april/7;
			    int superMonthHari=april%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// maret ===========
			else if(bulan.equals("maret")){
			    int superMonthMinggu=maret/7;
			    int superMonthHari=maret%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			// februari ===========
			else if(bulan.equals("februari")){
			    int superMonthMinggu=februari/7;
			    int superMonthHari=februari%7;

			    System.out.print("jumlah minggu = "+superMonthMinggu+" minggu\nJumlah Hari = "+superMonthHari+" hari");
			}
			else {
				System.out.println("Punten ngadambel we bulan nyalira");
			}
		}
		else if(pilihan.equals("jumlah hari")){
			System.out.print("Ketikan Jumlah hari : ");
			hari = key.nextInt();
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
import java.util.Scanner;

public class MalikIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	String pilihan, namaBulan;
	int hari, jmlHari, minggu, sisaHari;

	System.out.println("=========================");
	System.out.println("       super month       ");
	System.out.println("=========================");
	System.out.println("apa yang ingin anda tentukan(nama bulan/jumlah hari) :");
	pilihan = keyboard.nextLine ();


	if (pilihan.equals ("nama bulan")) {
		System.out.println("Ketikan nama bulan (januari-desember) : ");
		namaBulan = keyboard.next ();
		if (namaBulan.equals ("januari") || namaBulan.equals ("maret") || namaBulan.equals ("mei") || namaBulan.equals ("juli")|| namaBulan.equals ("agustus") || namaBulan.equals ("oktober") || namaBulan.equals ("desember")) {	
			hari = 31;
		} 
		else if (namaBulan.equals ("april") || namaBulan.equals ("juni") || namaBulan.equals ("september") || namaBulan.equals ("november")) {	
			hari = 30;
		} 
		else {hari = 29;
		}
		System.out.println("jumlah hari: "+ hari + " hari");
		minggu = hari/7;
		sisaHari = hari%7;
		System.out.println("jumlah minggu: " + minggu + " minggu " + sisaHari + " hari");
	}

	else if (pilihan.equals ("jumlah hari")) {
		System.out.println("ketikan jumlah hari : ");
		jmlHari = keyboard.nextInt ();
		if (jmlHari >= 29 && jmlHari <=31) {
			if (jmlHari == 31) {
				System.out.println("jumlah bulan dengan 31 hari : januari, maret, mei, juli, agustus, oktober, desember");
			}
			else if (jmlHari == 30) {
				System.out.println("jumlah bulan dengan 30 hari : april, juni, september, november");
			}
			else {System.out.println("jumlah bulan dengan 29 hari : Februari");
			}
		}
	}
		
}
}



/*2. Andi ingin menentukan statistik bulan, mulai dari januari sampai desember.
   baik berdasarkan nama dan hari. hari maksimal 31 hari. jika jumlah hari kurang
   dari 29 maka tidak ada bulan dengan jumlah hari tsb.

   output :

   ====================
       super month
   ====================
   apa yang ingin anda tentukan(nama bulan/jumlah hari) :

   -- jika "nama bulan" --

   Ketikan nama bulan (januari-desember) : januari

   jumlah hari : 31 hari
   jumlah minggu : 4 minggu 3 hari

   -- jika "jumlah hari" --

   ketikan jumlah hari : 31

   jumlah bulan dengan 31 hari : januari, maret, dst; */

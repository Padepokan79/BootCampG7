/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	11.32
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfMalik2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int jumlah1=31, jumlah2=30, jumlah3=29, hari;
		String jenis, bulan, minggu1="4 minggu 3 hari", minggu2="4 minggu 2 hari", minggu3="4 minggu 1 hari";

		System.out.println("===================");
		System.out.println("   Super Month");
		System.out.println("===================");
		System.out.print("apa yang ingin anda tentukan (nama bulan/jumlah hari): ");
		jenis=scan.nextLine();
		if(jenis.equals("nama bulan")){
			System.out.print("ketikkan nama bulan : ");
			bulan=scan.next();
			if(bulan.equals("januari")||bulan.equals("maret")||bulan.equals("mei")||bulan.equals("juli")||bulan.equals("agustus")||bulan.equals("oktober")||bulan.equals("desember")){
				System.out.println("Jumlah hari   : "+jumlah1);
				System.out.println("Jumlah minggu : "+minggu1);
			}
			else if(bulan.equals("april")||bulan.equals("juni")||bulan.equals("september")||bulan.equals("november")){
				System.out.println("Jumlah hari : "+jumlah2);
				System.out.println("Jumlah minggu : "+minggu2);
			}
			else if(bulan.equals("februari")){
				System.out.println("Jumlah hari : "+jumlah3);
				System.out.println("Jumlah minggu : "+minggu3);
			}
			else
				System.out.println("Tidak ada nama bulan "+bulan);
		}
		else if(jenis.equals("jumlah hari")){
			System.out.print("Ketikkan jumlah hari: ");
			hari=scan.nextInt();
			if(hari==jumlah1)
				System.out.println("jumlah bulan dengan "+hari+" hari : januari, maret, mei, juli, agustus, oktober, desember");
			else if(hari==jumlah2)
				System.out.println("jumlah bulan dengan "+hari+" hari : april, juni, september, november");
			else if(hari==jumlah3)
				System.out.println("jumlah bulan dengan "+hari+" hari : februari");
			else
				System.out.println("Tidak ada bulan dengan "+hari+" hari");
		}
		else
			System.out.println("ERROR");
	}
}
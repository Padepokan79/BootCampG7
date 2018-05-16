/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfMalik2 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);
			int januari=31, februari=29, maret=31, april=30, mei=31, juni=30, juli=31, agustus=31, september=30, oktober=31, novermber=30, desember=31;
			int hari;
			String jenis, bulan, minggu1="4 minggu 3 hari", minggu2="4 minggu 2 hari", minggu3="4 minggu 1 hari";

			System.out.println("================================");
			System.out.println("           Super Month");
			System.out.println("================================");
			System.out.println("apa yang ingin anda tentukan(nama bulan/jumlah hari) :");
			jenis = key.nextLine();

			if (jenis.equals("nama bulan")){
				System.out.println("Ketikan nama bulan (januari-desember) : ");
				bulan = key.nextLine();
				if (bulan.equals("januari")){
					System.out.println("JUmlah hari "+januari);
					System.out.println("jumlah minggu "+minggu1);
				}
				else if (bulan.equals("februari")){
					System.out.println("JUmlah hari "+februari);
					System.out.println("jumlah minggu "+minggu3);
				}
				else if (bulan.equals("maret")){
					System.out.println("JUmlah hari "+maret);
					System.out.println("jumlah minggu "+minggu1);
				}
				else if (bulan.equals("april")){
					System.out.println("JUmlah hari "+april);
					System.out.println("jumlah minggu "+minggu2);
				}
				else if (bulan.equals("mei")){
					System.out.println("JUmlah hari "+mei);
					System.out.println("jumlah minggu "+minggu1);
				}
				else if (bulan.equals("juni")){
					System.out.println("JUmlah hari "+juni);
					System.out.println("jumlah minggu "+minggu2);
				}
				else if (bulan.equals("juli")){
					System.out.println("JUmlah hari "+juli);
					System.out.println("jumlah minggu "+minggu1);
				}
				else if (bulan.equals("agustus")){
					System.out.println("JUmlah hari "+agustus);
					System.out.println("jumlah minggu "+minggu1);
				}
				else if (bulan.equals("september")){
					System.out.println("JUmlah hari "+september);
					System.out.println("jumlah minggu "+minggu2);
				}
				else if (bulan.equals("oktober")){
					System.out.println("JUmlah hari "+oktober);
					System.out.println("jumlah minggu "+minggu1);
				}
				else if (bulan.equals("november")){
					System.out.println("JUmlah hari "+novermber);
					System.out.println("jumlah minggu "+minggu2);
				}
				else if (bulan.equals("desember")){
					System.out.println("JUmlah hari "+desember);
					System.out.println("jumlah minggu "+minggu1);
				}
				else {
					System.out.println("error");
				}
			}
			else if (jenis.equals("jumlah hari")) {
				System.out.println("ketikan jumlah hari : ");
				hari = key1.nextInt();
				if (hari==31) {
					System.out.println("januari, maret, mei, juli, agustus, oktober, desember");
				}
				else if (hari==30) {
					System.out.println("april, juni, sptember, november");
				}
				else if (hari==29) {
					System.out.println("februari");
				}
				else {
					System.out.println("error");
				}
			}
			else {
				System.out.println("error");
			}

		}
	}
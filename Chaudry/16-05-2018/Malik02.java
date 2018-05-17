/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Malik02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);
		int inputHari, maxHari, minHari, hari30, jmlMinggu, hari2, hari3, hari1;
		String inputPilihan, inputBulan;
		maxHari 	= 31;
		minHari 	= 29;
		hari30 		= 30;
		jmlMinggu 	= 4;
		hari2 		= 2;
		hari3 		= 3;
		hari1 		= 1;

		
		System.out.println("=========================================");
		System.out.println("               SUPER MONTH               ");
		System.out.println("=========================================");
		System.out.println("apa yang ingin anda tentukan(nama bulan/jumlah hari) : ");
		inputPilihan 	= key2.nextLine();

		if (inputPilihan.equals("nama bulan")) {
			
			System.out.print("Ketikan nama bulan (januari-desember) :  ");
			inputBulan 	= key.next();

			if (inputBulan.equals("januari")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else if (inputBulan.equals("februari")) {
				System.out.println("Jumlah Hari     : "+minHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari1+" hari");
			}
			else if (inputBulan.equals("maret")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else if (inputBulan.equals("april")) {
				System.out.println("Jumlah Hari     : "+hari30+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari2+" hari");
			}
			else if (inputBulan.equals("mei")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else if (inputBulan.equals("juni")) {
				System.out.println("Jumlah Hari     : "+hari30+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari2+" hari");
			}
			else if (inputBulan.equals("juli")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else if (inputBulan.equals("agustus")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else if (inputBulan.equals("september")) {
				System.out.println("Jumlah Hari     : "+hari30+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari2+" hari");
			}
			else if (inputBulan.equals("oktober")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else if (inputBulan.equals("nopember")) {
				System.out.println("Jumlah Hari     : "+hari30+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari2+" hari");
			}
			else if (inputBulan.equals("desember")) {
				System.out.println("Jumlah Hari     : "+maxHari+" hari");
				System.out.println("Jumlah minggu   : "+jmlMinggu+" minggu "+hari3+" hari");
			}
			else{
				System.out.println("Tidak ada bulan!!");
			}

		}
		else if (inputPilihan.equals("jumlah hari")) {
			
			System.out.print("Ketikan Jumlah hari :  ");
			inputHari 	= key.nextInt();

			if (inputHari <= maxHari && inputHari >= minHari) {
				if (inputHari == maxHari) {
					System.out.println("- Januari\n- Maret\n- Mei\n- Juli\n- Agustus\n- Oktober\n- Desember");
				}
				else if (inputHari == hari30) {
					System.out.println("- April\n- Juni\n- September\n- Nopember");
				}else{
					System.out.println("- Februari");
				}
			}else{
				System.out.println("Tidak ada bulan dengan jumlah hari tersebut!!");
			}
		}
		else{
			System.out.println("Tidak ada dalam pilihan!!");
		}
		
	}
}
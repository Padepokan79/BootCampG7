
import java.util.*;

public class Passenger {
	
	public static void main(String[] args ) {
	
		Kereta kelas1 = new Kereta();
		kelas1.setKelas("Ekonomi");
		kelas1.setHarga(18000);
		
		Kereta kelas2 = new Kereta();
		kelas2.setKelas("Bisnis");
		kelas2.setHarga(35000);		
		
		Kereta kelas3 = new Kereta();
		kelas3.setKelas("Executive");
		kelas3.setHarga(80000);		

		System.out.println(kelas1.sammery());
		System.out.println(kelas2.sammery());
		System.out.println(kelas3.sammery());
		
		ArrayList<Kereta> listKelas = new ArrayList<Kereta>();
		listKelas.add(kelas1);
		listKelas.add(kelas2);
		listKelas.add(kelas3);
		
		//penjualan tiket ekonomi
		ArrayList<Integer> kelasEkonomi = new ArrayList<Integer>();
		kelasEkonomi.add(120);
		kelasEkonomi.add(100);
		kelasEkonomi.add(50);
		kelasEkonomi.add(30);
		kelasEkonomi.add(20);
		kelasEkonomi.add(150);
		kelasEkonomi.add(110);
		
		//penjualan tiket bisnis
		ArrayList<Integer> kelasBisnis = new ArrayList<Integer>();
		kelasBisnis.add(50);
		kelasBisnis.add(15);
		kelasBisnis.add(13);
		kelasBisnis.add(10);
		kelasBisnis.add(20);
		kelasBisnis.add(55);
		kelasBisnis.add(60);

		//penjualan tiket eksekutif
		ArrayList<Integer> kelasExecutive = new ArrayList<Integer>();
		kelasExecutive.add(40);
		kelasExecutive.add(21);
		kelasExecutive.add(11);
		kelasExecutive.add(16);
		kelasExecutive.add(12);
		kelasExecutive.add(35);
		kelasExecutive.add(40);
		
		int i = 1, j = 1, k = 1;
		int eko = 0, bis = 0, exa = 0;
		int totalEkonomiPerHari = 0;
		int totalBisnisPerHari = 0;
		int totalExecutivePerHari = 0;
		int totPenjualanEko = 0;
		int totPenjualanBis = 0;
		int totPenjualanExe = 0;
		int setTotalPerHari = 0;
		
		System.out.println("=============================================");
		for(int jualEkonomi:kelasEkonomi) {
			totalEkonomiPerHari = jualEkonomi * kelas1.getHarga();
			System.out.print("Penjualan Tiket Ekonomi hari ke " + i + " : " + totalEkonomiPerHari + "\n");
			i++;
			totPenjualanEko = totPenjualanEko + totalEkonomiPerHari;
		}

		System.out.println("=============================================");
		for(int jualBisnis:kelasBisnis) {
			totalBisnisPerHari = jualBisnis * kelas2.getHarga();
			System.out.print("Penjualan Tiket Bisnis hari ke " + j + " : " + totalBisnisPerHari + "\n");
			j++;
			totPenjualanBis = totPenjualanBis + totalBisnisPerHari;
		}
		
		System.out.println("=============================================");
		for(int jualExecutive:kelasExecutive) {
			totalExecutivePerHari = jualExecutive * kelas3.getHarga();
			System.out.print("Penjualan Tiket Executive hari ke " + k + " : " + totalExecutivePerHari + "\n");
			k++;
			totPenjualanExe = totPenjualanExe + totalExecutivePerHari;
		}
		System.out.println("=============================================");
		
		for(int jumHari = 0; jumHari < kelasEkonomi.size(); jumHari++) {
			eko = kelasEkonomi.get(jumHari) * kelas1.getHarga();
			bis = kelasBisnis.get(jumHari) * kelas2.getHarga();
			exa = kelasExecutive.get(jumHari) * kelas3.getHarga();
 			setTotalPerHari = eko  + bis + exa;
			System.out.println("Total Penjualan Tiket Hari ke " + (jumHari+1) + "\t : Rp " + setTotalPerHari);
		}
		System.out.println();
		System.out.println("Total Penjualan Ekonomi \t: Rp " + totPenjualanEko);
		System.out.println("Total Penjualan Bisnis \t\t: Rp " + totPenjualanBis);
		System.out.println("Total Penjualan Executive \t: Rp " + totPenjualanExe);
		int totalSeminggu = totPenjualanEko + totPenjualanBis + totPenjualanExe;
		System.out.println("------------------------------------------- +");
		System.out.println("Total Penjualan 7 Hari \t\t: Rp " + totalSeminggu);
	}
}
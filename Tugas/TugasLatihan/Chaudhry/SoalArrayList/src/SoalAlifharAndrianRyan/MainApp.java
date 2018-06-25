/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalAlifharAndrianRyan;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String inputAngka, inputJenis1, inputJenis2;
		int incomeSenin = 0, incomeSelasa = 0, incomeRabu = 0, incomeKamis = 0, incomeJumat = 0, incomeSabtu = 0, incomeMinggu = 0, incomeSeminggu = 0;
		int tiketSenin = 0, tiketSelasa = 0, tiketRabu = 0, tiketKamis = 0, tiketJumat = 0, tiketSabtu = 0, tiketMinggu = 0, tiketSeminggu = 0;
		int tiketBanding1 = 0, tiketBanding2 = 0;
		
		Cinema reguler = new Cinema("Reguler", 120, 45000, 55000, 3, 4, 5, 8, 10, 12, 15);
		Cinema starium = new Cinema("Starium", 150, 50000, 60000, 5, 7, 9, 11, 13, 15, 17);
		Cinema sweetbox = new Cinema("SweetBox", 40, 55000, 70000, 1, 2, 3, 4, 5, 6, 7);
		Cinema velvet = new Cinema("Velvet", 30, 90000, 125000, 1, 1, 1, 2, 3, 4, 1);
		
		ArrayList<Cinema> arrCinema = new ArrayList<Cinema>();
		arrCinema.add(reguler);
		arrCinema.add(starium);
		arrCinema.add(sweetbox);
		arrCinema.add(velvet);
		
		for (Cinema cinema : arrCinema) {
			incomeSenin = cinema.kapasitasSenin*cinema.getHargaWeeks();
			incomeSelasa = cinema.kapasitasSelasa*cinema.getHargaWeeks();
			incomeRabu = cinema.kapasitasRabu*cinema.getHargaWeeks();
			incomeKamis = cinema.kapasitasKamis*cinema.getHargaWeeks();
			incomeJumat = cinema.kapasitasJumat*cinema.getHargaWeeks();
			incomeSabtu = cinema.kapasitasSabtu*cinema.getHargaWeekEnd();
			incomeMinggu = cinema.kapasitasMinggu*cinema.getHargaWeekEnd();
			
			tiketSenin += cinema.kapasitasSenin;
			tiketSelasa += cinema.kapasitasSelasa;
			tiketRabu += cinema.kapasitasRabu;
			tiketKamis += cinema.kapasitasKamis;
			tiketJumat += cinema.kapasitasJumat;
			tiketSabtu += cinema.kapasitasSabtu;
			tiketMinggu += cinema.kapasitasMinggu;
		}
		incomeSeminggu = incomeSenin + incomeSelasa + incomeRabu + incomeKamis + incomeJumat + incomeSabtu + incomeMinggu;
		tiketSeminggu = tiketSenin + tiketSelasa + tiketRabu + tiketKamis + tiketJumat + tiketSabtu + tiketMinggu;
		
		System.out.println("[1] --> Mencari penjualan perhari");
		System.out.println("[2] --> Mencari penjualan perminggu");
		System.out.println("[3] --> Total tiket yang terjual perhari");
		System.out.println("[4] --> Total tiket yang terjual perminggu");
		System.out.println("[5] --> Perbandingan penjualan antara 2 jenis tiket berbeda (perminggu)");
		System.out.print("Masukan pilihan : ");
		inputAngka = key.nextLine();
		
		if (inputAngka.equals("1")) {
			System.out.println("Penjualan hari senin Rp."+incomeSenin);
			System.out.println("Penjualan hari selasa Rp."+incomeSelasa);
			System.out.println("Penjualan hari rabu Rp."+incomeRabu);
			System.out.println("Penjualan hari kamis Rp."+incomeKamis);
			System.out.println("Penjualan hari jumat Rp."+incomeJumat);
			System.out.println("Penjualan hari sabtu Rp."+incomeSabtu);
			System.out.println("Penjualan hari minggu Rp."+incomeMinggu);
		
		}else if (inputAngka.equals("2")) {
			System.out.println("Penjualan selama seminggu Rp."+incomeSeminggu);
		
		}else if(inputAngka.equals("3")) {
			System.out.println("Total tiket terjual hari senin "+tiketSenin);
			System.out.println("Total tiket terjual hari selasa "+tiketSelasa);
			System.out.println("Total tiket terjual hari rabu "+tiketRabu);
			System.out.println("Total tiket terjual hari kamis "+tiketKamis);
			System.out.println("Total tiket terjual hari jumat "+tiketJumat);
			System.out.println("Total tiket terjual hari sabtu "+tiketSabtu);
			System.out.println("Total tiket terjual hari minggu "+tiketMinggu);
		
		}else if (inputAngka.equals("4")) {
			System.out.println("Total tiket terjual selama seminggu "+tiketSeminggu);
		
		}else if (inputAngka.equals("5")) {
			System.out.print("Jenis tiket ke 1 : ");
			inputJenis1 = key.nextLine();
			System.out.print("Jenis tiket ke 2 : ");
			inputJenis2 = key.nextLine();
			
			for (Cinema cinema2 : arrCinema) {
				if (cinema2.jenisTiket.equals(inputJenis1)) {
					tiketBanding1 = (cinema2.kapasitasSenin + cinema2.kapasitasSelasa + cinema2.kapasitasRabu + cinema2.kapasitasKamis + cinema2.kapasitasJumat)*cinema2.getHargaWeeks() + (cinema2.kapasitasSabtu + cinema2.kapasitasMinggu)*cinema2.getHargaWeekEnd();
				}
				if (cinema2.jenisTiket.equals(inputJenis2)) {
					tiketBanding2 = (cinema2.kapasitasSenin + cinema2.kapasitasSelasa + cinema2.kapasitasRabu + cinema2.kapasitasKamis + cinema2.kapasitasJumat)*cinema2.getHargaWeeks() + (cinema2.kapasitasSabtu + cinema2.kapasitasMinggu)*cinema2.getHargaWeekEnd();
				}
			}
			if (tiketBanding1 > tiketBanding2) {
				tiketBanding1 -= tiketBanding2;
			}else if (tiketBanding2 > tiketBanding1) {
				tiketBanding1 = tiketBanding2 - tiketBanding1;
			}
			System.out.println("Perbandingan penjualan antara tiket : "+inputJenis1+" - "+inputJenis2+" sebesar Rp."+tiketBanding1);
		}

	}

}

package bioskop;
import java.util.*;

public class Premiere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputKey = new Scanner(System.in);
		String menu, hari1, hari2, jenisTiket1, jenisTiket2;
		int day, weekDay, week, totalWDay, totalWEnd, totalMingguan, tiketWDay, tiketWEnd, totalTiket, tiket, tiket2;
		
		hari2 = hari1 = menu = "";
		/*jenisTiket1 = jenisTiket2 = */tiket2 = tiket =totalTiket = tiketWDay = tiketWEnd = totalMingguan = totalWEnd = totalWDay = 0; 
		day = 1;
		weekDay = 5;
		week = 7; 
		
		Cinema cnm = new Cinema();
		Cinema reg = new Cinema("Reguler", 45000, 55000, 15, 15, 15, 15, 15, 20, 20); 
		Cinema star = new Cinema("Starium", 50000, 60000, 10, 10, 10, 10, 10, 15, 15);
		Cinema sbox = new Cinema("SweetBox", 55000, 70000, 5, 5, 5, 5, 5, 8, 8);
		Cinema vlv = new Cinema("Velvet", 90000, 125000, 8, 8, 8, 8, 8, 9, 9);
		
		List<Cinema> tktList = new ArrayList<Cinema>();
		List<Integer> tempList = new ArrayList<Integer>();
		tktList.add(reg);
		tktList.add(star);
		tktList.add(sbox);
		tktList.add(vlv);
		System.out.println("Test");
		System.out.println("Masukan Menu Yang diinginkan");
		menu = inputKey.nextLine();
		
		if (menu.equals("1")) {
			System.out.println("1. Penghasilan Perhari");
			for(day=1; day<=week; day++) {
				totalWDay=0;
				for(Cinema obj: tktList) {
					totalWDay+=obj.daily(day);
				}
				System.out.println("Total pemasukan hari "+ cnm.checkDaily(day) + " " + totalWDay);
				cnm.checkDaily(day);
			}
		} else if (menu.equals("2")) {
			System.out.println("2. Penghasilan Perminggu");
			for(day=1; day<=week; day++) {
				totalWDay=0;
				for(Cinema obj: tktList) {
					totalWDay+=obj.daily(day);
				}
				System.out.println("Total pemasukan hari "+ cnm.checkDaily(day) + " " + totalWDay);
				cnm.checkDaily(day);
				totalMingguan+=totalWDay;
			}
			System.out.println("Penjualan Perminggu " + totalMingguan );
		} else if (menu.equals("3")) {
			System.out.println("3. Penjualan Tiket Perhari");
			for(day=1; day<=week; day++) {
				tiketWDay=0;
				for(Cinema obj: tktList) {
					tiketWDay+=obj.dailyTiket(day);
				}
				System.out.println("Total Tiket hari "+ cnm.checkDaily(day) + " " + tiketWDay);
				cnm.checkDaily(day);
			}
		} else if (menu.equals("4")) {
			System.out.println("4. Penjualan Tiket Perminggu");
			for(day=1; day<=week; day++) {
				tiketWDay=0;
				for(Cinema obj: tktList) {
					tiketWDay+=obj.dailyTiket(day);
				}
				System.out.println("Total Tiket hari "+ cnm.checkDaily(day) + " " + tiketWDay);
				cnm.checkDaily(day);
				totalTiket+=tiketWDay;
			}
			System.out.println("Penjualan Perminggu " + totalTiket );
		}  else if (menu.equals("5")) {
			int day1 = 0;
			int day2 = 0;
			System.out.println("5. Perbandingan Penghasilan");
			System.out.println("Masukan Jenis Tiket kesatu");
			jenisTiket1 = inputKey.nextLine();
			System.out.println("Masukan Jenis Tiket Kedua");
			jenisTiket2 = inputKey.nextLine();
			
			if (jenisTiket1.equalsIgnoreCase("Reguler")) {
				tiket = reg.totalTiket();
				System.out.println(tiket);
			} else if (jenisTiket1.equalsIgnoreCase("Starium")) {
				tiket = star.totalTiket();
				System.out.println(tiket);
			} else if (jenisTiket1.equalsIgnoreCase("SweetBox")) {
				tiket = sbox.totalTiket();
				System.out.println(tiket);
			} else if (jenisTiket1.equalsIgnoreCase("Velvet")) {
				tiket = vlv.totalTiket();
				System.out.println(tiket);
			}
			
			if (jenisTiket2.equalsIgnoreCase("Reguler")) {
				tiket2 = reg.totalTiket();
				System.out.println(tiket2);
			} else if (jenisTiket2.equalsIgnoreCase("Starium")) {
				tiket2 = star.totalTiket();
				System.out.println(tiket2);
			} else if (jenisTiket2.equalsIgnoreCase("SweetBox")) {
				tiket2 = sbox.totalTiket();
				System.out.println(tiket2);
			} else if (jenisTiket2.equalsIgnoreCase("Velvet")) {
				tiket2 = vlv.totalTiket();
				System.out.println(tiket2);
			}
		
//			day1=cnm.checkDays(jenisTiket1);
//			System.out.println("Hari Pertama "+ tiket + " " + tempList.get(day1));
//
//			day2=cnm.checkDays(jenisTiket2);
//			System.out.println("Hari Kedua "+ tiket2 + " " + tempList.get(day2));
			
			if (tiket-tiket2==0) {
				System.out.println("Harga Sama");
			}else if (tiket-tiket2>0) {
				System.out.println("Penghasilan hari " + jenisTiket1 + ", Lebih Besar dari " + jenisTiket2);
			}else {
				System.out.println("Penghasilan hari " + jenisTiket2 + ", Lebih Besar dari " + jenisTiket1);
			}
		}
	}

}

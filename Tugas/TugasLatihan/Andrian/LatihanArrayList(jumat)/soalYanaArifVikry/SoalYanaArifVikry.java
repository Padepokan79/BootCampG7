/**
 * 
 */
package soalYanaArifVikry;

import java.util.*;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 2:53:52 PM
 * email : muhamadrifanandrian@gmail.com
 */
public class SoalYanaArifVikry {

	private static Scanner key;

	public static void main(String[] args) {
		key = new Scanner(System.in);
		int pilihan, total=0;
		String hari;
		
		Object roti = new Object("Sari roti cheese", 4500, "senin");
		Object coklat = new Object("Silver queen", 11200, "senin", "selasa", "rabu", "sabtu");
		Object sabun = new Object("lifebouy lemonfresh", 6500, "senin", "rabu");
		Object tisue = new Object("Paseo 200 pl", 11500, "senin", "rabu", "sabtu");
		Object susu = new Object("Ultramilk coklat", 4500, "selasa", "kamis", "jumat", "minggu");
		Object oats = new Object("Quackers oats", 9500, "selasa", "kamis", "jumat");
		Object minuman = new Object("Mogu mogu", 7800, "rabu");
		Object susu2 = new Object("Bear brand", 8500, "kamis");
		Object minuman2 = new Object("Teh kotak", 11200, "jumat");
		Object coklat2 = new Object("Cadbury", 12500, "sabtu");
		Object minuman3 = new Object("Aqua", 2500, "sabtu");
		Object minuman4 = new Object("Floridina", 3200, "minggu");
		Object snack = new Object("Tic tac", 9500, "minggu");

		ArrayList<Object> listBarang = new ArrayList<Object>(Arrays.asList(roti, coklat, sabun, tisue, susu, oats, minuman, susu2, minuman2, coklat2, minuman3, minuman4, snack));
		
		System.out.println("=================================");
		System.out.println("			MINIMARKET");
		System.out.println("=================================");
		System.out.println("1. Penghasilan setiap hari");
		System.out.println("2. Penghasilan seminggu");
		System.out.println("3. Penghasilan sebulan");
		System.out.println("0. Keluar");
		System.out.println();
		System.out.print("Masukan pilihan yang anda inginkan : ");
		pilihan = key.nextInt();
		if (pilihan==1) {
			System.out.print("Masukan hari : ");
			hari = key.next();
			for (Object list : listBarang) {
				for (String namaHari:list.hari) {
					if (hari.equalsIgnoreCase(namaHari)) {
						total+=list.getHargaBarang();
					}
				}
			}
			System.out.println(total);
		}
		else if (pilihan==2) {
			for (Object list : listBarang) {
				for (int muncul=0 ;muncul<list.hari.size(); muncul++) {
					total+=list.getHargaBarang();
				}
			}
			System.out.println(total);
		}
		else if (pilihan==3) {
			for (Object list : listBarang) {
				for (int muncul=0 ;muncul<list.hari.size(); muncul++) {
					total+=list.getHargaBarang()*4;
				}
			}
			System.out.println(total);
		}
	}

}

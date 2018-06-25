/**
 * 
 */
package soal3;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 12:33:05 PM
 * email : muhamadrifanandrian@gmail.com
 */
import java.util.*;
public class Soal3 {

	private static Scanner key;

	public static void main(String[] args) {
		key = new Scanner(System.in);
		int angkaCari=0, cek=0;
		
		ArrayList<Integer> angka = new ArrayList<Integer>();
		angka.add(4);
		angka.add(3);
		angka.add(2);
		angka.add(4);
		angka.add(2);
		angka.add(6);
		angka.add(2);
		angka.add(5);
		angka.add(5);
		angka.add(7);
		angka.add(5);
		angka.add(3);
		angka.add(5);
		angka.add(3);
		angka.add(3);
		angka.add(23);
		angka.add(4);
		angka.add(6);
		angka.add(4);
		angka.add(3);
		angka.add(4);
		angka.add(4);
		angka.add(2);
		angka.add(2);
		
		System.out.println("Masukan angka yang ingin di cari : ");
		angkaCari = key.nextInt();
		for (int cari:angka) {
			cek++;
			if (angkaCari==cari) {
				System.out.print(cek+" ");
			}
		}
	}

}

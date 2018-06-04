//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 2:50 PM
//Modified by :
import java.util.Scanner;

public class StartEndLoop{
	public static void main(String[] args) {
		int n, nAwal, nAkhir;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukan angka mulai    :");
		nAwal = keyboard.nextInt();
		System.out.print("Masukan angka berhenti :");
		nAkhir = keyboard.nextInt();

		for (n = nAwal ; n <= nAkhir; n++)
		{
			System.out.println(n);
		}
	}
}
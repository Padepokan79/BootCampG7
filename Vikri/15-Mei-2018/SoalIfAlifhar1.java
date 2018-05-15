import java.util.Scanner;
public class SoalIfAlifhar1{
	public static void main(String[] args) {
		int ribuan, angka, persen, persen1, persen2, persen3, persen4, ratusan, puluhan;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Angka: ");
		angka = input.nextInt();

		persen = angka%1000;
		persen1 = angka%100;
		persen2 = angka%10;

		ribuan = (persen%100)%10;
		ratusan = persen1%10;
		puluhan = persen2;

		if (angka>=1000&&angka<10000) {
			angka = angka/1000;
			System.out.println("Angka Terdepan "+angka+" angka terbelakang: "+ribuan);
		} else if (angka<1000&&angka>=100) {
			angka = angka/100;
			System.out.println("Angka Terdepan "+angka+"angka terbelakang: "+ratusan);
		} else if (angka<100) {
			angka = angka/10;
			System.out.println("Angka Terdepan "+angka+" angka terbelakang: "+puluhan);
		} else if (angka<10) {
			System.out.println("Angka Terdepan dan terbelakang "+angka);
		} else {
			System.out.println("Angka "+angka+ "Tidak Memenuhi Syarat");
		}
	}
}
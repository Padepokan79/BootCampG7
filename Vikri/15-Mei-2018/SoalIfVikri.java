/*
	Created By Vikri
	15/05/2018
	14:32
*/
import java.util.Scanner;
public class SoalIfVikri{
	public static void main(String[] args) {
		int istri, anak;
		String jKelamin;

		Scanner input = new Scanner(System.in);

		System.out.print("Jenis Kelamin Cucu: ");
		jKelamin=input.next();

		System.out.print("Jumlah istri: ");
		istri=input.nextInt();

		System.out.print("Jumlah anak: ");
		anak=input.nextInt();

		if (jKelamin.equals("pria")){
			if (istri==1) {
				if (anak>2) {
					System.out.println("Selamat anda mendapat mobil");
				} else {
					System.out.println("Yahh ga dapet mobil");
				}
			} else if (istri>=2) {
				if (anak==1) {
					System.out.println("Selamat anda mendapat mobil");
				} else {
					System.out.println("Yahh ga dapet mobil");
				}
			}
		} else {
			System.out.println("Yahh ga dapet mobil");
		}
	}
}
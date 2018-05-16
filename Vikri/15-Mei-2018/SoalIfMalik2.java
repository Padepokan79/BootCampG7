/*
	Created Vikri
	15/05/2018
	13:58
*/
import java.util.Scanner;	
public class SoalIfMalik2{
	public static void main(String[] args) {
		int jujur, bohong, sombong, angkuh, skala;
		Scanner string = new Scanner(System.in);

		System.out.println("===========================");
		System.out.println("    DETECTED UR ATTITUDE");
		System.out.println("===========================");
	
		System.out.print("Skala Jujur Anda: ");
		jujur=string.nextInt();

		System.out.print("Skala Bohong Anda: ");
		bohong=string.nextInt();

		System.out.print("Skala Sombong Anda: ");
		sombong=string.nextInt();

		System.out.print("Skala Angkuh Anda: ");
		angkuh=string.nextInt();

		skala = jujur+bohong+sombong+angkuh;

		if (skala>=15&&skala<35) {
			if (jujur==8) {
				if (bohong<=5) {
					if (sombong<6) {
						if (angkuh<7) {
							System.out.println("Anda Orang Baik");
						}
					}
				}
			} else if (jujur>=9) {
				if (sombong<=2) {
					System.out.println("Anda Orang baik");
				}
			} else{
				System.out.println("Anda kurang Jujur");
			}
		} else if (skala>=35) {
			System.out.println("SELAMAT! Anda sangat baik !");
		} else if (skala<15&&skala>5) {
			System.out.println("Anda bukan orang buruk!");
		} else{
			System.out.println("Anda bukan orang baik!");
		}
	}
}
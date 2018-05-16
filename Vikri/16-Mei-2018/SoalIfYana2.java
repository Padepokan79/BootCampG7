/*
	Created By Vikri
	16/05/2018
	8:29
*/
import java.util.Scanner;
public class SoalIfYana2{
	public static void main(String[] args) {
		int jurusan, semester;
		double ipk;
		String jaringan, rakitan, algoritma, basisdata, strukturData;

		Scanner input = new Scanner(System.in);

		System.out.print("Jurusan: ");
		jurusan=input.nextInt();

		System.out.print("Semester: ");
		semester=input.nextInt();

		System.out.print("Ipk: ");
		ipk=input.nextDouble();

		if (jurusan==345) {
			System.out.print("Nilai prak. algoritma: ");
			algoritma=input.next();

			System.out.print("Nilai prak. Struktur Data: ");
			strukturData=input.next();

			System.out.print("Nilai prak. Basis Data: ");
			basisdata=input.next();
			if (semester>=3&&semester<6) {
				if (ipk>=3.25&&ipk<=4) {
					if (algoritma.equals("A")) {
						if (basisdata.equals("A")||strukturData.equals("A")) {
							System.out.println("Anda Memenuhi Syarat untuk mendaftar beasiswa\nJurusan Teknik komputer");
						} else {
							System.out.println("Maaf Anda tidak berhak menerima beasiswa");
						}
					} else {
						System.out.println("Maaf Anda tidak berhak menerima beasiswa");
					}
				} else {
					System.out.println("Maaf Anda tidak berhak menerima beasiswa");
				}
			} else {
				System.out.println("Maaf Anda tidak berhak menerima beasiswa");
			}
		} else if (jurusan==321) {
			System.out.print("Nilai prak. algoritma: ");
			algoritma=input.next();

			System.out.print("Nilai prak. Struktur Data: ");
			strukturData=input.next();

			System.out.print("Nilai prak. Basis Data: ");
			basisdata=input.next();

			if (semester>=3&&semester<6) {
				if (ipk>=3.25&&ipk<=4) {
					if (algoritma.equals("A")) {
						if (strukturData.equals("B")||basisdata.equals("A")) {
							System.out.println("Anda Memenuhi Syarat untuk mendaftar beasiswa\nJurusan Teknik komputer");
						} else {
							System.out.println("Maaf Anda tidak berhak menerima beasiswa");
						}
					} else {
						System.out.println("Maaf Anda tidak berhak menerima beasiswa");
					}
				} else {
					System.out.println("Maaf Anda tidak berhak menerima beasiswa");
				}
			} else {
				System.out.println("Maaf Anda tidak berhak menerima beasiswa");
			}
		} else if (jurusan==531) {
			System.out.print("Nilai prak. Jaringan: ");
			jaringan=input.next();

			System.out.print("Nilai prak. Rakitan: ");
			rakitan=input.next();
			if (semester==4) {
				if (ipk>=3.25&&ipk<=4) {
					if (jaringan.equals("A")) {
						if (rakitan.equals("A")||rakitan.equals("B")) {
							System.out.println("Anda Memenuhi Syarat untuk mendaftar beasiswa\nJurusan Teknik komputer");
						} else {
							System.out.println("Maaf Anda tidak berhak menerima beasiswa");
						}
					} else {
						System.out.println("Maaf Anda tidak berhak menerima beasiswa");
					}
				} else {
					System.out.println("Maaf Anda tidak berhak menerima beasiswa");
				}
			} else {
				System.out.println("Maaf Anda tidak berhak menerima beasiswa");
			}
		} else{
			System.out.println("Ga jelas");
		}
	}
}
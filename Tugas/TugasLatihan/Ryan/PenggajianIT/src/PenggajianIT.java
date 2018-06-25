import java.util.Scanner;

public class PenggajianIT {
	static Scanner key = new Scanner(System.in);
	static int nik,lamaKerja;
	static String nama,penempatan,posisi,tingkatan,status;
	
	public static void main(String[] args) {
		System.out.println("\n\tPenggajian Karyawan\t\n\t-------------------");
		System.out.print("Nama : ");
		nama = key.next();
		System.out.print("NIK : ");
		nik = key.nextInt();
		System.out.print("Posisi : ");
		posisi = key.next();
		System.out.print("Tingkatan : ");
		tingkatan = key.next();
		System.out.print("Penempatan : ");
		penempatan = key.next();
		System.out.print("Lama Kerja : ");
		lamaKerja = key.nextInt();
		System.out.print("Status (k/bk) : ");
		status = key.next();
		Karyawan karyawan = new Karyawan(nama, nik, posisi, penempatan, lamaKerja);
		karyawan.setUmk();
		if (posisi.equals("Programmer")) {
			Programmer programmer = new Programmer(karyawan, tingkatan, status);
			System.out.println(programmer.toString());
		}
		else if (posisi.equals("Analyst")) {
			Analyst analyst = new Analyst(karyawan, tingkatan, status);
			System.out.println(analyst.toString());
		}
		else if (posisi.equals("Tester")) {
			Tester tester = new Tester(karyawan, tingkatan, status);
			System.out.println(tester.toString());
		}
	}

}

package Gaji;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		String nama, lokasi, grade, posisi, status, tambahan, pilihan;
		int nik, lembur, masaKerja, bonus = 0;
		boolean menikah;
		System.out.print("Masukan nama anda : ");
		nama = key.next();
		System.out.print("Masukan NIK anda : ");
		nik = key.nextInt();
		System.out.print("Masukan lokasi anda : ");
		lokasi = key.next();
		System.out.print("Masukan posisi anda : ");
		posisi = key.next();
		System.out.print("Masukan grade anda : ");
		grade = key.next();
		System.out.print("Masukan masa Kerja anda : ");
		masaKerja = key.nextInt();
		System.out.print("Masukan status anda : ");
		status = key.next();
		if (status.equalsIgnoreCase("Menikah")) {
			menikah = true;
		} else {
			menikah = false;
		}
		System.out.print("Apa ada yang ingin ditambahkan : ");
		tambahan = key.next();
		if (tambahan.equalsIgnoreCase("y")) {
			if (posisi.equalsIgnoreCase("Programmer")) {
				System.out.println("Masukan banyak fixBug : ");
				bonus = key.nextInt();
			} else if (posisi.equalsIgnoreCase("Tester")) {
				System.out.println("Masukan banyak testcase  : ");
				bonus = key.nextInt();
			}
		} else {
			lembur = 0;
		}
//		System.out.print("Apa menggunakan waktu lembur : ");
//		pilihan = key.next();
//		if (pilihan.equalsIgnoreCase("y")) {
//			System.out.println("Masukan banyak jam lembur : ");
//			lembur = key.nextInt();
//		} else {
//			lembur = 0;
//		}
//		
		Karyawan kry = new Karyawan(nama, lokasi, nik);
		Programmer prg = new Programmer(kry, 5, bonus, menikah);
		kry.setPosisi(posisi);
		kry.setGrade(grade);
		kry.setUmkKerja(kry.getPosisi(), kry.getGrade());
		kry.setMasaKerja(masaKerja);
		kry.setUmkKerja(kry.getMasaKerja());
		kry.setPenempatanKerja(lokasi);
		kry.setUmkKerja(kry.getPenempatanKerja());
		prg.getTunjanganTransport(kry.getPenempatanKerja());
		prg.setMenikah(menikah);
		prg.getTunjanganMenikah(prg.isMenikah());
		prg.tunjangan();
		prg.bulananBersih();
		prg.bulananKotor();
		prg.hitungPph(menikah);
		prg.lemburan();
		prg.bonusan();
		prg.getBPJSKesehatan(prg.totalHasil());
		prg.getBPJSKetenagaKerjaan(prg.totalHasil());
		//System.out.println(kry.toString());
		System.out.println(prg.toString());
//		
//		System.out.println(prg.bonusan());
//		System.out.println(kry.getGrade());
//		System.out.println(kry.getGapok());
//		System.out.println(prg.tunjangan());

	}

}
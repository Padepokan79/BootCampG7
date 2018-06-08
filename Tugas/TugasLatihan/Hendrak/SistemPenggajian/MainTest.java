package SistemPenggajianKaryawanIT;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String pilih ="", pilih2="";
		int pilihAngka;
		Validasi val = new Validasi();
		Karyawan kar = new Karyawan();
		Programmer pg = new Programmer();
		
		System.out.println("Menu Penggajian");
		System.out.println("================");
		System.out.println("1.Programmer");
		System.out.println("2.Sistem Analis");
		System.out.println("3.Tester");
		System.out.println("================");
		System.out.print("Masukan Pilihan : ");
		pilih2 = key.next();
		pg.setPosisi(pilih);
		
		if(pilih2.equals("1"))
		{ 	System.out.print("NIK           : ");
			pilih = key.next();
			pg.setNik(pilih);
			System.out.print("Nama          : ");
			pilih = key.next();
			pg.setNama(pilih);
			System.out.print("Menikah (y/n) :");
			pilih = key.next();
			pg.setMenikah(pilih);
				if(pilih.equals("y")) {
					System.out.println("Jumlah Anak :");
					pilih = key.next();
					pilihAngka = Integer.parseInt(pilih);
					pg.setJmlAnak(pilihAngka);
				}
			
			pg.setPosisi("Programmer");
			System.out.print("Tingkatan (junior, middle, senior) : ");
			pilih = key.next();
			pg.setTingkatan(pilih);
			System.out.print("Tempat Kerja      : ");
			pilih = key.next();
			pg.setPenempatan(pilih);
			System.out.print("Jam lembur        : ");
			pilih = key.next();
			pg.setLembur(val.convertToInt(pilih));
		
			System.out.print("Jumlah Fixing Bug : ");
			pilih = key.next();
			pg.setFixingBug(val.convertToInt(pilih));
			System.out.print("Lama kerja        : ");
			pilih = key.next();
			pg.setLamaKerja(val.convertToInt(pilih));
			
			pg.setUmk(pg.getUmk(pg.getPenempatan()));
			pg.hitungBonus(pg.getFixingBug());
			pg.getTunjanganTransport(pg.getPenempatan());
			pg.setGapok(pg.hitungGapok(pg.getTingkatan(), pg.getLamaKerja(), pg.getUmk()));
			pg.getTotalPenghasilan(pg.getGapok(), pg.getTunjanganPegawai(), pg.getTunjanganTransport(pg.getPenempatan()), pg.getTunjanganKeluarga());
			pg.getPPh(pg.getMenikah(), pg.getJmlAnak(), pg.getTunjanganPegawai(), pg.getTunjanganTransport(), pg.getTunjanganKeluarga(), pg.getGapok());
			
			System.out.println(pg.toString());
			
		}
		else if(pilih2.equals("2")){
			pg.setPosisi("Sistem Analis");
		}
		else if(pilih2.equals("3"))
		{   pg.setPosisi("Tester");
			
		}
		


	}

}

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String inputLamaKerja, inputJmlAnak, inputStatus, inputNama, inputNik, inputTmptKerja, inputJamLembur, inputPosisi, inputTingkatan, inputFixBug, inputJmlTest;
		Karyawan ky = new Karyawan();
		
		System.out.println("");
		System.out.print("Nama        : ");
		inputNama 	= key.nextLine();
		System.out.print("NIK         : ");
		inputNik 	= key.nextLine();
		Programmer pg = new Programmer(inputNama, inputNik);
		
		System.out.println("");
		System.out.println("-- POSISI KERJA");
		System.out.println("[1] --> Programmer");
		System.out.println("[2] --> Sistem Analis");
		System.out.println("[3] --> Tester");
		System.out.print("Posisi Kerja  : ");
		inputPosisi 	= key.nextLine();
		
		if(inputPosisi.equals("1")) {
			
		}
		
		pg.setPosisi(inputPosisi);
		
		System.out.println("");
		System.out.println("-- TINGKATAN KERJA");
		System.out.println("[1] --> Junior");
		System.out.println("[2] --> Middle");
		System.out.println("[3] --> Senior");
		System.out.print("Tingkatan  : ");
		inputTingkatan 	= key.nextLine();
		pg.setTingkatan(inputTingkatan);
		
		System.out.print("Penempatan    : ");
		inputTmptKerja 	= key.nextLine();
		pg.setPenempatanKerja(inputTmptKerja);
		
		if(inputPosisi.equals("1")) {
			System.out.print("Fixing bug  : ");
			inputFixBug 	= key.nextLine();
			pg.setFixBug(Integer.parseInt(inputFixBug));
		
		}else if(inputPosisi.equals("3")) {
			System.out.print("TestCase  : ");
			inputJmlTest 	= key.nextLine();
		}
		
		System.out.print("Jumlah jam lembur  : ");
		inputJamLembur 	= key.nextLine();
		pg.setJamLembur(Integer.parseInt(inputJamLembur));
		
		System.out.print("Lama Kerja     : ");
		inputLamaKerja 	= key.nextLine();
		pg.setLamaKerja(Integer.parseInt(inputLamaKerja));
		
		System.out.println("");
		System.out.println("-- STATUS");
		System.out.println("[S] --> Sudah Menikah");
		System.out.println("[B] --> Belum Menikah");
		System.out.print("Input Pilihan  : ");
		inputStatus 	= key.nextLine();
		pg.setMenikah(inputStatus);
		
		if(inputStatus.equals("S")) {
			System.out.print("Jumlah Anak  : ");
			inputJmlAnak 	= key.nextLine();
			pg.setJmlAnak(Integer.parseInt(inputJmlAnak));
		}else {
			pg.setJmlAnak(0);
		}
		
		System.out.println("");
		System.out.println("=============================");
		System.out.println("-- DATA KARYAWAN");
		ky.getUmk(inputTmptKerja);
		pg.hitungTunjanganPegawai(pg.getTingkatan());
		pg.hitungGapok(pg.getLamaKerja(), pg.getTingkatan());
		pg.hitungBonus(pg.getFixBug());
		pg.hitungTunjanganTransport();
		pg.hitungTungjanganKeluarga(inputStatus);
		pg.hitungPotBpjs();
		pg.hitungLembur(Double.parseDouble(inputJamLembur));
		pg.hitungPph();
		pg.tampilData();
	}

}

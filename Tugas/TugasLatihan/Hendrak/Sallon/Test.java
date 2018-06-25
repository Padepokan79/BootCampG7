import java.util.Scanner;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String pilih="", valHuruf="h",valAngka="a",valMenu="m", valUlang = "u";
		int pilihAngka;
		boolean cek=false;
		Date tanggal = new Date();
		
		Visit    vs1 = new Visit("Hendra", "7 Juni 2018");	
		Validasi val = new Validasi();
	do {
		System.out.println("====================");
		System.out.println("Form Data Pengunjung");
		System.out.println("=====================");
		pilih = val.inputDanValidasi("Masukan Nama       : ", pilih, cek, key, valHuruf);
		vs1.setName(pilih);
		pilih = val.inputDanValidasi("Masukan Usia       : ", pilih, cek, key, valAngka);
		vs1.age=val.convertToInt(pilih);
		pilih = val.inputDanValidasi("Masukan Gender(L/P): ", pilih, cek, key, valHuruf);
		vs1.gender=pilih;
		pilih = val.inputDanValidasi("Apkah anda Member (y/n): ", pilih, cek, key, valHuruf);

		if(pilih.equals("y")) {
			vs1.setMember(true);
			System.out.print("Tipe Member");
			System.out.print("\n====================");
			System.out.print("\n1. Premium");
			System.out.print("\n2. Gold");
			System.out.print("\n3. Silver ");
			System.out.print("\n====================");
			pilih = val.inputDanValidasi("\nPilih tipe member 1 s.d 3 : ", pilih, cek, key, valMenu);
			pilihAngka = val.convertToInt(pilih);
			if(pilihAngka == 1) {
				pilih = "premium";
			}
			else if (pilihAngka == 2) {
				pilih = "gold";
			}
			else if (pilihAngka ==3){
				pilih = "silver";
			}
			vs1.setMemberType(pilih);
		}
		else if(pilih.equals("n")) {
			vs1.setMember(false);
			vs1.setMemberType("----");
		}
		
		pilih = val.inputDanValidasi("Masukan harga Service : ", pilih, cek, key, valAngka);
		vs1.setServiceExpanse(val.convertoDouble(pilih));
		pilih = val.inputDanValidasi("Masukan harga Product : ", pilih, cek, key, valAngka);
		vs1.setProductExpanse(val.convertoDouble(pilih));

		System.out.println("Tagihan");
		System.out.println("==================");
		System.out.println(vs1.toString());
		System.out.println(tanggal);
		pilih = val.inputDanValidasi("Ulang (y/n) : ", pilih, cek, key, valUlang);
	}while(pilih.equals("y"));
	
	System.out.println("Program Berhenti!!!");
	}

}

/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Andrian02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		
		String nama, predikat;
		int uts, uas, tugas, nol, dua, empat, enam, delapan, ratus ;
		double nilaiAkhir, percent1, percent2;

		percent1 = 30.0/100; // percent
		percent2 = 40.0/100; // percent
		nol 	= 0;
		dua 	= 20;
		empat 	= 40;
		enam 	= 60;
		delapan = 80;
		ratus 	= 100;



		System.out.println("Range Nilai\tPredikat\tKeterangan");
		System.out.println("80-100\t\tA\t\tLulus");
		System.out.println("60-79\t\tB\t\tLulus");
		System.out.println("40-59\t\tC\t\tTidak Lulus");
		System.out.println("20-39\t\tD\t\tTidak Lulus");
		System.out.println("0-19\t\tE\t\tTidak Lulus");

		System.out.println("=====================================");
		System.out.print("Nama\t: ");
		nama 	= key.next();
		System.out.print("UTS\t: ");
		uts 	= key.nextInt();
		System.out.print("UAS\t: ");
		uas 	= key.nextInt();
		System.out.print("Tugas\t: ");
		tugas 	= key.nextInt();
		System.out.println("=====================================");
		
		nilaiAkhir = (percent1*uts) + (percent1*uas) + (percent2*tugas);
		if (nilaiAkhir <= ratus && nilaiAkhir >= delapan) {
			System.out.println("Selamat "+nama+" predikat yang anda dapatkan A dan anda dinyatakan Lulus");
		}else if (nilaiAkhir < delapan && nilaiAkhir >= enam) {
			System.out.println("Selamat "+nama+" predikat yang anda dapatkan B dan anda dinyatakan Lulus");
		}else if (nilaiAkhir < enam && nilaiAkhir >= empat) {
			System.out.println("Selamat "+nama+" predikat yang anda dapatkan C dan anda dinyatakan Tidak Lulus");
		}else if (nilaiAkhir < empat && nilaiAkhir >= dua) {
			System.out.println("Selamat "+nama+" predikat yang anda dapatkan D dan anda dinyatakan Tidak Lulus");
		}else if (nilaiAkhir < dua && nilaiAkhir >= nol) {
			System.out.println("Selamat "+nama+" predikat yang anda dapatkan E dan anda dinyatakan Tidak Lulus");
		}else{
			System.out.println("Anda tidak terdaftar :)");
		}
	}
}
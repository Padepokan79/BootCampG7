import java.util.ArrayList;

/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class MainAppArrayList {
	public static void main(String[] args) {
		int total = 0;
		int hari01 = 0;       int hari05 = 0;   
		int hari02 = 0;       int hari06 = 0;
		int hari03 = 0;       int hari07 = 0;
		int hari04 = 0;
		
		Kereta krtEko = new Kereta("Ekonomi", 18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta krtBis = new Kereta("Bisnis", 35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta krtEks = new Kereta("Eksekutif", 80000, 40, 21, 11, 16, 12, 35, 40);
		
		ArrayList<Kereta> list = new ArrayList<Kereta>();
		list.add(krtEko);
		list.add(krtBis);
		list.add(krtEks);
		
		for (Kereta kereta : list) {
			hari01 += kereta.getHargaTiket()*kereta.jmlPenumpangSatu;
			hari02 += kereta.getHargaTiket()*kereta.jmlPenumpangDua;
			hari03 += kereta.getHargaTiket()*kereta.jmlPenumpangTiga;
			hari04 += kereta.getHargaTiket()*kereta.jmlPenumpangEmpat;
			hari05 += kereta.getHargaTiket()*kereta.jmlPenumpangLima;
			hari06 += kereta.getHargaTiket()*kereta.jmlPenumpangEnam;
			hari07 += kereta.getHargaTiket()*kereta.jmlPenumpangTujuh;
		}
		
		System.out.println("PT. KERETA API");
		System.out.println("BANDUNG - BEKASI");
		System.out.println("===========================================");
		
		System.out.println("Penghasilan pada hari ke 1 : "+(hari01));
		System.out.println("Penghasilan pada hari ke 2 : "+(hari02));
		System.out.println("Penghasilan pada hari ke 3 : "+(hari03));
		System.out.println("Penghasilan pada hari ke 4 : "+(hari04));
		System.out.println("Penghasilan pada hari ke 5 : "+(hari05));
		System.out.println("Penghasilan pada hari ke 6 : "+(hari06));
		System.out.println("Penghasilan pada hari ke 7 : "+(hari07));
		
		System.out.println("");
		System.out.println("-------------------------------------------");
		total += hari01 + hari02 + hari03 + hari04 + hari05 + hari06 + hari07;		
		System.out.println("Total Penghasilan selama 7 hari : "+total);
		
	}

}

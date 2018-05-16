import java.util.Scanner;

public class VikriIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	String nama, spp;
	double nilaiMTK, nilaiAgama, utang;

	System.out.println("============================");
	System.out.print("Nama: ");
	nama= keyboard.next ();
	System.out.print("Nilai mtk : ");
	nilaiMTK = keyboard.nextDouble ();
	System.out.print("Nilai agama: ");
	nilaiAgama= keyboard.nextDouble ();
	System.out.println("SPP lunas? (Ya/Tidak) ");
	spp = keyboard.next ();
	System.out.println("Berapa utang pembangunan Anda? ");
	utang = keyboard.nextDouble ();
	

	if (!(nama.equals("andi")) && nilaiMTK >= 72 && nilaiAgama >= 75) {
		System.out.println("Selamat kamu dinyatakan naik kelas!");
	}
	else if (spp.equals("Ya") && utang <= 0) {
		System.out.println("Selamat kamu dinyatakan naik kelas!");
	}
	else {
		System.out.println("Maaf kamu tidak naik kelas");
	}

}
}

/*
2. siswa dinyatakan naik kelas jika tidak bernama andi dan nilai mtk tidak dibawah 72 dan nilai agama tidak dibawah 75, tapi bisa juga naik kelas jika spp nya lunas dan utang uang pembangunan tidak lebih dari 0 */

import java.util.Scanner;

public class YanaIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	int semester, jurusan;
	double ipk;
	String jenisJurusan = "tes", nilaiAlgo, nilaiBasData, nilaiStrukData, nilaiJar, nilaiRakit;

	System.out.println("=============================");
	System.out.print("Jurusan : ");
	jurusan = keyboard.nextInt ();

	System.out.print("Semester : ");
	semester = keyboard.nextInt ();
	System.out.print("Ipk : ");
	ipk = keyboard.nextDouble ();

	if (jurusan == 345 || jurusan == 321){
		if (jurusan==345) {
			jenisJurusan = "Teknik Informatika";
		}
		else if (jurusan == 321) {
			jenisJurusan = "Sistem Informatika";
		}
		System.out.print("Nilai prak. Algoritma : ");
		nilaiAlgo = keyboard.next ();
		System.out.print("Nilai prak. Basis Data : ");
		nilaiBasData = keyboard.next ();
		System.out.print ("Nilai prak. Struktur Data: ");
		nilaiStrukData = keyboard.next ();
		if (nilaiAlgo.equals ("A") && (nilaiStrukData.equals ("A") || nilaiBasData.equals ("A")) && ipk >= 3.0 && semester>= 3 && semester <= 5)
		{
			System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan " + jenisJurusan);
		}
		else {System.out.println("Mohon maaf anda tidak bisa mendaftar beasiswa");
		}
	}

	if (jurusan == 531){
		jenisJurusan = "Teknik Komputer";
		System.out.print("Nilai prak. Jaringan : ");
		nilaiJar = keyboard.next ();
		System.out.print("Nilai prak. Rakitan : ");
		nilaiRakit = keyboard.next ();
		if (nilaiJar.equals ("A") && nilaiRakit.equals ("A") && ipk >= 3.25 && semester>= 3 && semester <= 5){
			System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan " + jenisJurusan);
		}
		else {System.out.println("Mohon maaf anda tidak bisa mendaftar beasiswa");
		}
	}

}
}

/*
2. Syarat beasiswa 79

A. Jurusan Teknik Informatika (KODE: 345) & Sistem Informasi (KODE: 321)
Syarat:
- Semester 3 - 5
- ipk min. 3.0
- nilai prak. Algoritma : A
- nilai prak. Basis Data : A atau prak Struktur Data : A

B. Jurusan Teknik Komputer (KODE: 531)
Syarat:
- Semester 3 - 5
- ipk min 3.25
- nilai prak. Jaringan : A
- nilai prak. Rakitan min. : B


Contoh output:

=============================
Jurusan : 531
Semester : 4
Ipk : 3.5
Nilai prak. Jaringan : A
Nilai prak. Rakitan : A

Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer. 
=============================*/
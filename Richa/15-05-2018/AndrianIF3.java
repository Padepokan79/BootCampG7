import java.util.Scanner;

public class AndrianIF3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double nilaiAkhir, uts, uas, tugas;
	String nama, predikat= "INIT", keterangan ="INIT";


	System.out.println("===============================");
	System.out.print ("Nama: ");
	nama= keyboard.next ();
	System.out.print ("UTS: ");
	uts = keyboard.nextDouble ();
	System.out.print ("UAS: ");
	uas= keyboard.nextDouble ();
	System.out.print ("Tugas: ");
	tugas = keyboard.nextDouble ();

	nilaiAkhir = (0.3 * uts) + (0.3*uas) + (0.4*tugas);

	if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
		predikat = "A";
		keterangan = "Lulus";
	}
	else if (nilaiAkhir >= 60 && nilaiAkhir <= 79) {
		predikat = "B";
		keterangan = "Lulus";
	}
	else if (nilaiAkhir >= 40 && nilaiAkhir <= 59) {
		predikat = "C";
		keterangan = "Tidak Lulus";
	}
	else if (nilaiAkhir >=20 && nilaiAkhir <= 39) {
		predikat = "D";
		keterangan = "Tidak Lulus";
	}
	else if (nilaiAkhir >=0 && nilaiAkhir <= 19) {
		predikat = "E";
		keterangan = "Tidak Lulus";
	}


	System.out.println("===============================");
	System.out.println("Selamat " + nama +  " predikat yang anda dapatkan " + predikat + " dan anda dinyatakan "+ keterangan);
}
}


/*3. 	Hitung nilai akhir tingkat kelulusan mahasiswa dengan prosentase 
	30% UTS + 30% UAS + 40% Tugas.

	Input yang di harapkan adalah Nama Mahasiswa, UTS, UAS, dan Tugas. 
	Output yang diharapakan sesuai dengan tabel di bawah ini :
	Range Nilai 	Predikat 	Keterangan
	80 – 100 	A 		Lulus
	60 -79 		B 		Lulus
	40 – 59 	C 		Tidak Lulus
	20 – 39 	D 		Tidak Lulus
	0 – 19 		E 		Tidak Lulus

output:
============================================
Nama		:
UTS		:
UAS		:
Tugas		:
============================================
Selamat "Nama" predikat yang anda dapatkan "predikat" dan anda dinyatakan "keterangan" */
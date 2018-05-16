/*
	 Program     : Soal 2 - Yana
     Creator     : Khairil
     Created At  : 16 Mei 2018 08:35 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class YanaIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String init345, init321, inputNilaiAlgo, inputNilaiBasdat, inputNilaiStrukdat, inputNilaiJaring, inputNilaiRakit;
		int kode345, kode321, kode531, semester, inputJurusan, inputSemester;
		double inputIPK; 
		boolean syarat3432, syarat531;

		System.out.println("=============================");
		System.out.print("Jurusan : ");
		inputJurusan = keyboard.nextInt();

		init345 = "Teknik Informatika";
		init321 = "Teknik Komputer";
		kode345 = 345;
		kode321 = 321;
		kode531 = 531;
		
		if(inputJurusan == kode345 || inputJurusan == kode321) {
			System.out.print("Semester : ");
			inputSemester = keyboard.nextInt();		
			System.out.print("Ipk : ");
			inputIPK = keyboard.nextDouble();					
			System.out.print("Nilai prak. algoritma : ");
			inputNilaiAlgo = keyboard.next();
			System.out.print("Nilai prak. Basis Data : ");
			inputNilaiBasdat = keyboard.next();
			System.out.print("Nilai prak. Struktur Data : ");
			inputNilaiStrukdat = keyboard.next();
			System.out.println();
			System.out.println("=============================");
			System.out.println("Jurusan : " + inputJurusan);
			System.out.println("Semester : " + inputSemester);
			System.out.println("Ipk : " + inputIPK);			
			System.out.println("Nilai prak. algoritma : " + inputNilaiAlgo);
			System.out.println("Nilai prak. Basis Data : " + inputNilaiBasdat);
			System.out.println("Nilai prak. Struktur Data : " + inputNilaiStrukdat);

			syarat3432 =  (inputSemester == 3 || inputSemester == 4 || inputSemester == 5) && inputIPK >= 3.0 && inputNilaiAlgo.equals("A") && ( inputNilaiBasdat.equals("A") || inputNilaiStrukdat.equals("A") );

			if(syarat3432) {
				if(inputJurusan == kode345) {
					System.out.println();
					System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika.");
					System.out.println("=============================");
				}
				else if(inputJurusan == kode321) {
					System.out.println();
					System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Sistem Informasi.");
					System.out.println("=============================");
				}
			}
			else {
				if(inputJurusan == kode345) {
					System.out.println();
					System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika.");
					System.out.println("=============================");
				}
				else if(inputJurusan == kode321) {
					System.out.println();
					System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Sistem Informasi.");
					System.out.println("=============================");
				}
			}


		}
		else if(inputJurusan == kode531) {
			System.out.print("Semester : ");
			inputSemester = keyboard.nextInt();		
			System.out.print("Ipk : ");
			inputIPK = keyboard.nextDouble();					
			System.out.print("Nilai prak. Jaringan : ");
			inputNilaiJaring = keyboard.next();
			System.out.print("Nilai prak. Rakitan : ");
			inputNilaiRakit = keyboard.next();
			System.out.println();
			System.out.println("=============================");
			System.out.println("Jurusan : " + inputJurusan);
			System.out.println("Semester : " + inputSemester);
			System.out.println("Ipk : " + inputIPK);						
			System.out.println("Nilai prak. Jaringan : " + inputNilaiJaring);
			System.out.println("Nilai prak. Rakitan : " + inputNilaiRakit);

			syarat531 = (inputSemester == 3 || inputSemester == 4 || inputSemester == 5) && inputIPK >= 3.25 && inputNilaiJaring.equals("A") && ( inputNilaiJaring.equals("A") || inputNilaiJaring.equals("B") );  

			if(syarat531) {
				System.out.println();
				System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer.");
				System.out.println("=============================");				
			}
			else {
				System.out.println();
				System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer.");
				System.out.println("=============================");								
			}
		}
		else {
			System.out.println("Kode jurusan tidak dikenal");
		}
	}
}
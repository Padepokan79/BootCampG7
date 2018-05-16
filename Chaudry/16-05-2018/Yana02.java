/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Yana02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int tiga, lima, inputJurusan, inputSemester, kodeInformastika, kodeSI, kodeKomputer;
		double minIpk1, minIpk2, inputIpk;
		boolean banding1, banding2;
		String inputAlgor, inputBasis, inputStruktur, inputJardas, inputRakitan;
		kodeInformastika = 345;
		kodeSI 			 = 321;
		kodeKomputer 	 = 531;
		tiga 			 = 3;
		lima 			 = 5;
		minIpk1 		 = 3.0;
		minIpk2 		 = 3.25;

		
		System.out.println("============================================");
		System.out.print("Jurusan      : ");
		inputJurusan = key.nextInt();

		System.out.print("Semester     : ");
		inputSemester = key.nextInt();

		System.out.print("IPK          : ");
		inputIpk = key.nextDouble();

		if (inputJurusan == kodeInformastika || inputJurusan == kodeSI) {
			System.out.print("Nilai Prak. Algoritma     : ");
			inputAlgor = key.next();
			System.out.print("Nilai Prak. Basis Data    : ");
			inputBasis = key.next();
			System.out.print("Nilai Prak. Struktur Data : ");
			inputStruktur = key.next();

			banding1 	= ( inputSemester >= tiga && inputSemester <= lima && inputIpk >= minIpk1 && inputAlgor.equals("A") && (inputBasis.equals("A") || inputStruktur.equals("A")) );
			if (banding1) {
				if (inputJurusan == kodeInformastika) {
					System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika");
				}else if(inputJurusan == kodeSI){
					System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Sistem Informasi");
				}
			}else{
				if (inputJurusan == kodeInformastika) {
					System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika");
				}else if(inputJurusan == kodeSI){
					System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Sistem Informasi");
				}
			}
		}
		else if(inputJurusan == kodeKomputer){
			System.out.print("Nilai Prak. Jaringan     : ");
			inputJardas = key.next();
			System.out.print("Nilai Prak. Rakitan      : ");
			inputRakitan = key.next();

			banding2 	= ( inputSemester >= tiga && inputSemester <= lima && inputIpk >= minIpk2 && inputJardas.equals("A") && (inputRakitan.equals("A") || inputRakitan.equals("B")) );
			if (banding2) {
				System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
			}else{
				System.out.println("Anda tidak memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer");
			}
		}
		else{
			System.out.println("Kode jurusan tidak terdaftar!!");
		}


		System.out.println("============================================");

	}
}
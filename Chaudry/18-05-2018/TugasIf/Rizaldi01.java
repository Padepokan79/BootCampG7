/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Rizaldi01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		double rataNilai, inputIpa, inputIpb, inputIpc, inputIpd, inputIpe, inputIpf, inputIpg, inputIph;
		String keterangan;
		int nilaiA, nilaiA2, nilaiB, nilaiC, nilaiD;
		boolean bobotA, bobotB, bobotC, bobotD, bobotE, bobotPelA, bobotPelB, bobotPelC, bobotPelD, bobotPelE, bobotPelF, bobotPelG, bobotPelH;
		nilaiA  = 10;
		nilaiA2 = 9;
		nilaiB  = 8;
		nilaiC  = 7;
		nilaiD  = 6;

		System.out.println("Inputan =========================================");
		System.out.print("Nilai IPA    : ");
		inputIpa 	= key.nextInt();

		System.out.print("Nilai IPB    : ");
		inputIpb 	= key.nextInt();

		System.out.print("Nilai IPC    : ");
		inputIpc 	= key.nextInt();

		System.out.print("Nilai IPD    : ");
		inputIpd 	= key.nextInt();

		System.out.print("Nilai IPE    : ");
		inputIpe 	= key.nextInt();

		System.out.print("Nilai IPF    : ");
		inputIpf 	= key.nextInt();

		System.out.print("Nilai IPG    : ");
		inputIpg 	= key.nextInt();

		System.out.print("Nilai IPH    : ");
		inputIph 	= key.nextInt();
		System.out.println("=================================================");
		

		rataNilai = (inputIpa+inputIpb+inputIpc+inputIpd+inputIpe+inputIpf+inputIpg+inputIph) / 8;
		bobotA 	  = (rataNilai >= nilaiA2 && rataNilai <= nilaiA);
		bobotB 	  = (rataNilai >= nilaiB && rataNilai < nilaiA2);
		bobotC 	  = (rataNilai >= nilaiC && rataNilai < nilaiB);
		bobotD 	  = (rataNilai >= nilaiD && rataNilai < nilaiC);
		bobotA 	  = (rataNilai < nilaiD);

		bobotPelA = (inputIpa >= nilaiD);
		bobotPelB = (inputIpb >= nilaiD);
		bobotPelC = (inputIpc >= nilaiD);
		bobotPelD = (inputIpd >= nilaiD);
		bobotPelE = (inputIpe >= nilaiD);
		bobotPelF = (inputIpf >= nilaiD);
		bobotPelG = (inputIpg >= nilaiD);
		bobotPelH = (inputIph >= nilaiD);

		if (bobotB || bobotA) {
			
			if (bobotPelA && bobotPelB && bobotPelC && bobotPelD && bobotPelE && (bobotPelF || bobotPelG || bobotPelH)) {
				
				System.out.println("Keterangan : Lulus");
				if (bobotB) {
					System.out.println("Bobot Nilai: B");
				}else{
					System.out.println("Bobot Nilai: A");
				}
				
			}else{
				System.out.println("Keterangan : Tidak Lulus");
				if (bobotB) {
					System.out.println("Bobot Nilai: B");
				}else{
					System.out.println("Bobot Nilai: A");
				}
			}

		}

	}
}
/*
	 Program     : Soal 1 - Rizaldi
     Creator     : Khairil
     Created At  : 16 Mei 2018 10:30 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RizaldiIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String keterangan, bobot, ketLulus, ketTLulus, ketTLulus1, ketGenius, ketMustahil;
		double ipa, ipb, ipc, ipd, ipe, ipf, ipg, iph, totalNilai, rataNilai;
		int satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, sepuluh;
		boolean lulusIpa, lulusIpb, lulusIpc, lulusIpd, lulusIpe, lulusIpf, lulusIpg, lulusIph, gagalIpa, gagalIpb, gagalIpc, gagalIpd, gagalIpe, gagalIpf, gagalIpg, gagalIph, gagalE, lulusE, syaratLulus1, syaratLulus2, syaratLulus3, syaratLulus4, syaratLulus5, syaratLulus6, syaratLulus7, syaratLulus8, syaratLulus9, syaratLulus10, syaratLulus11, syaratLulus12, syaratLulus13, syaratLulus14, syaratLulus15, syaratLulus16, syaratLulus17, syaratLulus18, syaratLulus19, syaratLulus20, syaratLulus21, syaratLulus22, syaratLulus23, syaratLulus24, syaratLulus25, syaratLulus26, syaratLulus27, syaratLulus28, syaratLulus, mustahil, mustahilIpa, mustahilIpb, mustahilIpc, mustahilIpd, mustahilIpe, mustahilIpf, mustahilIpg, mustahilIph, genius, rataNilaiA, rataNilaiB, rataNilaiC, rataNilaiD, rataNilaiE;

		satu = 1; dua = 2; tiga = 3; empat = 4; lima = 5; enam = 6; tujuh = 7;
		delapan = 8; sembilan = 9; sepuluh = 10;

		ketLulus = "Lulus";
		ketTLulus = "Tidak Lulus";
		ketGenius = "Drop Out(Genius)";
		ketMustahil = "Drop Out(Mustahil)";
		ketTLulus1 = "Tidak Lulus Mata Pelajaran";

		System.out.println("inputan ========================================");
		System.out.print("nilai IPA : ");
		ipa = keyboard.nextDouble();
		System.out.print("nilai IPB : ");
		ipb = keyboard.nextDouble();		
		System.out.print("nilai IPC : ");
		ipc = keyboard.nextDouble();
		System.out.print("nilai IPD : ");
		ipd = keyboard.nextDouble();
		System.out.print("nilai IPE : ");
		ipe = keyboard.nextDouble();
		System.out.print("nilai IPF : ");
		ipf = keyboard.nextDouble();
		System.out.print("nilai IPG : ");
		ipg = keyboard.nextDouble();
		System.out.print("nilai IPH : ");
		iph = keyboard.nextDouble();

		System.out.println();

		totalNilai = ipa + ipb + ipc + ipd + ipe + ipf + ipg + iph;
		rataNilai  = totalNilai / delapan;

		rataNilaiA = rataNilai >= sembilan && rataNilai <= sepuluh;
		rataNilaiB = rataNilai >= delapan && rataNilai < sembilan;
		rataNilaiC = rataNilai >= tujuh && rataNilai < delapan;
		rataNilaiD = rataNilai >= enam && rataNilai < tujuh;
		rataNilaiE = rataNilai < enam;

		lulusIpa   = ipa >= enam && ipa <= sepuluh;
		lulusIpb   = ipb >= enam && ipb <= sepuluh;
		lulusIpc   = ipc >= enam && ipc <= sepuluh;
		lulusIpd   = ipd >= enam && ipd <= sepuluh;
		lulusIpe   = ipe >= enam && ipe <= sepuluh;
		lulusIpf   = ipf >= enam && ipf <= sepuluh;
		lulusIpg   = ipg >= enam && ipg <= sepuluh;
		lulusIph   = iph >= enam && iph <= sepuluh;

		mustahilIpa = ipa >= sembilan; mustahilIpb = ipa >= sembilan;
		mustahilIpc = ipc >= sembilan; mustahilIpd = ipd >= sembilan;
		mustahilIpe = ipe >= sembilan; mustahilIpf = ipf >= sembilan;
		mustahilIpg = ipg >= sembilan; mustahilIph = iph >= sembilan;

		gagalIpa   = ipa < enam;	gagalIpb   = ipb < enam;
		gagalIpc   = ipc < enam;	gagalIpd   = ipd < enam;
		gagalIpe   = ipe < enam;	gagalIpf   = ipf < enam;
		gagalIpg   = ipg < enam;	gagalIph   = iph < enam;

		lulusE = lulusIpa || lulusIpb || lulusIpc || lulusIpd || lulusIpe || lulusIpf || lulusIpg || lulusIph;

		gagalE = gagalIpa || gagalIpb || gagalIpc || gagalIpd || gagalIpe || gagalIpf || gagalIpg || gagalIph;

		genius = gagalIpa && gagalIpb && gagalIpc && gagalIpd && gagalIpe && gagalIpf && gagalIpg && gagalIph;

		mustahil = mustahilIpa && mustahilIpb && mustahilIpc && mustahilIpd && mustahilIpe && mustahilIpf && mustahilIpg && mustahilIph;

		syaratLulus1 = lulusIpa && lulusIpb && lulusIpc && lulusIpd && lulusIpe && lulusIpf; //GH
		syaratLulus2 = lulusIpa && lulusIpb && lulusIpc && lulusIpd && lulusIpe && lulusIph; //FG
		syaratLulus3 = lulusIpa && lulusIpb && lulusIpc && lulusIpd && lulusIpe && lulusIpg; //FH
		syaratLulus4 = lulusIpa && lulusIpb && lulusIpc && lulusIpd && lulusIpg && lulusIph; //EF
		syaratLulus5 = lulusIpa && lulusIpb && lulusIpc && lulusIpd && lulusIpf && lulusIph; //EG
		syaratLulus6 = lulusIpa && lulusIpb && lulusIpc && lulusIpd && lulusIpf && lulusIpg; //EH
		syaratLulus7 = lulusIpa && lulusIpb && lulusIpc && lulusIpf && lulusIpg && lulusIph; //DE
		syaratLulus8 = lulusIpa && lulusIpb && lulusIpc && lulusIpe && lulusIpg && lulusIph; //DF
		syaratLulus9 = lulusIpa && lulusIpb && lulusIpc && lulusIpe && lulusIpf && lulusIph; //DG
		syaratLulus10 = lulusIpa && lulusIpb && lulusIpc && lulusIpe && lulusIpf && lulusIpg; //DH
		syaratLulus11 = lulusIpa && lulusIpb && lulusIpe && lulusIpf && lulusIpg && lulusIph; //CD
		syaratLulus12 = lulusIpa && lulusIpb && lulusIpd && lulusIpf && lulusIpg && lulusIph; //CE
		syaratLulus13 = lulusIpa && lulusIpb && lulusIpd && lulusIpe && lulusIpg && lulusIph; //CF
		syaratLulus14 = lulusIpa && lulusIpb && lulusIpd && lulusIpe && lulusIpf && lulusIph; //CG
		syaratLulus15 = lulusIpa && lulusIpb && lulusIpd && lulusIpe && lulusIpf && lulusIph; //CH
		syaratLulus16 = lulusIpa && lulusIpd && lulusIpe && lulusIpf && lulusIpg && lulusIph; //BC
		syaratLulus17 = lulusIpa && lulusIpc && lulusIpe && lulusIpf && lulusIpg && lulusIph; //BD
		syaratLulus18 = lulusIpa && lulusIpc && lulusIpd && lulusIpf && lulusIpg && lulusIph; //BE
		syaratLulus19 = lulusIpa && lulusIpc && lulusIpd && lulusIpe && lulusIpg && lulusIph; //BF
		syaratLulus20 = lulusIpa && lulusIpc && lulusIpd && lulusIpe && lulusIpf && lulusIph; //BG
		syaratLulus21 = lulusIpa && lulusIpc && lulusIpd && lulusIpe && lulusIpf && lulusIpg; //BH
		syaratLulus22 = lulusIpc && lulusIpd && lulusIpe && lulusIpf && lulusIpg && lulusIph; //AB
		syaratLulus23 = lulusIpb && lulusIpd && lulusIpe && lulusIpf && lulusIpg && lulusIph; //AC
		syaratLulus24 = lulusIpb && lulusIpc && lulusIpe && lulusIpf && lulusIpg && lulusIph; //AD
		syaratLulus25 = lulusIpb && lulusIpc && lulusIpd && lulusIpf && lulusIpg && lulusIph; //AE
		syaratLulus26 = lulusIpb && lulusIpc && lulusIpd && lulusIpe && lulusIpg && lulusIph; //AF
		syaratLulus27 = lulusIpb && lulusIpc && lulusIpd && lulusIpe && lulusIpf && lulusIph; //AG
		syaratLulus28 = lulusIpb && lulusIpc && lulusIpd && lulusIpe && lulusIpf && lulusIpg; //AH

		syaratLulus = syaratLulus1 || syaratLulus2 || syaratLulus3 || syaratLulus4 || syaratLulus5 || syaratLulus6 || syaratLulus7 || syaratLulus8 || syaratLulus9 || syaratLulus10 || syaratLulus11 || syaratLulus12 || syaratLulus13 || syaratLulus14 || syaratLulus15 || syaratLulus16 || syaratLulus17 || syaratLulus18 || syaratLulus19 || syaratLulus20 || syaratLulus21 || syaratLulus22 || syaratLulus23 || syaratLulus24 || syaratLulus25 || syaratLulus26 || syaratLulus27 || syaratLulus28;

		System.out.println("=================================================");

		if(lulusE) {
			if( (syaratLulus && gagalE) || (rataNilai > delapan && gagalE)) {
				keterangan = ketTLulus1;
				System.out.println("keterangan  : " + keterangan);
			}
			else if(syaratLulus || rataNilai > delapan) {
				if(mustahil) {
					keterangan = ketMustahil;
					System.out.println("keterangan  : " + keterangan);
				}				
				else {
					keterangan = ketLulus;
					System.out.println("keterangan  : " + keterangan);
				}
			}
			else if(rataNilai < enam) {
				keterangan = ketTLulus;
				System.out.println("keterangan  : " + keterangan);				
			}
			else {
				System.out.println("Benerin lagi codingnya");
			}
		}
		else if(gagalE) {
			if(genius) {
				keterangan = ketGenius;
				System.out.println("keterangan  : " + keterangan);								
			}			
		}
		else {
			System.out.println("Benerin lagi codingnya");			
		}

		if(rataNilaiA) {
			System.out.println("bobot nilai : A");
		}
		else if(rataNilaiB) {
			System.out.println("bobot nilai : B");
		}
		else if(rataNilaiC) {
			System.out.println("bobot nilai : C");
		}
		else if(rataNilaiD) {
			System.out.println("bobot nilai : D");
		}
		else if(rataNilaiE) {
			System.out.println("bobot nilai : E");
		}
	}
}
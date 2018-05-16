/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	08.07
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfRizaldi1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String bobot, keterangan, mapel="";
		int rest=0;
		double ipa, ipb, ipc, ipd, ipe, ipf, ipg, iph, rata, a=9, b=8, c=7, d=6;

		System.out.println("====================================");
		System.out.print("IPA    : ");
		ipa=scan.nextDouble();
		if(ipa<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPA");
			rest+=1;
		}
		System.out.print("IPB    : ");
		ipb=scan.nextDouble();
		if(ipb<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPB");
			rest+=1;
		}
		System.out.print("IPC    : ");
		ipc=scan.nextDouble();
		if(ipc<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPC");
			rest+=1;
		}
		System.out.print("IPD    : ");
		ipd=scan.nextDouble();
		if(ipd<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPD");
			rest+=1;
		}
		System.out.print("IPE    : ");
		ipe=scan.nextDouble();
		if(ipe<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPE");
			rest+=1;
		}
		System.out.print("IPF    : ");
		ipf=scan.nextDouble();
		if(ipf<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPF");
			rest+=1;
		}
		System.out.print("IPG    : ");
		ipg=scan.nextDouble();
		if(ipg<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPG");
			rest+=1;
		}
		System.out.print("IPH    : ");
		iph=scan.nextDouble();
		if(iph<c){
			mapel+=("\n\t\ttidak lulus mata pelajaran IPH");
			rest+=1;
		}
		System.out.println("====================================");

		rata=(ipa+ipb+ipc+ipd+ipe+ipf+ipg+iph)/8;
		
		if(rata>=0 && rata<6)
			bobot="E";
		else if(rata>=6 && rata<7)
			bobot="D";
		else if(rata>=7 && rata<8)
			bobot="C";
		else if(rata>=8 && rata<9)
			bobot="B";
		else
			bobot="A";
		
		if(ipa<d && ipb<d && ipc<d && ipd<d && ipe<d && ipf<d && ipg<d && iph<d)
			keterangan="genius alias diluluskan secara tidak hormat";
		else if(ipa<d || ipb<d || ipc<d || ipd<d || ipe<d || ipf<d || ipg<d || iph<d || rest>2)
			keterangan="tidak lulus";
		else if(ipa>=a && ipb>=a && ipc>=a && ipd>=a && ipe>=a && ipf>=a && ipg>=a && iph>=a)
			keterangan="Mustahil, diluluskan secara tidak hormat";
		else if(rata>=b)
			keterangan="lulus";
		else
			keterangan="tidak lulus";

		System.out.println("Keterangan    : "+keterangan+mapel);
		System.out.println("bobot nilai   : "+bobot);
		System.out.println("=====================================");
	}
}
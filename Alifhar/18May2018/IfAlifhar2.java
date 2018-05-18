/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	13.12
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfAlifhar2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int bil, bel, dep;
		String stat;

		System.out.println("===============================");
		System.out.print("Masukkan bilangan: ");
		bil=scan.nextInt();
		System.out.println("===============================");

		bel=bil%10;
		if(bil<=99){
			dep=bil/10;
			stat="puluhan";
		}
		else if(bil<=999){
			dep=bil/100;
			stat="ratusan";
		}
		else if(bil<=9999){
			dep=bil/1000;
			stat="ribuan";
		}else{
			dep=0;
			stat="salah";
		}

		System.out.println("angka terdepan: "+dep+" dengan nilai "+stat);
		System.out.println("angka paling belakang: "+bel+" dengan nilai satuan");
		System.out.println("===============================");
	}
}

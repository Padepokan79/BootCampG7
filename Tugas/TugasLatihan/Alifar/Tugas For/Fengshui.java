/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	14.42
	* Updated by:
	*
*/
import java.util.Scanner;

public class Fengshui{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String hp, nol, satu, dua, tiga, empat, lima, enam, tujuh, lapan, bilan;

		nol="khusus, special, langka";
		satu="satu, satu-satunya, diri sendiri";
		dua="mudah, gampang, tidak sulit";
		tiga="menemukan, mendapatkan, hidup";
		empat="mati, miskin, susah";
		lima="tidak akan, tidak pernah, tidak bisa";
		enam="menuju, akan";
		tujuh="tepat, hoki, atau bisa disebut juga dengan ketuhanan";
		lapan="makmur";
		bilan="sukses";

		System.out.println("Masukkan No HP anda:");
		hp=scan.next();
		System.out.println();

		for(int i=0;i<hp.length();i++){
			if(hp.charAt(i)=='0')
				System.out.println(hp.charAt(i)+" "+nol);
			if(hp.charAt(i)=='1')
				System.out.println(hp.charAt(i)+" "+satu);
			if(hp.charAt(i)=='2')
				System.out.println(hp.charAt(i)+" "+dua);
			if(hp.charAt(i)=='3')
				System.out.println(hp.charAt(i)+" "+tiga);
			if(hp.charAt(i)=='4')
				System.out.println(hp.charAt(i)+" "+empat);
			if(hp.charAt(i)=='5')
				System.out.println(hp.charAt(i)+" "+lima);
			if(hp.charAt(i)=='6')
				System.out.println(hp.charAt(i)+" "+enam);
			if(hp.charAt(i)=='7')
				System.out.println(hp.charAt(i)+" "+tujuh);
			if(hp.charAt(i)=='8')
				System.out.println(hp.charAt(i)+" "+lapan);
			if(hp.charAt(i)=='9')
				System.out.println(hp.charAt(i)+" "+bilan);
		}
	}
}
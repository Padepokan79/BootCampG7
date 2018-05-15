/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	11.32
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfMalik1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double jaketMin, jaketMaks, kaosMin, kaosMaks, celanaMin, celanaMaks, topiMin, topiMaks, sweaterMin, sweaterMaks;
		double hargaJaket=30000, hargaKaos=10000, hargaCelana=20000, hargaTopi=5000, hargaSweater=15000, maks, gaji=2000000, harga, untung, naik;
		int jaket, kaos, celana, topi, sweater;
		
		jaketMaks=10000; jaketMin=6000; kaosMaks=4000; kaosMin=2000; celanaMaks=8000; celanaMin=3200; topiMaks=0.3*jaketMaks; topiMin=0.7*topiMaks; sweaterMaks=0.25*(jaketMaks+kaosMaks+celanaMaks+topiMaks); sweaterMin=0.8*topiMaks;
		//System.out.println("jaket   "+jaketMin+" "+jaketMaks);
		//System.out.println("kaos    "+kaosMin+" "+kaosMaks);
		//System.out.println("celana  "+celanaMin+" "+celanaMaks);
		//System.out.println("topi    "+topiMin+" "+topiMaks);
		//System.out.println("sweater "+sweaterMin+" "+sweaterMaks);

		maks=jaketMaks*hargaJaket+(kaosMaks/2)*hargaKaos+celanaMaks*hargaCelana+topiMaks*hargaTopi+sweaterMaks*hargaSweater;

		System.out.println("=================");
		System.out.println(" PABRIK KONVEKSI");
		System.out.println("=================\n");
		System.out.print("jumlah produksi jaket     : ");
		jaket=scan.nextInt();
		System.out.print("jumlah produksi kaos kaki : ");
		kaos=scan.nextInt();
		System.out.print("jumlah produksi celana    : ");
		celana=scan.nextInt();
		System.out.print("jumlah produksi topi      : ");
		topi=scan.nextInt();
		System.out.print("jumlah produksi sweater   : ");
		sweater=scan.nextInt();
		System.out.println("-----------------");

		if(kaos%2!=0)
			System.out.println("ERROR");
		else if(jaket>=jaketMin && jaket<=jaketMaks && kaos>=kaosMin && kaos<=kaosMaks && celana>=celanaMin && celana<=celanaMaks && topi>=topiMin && topi<=topiMaks && sweater>=sweaterMin && sweater<=sweaterMaks){
			harga=jaket*hargaJaket+(kaos/2)*hargaKaos+celana*hargaCelana+topi*hargaTopi+sweater*hargaSweater;
			untung=0.5*harga;

			if(untung>=294375000){
				System.out.println("Selamat Perusahaan ini SUKSES\n");
				naik=0.02*untung;
				System.out.println("gaji karyaman naik Rp. "+naik);
				gaji+=naik;
				System.out.println("gaji karyaman sebesar Rp. "+gaji);
			}
			else if(untung<294375000 && untung>=0.6*maks){
				System.out.println("Selamat Perusahaan ini CUKUP SUKSES\n");
				naik=0*untung;
				System.out.println("gaji karyaman naik Rp. "+naik);
				gaji+=naik;
				System.out.println("gaji karyaman sebesar Rp. "+gaji);
			}
			else if(untung<0.6*maks && untung>=0.5*0.6*maks){
				System.out.println("Selamat Perusahaan ini CUKUP SUKSES\n");
				naik=-0.02*untung;
				System.out.println("gaji karyaman naik Rp. "+naik);
				gaji+=naik;
				System.out.println("gaji karyaman sebesar Rp. "+gaji);
			}
			else
				System.out.println("salah nih");
		}
		else
			System.out.println("Tidak sesuai rentang");
	}
}
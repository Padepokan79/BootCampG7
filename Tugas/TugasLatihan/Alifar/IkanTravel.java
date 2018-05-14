/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	13.51
	* Updated by:
	*
*/

import java.util.Scanner;

public class IkanTravel{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int nol, bisA, bisB, bisC, bisD, bisE, bisF;
		int hargaA, hargaB, hargaC, hargaD, hargaE, hargaF;
		int penumpang;

		nol=0; bisA=6; bisB=12; bisC=18; bisD=32; bisE=45; bisF=60;
		hargaA=2000000; hargaB=1300000; hargaC=1500000; hargaD=1800000; hargaE=2000000; hargaF=2300000;

		System.out.println("==============================================================");
		System.out.println("Selamat Datang di Ikan Travel\n");
		System.out.println("Masukkan jumlah penumpang: ");
		penumpang=keyboard.nextInt();
		System.out.println("\nBus yang tersedia untuk anda: ");

		if(penumpang>=60)
			System.out.println("Bis Dengan Kursi 60\t\t Rp. "+hargaF);
		if(penumpang>=45)
			System.out.println("Bis Dengan Kursi 45\t\t Rp. "+hargaE);
		if(penumpang>=32)
			System.out.println("Bis Dengan Kursi 32\t\t Rp. "+hargaD);
		if(penumpang>=18)
			System.out.println("Bis Dengan Kursi 18\t\t Rp. "+hargaC);
		if(penumpang>=12)
			System.out.println("Bis Dengan Kursi 12\t\t Rp. "+hargaB);
		if(penumpang>0)
			System.out.println("Bis Dengan Kursi 6 Executive\t Rp. "+hargaA);

		System.out.println("==============================================================");
		System.out.println("\n*Rekomendasi Bis untuk anda");
		if(penumpang>nol && penumpang<=bisA)
			System.out.println("1 Bis 6 kursi dengan harga Rp. "+hargaA);
		else if(penumpang>bisA && penumpang<bisB)
			System.out.println("2 Bis 6 kursi dengan harga Rp. "+(hargaA+hargaA));
		else if(penumpang==bisB)
			System.out.println("1 Bis 12 kursi dengan harga Rp. "+hargaB);
		else if( (penumpang>bisB && penumpang<bisC) || (penumpang>bisC && penumpang<(bisB+bisB)) )
			System.out.println("2 Bis 12 kursi dengan harga Rp. "+(hargaB+hargaB));
		else if(penumpang==bisC)
			System.out.println("1 Bis 18 kursi dengan harga Rp. "+hargaC);
		else if(penumpang>(bisB+bisB) && penumpang<=(bisB+bisC))
			System.out.println("1 bis 12 kursi dan 1 bis 18 kursi dengan harga Rp. "+(hargaB+hargaC));
		else if( penumpang<bisD || (penumpang>bisD && penumpang<=(bisC+bisC)) )
			System.out.println("2 bis 18 kursi dengan harga Rp. "+(hargaC+hargaC));
		else if(penumpang==bisD)
			System.out.println("1 bis 32 kursi dengan harga Rp. "+hargaD);
		else if(penumpang>(bisB+bisB+bisB) && penumpang<bisE)
			System.out.println("1 bis 12 kursi dan 1 bis 32 kursi dengan harga Rp. "+(hargaB+hargaD));
		else if(penumpang==bisE)
			System.out.println("1 bis 45 kursi dengan harga Rp. "+hargaE);
		else if(penumpang>bisE && penumpang<=(bisC+bisD))
			System.out.println("1 bis 18 kursi dan 1 bis 32 kursi dengan harga Rp. "+(hargaC+hargaD)+"\n1 bis 12 kursi dan 1 bis 45 kursi dengan harga Rp. "+(hargaB+hargaE));
		else if(penumpang>(bisC+bisD) && penumpang<=(bisB+bisE))
			System.out.println("1 bis 12 kursi dan 1 bis 45 kursi dengan harga Rp. "+(hargaB+hargaE));
		else if( (penumpang>(bisB+bisE) && penumpang<bisF) || (penumpang>bisF && penumpang<(bisD+bisD)) )
			System.out.println("1 bis 18 kursi dan 1 bis 45 kursi dengan harga Rp. "+(hargaC+hargaE));
		else if(penumpang==bisF)
			System.out.println("1 bis 60 kursi dengan harga Rp. "+(hargaF));
		else if(penumpang==(bisD+bisD))
			System.out.println("2 bis 32 kursi dengan harga Rp. "+(hargaD+hargaD)+"\n1 bis 12 kursi dan 1 bis 60 kursi dengan harga Rp. "+(hargaB+hargaF));
		else if(penumpang>(bisD+bisD) && penumpang<=(bisB+bisF))
			System.out.println("1 bis 12 kursi dan 1 bis 60 kursi dengan harga Rp. "+(hargaB+hargaF));
		else if(penumpang>(bisB+bisF) && penumpang<(bisC+bisF))
			System.out.println("1 bis 18 kursi dan 1 bis 60 kursi dengan harga Rp. "+(hargaC+hargaF)+"\n1 bis 32 kursi dan 1 bis 45 kursi dengan harga Rp. "+(hargaD+hargaE));
		else if(penumpang==(bisC+bisF))
			System.out.println("1 bis 18 kursi dan 1 bis 60 kursi dengan harga Rp. "+(hargaC+hargaF));
		else if(penumpang>(bisC+bisF) && penumpang<=(bisE+bisE))
			System.out.println("2 bis 45 kursi dengan harga Rp. "+(hargaE+hargaE));
		else if(penumpang>(bisE+bisE) && penumpang<=(bisD+bisF))
			System.out.println("1 bis 32 kursi dan 1 bis 60 kursi dengan harga Rp. "+(hargaD+hargaF));
		else if(penumpang>(bisD+bisF) && penumpang<=(bisE+bisF))
			System.out.println("1 bis 45 kursi dan 1 bis 60 kursi dengan harga Rp. "+(hargaE+hargaF));
		else if(penumpang>(bisE+bisF) && penumpang<=(bisF+bisF))
			System.out.println("2 bis 60 kursi dengan harga Rp. "+(hargaF+hargaF));
		System.out.println("==============================================================");
	}
}

//Created By Vikri
//07/05/2018

public class SalaryProgrammer{
	public static void main(String[] args) {
		
		double totalThp, umkb, umkj, kes, kesj, gapok, gapokj, bonus, lembur, lemburj, transportasi, pph, pph2, pph3, gaji, gaji2, gaji3, thpapril, thpmei, thpjuni;

		umkb = 3091446;
		umkj = 3648035;

		gapok = umkb*120/100;
		kes = gapok*2/100;
		gapokj = umkj*120/100;
		kesj = gapokj*2/100;
		bonus = 500000;
		lembur = gapok*1.5*1/173;
		lemburj = gapokj*1.5*1/173;
		transportasi = 750000;

		gaji = (bonus*2)+(lembur*10)+gapok+kes;
		gaji2 = gapok+lembur*5+kes;
		gaji3 = (lemburj*12)+gapokj+transportasi+kesj+bonus;

		pph = gaji*5.0/100;
		pph2 = gaji2*5/100;
		pph3 = gaji3*5/100;

		thpapril = gaji - pph;
		thpmei = gaji2 - pph2;
		thpjuni = gaji3 - pph3;

		totalThp = thpapril+thpmei+thpjuni;

		System.out.println("Salary bulan April");
		System.out.println("*************************************");
		System.out.println("NAMA\t: Nurwan");
		System.out.println("Posisi\t: Programmer");
		System.out.println("=====================================");
		System.out.println("Gaji Pokok\t: Rp. "+(int)gapok);
		System.out.println("T.Kesehatan\t: Rp. "+(int)kes);
		System.out.println("Bonus\t\t: Rp. "+(int)bonus*2);
		System.out.println("Lembur\t\t: Rp. "+(int)lembur*10);
		System.out.println("");
		System.out.println("PPH\t\t: Rp. "+(int)pph);
		System.out.println("=====================================");
		System.out.println("Take Home Pay\t: Rp. "+(int)thpapril);
		System.out.println("=====================================");

		System.out.println("Salary bulan Mei");
		System.out.println("*************************************");
		System.out.println("NAMA\t: Nurwan");
		System.out.println("Posisi\t: Programmer");
		System.out.println("=====================================");
		System.out.println("Gaji Pokok\t: Rp. "+(int)gapok);
		System.out.println("T.Kesehatan\t: Rp. "+(int)kes);
		System.out.println("Bonus\t\t: Rp. "+(int)0);
		System.out.println("Lembur\t\t: Rp. "+(int)lembur*5);
		System.out.println("");
		System.out.println("PPH\t\t: Rp. "+(int)pph2);
		System.out.println("=====================================");
		System.out.println("Take Home Pay\t: Rp. "+(int)thpmei);
		System.out.println("=====================================");

		System.out.println("Salary bulan Juni");
		System.out.println("*************************************");
		System.out.println("NAMA\t: Nurwan");
		System.out.println("Posisi\t: Programmer");
		System.out.println("=====================================");
		System.out.println("Gaji Pokok\t: Rp. "+(int)gapokj);
		System.out.println("T.Kesehatan\t: Rp. "+(int)kesj);
		System.out.println("Bonus\t\t: Rp. "+(int)bonus);
		System.out.println("Lembur\t\t: Rp. "+(int)lemburj*12);
		System.out.println("");
		System.out.println("PPH\t\t: Rp. "+(int)pph3);
		System.out.println("=====================================");
		System.out.println("Take Home Pay\t: Rp. "+(int)thpjuni);
		System.out.println("=====================================");

		System.out.println("=====================================");
		System.out.println("Total Thp Rp." + (int)totalThp);
		System.out.println("=====================================");

	}
}
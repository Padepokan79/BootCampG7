
//Created By Vikri
//07/05/2018

public class GajiPNS{
	public static void main(String[] args) {
		int gaji, tk, ta, tf, tn, taa;
		double rc, bruto, fe, tc, net, total, pph, g;	
		gaji = 2456700;
		tf = 500000;
		tk = 10*gaji/100;
		ta = 2*gaji/100;
		ta = ta * 2;
		tn = 10*4*13000;
		taa = tf + tk + ta + tn;
		bruto = gaji + tf + tk + ta + tn;

		rc = bruto*4.75/100.0;
		fe = bruto*5.0/100.0;
		tc = 10000.0;
		g = rc+fe+tc;
		net = bruto-g;
		pph = net*5.0/100.0;
		total = net - pph;

		System.out.println("=====================================");
		System.out.println("NAMA\t: Budi Anto");
		System.out.println("NIP\t: 19020390209");
		System.out.println("=====================================");
		System.out.println("Basic Salary\t: Rp. "+gaji);
		System.out.println("Total Allowance\t: Rp. "+taa);
		System.out.println("=====================================");
		System.out.println("Bruto Salary\t: Rp. "+(int)bruto);
		System.out.println("=====================================");
		System.out.println("Salary Cut\t: Rp. "+(int)g);
		System.out.println("=====================================");
		System.out.println("Netto Salary\t: Rp. "+(int)net);
		System.out.println("=====================================");
		System.out.println("PPH Salary\t: Rp. "+(int)pph);
		System.out.println("=====================================");
		System.out.println("Take Home Pay\t: Rp. "+(int)total);
		System.out.println("=====================================");
	}
}
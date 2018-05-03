/*
Date Created	: 1 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.text.DecimalFormat;

public class Hendra01{
	public static void main( String[] args){
		double basicSalary, familyAlowance, childAlowance, totalChildAlowance, totalChild, totalFamily, functionalAlowance, riceAlowance, totalRiceAlowance, ricePrice, cutRetire, brutoSalary, cutExpense, totalAlowance, cutTaperum, pph, nettoSalary, thp, totalContribution;
		DecimalFormat df = new DecimalFormat("#.##");

		// Pendapatan
		basicSalary = 2456700;
		familyAlowance = 0.1 * basicSalary;
		totalChild = 2;
		totalFamily = 4;
		childAlowance = 0.02 * basicSalary;
		totalChildAlowance = childAlowance * totalChild;
		functionalAlowance = 500000;
		riceAlowance = 10 * totalFamily;
		ricePrice = 13000;
		totalRiceAlowance = riceAlowance * ricePrice;
		totalAlowance = familyAlowance + totalChildAlowance + functionalAlowance + totalRiceAlowance;

		// Potongan
		brutoSalary = basicSalary + totalAlowance;
		cutRetire = 0.0475 * brutoSalary;
		cutExpense= 0.05 * brutoSalary;
		cutTaperum = 10000;
		totalContribution = cutRetire + cutExpense + cutTaperum;
		nettoSalary = brutoSalary - totalContribution;
		pph = 0.05 * nettoSalary;
		thp = nettoSalary - pph;

		System.out.println("=====================================");
		System.out.println("NAMA : Budi Anto");
		System.out.println("NIP  : 19020390209");
		System.out.println("=====================================");
		System.out.println();
		System.out.println("Basic Salary		: " + df.format(basicSalary));
		System.out.println("Total Allowance		: " + df.format(totalAlowance));
		System.out.println("=====================================");
		System.out.println("Bruto Salary		: " + df.format(brutoSalary));
		System.out.println("=====================================");
		System.out.println();
		System.out.println("Salary Cut		: " + df.format(totalContribution));
		System.out.println("=====================================");
		System.out.println("Netto Salary		: " + df.format(nettoSalary));
		System.out.println();
		System.out.println("=====================================");
		System.out.println("PPH Salary		: " + df.format(pph));
		System.out.println();
		System.out.println("=====================================");
		System.out.println("Take Home Pay       	: " + df.format(thp));
		System.out.println("=====================================");

	}
}

/*Budi adalah Seorang PNS yang sudah menikah dan mempunyai 2 orang anak, memiliki Basic Salary sebesar 2.456.700,
dan mendapatkan Family Allowance sebesar 10% dari basic salary, mendapatkan Children Allowance 2% dari basic salary
untuk setiap anaknya, Functional Allowance 500.000, mendapatkan Rice Allowance sebesar 10Kg peranggota keluarganya,
dimana Harga beras PerKilogramnya adalah 13.000. 

Namun Mendapatkan Potongan retriment Contribution sebesar 4.75% dari bruto Salary
(bruto salary didapat dari jumlah basic salary + total seluruh allowance),
Potongan Functional expenses contribution sebesar 5% dari bruto salary, Potongan Taperum Contribution = 10.000.
Potongan PPH sebesar 5% dari netto salary (netto salary didapat dari Bruto salary dikurangi jumlah semua contribution).

Berapakah Take Home Pay dari Budi? (Take home pay didapat dari netto salary dikurangi PPH)



Outpuh Yang di inginkan:

=====================================
NAMA : Budi Anto
NIP  : 19020390209
=====================================
 
Basic Salary		: 
Total Allowance		: 
=====================================
Bruto Salary		: 
=====================================

Salary Cut		:
=====================================
Netto Salary		: 

=====================================
PPH Salary		:

=====================================
Take Home Pay       	:
=====================================
*/
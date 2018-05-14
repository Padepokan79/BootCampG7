/*
	Data Created 	= 07 Mei 2018
	Author			= Nurdhiat Chaudhary Malik
*/
public class Hendra01{
	public static void main(String[] args){

		double jmlAnak, jmlkeluarga, basicSalary, familyAllow, childrenAllow, functAllow, riceAllow, hargaBeras, retrimentCont, brutoSalary, functExpenses, taperumCont, pph, nettoSalary, takeHome, totalAllowFamily, totalAllowChild, totalAllowRice, totalAllow, totalRetriment, totalFunctExpenses, totalCont, totalPPH;

		jmlAnak 	= 2;
		jmlkeluarga = 4; 
		basicSalary = 2456700; // juta
		familyAllow = 10.0/100; // persent dari basic salary
		childrenAllow = 2.0/100; // persent dari basic salary untuk setiap anak
		functAllow 	= 500000; // ribu
		riceAllow 	= 10; //KG per anggota keluarga
		hargaBeras 	= 13000; // harga beras per kilogram

		retrimentCont = 4.75/100; // persent dari bruto salary
		functExpenses = 5.0/100; // persent dari bruto salary
		taperumCont   = 10000;
		pph  		  = 5.0/100; // persent dari netto salary

		/*
			bruto salary didapat dari jumlah basic salary + total seluruh allowance
			netto salary didapat dari bruto salary dikurangi jumlah semua contribution
			take home pay didapat dari netto salary dikurangi pph
		*/ 

			// Total Allowance
			totalAllowFamily = basicSalary*familyAllow;
			totalAllowChild  = (basicSalary*childrenAllow)*jmlAnak;
			totalAllowRice   = (riceAllow*hargaBeras)*jmlkeluarga;
			totalAllow 	= totalAllowFamily + totalAllowChild + functAllow + totalAllowRice;

			// bruto salary
			brutoSalary 	= basicSalary + totalAllow;

			// Total potongan
			totalRetriment 	= brutoSalary*retrimentCont;
			totalFunctExpenses = brutoSalary*functExpenses;
			totalCont 		= totalRetriment + totalFunctExpenses + taperumCont;

			// netto salary
			nettoSalary 	= brutoSalary - totalCont;

			totalPPH 		= nettoSalary*pph;

			takeHome 		= nettoSalary - totalPPH; 


		// OUTPUT
		System.out.println("=================================");
		System.out.println("NAMA : Budi Anto");
		System.out.println("NIP  : 19020390209");
		System.out.println("=================================");
		System.out.println();
		System.out.println("Basic Salary\t: " + basicSalary );
		System.out.println("Total Allowance\t: " + totalAllow );
		System.out.println("=================================");
		System.out.println("Bruto Salary\t: " + brutoSalary );
		System.out.println("=================================");
		System.out.println();
		System.out.println("Salary Cut\t: " + totalCont );
		System.out.println("=================================");
		System.out.println("Netto Salary\t: " + nettoSalary );
		System.out.println();
		System.out.println("=================================");
		System.out.println("PPH Salary\t: " + totalPPH );
		System.out.println();
		System.out.println("=================================");
		System.out.println("Take Home Pay\t: " + takeHome );
		System.out.println("=================================");
	}
}
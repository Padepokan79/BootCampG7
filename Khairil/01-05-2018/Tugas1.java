/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 10:00 AM     
     Updated By  : 
     Update Date : 
*/
class Tugas1 {
	public static void main(String[] args) {
		String soal, nama, nip;
		int jumAnak, jumKel, riceQty;
		double basicSalary, childrenAllowance, familyAllowance, functionAllowance, totalAllowance, 
		       ricePrice, riceAllowance, brutoSalary, functionalExpense, retrimentContribute, taperumContribute, 
		       totalCut, nettoSalary, pphSalary, takehomePay; 

		soal = "Budi adalah Seorang PNS yang sudah menikah dan mempunyai 2 orang anak, memiliki Basic Salary sebesar 2.456.700, dan mendapatkan Family Allowance sebesar 10% dari basic salary, mendapatkan Children Allowance 2% dari basic salary untuk setiap anaknya, Functional Allowance 500.000, mendapatkan Rice Allowance sebesar 10Kg peranggota keluarganya, dimana Harga beras PerKilogramnya adalah 13.000. Namun Mendapatkan Potongan retriment Contribution sebesar 4.75% dari bruto Salary (bruto salary didapat dari jumlah basic salary + total seluruh allowance), Potongan Functional expenses contribution sebesar 5% dari bruto salary, Potongan Taperum Contribution = 10.000. Potongan PPH sebesar 5% dari netto salary (netto salary didapat dari Bruto salary dikurangi jumlah semua contribution). Berapakah Take Home Pay dari Budi? (Take home pay didapat dari netto salary dikurangi PPH)";

		nama = "Budi Anto";
		nip = "19020390209";
		basicSalary = 2456700;
		jumAnak = 2;
		jumKel = 4; //asumsi istri masih hidup atau tidak bercerai
		familyAllowance = 0.1 * basicSalary;
		childrenAllowance = 0.02 * basicSalary * jumAnak;
		functionAllowance = 500000;
		riceQty = 10;
		ricePrice = 13000;
		riceAllowance = riceQty * ricePrice * jumKel;
		totalAllowance = childrenAllowance + functionAllowance + familyAllowance + riceAllowance;
		brutoSalary = basicSalary + totalAllowance;
		retrimentContribute = 0.0475 * brutoSalary;
		functionalExpense = 0.05 * brutoSalary;
		taperumContribute = 10000;
		totalCut = retrimentContribute + taperumContribute + functionalExpense;
		nettoSalary = brutoSalary - totalCut;
		pphSalary = 0.05 * nettoSalary;
		takehomePay = nettoSalary - pphSalary;

		System.out.println("=====================================");
		System.out.println("NAMA : " + nama);
		System.out.println("NIP  : " + nip);
		System.out.println("=====================================");
		System.out.println();
		System.out.println("Basic Salary		: " + Math.ceil(basicSalary)); 
		System.out.println("Total Allowance		: " + Math.ceil(totalAllowance));
		System.out.println("=====================================");
		System.out.println("Bruto Salary		: " + Math.ceil(brutoSalary));
		System.out.println("=====================================");
		System.out.println();
		System.out.println("Salary Cut 			: " + Math.ceil(totalCut));
		System.out.println("=====================================");
		System.out.println("Netto Salary		: " + Math.ceil(nettoSalary));
		System.out.println();
		System.out.println("=====================================");
		System.out.println("PPH Salary		    : " + Math.ceil(pphSalary));
		System.out.println();
		System.out.println("=====================================");
		System.out.println("Take Home Pay       : " + Math.ceil(takehomePay));
		System.out.println("=====================================");
	} 
}
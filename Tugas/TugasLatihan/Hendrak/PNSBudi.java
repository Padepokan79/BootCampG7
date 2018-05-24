//createby:Hendra Kurniawan 
//Date:17 Mei 2018 Time:12:52
//Modified by :
public class PNSBudi{
	public static void main(String[] args) {
	
	double basicSalary,familyAllowance,childernAllowance,riceAllowance,totalAllowance,functionalAllowance, brutoSalary;
	double retrimentContribution, expenseContribution, taperumContribution,salaryCut;
	double nettoSalary,pph,takeHomePay;

	basicSalary = 2456700;
	functionalAllowance = 500000;

	familyAllowance = basicSalary * 0.1;
	childernAllowance = basicSalary * 0.02;
	riceAllowance = 4 * 10 * 13000;
	totalAllowance = familyAllowance + childernAllowance + riceAllowance + riceAllowance;
	brutoSalary = basicSalary + totalAllowance;

	retrimentContribution = brutoSalary * 0.0475;
	expenseContribution   = brutoSalary * 0.05;
	taperumContribution   = 10000;
	salaryCut = retrimentContribution + expenseContribution + taperumContribution;

	nettoSalary = brutoSalary - salaryCut;
	pph = nettoSalary * 0.05;

	takeHomePay = nettoSalary - pph;
	System.out.println("====================================");
	System.out.println("NAMA : Budi Anto");
	System.out.println("NIP  : 19020390209");
	System.out.println("====================================");
	System.out.println("Basic Salary    :Rp " + basicSalary );
	System.out.println("Total Allowance :Rp " + totalAllowance);
	System.out.println("====================================\n");
	System.out.println("Bruto Salary    :Rp " + brutoSalary);
	System.out.println("====================================\n");
	System.out.println("Salary Cut      :Rp " + salaryCut);
	System.out.println("====================================");
	System.out.println("Netto Salary    :Rp " + nettoSalary);
	System.out.println("====================================\n");
	System.out.println("PPH Salary      :Rp " + pph);
	System.out.println("====================================\n");
	System.out.println("Take Home Pay   :RP " + takeHomePay);
	System.out.println("====================================\n");
	System.out.println("====================================\n");



	}
}
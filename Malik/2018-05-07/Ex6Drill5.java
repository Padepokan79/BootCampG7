/*
nama : Malik Chaudhary
time : 07-05-2018 2:23PM
*/

public class Ex6Drill5{
	public static void main(String[] args){
		int anakBudi, basicSalary, riceAllowance, functionAllowance, beratBeras, hargaBeras, taperumContribution, jumlahKeluarga;
		double familyAllowance, childrenAllowance, brutoSalary, retrimentContribution, funtionalExpenses, pph, nettoSalary, takeHomePay, totalAllowance, salaryCut;

		anakBudi	      = 2;
		jumlahKeluarga    = 4;
		basicSalary       = 2456700;
		familyAllowance   = 0.1*basicSalary;
		childrenAllowance = (0.02*basicSalary)*anakBudi;
		functionAllowance = 500000;
		beratBeras		  = 10;
		hargaBeras        = 13000;
		riceAllowance     = (beratBeras*hargaBeras)*jumlahKeluarga;
		totalAllowance    = familyAllowance+childrenAllowance+functionAllowance+riceAllowance;

		brutoSalary       = basicSalary+totalAllowance;
		
		retrimentContribution = 0.0475*brutoSalary;
		taperumContribution   = 10000;
		funtionalExpenses     = 0.05*brutoSalary;

		salaryCut             = retrimentContribution+taperumContribution+funtionalExpenses;

		nettoSalary           = brutoSalary-salaryCut;
		pph                   = 0.05*nettoSalary;

		takeHomePay           = nettoSalary-pph;

		System.out.println("=======================================");
		System.out.println("Nama : Budi Anto");
		System.out.println("NIP  : 19020390209");
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Basic Salary\t\t: Rp."+basicSalary);
		System.out.println("Total Allowance\t\t: Rp."+totalAllowance);
		System.out.println("=======================================");
		System.out.println("bruto Salary\t\t: Rp."+brutoSalary);
		System.out.println("=======================================");
		System.out.println();
		System.out.println("Salary Cut\t\t: Rp."+salaryCut);
		System.out.println("=======================================");
		System.out.println("Netto Salary\t\t: Rp."+nettoSalary);
		System.out.println();
		System.out.println("=======================================");
		System.out.println("PPH Salary\t\t: Rp."+pph);
		System.out.println();
		System.out.println("=======================================");
		System.out.println("Take Home Pay\t\t: Rp."+takeHomePay);

	}
}
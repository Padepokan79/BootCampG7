/*
     * Penghitungan gaji PNS.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 09:53  
     * Updated By : 
     * Updated At : 
*/

public class Ex6DrillPns1{
	public static void main(String[] args) {
		String nama, nip;
		int functionalAllowance, riceAllowance,
			taperumContribution, jmlKeluarga, hargaberas;
		double  brutoSallary, pphSallary, retritmentContribution, functionalExpences,
				sallaryCut, nettoSallary, takeHome, childrenAllowance, totalAllowance,
				familyAllowance, basicSallary ;

		nama 				="Budi Anto";
		nip 				="19020390209";

		basicSallary		=2456700.00;
		familyAllowance		=basicSallary/100*10;
		childrenAllowance	=(basicSallary/100*2)*2;
		jmlKeluarga			=4;
		hargaberas			=13000;
		riceAllowance		=(jmlKeluarga*10)*hargaberas;
		functionalAllowance	=500000;
		taperumContribution	=10000;

		totalAllowance			=childrenAllowance+riceAllowance+functionalAllowance+familyAllowance;
		brutoSallary			=basicSallary+totalAllowance;
		retritmentContribution	=brutoSallary/100*4.75;
		functionalExpences		=brutoSallary/100*5;
		sallaryCut				=retritmentContribution+functionalExpences+taperumContribution;
		nettoSallary			=brutoSallary - sallaryCut;
		pphSallary				=nettoSallary/100*5;
		takeHome				=nettoSallary - pphSallary;

		System.out.println("===============================");
		System.out.println("Nama\t: "+nama);
		System.out.println("Nip\t: "+nip);
		System.out.println("===============================\n");
		System.out.printf("Basic Sallary\t: %.2f",basicSallary);
		System.out.printf("\nTotal Allowance\t: %.2f",totalAllowance);
		System.out.println("\n===============================");
		System.out.printf("\nBruto Sallary\t: %.2f",brutoSallary);
		System.out.println("\n===============================\n");
		System.out.printf("\nSallary Cut\t: %.2f",sallaryCut);
		System.out.println("\n===============================");
		System.out.printf("\nNetto Sallary\t: %.2f",nettoSallary);
		System.out.println("\n\n===============================");
		System.out.printf("PPH Sallary\t: %.2f",pphSallary);
		System.out.println("\n\n===============================");
		System.out.printf("Take Home Pay\t: %.2f",takeHome);
		System.out.println("\n===============================");



	}
}
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
		int basicSallary, childrenAllowance, functionalAllowance, riceAllowance,
			taperumContribution, jmlKeluarga, hargaberas, totalAllowance;
		double  brutoSallary, pphSallary, retritmentContribution, functionalExpences,
				sallaryCut, nettoSallary, takeHome;

		nama 				="Budi Anto";
		nip 				="19020390209";

		basicSallary		=2456700;
		childrenAllowance	=(basicSallary/100*2)*2;
		jmlKeluarga			=4;
		hargaberas			=13000;
		riceAllowance		=(jmlKeluarga*10)*hargaberas;
		functionalAllowance	=500000;
		taperumContribution	=10000;

		totalAllowance			=childrenAllowance+riceAllowance+functionalAllowance;
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
		System.out.println("Basic Sallary\t: "+basicSallary);
		System.out.println("Total Allowance\t: "+totalAllowance);
		System.out.println("===============================");
		System.out.println("Bruto Sallary\t: "+brutoSallary);
		System.out.println("===============================\n");
		System.out.println("Sallary Cut\t: "+sallaryCut);
		System.out.println("===============================");
		System.out.println("Netto Sallary\t: "+nettoSallary);
		System.out.println("\n===============================");
		System.out.println("PPH Sallary\t: "+pphSallary);
		System.out.println("\n===============================");
		System.out.println("Take Home Pay\t: "+takeHome);
		System.out.println("===============================");



	}
}
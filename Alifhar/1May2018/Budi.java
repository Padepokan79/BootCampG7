/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	09.32
	* Updated by:
	*
*/

public class Budi{
	public static void main(String[] args){
		double famAll, childAll, funcAll, riceAll, beras, retCon, funcCon, tapCon, pph;
		double salary, allowance, cut, brutSal, netSal, takeHomePay;
		int anak=2, kel=anak+2;
		salary=2456700; beras=13000;

		System.out.println("=====================================");
		System.out.println("NAMA : Budi Anto");
		System.out.println("NIP  : 19020390209");
		System.out.println("=====================================");

		famAll=10.0/100.0*salary;
		childAll=2.0/100.0*salary*anak;
		funcAll=500000;
		riceAll=10*beras*kel;
		allowance=famAll+childAll+funcAll+riceAll;
		brutSal=salary+allowance;
		System.out.println("\nBasic Salary		:"+salary);
		System.out.println("Total Allowance		:"+allowance);
		System.out.println("=====================================");
		System.out.println("Bruto Salary		:"+brutSal);
		System.out.println("=====================================");

		retCon=4.75/100.0*brutSal;
		funcCon=5.0/100.0*brutSal;
		tapCon=10000;
		cut=retCon+funcCon+tapCon;
		netSal=brutSal-cut;
		System.out.println("\nSalary Cut		:"+cut);
		System.out.println("=====================================");
		System.out.println("Netto Salary		:"+netSal);

		pph=5.0/100.0*netSal;
		System.out.println("\n=====================================");
		System.out.println("PPH Salary		:"+pph);

		takeHomePay=netSal-pph;
		System.out.println("\n=====================================");
		System.out.println("Take Home Pay       	:"+takeHomePay);
		System.out.println("=====================================");
	}
}
public class SoalLatihanHendra {
	public static void main (String[] args) {

		double basicSal, famAl, childAl, funAl, riceAl, bruto, retriment, funcEx, taperum, netto, pph, pay, totalAl, salCut;

		basicSal = 2456700;
		famAl = 0.1 * basicSal;
		childAl = 0.02 *2* basicSal;
		funAl = 500000;
		riceAl = 10*13000*4;
		totalAl = famAl + childAl +funAl+ riceAl;
		bruto = basicSal + totalAl;
		retriment = 0.0475* bruto;
		funcEx = 0.05*bruto;
		taperum = 10000;
		salCut = retriment + funcEx + taperum;
		netto = bruto - (retriment+funcEx+taperum);
		pph = 0.05*netto;
		pay = netto - pph;

		System.out.println ();
		System.out.println (); 
		System.out.println("=====================================");
		System.out.println("NAMA : Budi Anto                     ");
		System.out.println("NIP  : 19020390209                   ");
		System.out.println("=====================================");
		System.out.println("                                     ");
		System.out.println("Basic Salary        : " + Math.ceil(basicSal));
		System.out.println("Total Allowance     : " + Math.ceil(totalAl));
		System.out.println("=====================================");
		System.out.println("Bruto Salary        : " + Math.ceil(bruto));
		System.out.println("=====================================");
		System.out.println("Salary cut      : " + Math.ceil(salCut));
		System.out.println("=====================================");
  		System.out.println("Netto Salary        : " + Math.ceil(netto));
  		System.out.println (); 
  		System.out.println("=====================================");
  		System.out.println("PPH Salary    : " + Math.ceil(pph)  );
  		System.out.println("take Home Pay         : " + Math.ceil(pay));
  		System.out.println("=====================================");
	}
}



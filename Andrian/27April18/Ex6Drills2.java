/* 	Date 		: 27/4/2018    
	Time 		: 11:05:39
	Create by 	: Muhamad Rifan Adrian
	Edited by 	: 
				
	*/
public class Ex6Drills2 {
	public static void main( String[] args ) {
		int uang, baju, lomba, hadiah, boneka;

		uang = 100000;

		baju = uang - 20000;
		System.out.println( "Uang anto setelah membeli baju " + baju );

		lomba = baju - 50000;
		System.out.println( "Uang anto setelah membeli baju dan membayar untuk lomba " + lomba );

		hadiah = lomba + 120000;
		System.out.println( "Uang anto setelah membeli bajudan membayar lomba lalu menang uara ke-2 " + hadiah );

		boneka = hadiah - 80000;
		System.out.println( "Sisa uang anto setelah membeli boneka adalah " + boneka );
	}
}
/* 	Date 		: 27/4/2018    
	Time 		: 11:05:39
	Create by 	: Muhamad Rifan Adrian
	Edited by 	: 
				
	*/
public class Ex6Drills2 {
	public static void main( String[] args ) {
		int uang, baju, lomba, hadiah, boneka;

		uang = 100000;
		baju = 20000;
		lomba = 50000;
		hadiah = 120000;
		boneka = 80000;

		uang = uang - baju;
		uang = uang - lomba;
		uang = uang + hadiah;
		uang = uang - boneka;

		System.out.println( "Sisa uang anto adalah " + uang );
	}
}
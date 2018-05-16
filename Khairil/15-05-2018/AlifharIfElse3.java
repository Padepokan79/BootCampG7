/*
	 Program     : Soal 3 - Alifhar
     Creator     : Khairil
     Created At  : 15 Mei 2018 09:10 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class AlifharIfElse3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int bilA, bilB, bilC, nolAjah, satuAjah, duaAjah, empatAjah, determinan;
		String fungsiA, fungsiB, fungsiC, jenisA;
		double x1, x2;

		nolAjah = 0;
		satuAjah = 1;
		duaAjah = 2;
		empatAjah = duaAjah * duaAjah;

		System.out.println("===========================================================");
		System.out.print("Input untuk angka A : ");
		bilA = keyboard.nextInt();
		System.out.print("Input untuk angka B : ");
		bilB = keyboard.nextInt();
		System.out.print("Input untuk angka C : ");
		bilC = keyboard.nextInt();

		System.out.print("Persamaan Kuadratnya adalah : ");

        if(bilA == satuAjah || bilA == -(satuAjah)) {
	    	if(bilA < nolAjah) {
				fungsiA = "-x^2 ";
		        System.out.print(fungsiA);	    		
	    	}
	    	else {
				fungsiA = "x^2 ";
		        System.out.print(fungsiA);	    		
	    	}        	
        }
        else {
	    	fungsiA = bilA + "x^2 ";
	        System.out.print(fungsiA);        	
        }

        if(bilB == satuAjah || bilB == -(satuAjah)) {
	    	if(bilB < nolAjah) {
	        	fungsiB = "- x ";
	        	System.out.print(fungsiB);
	    	}
	    	else {
	            fungsiB = "+ x ";
		        System.out.print(fungsiB);            
	    	}        	
        }
        else {
	    	fungsiB = " + " + bilB + " x ";
	        System.out.print(fungsiB);        	
        }

        if(bilC < nolAjah) {
        	fungsiC = "- " + (-bilC) + " = 0";
	        System.out.println(fungsiC);        	
        }
        else if(bilC > nolAjah) {
        	fungsiC = "+ " + bilC + " = 0";
	        System.out.println(fungsiC);        	
        }

        determinan = bilB * bilB - ( empatAjah * bilA * bilC);

		System.out.println("Maka didapatkan akar akar dari persamaan tersebut adalah:");
		if( determinan < nolAjah) {
			jenisA = "akar imajiner";
			System.out.println(jenisA);
		} else if ( determinan == nolAjah) {
			jenisA = "akar kembar";
			x1 = -bilB / duaAjah * bilA;
			System.out.println(jenisA);
			System.out.println("x1 = x2 = " + x1);
		} else {
			jenisA = "akar berbeda";
			x1 = (-bilB + Math.sqrt(determinan) ) / (duaAjah*bilA);
			x2 = (-bilB - Math.sqrt(determinan) ) / (duaAjah*bilA);
			System.out.println(jenisA);
			System.out.println("x1 = "+ x1 +" dan x2 = " + x2);			
		}
		
		System.out.println("===========================================================");
	}
}
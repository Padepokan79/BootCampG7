/*
	DATE CREATED : 17 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class WhileKuePedagang{
	public static void main(String[] args){
		int stockTotal, stockTerjual, minMenit, maxMenit, nol = 0;
		stockTotal 		= 200;
		stockTerjual	= 3;
		minMenit 		= 15;
		maxMenit 		= (8*60) + 30;


		while (maxMenit >= nol) {
			stockTotal = stockTotal - stockTerjual;

			maxMenit = maxMenit - minMenit;
		}
		System.out.print("  Sisa "+stockTotal+"");

	}
}
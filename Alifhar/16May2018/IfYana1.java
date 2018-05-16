/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	10.46
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfYana1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int uang, tas=60000, dompet=40000, sepatu=120000, jas=250000, kemeja, dasi;
		kemeja=tas+dompet;
		dasi=dompet;

		System.out.println("=====================================");
		System.out.print("Masukkan nominal uang Budi : ");
		uang=scan.nextInt();
		System.out.println();

		if(uang>500000){
			System.out.println("Budi membeli jas seharga Rp. "+jas);
			System.out.println("Busi membeli kemeja seharga Rp. "+kemeja);
			System.out.println("Busi membeli dasi seharga Rp. "+dasi);
			uang-= (jas+kemeja+dasi);
		}
		else if(uang>200000){
			System.out.println("Budi akan membeli Tas seharga Rp. "+tas);
			System.out.println("Budi akan membeli Sepatu seharga Rp. "+sepatu);
			uang-= (tas+sepatu-0.1*(tas+sepatu));
		}
		else if(uang>100000){
			System.out.println("Budi akan membeli Tas seharga Rp. "+tas);
			System.out.println("Budi akan membeli Dompet seharga Rp. "+dompet);
			uang-= (tas+dompet-0.1*(tas+dompet));
		}
		else if(uang>90000){
			System.out.println("Budi akan membeli Tas seharga Rp. "+tas);
			uang-= tas-0.1*tas;
		}
		System.out.println("\nSisa uang Budi adalah Rp. "+uang);
		System.out.println("========================================");
	}
}
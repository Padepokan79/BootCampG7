/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfYana1{
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double tas=60000, dompet=40000, sepatu=120000, jas=250000,
					kameja=tas+dompet,dasi=dompet,kondisi1=90000,
					kondisi2=100000, kondisi3=200000, kondisi4=500000,
					kembalian, diskon, uang, item2, item3;


			//item1 = tas;
			item2 = tas+dompet;
			item3 = tas+sepatu;
			//item4 = jas

			System.out.print("Masuka nominal uang budi\t\t: ");
			uang = key.nextInt();
			System.out.println();

			if (uang>=kondisi4) {
				System.out.println("budi membeli jas seharga "+jas);
				System.out.println("Budi membeli kameja seharga "+kameja);
				System.out.println("Budi membeli dasi seharga "+dasi);
				System.out.println();
				kembalian = (uang-(jas+kameja+dasi));
				System.out.println("Sisa uang budi adalah "+kembalian);
			}
			else if (uang>=kondisi3) {
				System.out.println("budi membeli tas seharga "+tas);
				System.out.println("Budi membeli sepatu seharga "+sepatu);
				System.out.println();
				diskon = (item3*0.1);
				kembalian = (uang-(item3-diskon));
				System.out.println("Sisa uang budi adalah "+kembalian);
			}
			else if (uang>=kondisi2) {
				System.out.println("budi membeli tas seharga "+tas);
				System.out.println("Budi membeli dompet seharga "+dompet);
				System.out.println();
				diskon = (item2*0.1);
				kembalian = (uang-(item2-diskon));
				System.out.println("Sisa uang budi adalah "+kembalian);
			}
			else if (uang>=kondisi1) {
				System.out.println("budi membeli tas seharga "+tas);
				System.out.println();
				diskon = (tas*0.1);
				kembalian = (uang-(tas-diskon));
				System.out.println("Sisa uang budi adalah "+kembalian);
			}
			else {
				System.out.println("....");
			}
		}
	}
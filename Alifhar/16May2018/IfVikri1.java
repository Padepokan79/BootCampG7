/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	09.58
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfVikri1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int istri, anak;

		System.out.print("Jumlah istri : ");
		istri=scan.nextInt();
		System.out.print("Jumlah anak  : ");
		anak=scan.nextInt();

		if((istri==1 && anak>2) || (istri>2 && anak==1))
			System.out.println("\nAnda diberi mobil oleh nene");
		else
			System.out.println("Tidak mendapatkan apa apa");
	}
}
/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	08.35
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfAndrian1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String member;
		int fc, total, hargaMember, hargaDikit, hargaSedang, hargaBanyak, dikit, banyak;

		hargaMember=75; hargaDikit=150; hargaSedang=100; hargaBanyak=80;
		dikit=100; banyak=200;

		System.out.println("=============================================");
		System.out.print("Apakah anda member (Y/N)              : ");
		member=scan.next();
		System.out.print("Berapa lembar yang akan di fotocopy   : ");
		fc=scan.nextInt();
		System.out.println("=============================================");

		if(member.equals("Y")){
			total=hargaMember*fc;
			if(fc<0){
				total=0;
				System.out.println("Jumlah fotocopy harus lebih besar dari nol");
			}
		}
		else if(member.equals("N")){
			if(fc>=0 && fc<dikit)
				total=hargaDikit*fc;
			else if(fc>=dikit && fc<=banyak)
				total=hargaSedang*fc;
			else if(fc>banyak)
				total=hargaBanyak*fc;
			else{
				total=0;
				System.out.println("Jumlah fotocopy harus lebih besar dari nol");
			}
		}
		else{
			System.out.println("Jawaban member harus Y atau N");
			total=0;
		}

		System.out.println("Harga                               = "+total);
		System.out.println("Bayar                               = "+total);
		System.out.println("=============================================");
	}
}
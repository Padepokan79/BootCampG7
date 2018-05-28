/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class LoopYana{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		boolean cek=false;
		int budi=200, tambahBudi=40/2, man=10, tambahMan=120/3, tono=500, tambahTono=0, menit=0, rest=0;

		while(!cek){
			menit++;
			System.out.print("\nMenit ke-"+menit);
			budi+=tambahBudi;
			man+=tambahMan;
			if(man>=budi)
				rest+=1;
			if(tono==500 || rest==1)
				tambahTono=rand.nextInt(6)+1;
			tono+=tambahTono;
			scan.nextLine();
			System.out.println("--------------------");
			System.out.println("kelereng Budi : "+budi);
			System.out.println("kelereng Man  : "+man);
			System.out.println("Kelereng Tono : "+tono);
			System.out.println("--------------------");

			if(man>=tono)
				cek=true;
		}
		System.out.println("\nPada menit ke-"+menit+", kelereng Man mengejar kelereng Tono");
	}
}
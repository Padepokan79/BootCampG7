/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class LoopRyan{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int player, comp, skorp=0, skorc=0;
		String masukan;

		for(int giliran=0; giliran<5; giliran++){
			System.out.println(giliran);
			System.out.println("\n=============================");
			System.out.println("    Player vs Computer");
			System.out.println("\t"+skorp+"\t"+skorc);
			System.out.println("=============================\n");

			System.out.println("Giliran Anda");
			System.out.print("masukkan \"tendang\" : ");
			masukan=scan.next();
			if(masukan.equals("tendang"))
				player=rand.nextInt(100);
			else
				player=0;
			comp=rand.nextInt(100);

			if(player>comp){
				System.out.println("\nGollll-l-l-l");
				skorp+=1;
			}
			else
				System.out.println("\ntendangan berhasil ditangkap");

			System.out.println("\n=============================");
			System.out.println("    Player vs Computer");
			System.out.println("\t"+skorp+"\t"+skorc);
			System.out.println("=============================\n");

			System.out.println("Giliran Komputer");
			System.out.print("masukkan \"tangkap\" : ");
			masukan=scan.next();
			if(masukan.equals("tangkap"))
				player=rand.nextInt(100);
			else
				player=0;
			comp=rand.nextInt(100);

			if(player>comp)
				System.out.println("\ntendangan berhasil ditangkap");
			else{
				System.out.println("\nGollll-l-l-l");
				skorc+=1;
			}
		}
		System.out.println("\n=============================");
		System.out.println("    Player vs Computer");
		System.out.println("\t"+skorp+"\t"+skorc);
		System.out.println("=============================\n");
	}
}
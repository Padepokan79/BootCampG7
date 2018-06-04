/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;
public class LoopRizaldi{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int modal1=100000, modal2=100000, poin1=0, poin2=0, angka1, angka2, pilih1, pilih2;

		do{
		System.out.println("Modal player 1 : "+modal1);
		System.out.println("Modal player 2 : "+modal2);
		System.out.println("-------------------------------");
		System.out.println("1. lotre Rp.100, point 0 - 10 ");
		System.out.println("2. lotre Rp.200, point 0 - 20 ");
		System.out.println("3. lotre Rp.300, point 0 - 50 ");
		System.out.println("4. lotre Rp.500, point 0 - 100 ");
		System.out.println("Pilih lotre yang diinginkan...");
		System.out.println("-------------------------------");

		System.out.print("Player 1 : ");
		pilih1=scan.nextInt();
		System.out.print("Player 2 : ");
		pilih2=scan.nextInt();
		System.out.println();

		if(pilih1==1){
			modal1-=100;
			angka1=rand.nextInt(11);
			System.out.println("Player 1 mendapat poin "+angka1);
			poin1+=angka1;
		}
		else if(pilih1==2){
			modal1-=200;
			angka1=rand.nextInt(21);
			System.out.println("Player 1 mendapat poin "+angka1);
			poin1+=angka1;
		}
		else if(pilih1==3){
			modal1-=300;
			angka1=rand.nextInt(51);
			System.out.println("Player 1 mendapat poin "+angka1);
			poin1+=angka1;
		}
		else if(pilih1==4){
			modal1-=500;
			angka1=rand.nextInt(101);
			System.out.println("Player 1 mendapat poin "+angka1);
			poin1+=angka1;
		}

		if(pilih2==1){
			modal2-=100;
			angka2=rand.nextInt(11);
			System.out.println("Player 1 mendapat poin "+angka2);
			poin2+=angka2;
		}
		else if(pilih2==2){
			modal2-=200;
			angka2=rand.nextInt(21);
			System.out.println("Player 1 mendapat poin "+angka2);
			poin2+=angka2;
		}
		else if(pilih2==3){
			modal2-=300;
			angka2=rand.nextInt(51);
			System.out.println("Player 1 mendapat poin "+angka2);
			poin2+=angka2;
		}
		else if(pilih2==4){
			modal2-=500;
			angka2=rand.nextInt(101);
			System.out.println("Player 1 mendapat poin "+angka2);
			poin2+=angka2;
		}

		System.out.println("\n===============================");
		System.out.println("Total poin player 1 : "+poin1);
		System.out.println("Total poin player 2 : "+poin2);
		System.out.println("===============================\n");

		}while(poin1<1000 && poin2<1000 && modal1>0 && modal2>0);

		if(poin1>=1000 & poin2>=1000)
			System.out.println("draw");
		else if(poin1>=1000 || modal2<=0)
			System.out.println("Player 1 win");
		else if(poin2>=1000 || modal1<=0)
			System.out.println("Player 2 win");

	}
}
/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	13.59
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfRicha1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String nama, pilih;
		int jum, hari, budget;
		int ppL=2170000, ppB=3780000, ppS=1200000, ppT=4760000, hotelL=255000, hotelB=305000, hotelS=335000, hotelT=355000, makanL=75000, makanB=55000, makanS=85000, makanT=105000, snorkling=250000, belanja=300000, studio=360000, ski=325000, hargaL, hargaB, hargaS, hargaT;

		System.out.println("========WELCOME TO TRAVEL 79.com========");
		System.out.println("\nTentukan dengan mudah destinasi terbaikmu");
		System.out.print("Nama: ");
		nama=scan.next();
		System.out.print("Berapa orang yang ikut travel bersamamu? ");
		jum=scan.nextInt();
		System.out.print("Berapa hari kamu akan pergi? ");
		hari=scan.nextInt();
		System.out.print("Budget kami berapa, "+nama+"? ");
		budget=scan.nextInt();

		hargaL=jum*ppL+(jum+(jum%2))/2*hotelL*hari+jum*makanL*hari;
		hargaB=jum*ppB+(jum+(jum%2))/2*hotelB*hari+jum*makanB*hari;
		hargaS=jum*ppS+(jum+(jum%2))/2*hotelS*hari+jum*makanS*hari;
		hargaT=jum*ppT+(jum+(jum%2))/2*hotelT*hari+jum*makanT*hari;

		if(budget>hargaT){
			System.out.println("\nRekomendasi kami untuk "+nama+" adalah Tokyo");
			if ((budget-hargaT)>=ski){
				System.out.println("\nApakah kamu ingin ski? (y/n) ");
				pilih=scan.next();
				if(pilih.equals("y"))
					System.out.println("\nTotal yang harus kamu bayar untuk ke Tokyo adalah "+(hargaT+ski*jum));
				else
					System.out.println("\nTotal yang harus kamu bayar untuk ke Tokyo adalah "+hargaT);
			}
			else
				System.out.println("\nTotal yang harus kamu bayar untuk ke Tokyo adalah "+hargaT);
		}
		else if(budget>hargaB){
			System.out.println("\nRekomendasi kami untuk "+nama+" adalah Bangkok");
			if ((budget-hargaB)>=belanja){
				System.out.println("\nApakah kamu ingin belanja? (y/n) ");
				pilih=scan.next();
				if(pilih.equals("y"))
					System.out.println("\nTotal yang harus kamu bayar untuk ke Bangkok adalah "+(hargaB+belanja*jum));
				else
					System.out.println("\nTotal yang harus kamu bayar untuk ke Bangkok adalah "+hargaB);
			}
			else
				System.out.println("\nTotal yang harus kamu bayar untuk ke Bangkok adalah "+hargaB);
		}
		else if(budget>hargaL){
			System.out.println("\nRekomendasi kami untuk "+nama+" adalah Lombok");
			if ((budget-hargaL)>=snorkling){
				System.out.println("\nApakah kamu ingin snorkling? (y/n) ");
				pilih=scan.next();
				if(pilih.equals("y"))
					System.out.println("\nTotal yang harus kamu bayar untuk ke Lombok adalah "+(hargaL+snorkling*jum));
				else
					System.out.println("\nTotal yang harus kamu bayar untuk ke Lombok adalah "+hargaL);
			}
			else
				System.out.println("\nTotal yang harus kamu bayar untuk ke Lombok adalah "+hargaL);
		}
		else if(budget>hargaS){
			System.out.println("\nRekomendasi kami untuk "+nama+" adalah Singapura");
			if ((budget-hargaS)>=studio){
				System.out.println("\nApakah kamu ingin ke universal studio? (y/n) ");
				pilih=scan.next();
				if(pilih.equals("y"))
					System.out.println("\nTotal yang harus kamu bayar untuk ke Singapura adalah "+(hargaS+studio*jum));
				else
					System.out.println("\nTotal yang harus kamu bayar untuk ke Singapura adalah "+hargaS);
			}
			else
				System.out.println("\nTotal yang harus kamu bayar untuk ke Singapura adalah "+hargaS);
		}
		else
			System.out.println();
	}
}
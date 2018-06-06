//Created ny : Hendra Kurniawan
//Date : 24 Mei 2018 Time : 10:06 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingMalik{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int jPensil, kesempatan = 5, tebakan, acakPensil, point=0;
		String tukar;
		System.out.print("Masukan Jumlah Pensil Kamu : ");
		jPensil = keyboard.nextInt();

		while(kesempatan > 0)
		{
			acakPensil = rand.nextInt(jPensil)+1;

			System.out.print("Coba tebak ada berapa pensil ?");
			tebakan = keyboard.nextInt();
			System.out.println("=============================");
			if(tebakan == acakPensil)
			{	
				System.out.println("Wow , Kamu Benar..");
				kesempatan+=1;
				point +=10;
			}
			else 
			{
				System.out.println("Kamu Salah, yang bener "+ acakPensil);
				kesempatan -= 1;

			}
			
			if(kesempatan == 0 && point >= 10)
			{
				System.out.println("HHmmmmm.....");
				System.out.print("kamu ingin menukar 10 poin dengan 1 Kesempatan(y/n)?");
				tukar = keyboard.next();
				if(tukar.equals("y"))
				{
					kesempatan += 1;
					System.out.println("Selamat Kamu punya 1 kesempatan Lagi.");
				}
			}


		}
		System.out.println("==================");
		System.out.println("Game Over!!! ");
		System.out.println("Poin  : " + point);
		System.out.println("==================");
	}
}
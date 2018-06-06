//Created ny : Hendra Kurniawan
//Date : 24 Mei 2018 Time : 2:19 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingRizaldi{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		double modal1=100000,modal2=100000, point1=0, point2=0,pointTotal1=0,pointTotal2=0;
		int pilih;

		while(pointTotal1 <1000 && pointTotal2 <1000 && modal1 >0 && modal2>0)
		{	
			System.out.println("\nTurn PLAYER 1 ");
			System.out.println("===================");
			System.out.println("Kriteria Lotre");
			System.out.println("===================");
			System.out.println("1.Harga = 100 (Point 0-10)");
			System.out.println("2.Harga = 200 (Point 0-20)");
			System.out.println("3.Harga = 300 (Point 0-50)");
			System.out.println("4.Harga = 500 (Point 0-100)");
			System.out.print("Pilih Lotre (1-4): ");
			pilih = keyboard.nextInt();

			if(pilih == 1)
			{
				point1 = rand.nextInt(11);
				modal1 -= 100;
			}

			else if(pilih == 2)
			{
				point1 = rand.nextInt(21);
				modal1 -= 200;
			}
			else if(pilih == 3)
			{
				point1 = rand.nextInt(51);
				modal1 -= 300;
			}
			else if(pilih ==4)
			{
				point1 = rand.nextInt(101);
				modal1 -= 500;
			}
			pointTotal1 += point1;
		System.out.println("Modal Kamu Tinggal Segini "+ modal1);
		System.out.println("Point Kamu = "+ pointTotal1);

			System.out.println("\nTurn PLAYER 2");
			System.out.println("===================");
			System.out.println("Kriteria Lotre");
			System.out.println("===================");
			System.out.println("1.Harga = 100 (Point 0-10)");
			System.out.println("2.Harga = 200 (Point 0-20)");
			System.out.println("3.Harga = 300 (Point 0-50)");
			System.out.println("4.Harga = 500 (Point 0-100)");
			System.out.print("Pilih Lotre (1-4): ");
			pilih = keyboard.nextInt();

		 	if(pilih == 1)
			{
				point2 = rand.nextInt(11);
				modal2 -= 100;
			}

			else if(pilih == 2)
			{
				point2 = rand.nextInt(21);
				modal2 -= 200;
			}
			else if(pilih == 3)
			{
				point2 = rand.nextInt(51);
				modal2 -= 300;
			}
			else if(pilih ==4)
			{
				point2 = rand.nextInt(101);
				modal2 -= 500;
			}
			pointTotal2 += point2;
		System.out.println("Modal Kamu Tinggal Segini "+ modal2);
		System.out.println("Point Kamu = "+ pointTotal2);

		}

		if(pointTotal1 >1000)
		{
			System.out.println("SELAMAT PLAYER 1 MENANG!!");
		}
		else if(pointTotal2 >1000)
		{
			System.out.println("SELAMAT PLAYER 2 MENANG!!");
		}
		if(modal1 <0)
		{
			System.out.println("Kamu Kalah Dan Tidak Dapat Point LOTRE");	
		}
		else if(modal2 <0)
		{
			System.out.println("Kamu Kalah Dan Tidak Dapat Point LOTRE");	
		}
	}
}
//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 2:33 AM
//Modified :
import java.util.Scanner;

public class RichaIf3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double rabAwal = 50000, denda = 1000, rabTotal=50000;
		double perfIron, perfThor,perfHulk,perfCaptain,perfSpider;
		double belIron = 15000,belThor = 32000, belHulk = 13500, belCaptain = 20500,belSpider=5000;

		System.out.println("Daftar Performa Avenger !!");
		System.out.println("=================================");
		System.out.print("Iron man        :");
		perfIron = keyboard.nextDouble();
		System.out.print("Thor            :");
		perfThor = keyboard.nextDouble();
		System.out.print("Hulk            :");
		perfHulk = keyboard.nextDouble();
		System.out.print("Captain America :");
		perfCaptain = keyboard.nextDouble();
		System.out.print("Spiderman       :");
		perfSpider = keyboard.nextDouble();

		//iron
		if(perfIron<3)
		{
			rabTotal += denda;
			rabAwal += denda;
		}
		if(perfIron >=3 && perfIron <=5)
		{
			rabTotal -=belIron*0.3; 
		}
		if(perfIron >=5.1 && perfIron <=7)
		{
			rabTotal -=belIron*0.5; 
		}
		if(perfIron >=7.1 && perfIron <=9)
		{
			rabTotal -=belIron*0.75; 
		}
		if(perfIron >=9.1 && perfIron <=10)
		{
			rabTotal -=belIron; 
		}

		//thor
		if(perfThor<3)
		{
			rabTotal += denda;
			rabAwal += denda;
		}
		if(perfThor >=3 && perfThor <=5)
		{
			rabTotal -=belThor*0.3; 
		}
		if(perfThor >=5.1 && perfThor <=7)
		{
			rabTotal -=belThor*0.5; 
		}
		if(perfThor >=7.1 && perfThor <=9)
		{
			rabTotal -=belThor*0.75; 
		}
		if(perfThor >=9.1 && perfThor <=10)
		{
			rabTotal -=belThor; 
		}

		//hulk
		if(perfHulk<3)
		{
			rabTotal += denda;
			rabAwal += denda;
		}
		if(perfHulk >=3 && perfHulk <=5)
		{
			rabTotal -=belHulk*0.3; 
		}
		if(perfHulk >=5.1 && perfHulk <=7)
		{
			rabTotal -=belHulk*0.5; 
		}
		if(perfHulk >=7.1 && perfHulk <=9)
		{
			rabTotal -=belHulk*0.75; 
		}
		if(perfHulk >=9.1 && perfHulk <=10)
		{
			rabTotal -=belHulk; 
		}

		//captain
		if(perfCaptain<3)
		{
			rabTotal += denda;
			rabAwal += denda;
		}
		if(perfCaptain >=3 && perfCaptain <=5)
		{
			rabTotal -=belCaptain*0.3; 
		}
		if(perfCaptain >=5.1 && perfCaptain <=7)
		{
			rabTotal -=belCaptain*0.5; 
		}
		if(perfCaptain >=7.1 && perfCaptain <=9)
		{
			rabTotal -=belCaptain*0.75; 
		}
		if(perfCaptain >=9.1 && perfCaptain <=10)
		{
			rabTotal -=belCaptain; 
		}

		//spider
			if(perfSpider<3)
		{
			rabTotal += denda;
			rabAwal += denda;
		}
		if(perfSpider >=3 && perfSpider <=5)
		{
			rabTotal -=belSpider*0.3; 
		}
		if(perfSpider >=5.1 && perfSpider <=7)
		{
			rabTotal -=belSpider*0.5; 
		}
		if(perfSpider >=7.1 && perfSpider <=9)
		{
			rabTotal -=belSpider*0.75; 
		}
		if(perfSpider >=9.1 && perfSpider <=10)
		{
			rabTotal -=belSpider; 
		}

		if(rabTotal <0)
		{
			System.out.println("RAB Tidak mencukupi!!!!");
		}
		rabAwal -= rabTotal;
		System.out.println("RAB digunakan : " + rabAwal);
		System.out.println("Sisa RAB      : " +rabTotal);
	}
}
//Created ny : Hendra Kurniawan
//Date : 24 Mei 2018 Time : 2:19 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingRicha{
	public static void main(String[] args) {
		double gajiawal  = 1500000 ,sumGaji = 1500000;
		int tahun=1, batas = 25,umur=31;
		String naik;
		Scanner keyboard= new Scanner(System.in);


			System.out.println("======================");
			System.out.println("Gaji Pak Jokowi");
			System.out.println("======================");
		for(int i =1;i<=batas;i++)
		{
			
			System.out.println("Umur  : "+ umur+ " Tahun");
			System.out.print(  "Naik pangkat(y/n):");
			naik = keyboard.next();
			System.out.println("======================");
			if(naik.equals("y"))
			{
				sumGaji = sumGaji *2;
			}
			System.out.println("Gaji :%.2f",sumGaji);
			System.out.println();
			
			if(naik.equals("n"))
			{
				sumGaji = sumGaji + (sumGaji*0.05);
			}
			umur++;
			tahun++;
		}

	}
}
/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	10.10
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfArief2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String merk, status;
		int hdd, ram, harga;
		double processor;

		System.out.println("_____________________________________________\n");
		System.out.println("         PORORO LAPTOP AND PC CENTER");
		System.out.println("_____________________________________________\n");
		System.out.print("Merk         : ");
		merk=scan.nextLine();
		System.out.print("RAM          : ");
		ram=scan.nextInt();
		System.out.print("HDD (GB)     : ");
		hdd=scan.nextInt();
		System.out.print("Processor    : ");
		processor=scan.nextDouble();
		System.out.print("Harga        : ");
		harga=scan.nextInt();

		if(merk.equals("keroro") && harga>=10000000)
			status="Anda Sultan Fanboy";
		else if(merk.equals("keroro"))
			status="Anda  Fanboy";
		else if(processor>=4.2)
			status="Gaming Nerd";
		else if(ram<8 || hdd<500)
			status="Laptop Ngelag";
		else if(harga>=7000000 && harga<=10000000 && processor>=2.8 && processor<=3.5)
			status="Setuju untuk dibeli";
		else
			status="Tidak jadi beli";

		System.out.println("\nStatus       : "+status);
		System.out.println("_____________________________________________\n");
		System.out.println("             Semoga Bermanfaat");
		System.out.println("_____________________________________________\n");

	}
}
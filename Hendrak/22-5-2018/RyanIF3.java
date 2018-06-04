//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 7:15 AM
//Modified : 
import java.util.Scanner;

public class RyanIF3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int kicau;
		String warna1, warna2;
		double hargaBurung;
		hargaBurung = 300000;
		System.out.print("Banyak kicau dalam sehari : ");
		kicau = keyboard.nextInt();
		System.out.print("Warna burung : ");
		warna1 = keyboard.next();
		System.out.print("Warna tambahan burung :");
		warna2 = keyboard.next();
		if((kicau==3 || kicau <5)&& warna1.equals("merah")&&warna2.equals("biru"))
		{
			System.out.println("Ayah membeli burung tersebut dengan harga Rp." + hargaBurung);			
		}
		else if((kicau==5 || kicau <7)&& warna1.equals("merah")&&warna2.equals("biru"))
		{
				System.out.println("Ayah membeli burung tersebut dengan harga Rp." + hargaBurung*1.5);			
		}
		else if((kicau==7 || kicau <9)&& warna1.equals("merah")&&warna2.equals("biru"))
		{
				System.out.println("Ayah membeli burung tersebut dengan harga Rp." + hargaBurung*3);			
		}
		else if((kicau==9 || kicau <11)&& warna1.equals("merah")&&warna2.equals("biru"))
		{
				System.out.println("Ayah membeli burung tersebut dengan harga Rp." + hargaBurung*4.5);			
		}
		else 
		{
			System.out.println("Ayah tidak tertarik!!");
		}
	}
	

}
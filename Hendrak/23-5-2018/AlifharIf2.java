//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 9:33 PM
//Modified : 
import java.util.Scanner;
public class AlifharIf2{
	public static void main(String[] args) {
		String bil,ket1="",ket2="satuan";
		int temp;
		Scanner keyboard = new Scanner(System.in);
		char aDepan,aBelakang;

		System.out.println("========================");
		System.out.print("Masukan angka (1-9999):");
		bil = keyboard.next();
		System.out.println("=========================");
		
		
		temp = bil.length();

		System.out.println(temp);
		 aDepan = bil.charAt(0);
		 aBelakang = bil.charAt(0);
		
		if(temp==1)
		{
		ket1 = "satuan";
		}
		else if(temp ==2 )
		{
		aBelakang = bil.charAt(1);
		ket1 = "puluhan";

		}
		else if(temp ==3 )
		{
		aBelakang = bil.charAt(2);
		ket1 = "ratusan";	
		}
		else if(temp ==4 )
		{
		aBelakang = bil.charAt(3);
		ket1 = "ribuan";	
		}

		System.out.println("Angka Terdepan         : "+ aDepan + " dengan nilai " +ket1);
		System.out.println("Angka Paling Belakang  : "+aBelakang + " dengan nilai " + ket2);
	}

}
//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 8:38 PM
//Modified by :
import java.util.Scanner;

public class Yanaif1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double tas, dompet, sepatu,jas, kemeja , dasi,uang;
		tas = 60000;
		dompet = 40000;
		sepatu = 120000;
		jas = 250000;
		kemeja = tas + dompet;
		dasi = dompet;

		System.out.println("=============================");
		System.out.print("Masukan nominal uang budi : ");
		uang = keyboard.nextDouble();

		if(uang >= tas)
		{ 
			System.out.println("Budi membeli tas seharga Rp."+tas);
			uang = uang - tas;
		} 

		if(uang >= dompet)
		{ 
			System.out.println("Budi membeli dompet seharga Rp."+dompet);
			uang = uang - dompet;
		} 
		if(uang >= sepatu)
		{
			System.out.println("Budi membeli sepatu seharga Rp."+sepatu);
			uang = uang - sepatu;
		}
		if(uang >= jas)
		{
			System.out.println("Budi membeli jas seharga Rp."+jas);
			uang = uang - jas;
		}
		if(uang >= kemeja)
		{
			System.out.println("Budi membeli kemeja seharga Rp."+kemeja);
			uang = uang - kemeja;
		}
		if(uang >= dasi)
		{
			System.out.println("Budi membeli dasi seharga Rp."+dasi);
			uang = uang - dasi;
		}

		System.out.println("Sisa uang budi adalah Rp. " +uang);
	}
}
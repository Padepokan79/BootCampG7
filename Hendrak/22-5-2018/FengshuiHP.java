//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 7:46 PM
//Modified by :
import java.util.Scanner;

public class FengshuiHP{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String noHp;
		boolean cek;

		System.out.print("Masukan nomor HP kamu :");
		noHp = keyboard.next();
		
		for(int i =0;i< noHp.length();i++)
		{
			if(noHp.charAt(i) == '0')
			{
				System.out.println(noHp.charAt(i) +"  khusus, special, langka");
			}
			if(noHp.charAt(i) == '1')
			{
				System.out.println(noHp.charAt(i) +" satu, satu-satunya, diri sendiri");
			}
			if(noHp.charAt(i) == '2')
			{
				System.out.println(noHp.charAt(i) +" mudah, gampang, tidak sulit");
			}	
			if(noHp.charAt(i) == '3')
			{
				System.out.println(noHp.charAt(i) +" menemukan, mendapatkan, hidup");
			}
			if(noHp.charAt(i) == '4')
			{
				System.out.println(noHp.charAt(i) +" mati, miskin, hidup");
			}		
			if(noHp.charAt(i) == '5')
			{
				System.out.println(noHp.charAt(i) +" tidak akan, tidak pernah, tidak bisa");
			}
			if(noHp.charAt(i) == '6')
			{
				System.out.println(noHp.charAt(i) +" menuju , akan");
			}
			if(noHp.charAt(i) == '7')
			{
				System.out.println(noHp.charAt(i) +" tepat, hoki, atau bisa disebut juga ketuhanan");
			}
			if(noHp.charAt(i) == '8')
			{
				System.out.println(noHp.charAt(i) +" makmur");
			}
			if(noHp.charAt(i) == '9')
			{
				System.out.println(noHp.charAt(i) +" sukses");
			}
		}
			
		}

	}

/*
 
*/
/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	11.25
	* Updated by:
	*
*/

public class Rizaldi1{
	public static void main(String[] args){
		System.out.println("Adi membeli 20 bungkus roti dan 20 botol air mineral,");
		System.out.println("jika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral.");
		System.out.println("berapa sisa roti dan air mineral jika adi merasa lapar 15 kali?");

		double roti=20, air=20;
		roti=roti-1*15;
		air=air-0.5*15;
		System.out.println("\nSisa roti "+roti);
		System.out.println("Sisa air mineral "+air);
	}
}
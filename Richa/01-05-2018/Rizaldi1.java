public class Rizaldi1 {
	public static void main (String[] args) {

		double roti, air, laparRoti, laparAir, sisaRoti, sisaAir;
		
		roti = 20;
		air = 20;
		laparRoti = (1*15);
		laparAir = (0.5*15);
		sisaRoti= (roti-laparRoti);
		sisaAir = (air-laparAir);

		System.out.println ("1. Adi membeli 20 bungkus roti dan 20 botol air mineral,\njika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral.\nberapa sisa roti dan air mineral jika adi merasa lapar 15 kali. ?");
		System.out.println ("Jadi, sisa roti dan air yang dimiliki Adi adalah " + sisaRoti + " roti dan " + sisaAir + " air ");
	}
}


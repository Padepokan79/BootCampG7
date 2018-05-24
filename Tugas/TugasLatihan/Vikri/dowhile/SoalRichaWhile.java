/*
	Created By Vikri
	19/05/2018
	13:18
*/
public class SoalRichaWhile{
	public static void main(String[] args) {
		int gaji, umur, naikgaji;
		umur = 31;
		gaji = 1500000;

		System.out.println("Umur: "+umur);
		System.out.println("Gaji: Rp. "+gaji+"\n");
		do{
			umur++;
			System.out.println("Umur: "+umur);
			if (umur%5==0) {
				System.out.println("Naik Pangkat? ya");
				gaji = gaji*2;
				System.out.println("Gaji: Rp. "+gaji);
			} else {
				naikgaji = gaji*5/100;
				gaji = gaji + naikgaji;
				System.out.println("Naik Pangkat? tidak");
				System.out.println("Gaji: Rp. "+gaji);
			}
			
			System.out.println("\n--------------------------");
		}while(umur<55);
	}
}
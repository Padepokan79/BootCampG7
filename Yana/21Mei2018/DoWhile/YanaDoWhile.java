/*
Creted by	: Yana
Time		: 18 Mei 2018 13.42
*/

import java.util.Random;

public class YanaDoWhile{
	public static void main(String[] args) {

		Random random = new Random();
		
		int	kelerengBudi = 200, kelerengMan=10, kelerengTono=500, 
			tambahanBudi=40/2, tambahanMan=120/3, tambahanTono=0, periodik=1, waktu1=0, waktu2=0;


		if (kelerengTono==500)
			tambahanTono = random.nextInt(1)+2;

		do{
			waktu1++;
			kelerengBudi 	= kelerengBudi + tambahanBudi;
			kelerengMan 	= kelerengMan + tambahanMan;
			kelerengTono	= kelerengTono + tambahanTono;
			System.out.println("waktu"+waktu1);
			System.out.println("Jumlah Kelereng Budi: "+kelerengBudi);
			System.out.println("Jumlah Kelereng Man: "+kelerengMan);
			System.out.println("Jumlah Kelereng Tono: "+kelerengTono);
		}while(kelerengMan < kelerengBudi);

		if (kelerengMan > kelerengBudi)
			tambahanTono = random.nextInt(1)+2;		

		kelerengTono	= kelerengTono + kelerengBudi;

		do{
			waktu2++;
			kelerengMan 	= kelerengMan + tambahanMan;
			kelerengTono	= kelerengTono + tambahanTono;
			System.out.println("waktu"+waktu2);
			System.out.println("Jumlah Kelereng Man: "+kelerengMan);
			System.out.println("Jumlah Kelereng Tono: "+kelerengTono);

		}while(kelerengMan < kelerengTono);
		waktu1	= waktu1 * periodik;
		waktu2	= (waktu1 + waktu2) * periodik;
		System.out.println("Jumlah kelereng Budi akan terkejar pada menit ke: " +waktu1);
		System.out.println("Jumlah kelereng Tono akan terkejar pada menit ke: " +waktu2);
	}
}

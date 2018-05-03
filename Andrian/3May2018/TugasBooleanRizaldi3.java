/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanRizaldi3 {
		public static void main(String[]args){
			Scanner key = new Scanner(System.in);
			String air,waktu;
			int udara, temperatur, umur, minimumUdara, umurMinimal, titikrendah, titiktinggi, umurMaksimal;
			double kadarO2, o2;
			boolean hasil;

			minimumUdara = 500000 ;
			titikrendah = 32 ;
			titiktinggi = 40 ;
			umurMinimal = 45 ;
			umurMaksimal = 200 ;


			System.out.println("Apakah ada air(ada/tidak): ");
			air = key.next();

			System.out.println("Seberapa besar total udara disana:");
			udara = key.nextInt();

			System.out.println("Seberapa besar kadar o2 disana dalam ton/kubik: ");
			o2 = key.nextInt();

			System.out.println("Berapa temperatur disana dalam derajat selsius: ");
			temperatur = key.nextInt();

			System.out.println("Bagaimana waktu disana(siang/malam): ");
			waktu = key.next();

			System.out.println("berapa umur planet tersebut(dalam miliar): ");
			umur = key.nextInt();

			kadarO2 = udara*(0.2);

			hasil = air.equals("ada") && udara>=minimumUdara && o2>=kadarO2 && (temperatur >= titikrendah && temperatur <= titiktinggi) && (umur >= umurMinimal && umur <= umurMaksimal) && (waktu.equals("siang") || waktu.equals("malam"));

			System.out.println("Apakah planet tersebut layak dihuni ? "+ hasil);

		}
	}
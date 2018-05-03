/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanRizaldi2 {
		public static void main(String[]args){
			Scanner	key = new Scanner(System.in);
			Scanner	key1 = new Scanner(System.in);
			String makan,minum,berak;
			boolean hasil;

			System.out.println("Apakah yang dimakan sasuke: ");
			makan = key.next();

			System.out.println("Apakah yang dinimu sasuke: ");
			minum = key1.nextLine();

			System.out.println("Apakah yang dimana sasuke boker: ");
			berak = key.next();

			hasil = ( makan.equals("rumput") || makan.equals("dedak") ) && minum.equals("air hujan") && berak.equals("pasir");

			System.out.println("Apakah dengan semua itu sasuke dapat tertidur? " +hasil );

		}
	}
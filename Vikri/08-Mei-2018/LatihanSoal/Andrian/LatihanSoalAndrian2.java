//Created by vikri
//08-05-2018
public class LatihanSoalAndrian2{
	public static void main(String[] args) {
		int apel, jeruk, apel1, jeruk1, ap, jer, hasil, hasil1, total;
		
		apel = 2;
		jeruk = 1;

		apel1  = 1;
		jeruk1 = 2;

		hasil = 3400;
		hasil1 = 4100;

		apel =apel*2;
		jeruk = jeruk*2;
		apel = apel-apel1;

		hasil = hasil*2;
		ap = (hasil-hasil1);
		ap = ap/apel;

		jer = (hasil/2)-(2*ap);

		System.out.println("Harga Satu Apel adalah  : "+ap+"\n"+
						   "Harga Satu Jeruk adalah : "+jer);
	}	
}
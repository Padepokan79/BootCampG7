/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;

public class TugasForHPFensui {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int number, startNUmber=0, end;
		String noHp, nol, satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan;

		nol = "khusus, special, langka";
		satu ="satu, satu-satunya, diri sendiri";
		dua = "mudah, gampang, tidak sulit";
		tiga = "menemukan, mendapatkan, hidup";
		empat = "mati, miskin, susah";
		lima = "Tidak akan, tidak pernah, tidak bisa";
		enam = "Menuju, akan";
		tujuh = "Tepat, hoki, atau bisa disebut juga ketuhanan";
		delapan = "Makmur";
		sembilan = "Sukses";


		System.out.println("Enter your number: ");
		noHp = key.nextLine();
		end = noHp.length();

		for (number=startNUmber; number<end; number++) {
			if (noHp.charAt(number) == '0') {
				System.out.print(noHp.charAt(number) + " " + nol);
			}
			else if (noHp.charAt(number) == '1') {
				System.out.print(noHp.charAt(number) + " " + satu);
			}
			else if (noHp.charAt(number) == '2') {
				System.out.print(noHp.charAt(number) + " " + dua);
			}
			else if (noHp.charAt(number) == '3') {
				System.out.print(noHp.charAt(number) + " " + tiga);
			}
			else if (noHp.charAt(number) == '4') {
				System.out.print(noHp.charAt(number) + " " + empat);
			}
			else if (noHp.charAt(number) == '5') {
				System.out.print(noHp.charAt(number) + " " + lima);
			}
			else if (noHp.charAt(number) == '6') {
				System.out.print(noHp.charAt(number) + " " + enam);
			}
			else if (noHp.charAt(number) == '7') {
				System.out.print(noHp.charAt(number) + " " + tujuh);
			}
			else if (noHp.charAt(number) == '8') {
				System.out.print(noHp.charAt(number) + " " + delapan);
			}
			else if (noHp.charAt(number) == '9') {
				System.out.print(noHp.charAt(number) + " " + sembilan);
			}
		}
	}
}
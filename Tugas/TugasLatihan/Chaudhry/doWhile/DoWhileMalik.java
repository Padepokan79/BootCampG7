/*
	DATE CREATED : 19 MEI 2018
	TIME CREATED : 10.50 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	Rangga menginputkan jumlah pensilnya sendiri 
	rangga akan menebak jumlah pensilnya sendiri yang diacak oleh komputer

- pertama bermain player memiliki 5 kesempatan yang diberikan
- bila tebakan player benar, maka player mendapatkan satu kesempatan dan menambahkan 10 poin untuk skor
- kesempatan berlaku bila ia salah menebak, maka kesempatan yang dimiliki berkurang
- bila player sudah tidak memiliki kesempatan, maka permainan berakhir atau GAME OVER
- terkecuali bila player memiliki poin min 10 dan kesempatan sudah habis maka program akan bertanya, apakah anda ingin menukar skor anda menjadi
  kesempatan?.
- bila Y, program bertanya : Berpa skor yang ingin anda tukar? ( 10 skor = 1 kesempatan )
- bila N, maka permainan berakhir dengan menampilkan skor terakhir
  *note : bila ada yang bingung bisa ditanyakan langsung
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileMalik{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);	
		Random rand = new Random();
		int inputJmlPensil, skorAkhir, inputSkor, inputJml, angkaRand, kesempatan, skorPoint, minPoint, kesempatanAwal;
		String status;
		status = "";
		kesempatanAwal = skorAkhir = 0;
		kesempatan = 5;
		minPoint = 10;
		skorPoint = 0;

		System.out.println("");	
		System.out.print("Jumlah pensil anda : ");
		inputJmlPensil = keyboard.nextInt();
		System.out.println("");		

		while(kesempatan > kesempatanAwal){
			System.out.println("=========================");
			angkaRand = rand.nextInt(inputJmlPensil) + 1;
			System.out.println("ACAK: "+angkaRand);

			System.out.println("Kesempatan : "+kesempatan);
			System.out.println("Skor       : " + skorPoint);
			System.out.print("Tebak Jumlah pensil : ");
			inputJml = keyboard.nextInt();

			if (inputJml == angkaRand) {
				System.out.println("TEBAKAN BENAR :)");
				kesempatan = kesempatan + 1;
				skorPoint += 10;
				System.out.println("=========================");
				System.out.println("");	
			}else{
					System.out.println("TEBAKAN SALAH :(");
					kesempatan = kesempatan - 1;
					skorPoint = skorPoint;
					System.out.println("=========================");
					System.out.println("");

				if (kesempatan == 0 && skorPoint >= 10){

					System.out.print("Apakah anda ingin menukar skor anda menjadi kesempatan (Y/N) ? ");
					status = keyboard.next();

						while(status.equals("Y")){
							System.out.print("Berapa skor yang ingin anda tukar ( 10 skor = 1 kesempatan ) ? ");
							inputSkor = keyboard.nextInt();
							
							if (inputSkor > skorPoint) {
								System.out.println("Inputan melebihi skor yang anda punya!!");
								System.out.println("");
							}
							else if (inputSkor < minPoint) {
								System.out.println("Inputan kurang dari ketentuan skor!!");
								System.out.println("");
							}
							else if(inputSkor <= skorPoint){
								skorAkhir = (inputSkor/10);
								kesempatan = skorAkhir;
								skorPoint = skorPoint - (kesempatan*10);
								status = "N";
							}
						}
						System.out.println("");
						System.out.println("--- GAME OVER ---");
						System.out.println("Skor anda : "+skorPoint+" point");

				}else if (kesempatan == 0 && skorPoint == 0) {
					System.out.println("--- GAME OVER ---");
					System.out.println("Skor anda : "+skorPoint+" point");
				}
			}
			kesempatan = kesempatan;
		}
	}
}
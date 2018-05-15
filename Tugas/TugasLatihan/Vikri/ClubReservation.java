/*
	Created By vikri
	14/05/2018
	13:31
*/
import java.util.Scanner;
public class ClubReservation{
	public static void main(String[] args) {
		int umur;
		String hari, jKelamin;
		double penampilan;
		boolean hari2;

		Scanner string = new Scanner(System.in);
		
		System.out.println(	"========================================\n"+
							"            Club Reservation\n"+
							"========================================");

		System.out.print("Hari yang diinginkan: ");
		hari = string.next();

		System.out.print("Umur anda: ");
		umur = string.nextInt();

		System.out.print("Jenis Kelamin: ");
		jKelamin = string.next();
		
		System.out.print("Penampilan: ");
		penampilan = string.nextDouble();

		hari2 = hari.equals("senin")||hari.equals("rabu")||hari.equals("minggu");

		System.out.println("========================================");
		if (hari.equals("jumat")&&umur>=40&&(jKelamin.equals("wanita")||jKelamin.equals("pria"))) {
			System.out.println("Reservasi Melodies Memori Berhasil");
		} else if(hari.equals("kamis")&&jKelamin.equals("wanita")&&umur>=21&&umur<=30&&penampilan>=8&&penampilan<=10){
			System.out.println("Reservasi Ladies Night 5a Berhasil");
		} else if(hari.equals("sabtu")&&(jKelamin.equals("wanita")||jKelamin.equals("pria"))&&umur>=21&&umur<=30&&penampilan>=8&&penampilan<=10) {
			System.out.println("Reservasi Jomblo Night 5a Berhasil");
		} else if(hari.equals("selasa")&&(jKelamin.equals("wanita")&&umur>=30&&umur<=45)&&(jKelamin.equals("pria")&&umur>=20&&umur<=25) ){
			System.out.println("Reservasi Brondong Night 5c Berhasil");
		} else if(hari2) {
			System.out.println("Reservasi club Umum Berhasil");
		} else {
			System.out.println("Reservasi Club gagal");
		}
		System.out.println("========================================");
	}
}
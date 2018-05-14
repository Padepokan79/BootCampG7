/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At :    
     * Updated By : 
     * Updated At : 
*/
import java.util.Scanner;

public class BooleanAlifhar2{
	public static void main(String[]args){

		Scanner keyboard = new Scanner(System.in);
		
		String warna, tahun;
		int kecepatan, kecepatanLama, kecepatanBaru;
		boolean hasil;

		kecepatanLama = 40;
		kecepatanBaru = 40+30;

		System.out.println("Warna Mobil : ");
		warna = keyboard.next();

		System.out.println("Kecepatan Mobil :");
		kecepatan = keyboard.nextInt();
		
		System.out.println("Keluaran tahun : ");
		tahun = keyboard.next();

		hasil = warna.equals("biru") && kecepatan > kecepatanBaru && ((tahun.equals("2016") || tahun.equals("2017")));

		System.out.println("Jadi Mobil dengan rincina diatas " + hasil + " Untuk dibeli Dheo");

	}
}
/*
Create by	: Yana
Time 		: 3 Mei 2018 21.28
Update by	:
*/

import java.util.Scanner;

public class AlifharBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		String	pensil, rambut;
		int		jumlahJawaban, jawabanBenar, jawabanKosong, jawabanSalah, 
				bobotBenar, bobotSalah, bobotKosong, nilaiMinimal, totalNilai, totalKedisiplinan;
		double	kerapihan;
		boolean lulus, disiplin;


		System.out.print("Jawaban Benar: ");
		jawabanBenar	= keyboard.nextInt();
		System.out.print("Jawaban Salah: ");
		jawabanSalah	= keyboard.nextInt();
		System.out.print("Jawaban Kosong: ");
		jawabanKosong	= keyboard.nextInt();
		System.out.print("Pensil (HB/2B/3B/4B/5B/6B): ");
		pensil	= keyboard.next();
		System.out.print("kerapihan: ");
		kerapihan	= keyboard.nextDouble();
		System.out.print("Rambut: ");
		rambut	= keyboard.next();


		bobotBenar	= 4;
		bobotSalah	= -1;
		bobotKosong	= 0;
		totalNilai	= ( jawabanBenar * bobotBenar ) + ( jawabanSalah* bobotSalah ) + ( jawabanKosong * bobotKosong );
		jumlahJawaban = jawabanBenar + jawabanSalah + jawabanKosong;
		lulus		= ( pensil.equals("2B") && totalNilai > 130 && jumlahJawaban == 60 && ( ( kerapihan >= 8 && kerapihan <=10.0 ) || rambut.equals("Pendek") ) );
		disiplin	= ( pensil.equals("2B") &&  ( ( kerapihan >= 8 && kerapihan <=10.0 ) || rambut.equals("Pendek") ) );
		
		System.out.println("Total Nilai: " +totalNilai);
		System.out.println("Kedisiplinan: " +disiplin);
		System.out.println("Anda Lulus: " +lulus);
	}
}
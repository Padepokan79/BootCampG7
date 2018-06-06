//Created by : Hendra Kurniawan
//Date : 29 Mei 2018 Time : 8:50 AM - 9.30 AM
//Modified :
import java.util.Scanner;

public class Quiz5Hendra{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int posisi, i ,j, nilai;
		int [] deretanNumber = new int[11];
		boolean validasi=true;
		deretanNumber[0]=2;deretanNumber[1]=39;deretanNumber[2]=47;deretanNumber[3]=14;deretanNumber[4]=36;deretanNumber[5]=56;deretanNumber[6]=57;deretanNumber[7]=49;deretanNumber[8]=43;deretanNumber[9]=79;

		for(int d : deretanNumber){
			System.out.print(d + " ");
		}

		do{
			System.out.print("\nMasukan angka yang mau disisipkan : ");
			nilai = keyboard.nextInt();
			System.out.print("Masukan posisi :");
			posisi = keyboard.nextInt();
			if(posisi>=1 && posisi <=10){
			validasi = true;
			}
			else if(posisi > 10){
				System.out.println("Maaf, input posisi tidak boleh dari sepuluh.");
			}
			else if(posisi <= 0){
				System.out.println("Maaf, input posisi tidak boleh kurang dari satu.");
			}else{
				System.out.println("Maaf, Input yang diterima hanya berupa angka.");
			}
		}while(!validasi);

		
		for(i=deretanNumber.length-1 ; i >= deretanNumber.length - posisi-1; i--){
			deretanNumber[i]= deretanNumber[i-1];
		}
		deretanNumber[posisi-1]=nilai;

		for(int d : deretanNumber){
			System.out.print(d + " ");
		}
	}
}
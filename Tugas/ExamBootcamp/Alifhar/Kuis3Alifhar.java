/*
	* created by Alifhar Juliansyah
	* 	29 May 2018		08.52
*/
import java.util.Scanner;

public class Kuis3Alifhar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input;
		String[] kata={"pertama", "kedua", "ketiga", "keempat", "kelima", "keenam", "ketujuh", "kedelapan", "kesembilan", "kesepuluh", "kesebelas", "keduabelas"};
		int keluarga=0, minKeluarga=2, maxKeluarga=6, tabungan=0, jumBulan=0, minBulan=1, maxBulan=12, jumlah=1000, bulan=0, rest;
		int[] jumHari={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean check=false;

		do{
			System.out.print("\nMasukan Jumlah keluarga : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				keluarga=Integer.parseInt(input);
				if(keluarga<minKeluarga){
					System.out.println("Maaf, jumlah keluarga tidak boleh kurang dari 2");
					System.out.println("Silahkan input kembali");
				}
				else if(keluarga>maxKeluarga){
					System.out.println("Maaf, jumlah keluarga tidak boleh lebih dari 6");
					System.out.println("Silahkan input kembali");
				}
				else
					check=true;
			} else{
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				System.out.println("Silahkan input kembali");
			}
		}while(!check);

		check=false;
		do{
			System.out.print("Masukan Lama tabungan : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				jumBulan=Integer.parseInt(input);
				if(jumBulan<minBulan){
					System.out.println("Maaf, Lama tabungan tidak boleh kurang dari 1");
					System.out.println("Silahkan input kembali");
				}
				else if(jumBulan>maxBulan){
					System.out.println("Maaf, Lama tabungan tidak boleh lebih dari 12");
					System.out.println("Silahkan input kembali");
				}
				else
					check=true;
			} else{
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				System.out.println("Silahkan input kembali");
			}
		}while(!check);
		int[] tabunganPerbulan=new int[jumBulan];

		System.out.println();
		while(bulan<jumBulan){
			rest=jumHari[bulan];
			for(int hari=0; hari<jumHari[bulan]; hari++){
				tabunganPerbulan[bulan]+=rest*jumlah*keluarga;
				rest--;
			}
			System.out.println("Tabungan pada bulan "+kata[bulan]+" sebesar "+tabunganPerbulan[bulan]);
			tabungan+=tabunganPerbulan[bulan];
			bulan++;
		}
		System.out.println("\nTotal tabungan selama "+jumBulan+" Bulan dengan "+keluarga+" anggota keluarga adalah "+tabungan);
	}
}

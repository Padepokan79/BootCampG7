// Created By vikri
// 22/06/2018

package warung;

import java.util.ArrayList;
import java.util.Scanner;

public class TestWarung {
	public static void main(String[] args) {
		String nama;
		double totalBeli = 0;
		int exit = 0;
		
		Warung b1 = new Warung("Teh Sobo", 1500, 5);
		Warung b2 = new Warung("Teh Sosoan", 1500, 5);
		
		ArrayList<Warung> al = new ArrayList<Warung>();
		al.add(b1);
		al.add(b2);
		
		Scanner scan = new Scanner(System.in);
			do {
				System.out.print("Yang mau dibeli ? ");
				nama = scan.nextLine();
				for(Warung a:al) {
					if(nama.equals(a.getNamaBarang())) {
						totalBeli += a.getHarga();
					} else if(nama.equals("udah")) {
						exit = 2;
					}
				}
			}while(exit < 1);
			
			for(Warung cek:al){
				System.out.println("Barang "+cek.getNamaBarang()+" dengan sisa qty "+cek.getQty());
			}
			System.out.println("\nTotal Beli: "+totalBeli);
	}
}

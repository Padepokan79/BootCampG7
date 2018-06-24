// Created by vikri 
// 12/05/2018
// 22:07
import java.util.Scanner;
public class SoalBooleanArief2{
	public static void main(String[] args) {
		boolean buka;
		String hari;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Hari Sekarang : ");
		hari = input.next();

		buka = hari.equals("jumat") || hari.equals("minggu"); 

		System.out.println("Toko Buka? "+!buka);
	}
}

/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	17.29
	* Updated by:
	*
*/
import java.util.Scanner;

public class Komandan{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		int batas, rest=0;
		String phr;

		System.out.print("Batas Segitiga :");
		batas=scan.nextInt();
		System.out.print("Kalimat :");
		phr=scan2.nextLine();

		for(int i=0; i<batas; i++){
			for(int j=i; j<batas-1;j++)
				System.out.print(" ");
			for(int k=0; k<(i+1); k++){
				if(rest<phr.length()){
					System.out.print(phr.charAt(rest)+" ");
					rest+=1;
				}
			}
			System.out.println();
		}
	}
}
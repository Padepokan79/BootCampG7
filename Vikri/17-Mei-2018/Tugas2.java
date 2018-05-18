/*
	Created By Vikri
	17/05/2018
	5:50
*/
import java.util.Scanner;
public class Tugas2{
	 public static void main(String[] args) {
        int bilangan, pembagi, batas, jml, pKalimat = 0;
        String kalimat;

        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        System.out.print("Kalimat: ");
        kalimat=string.nextLine();

        System.out.print("Batas: ");
        batas=input.nextInt();

        jml = kalimat.length();

        for (int i = 1; i <= batas; i++) {
            for (int j = i; j <= jml; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (i*2)-2; k+=2) {
                if (pKalimat<jml) {
                    System.out.print(kalimat.substring(pKalimat, pKalimat+1));
                    System.out.print(" ");
                    pKalimat++;
                }
            }
                System.out.println();
        }
    }
}
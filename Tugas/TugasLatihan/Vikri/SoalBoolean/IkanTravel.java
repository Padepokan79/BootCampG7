/*
	Created By Vikri
	14/05/2018
	13:54
*/
import java.util.Scanner;
public class IkanTravel{
	public static void main(String[] args) {
		int penumpang, harga, penumpang2;
		int hargaBis1, hargaBis2, hargaBis3, hargaBis4, hargaBis5, hargaBis6; 
		int penumpang60, penumpang45, penumpang32, penumpang18, penumpang12, penumpang6;
		Scanner string = new Scanner(System.in);

		System.out.print("masukan jumlah penumpang? ");
		penumpang=string.nextInt();

		hargaBis1 = 2300000;
		hargaBis2 = 2000000;
		hargaBis3 = 1800000;
		hargaBis4 = 1500000;
		hargaBis5 = 1300000;
		hargaBis6 = 2000000;

		penumpang60 = 60;
		penumpang45 = 45;
		penumpang32 = 32;
		penumpang18 = 18;
		penumpang12 = 12;
		penumpang6 = 6;

		System.out.println("Maka bis yang tersedia :\n");
		penumpang2 = penumpang*1;

		if (penumpang>=penumpang60) {
			if (penumpang2<=(penumpang60*2)&&penumpang2>105) {
		 		System.out.println("\t- 2 Bis dengan kursi 60 Seharga Rp. "+(hargaBis1+hargaBis1));	
			} else if (penumpang2==90) {
				System.out.println("\t- 2 Bis dengan kursi 45 dan 45 Seharga Rp. "+(hargaBis2+hargaBis2));
			} else if(penumpang<=63&&penumpang2>=61){
				System.out.println("\t- 2 Bis dengan kursi 45 dan 18 Seharga Rp. "+(hargaBis2+hargaBis4));
			} else if(penumpang2<=105&&penumpang2>92){
				System.out.println("\t- 2 Bis dengan kursi 60 dan 45 Seharga Rp. "+(hargaBis1+hargaBis2));
			} else if(penumpang2<=92&&penumpang2>78){
				System.out.println("\t- 2 Bis dengan kursi 60 dan 32 Seharga Rp. "+(hargaBis1+hargaBis3));
			} else if(penumpang2<=78&&penumpang2>72){
				System.out.println("\t- 2 Bis dengan kursi 60 dan 18 Seharga Rp. "+(hargaBis1+hargaBis4));
			} else if(penumpang2<=72&&penumpang2>=64){
				System.out.println("\t- 2 Bis dengan kursi 60 dan 12 Seharga Rp. "+(hargaBis1+hargaBis5));
			} else if (penumpang2==60){
				System.out.println("\t- Bis dengan kursi 60");
			}
		} else if(penumpang2>=45&&penumpang2<60){
			if (penumpang2<=59&&penumpang2>57) {
		 		System.out.println("\t- 2 Bis dengan kursi 18 dan 45 "+(hargaBis2+hargaBis3));	
			} else if (penumpang2==50) {
				System.out.println("\t- 2 Bis dengan kursi 45 dan 12 Seharga Rp. "+(hargaBis2+hargaBis5));
				System.out.println("\t- 2 Bis dengan kursi 18 dan 32 Seharga Rp. "+(hargaBis4+hargaBis3));
			} else if(penumpang2<=56&&penumpang2>45){
				System.out.println("\t- 2 Bis dengan kursi 45 dan 12 Seharga Rp. "+(hargaBis2+hargaBis5));
			} else if(penumpang2==45){
				System.out.println("\t- 1 Bis dengan kursi 45 Seharga Rp. "+hargaBis2);
			} else if(penumpang2==57){
				System.out.println("\t- 2 Bis dengan kursi 12 dan 45 "+(hargaBis2+hargaBis5));
			}
		} else if (penumpang2>=32&&penumpang2<45) {
			if (penumpang2<=44&&penumpang>36) {
				System.out.println("\t- 2 Bis dengan kursi 32 dan 12 Seharga Rp. "+(hargaBis3+hargaBis5));
			} else if(penumpang2==32){
				System.out.println("\t- 1 Bis dengan kursi 32 Seharga Rp. "+hargaBis3);
			} else if (penumpang2<=36&&penumpang2>33) {
				System.out.println("\t- 1 Bis dengan kursi 32 Seharga Rp. "+hargaBis3);
			}
		} else if (penumpang2>=18&&penumpang2<=31) {
			if (penumpang2<31&&penumpang>24) {
				System.out.println("\t- 2 Bis dengan kursi 18 dan 12 Seharga Rp. "+(hargaBis4+hargaBis5));
			} else if(penumpang2<=24&&penumpang2>18) {
				System.out.println("\t- 2 Bis dengan kursi 12 dan 12 Seharga Rp. "+(hargaBis5+hargaBis5));
			} else if(penumpang2==18){
				System.out.println("\t- 1 Bis dengan kursi 18  Seharga Rp. "+hargaBis4);
			} else if (penumpang2==31) {
				System.out.println("\t- 2 Bis dengan kursi 18 dan 18  Seharga Rp. "+(hargaBis4+hargaBis4));
			}
		} else if (penumpang2>=12&&penumpang2<18) {
			if (penumpang2<=17&&penumpang>12) {
				System.out.println("\t- 2 Bis dengan kursi 12 dan 12 Seharga Rp. "+(hargaBis5+hargaBis5));
			} else if(penumpang2==12){
				System.out.println("\t- 1 Bis dengan kursi 12 Seharga Rp. "+hargaBis5);
			}
		} else if (penumpang2>0&&penumpang2<=11) {
			if (penumpang2>6&&penumpang2<=11) {
				System.out.println("\t- 2 Bis dengan kursi 6 dan 6 Eksekutif Seharga Rp. "+(hargaBis6+hargaBis6));
			} else {
				System.out.println("\t- 1 Bis dengan kursi 6 Eksekutif  Seharga Rp. "+hargaBis6);
			}
		}
	}
}
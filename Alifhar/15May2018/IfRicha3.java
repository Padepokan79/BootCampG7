/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	15.15
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfRicha3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double scaleI, scaleT, scaleH, scaleC, scaleS, total, penalty=0;
		double statI=15000, statT=32000, statH=13500, statC=20500, statS=5000, rab=50000; 

		System.out.println("Daftar Performa Avengers");
		System.out.print("Iron man: ");
		scaleI=scan.nextDouble();
		System.out.print("Thor: ");
		scaleT=scan.nextDouble();
		System.out.print("Hulk: ");
		scaleH=scan.nextDouble();
		System.out.print("Captain america: ");
		scaleC=scan.nextDouble();
		System.out.print("Spiderman: ");
		scaleS=scan.nextDouble();

		if(scaleI>=0 && scaleI<3){
			statI=0;
			penalty+=1000;
		}
		else if(scaleI>=3 && scaleI<=5)
			statI*=0.3;
		else if(scaleI>5 && scaleI<=7)
			statI*=0.5;
		else if(scaleI>7 && scaleI<=9)
			statI*=0.75;
		else if(scaleI>9 && scaleI<=10);
		else
			statI=0;

		if(scaleT>=0 && scaleT<3){
			statT=0;
			penalty+=1000;
		}
		else if(scaleT>=3 && scaleT<=5)
			statT*=0.3;
		else if(scaleT>5 && scaleT<=7)
			statT*=0.5;
		else if(scaleI>7 && scaleT<=9)
			statT*=0.75;
		else if(scaleT>9 && scaleT<=10);
		else
			statT=0;

		if(scaleH>=0 && scaleH<3){
			statH=0;
			penalty+=1000;
		}
		else if(scaleH>=3 && scaleH<=5)
			statH*=0.3;
		else if(scaleH>5 && scaleH<=7)
			statH*=0.5;
		else if(scaleH>7 && scaleH<=9)
			statH*=0.75;
		else if(scaleH>9 && scaleH<=10);
		else
			statH=0;

		if(scaleC>=0 && scaleC<3){
			statC=0;
			penalty+=1000;
		}
		else if(scaleC>=3 && scaleC<=5)
			statC*=0.3;
		else if(scaleC>5 && scaleC<=7)
			statC*=0.5;
		else if(scaleC>7 && scaleC<=9)
			statC*=0.75;
		else if(scaleC>9 && scaleC<=10);
		else
			statC=0;

		if(scaleS>=0 && scaleS<3){
			statS=0;
			penalty+=1000;
		}
		else if(scaleS>=3 && scaleS<=5)
			statS*=0.3;
		else if(scaleS>5 && scaleS<=7)
			statS*=0.5;
		else if(scaleS>7 && scaleS<=9)
			statS*=0.75;
		else if(scaleS>9 && scaleS<=10);
		else
			statS=0;

		total=statI+statT+statH+statC+statS;
		System.out.println();

		if(rab<total)
			System.out.println("Maaf, RAB tidak mencukupi");
		else{
			rab-=total-penalty;
			System.out.println("Total RAB yang digunakan: $"+total);
			System.out.println("Sisa RAB termasuk denda : $"+rab);
		}
	}
}
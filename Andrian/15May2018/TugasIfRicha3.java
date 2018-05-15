/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfRicha3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double total, performaIronMan, performaThor, performaHulk, performaCaptAmrik, performaSpiderman, pinalty=0;
			double statusIronMan=15000, statusThor=32000, statusHulk=13500, statusCaptAmrik=20500, statusSpiderman=5000, rab=50000;

			System.out.println("Daftar performa avengers!");
			System.out.println("Iron man :");
			performaIronMan = key.nextDouble();
			System.out.println("Thor :");
			performaThor = key.nextDouble();
			System.out.println("Hulk :");
			performaHulk = key.nextDouble();
			System.out.println("Captain Amerika :");
			performaCaptAmrik = key.nextDouble();
			System.out.println("Spiderman :");
			performaSpiderman = key.nextDouble();

			if (performaIronMan<3) {
				statusIronMan= 0;
				pinalty += 1000;
			}
			else if (performaIronMan>=3 && performaIronMan<=5){
				statusIronMan*=0.3;
			}
			else if (performaIronMan>5 && performaIronMan<=7) {
				statusIronMan*=0.5;
			}
			else if (performaIronMan>7 && performaIronMan<=9) {
				statusIronMan*=0.75;
			}
			else if (performaIronMan>9 && performaIronMan<=10) {
			}
			else {
				statusIronMan=0;
			}

			if (performaThor<3) {
				statusThor= 0;
				pinalty += 1000;
			}
			else if (performaThor>=3 && performaThor<=5){
				statusThor*=0.3;
			}
			else if (performaThor>5 && performaThor<=7) {
				statusThor*=0.5;
			}
			else if (performaThor>7 && performaThor<=9) {
				statusThor*=0.75;
			}
			else if (performaThor>9 && performaThor<=10) {
			}
			else {
				statusThor=0;
			}

			if (performaHulk<3) {
				statusHulk= 0;
				pinalty += 1000;
			}
			else if (performaHulk>=3 && performaHulk<=5){
				statusHulk*=0.3;
			}
			else if (performaHulk>5 && performaHulk<=7) {
				statusHulk*=0.5;
			}
			else if (performaHulk>7 && performaHulk<=9) {
				statusHulk*=0.75;
			}
			else if (performaHulk>9 && performaHulk<=10) {
			}
			else {
				statusHulk=0;
			}

			if (performaCaptAmrik<3) {
				statusCaptAmrik= 0;
				pinalty += 1000;
			}
			else if (performaCaptAmrik>=3 && performaCaptAmrik<=5){
				statusCaptAmrik*=0.3;
			}
			else if (performaCaptAmrik>5 && performaCaptAmrik<=7) {
				statusCaptAmrik*=0.5;
			}
			else if (performaCaptAmrik>7 && performaCaptAmrik<=9) {
				statusCaptAmrik*=0.75;
			}
			else if (performaCaptAmrik>9 && performaCaptAmrik<=10) {
			}
			else {
				statusCaptAmrik=0;
			}

			if (performaSpiderman<3) {
				statusSpiderman= 0;
				pinalty += 1000;
			}
			else if (performaSpiderman>=3 && performaSpiderman<=5){
				statusSpiderman*=0.3;
			}
			else if (performaSpiderman>5 && performaSpiderman<=7) {
				statusSpiderman*=0.5;
			}
			else if (performaIronMan>7 && performaSpiderman<=9) {
				statusSpiderman*=0.75;
			}
			else if (performaSpiderman>9 && performaSpiderman<=10) {
			}
			else {
				statusSpiderman=0;
			}

			total = statusIronMan + statusThor + statusHulk + statusCaptAmrik + statusSpiderman;

			
			if (total > rab) {
				System.out.println("Sorry, RAB tidak mencukupi");
			}
			else{
				rab-=total-pinalty;
				System.out.println("total RAB yang digunakan "+total);
				System.out.println("sisa RAB termasuk denda: "+rab);
			}

		}
	}
//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 5:43 AM
//Modified by :
import java.util.Scanner;

public class EX22Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int month, days;
		String monthName;

		System.out.print("Which month ? (1 -12)");
		month = keyboard.nextInt();

		switch(month){
			case 1 : monthName = "January";
					System.out.println(" Bulan ini adalah " + monthName);
			case 2 : monthName = "February";
					System.out.println(" Bulan ini adalah " + monthName);		
			case 3 : monthName = "March";
					System.out.println(" Bulan ini adalah " + monthName);
			case 4 : monthName = "April";
					System.out.println(" Bulan ini adalah " + monthName);
			case 5 : monthName = "May";
					System.out.println(" Bulan ini adalah " + monthName);
			case 6 : monthName = "June";
					System.out.println(" Bulan ini adalah " + monthName);
			case 7 : monthName = "July";
					break;
			case 8 : monthName = "August";
					break;
			case 9 : monthName = "September";
					break;
			case 10 : monthName = "October";
					break;
			case 11 : monthName = "November";
					break;
			case 12 : monthName = "Desember";
					break;
			default : monthName = "error";
		}

		/*Thirty days hath september,April,June and November
		All the rest have thirty-one except the second mont alone..
		*/

		switch(month){
			case 9:
			case 4:
			case 6:
			case 11: days = 30;
					break;
			case 2 : days = 28;
					break;
			default: days = 31;
		}
		System.out.println( days + " days hath " +monthName);
	}

}
/*ketika break dihapus maka apabila kondisi case terpenuhi program akan mencetak 
keterangan bulan samapi bertemu dengan break
*/
package inputValidation;
import java.util.Scanner;

/*
 * Input.string(string word)
 * 		return String with the validation of String without symbol or space (usually used for username)
 * 
 * Input.string1(String word)
 * 		return String with the validation of String including space, dot and comma (usually used for full name)
 * 
 * Input.string2(String word)
 * 		return String with the validation of number (usually used for id)
 * 
 * Input.integer(String sword)
 * 		return integer with the validation of a number including negative, zero and positive
 * 
 * Input.integer(String sword, int from, int to)
 * 		return integer with the validation of a number from "from" to "to"
 * 
 * Input.integer(String sword, int min)
 * 		return integer with the validation of a number same or above "min"
 * 
 * Input.integer(String sword, int max)
 * 		return integer with the validation of a number same or below "max"
 * 
 */

public class Input {
	Scanner scan=new Scanner(System.in);
	public String data;
	
	public Input() {}
	
	public String string(String word) {
		String output;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			output=data;
			if(output.matches("[a-zA-Z]+"))
				cek=true;
			else 
				System.out.println("Input must be a letter");
		}while(!cek);
		return output;
	}

	public String string1(String word) {
		String output;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			output=data;
			if(output.matches("[a-zA-Z., ]+"))
					cek=true;
			else 
				System.out.println("Input didn't appropriate");
		}while(!cek);
		return output;
	}

	public String string2(String word) {
		String output;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			output=data;
			if(output.matches("[0-9]+"))
					cek=true;
			else 
				System.out.println("Input must be a number");
		}while(!cek);
		return output;
	}

	public int integer(String word) {
		int output=-1;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			if(data.matches("-?[0-9]+")) {
				output=Integer.parseInt(data);	
				cek=true;
			}
			else 
				System.out.println("Input must be a number");
		}while(!cek);
		return output;
	}

	public int integer(String word, int from, int to) {
		int output=-1;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			if(data.matches("-?[0-9]+")) {
				output=Integer.parseInt(data);
				if(output>=from && output<=to)
					cek=true;
				else
					System.out.println("Number must be in range from "+from+" to "+to);
			}
			else 
				System.out.println("Input must be a number");
		}while(!cek);
		return output;
	}

	public int integerAbove(String word, int min) {
		int output=-1;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			if(data.matches("-?[0-9]+")) {
				output=Integer.parseInt(data);
				if(output>=min)
					cek=true;
				else
					System.out.println("Number must be same or above "+min);
			}
			else 
				System.out.println("Input must be a number");
		}while(!cek);
		return output;
	}

	public int integerBelow(String word, int max) {
		int output=-1;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			if(data.matches("-?[0-9]+")) {
				output=Integer.parseInt(data);
				if(output<=max)
					cek=true;
				else
					System.out.println("Number must be same or below "+max);
			}
			else 
				System.out.println("Input must be a number");
		}while(!cek);
		return output;
	}
	
	public double real(String word) {
		double output=-1;
		boolean cek=false;
		do {
			System.out.print(word);
			data=scan.nextLine();
			if(data.matches("-?[0-9]+")) {
				output=Double.parseDouble(data);	
				cek=true;
			}
			else 
				System.out.println("Input must be a number");
		}while(!cek);
		return output;
	}

}

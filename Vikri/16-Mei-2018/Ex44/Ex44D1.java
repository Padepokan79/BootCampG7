/*
	Created By Vikri
	16/05/2018
	11:37
*/
public class Ex44D1{
	public static void main(String[] args) {
		int ganjil, kelipatan;
		for (kelipatan=0; kelipatan<=1000; kelipatan++) {
			if (kelipatan%2==1 || kelipatan%4==0) {
				System.out.println(kelipatan);
			} 
		}
	}
}
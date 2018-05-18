/*
	Created By Vikri
	16/05/2018
	12:50
*/
public class Ex44D2{
	public static void main(String[] args) {
		int kue, waktu, twaktu;
		twaktu = (60*8)+30;
		kue = 200;
		for (waktu = twaktu; waktu>=0; waktu -= 15) {
			kue = kue - 3;
		}
		System.out.print(kue);
	}
}
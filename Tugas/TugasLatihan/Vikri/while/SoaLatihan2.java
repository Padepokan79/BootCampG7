/*
	Created By Vikri
	17/05/2018
	13:00
*/
public class SoaLatihan2{
	public static void main(String[] args) {
		int kue, waktu, twaktu;
		twaktu = (60*8)+30;
		waktu = 15;
		kue = 200;

		while (twaktu >= 0){
			twaktu -= waktu;
			kue -= 3;
		}

		System.out.print("Jumlah kue adalah: "+kue);
	}
}
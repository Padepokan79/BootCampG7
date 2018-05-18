/*
	Created By vikri
	18/05/2018
	12:58
*/
public class SoalDoWhile2{
	public static void main(String[] args) {
		int kue, waktu, twaktu;
		twaktu = 60*8+30;
		waktu = 15;
		kue = 200;

		do{
			twaktu-=waktu;
			kue -= 3;
		}while(twaktu >= 0);
		System.out.print("Jumlah kue adalah: "+kue);
	}
}
//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 10:10 AM
//Modified :
public class PenjualKue{
	public static void main(String[] args) {
		int lamaJual = 8*60 + 30, jumlahKue =200;
		int n=lamaJual/15;

		while(n>=0)
		{
			if(jumlahKue > 3)
				{
					jumlahKue = jumlahKue -3;
				}
				;		
		n--;
		}

		System.out.println("Sisa Kue " + jumlahKue);
		System.out.println("lama jualan " + lamaJual +"menit");
	}
}
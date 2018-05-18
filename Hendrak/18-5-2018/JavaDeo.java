//createby:Hendra Kurniawan 
//Date:17 Mei 2018 Time:2:45
//Modified by :
public class JavaDeo{
	public static void main(String[] args) {
		int detikJava, detikC, totaldetik,jam,menit,detik,temp;

		detikJava = 6500;
		detikC = 3320;
		totaldetik = detikJava + detikC;

		jam = totaldetik/3600;
		temp = totaldetik%3600;

		menit = temp/60;

		detik = temp%60;
		System.out.println("Lama Deo belajar bahasa pemrograman yaitu "+ jam + " jam " + menit + " menit "+ detik + " detik " );
	}
}
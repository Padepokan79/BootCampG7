/*
soal : 
Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah 
uangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 butir 
kelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya. 
Berapakan jumlah uang Ijal saat ini?

create by : Malik Chaudhary
time : 08-05-2018 9:06PMPM

*/

public class YanaSoal1{
	public static void main(String[] args){
		double uangIjal, banyakKelereng, menjualKelereng, total, uang, kelereng;
		double uangBelanja, laba;

		uangIjal = 20000;
		uangBelanja = 0.5;
		banyakKelereng = 10;
		menjualKelereng = 4;
		laba = 0.2;

		uang = uangIjal*uangBelanja;
		kelereng = (uang/banyakKelereng)*laba;
		kelereng = (kelereng*menjualKelereng)+(uang/banyakKelereng*menjualKelereng)+uang;

		

		System.out.print("jumlah uang : "+kelereng);

	}
}
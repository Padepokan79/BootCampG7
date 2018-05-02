/*
created by 	: Yana
time		: 1 Mei 2018

1. Ijal mempunyai uang sebesar Rp. 20.000, ia membelanjakan setengah 
uangnya untuk membeli 10 butir kelereng. kemudian Ijal menjual 4 butir 
kelerengnya dengan laba 20% dari setiap butir kelereng yang dijualnya. 
Berapakan jumlah uang Ijal saat ini?
*/

public class Yana1{
	public static void main(String[] args){

		double uangIjal, jumlahBelanja, jumlahBeliKelereng, jumlahJualKelereng, labaJual;

		uangIjal			= 20000;
		jumlahBelanja		= 1.0 / 2.0 * uangIjal;
		jumlahBeliKelereng	= 10;
		jumlahJualKelereng	= 4;
		labaJual			= (jumlahBelanja / jumlahBeliKelereng) * 20.0 / 100.0 * jumlahJualKelereng ;
		uangIjal			= uangIjal - jumlahBelanja + (jumlahBelanja / jumlahBeliKelereng * jumlahJualKelereng) + labaJual;

		System.out.printf("Jumlah uang Ijal adalah Rp %.0f" ,uangIjal);
	}
}
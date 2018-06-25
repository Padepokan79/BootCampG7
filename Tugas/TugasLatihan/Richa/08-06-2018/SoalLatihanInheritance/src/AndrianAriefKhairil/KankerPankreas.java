/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 06.30 PM
Updated by			:
Updated Date/hour	:
*/

package AndrianAriefKhairil;

	public class KankerPankreas extends Kanker {
		private String nama, penyebab, penanggulangan;
		
	 public KankerPankreas () {
		 
	 }
	 
	 public KankerPankreas (String klasifikasi, String faktorResiko, String nama, String penyebab, String penanggulangan) {
		 super (klasifikasi, faktorResiko);
		 this.nama = nama;
		 this.penyebab = penyebab;
		 this.penanggulangan = penanggulangan; //set
	 }
	 
	 String getNama () {
		 return nama;
	 }
	 String getPenyebab () {
		 return penyebab;
	 }
	 String getPenanggulan () {
		 return penanggulangan;
	 }
	 void setPenanggulangan (String mencegah) {
		 penanggulangan = mencegah;
	 }
	 String printKanker () {
		 return super.printKanker() + " nama penyakit ini adalah " + nama + " yang penyebabnya adalah " + penyebab + " dan penanggulangannya adalah " + penanggulangan;
	 }
}

/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 10.00 AM
Updated by			:
Updated Date/hour	:
*/

package RyanHendraChaudry;

public class Unggas {
	
	private String nama, warnaBulu, alatPernapasan;
	private int lamaHidup, ukuran, lamaBertelur;
	private String suara;
	
	public Unggas () {
		
	}
	public Unggas (String name, String featherColor, String respi, int ageLife, int size, int eggTime, String voice) {
		nama = name; 
		warnaBulu = featherColor; //set
		alatPernapasan = respi;
		lamaHidup = ageLife; //set
		ukuran = size;
		lamaBertelur = eggTime; //set
		suara = voice; 
	}
	String getNama () {
		return nama;
	}
	String getWarnaBulu () {
		return warnaBulu;
	}
	void setWarnaBulu (String wrnBulu) {
		warnaBulu = wrnBulu;
	}
	String getAlatPernafasan () {
		return alatPernapasan;
	}
	int getLamaHidup () {
		return lamaHidup;
	}
	void setLamaHidup (int lmHidup) {
		lamaHidup = lmHidup;
	}
	int  getUkuran () {
		return lamaHidup;
	}
	int getLamaBertelur () {
		return lamaBertelur;
	}
	void setLamaBertelur (int lb) {
		 lamaBertelur = lb;
	}
	String getSuara () {
		return suara;
	}

	
}

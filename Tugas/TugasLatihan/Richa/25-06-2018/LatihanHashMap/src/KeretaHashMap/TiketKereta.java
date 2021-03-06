package KeretaHashMap;
/* 
Created by  		: Richa Fitria
Date/hour			: 25 Juni 2018/ 10.46 AM
Updated by			:
Updated Date/hour	:
*/

public class TiketKereta {

	private double harga;
	String namaKelas;
	int day1, day2, day3, day4, day5, day6, day7;
	
	//berdasarkan hari
	public TiketKereta (String gerbong, double harga, int day1, int day2, int day3, int day4, int day5, int day6, int day7) {
		namaKelas = gerbong;
		this.harga = harga;
		this.day1 = day1;
		this.day2 = day2;
		this.day3 = day3;
		this.day4 = day4;
		this.day5 = day5;
		this.day6 = day6;
		this.day7 = day7;
		
	}	
	public double getHarga() {
		return harga;
	}

	public int getDay1() {
		return day1;
	}

	public void setDay1(int day1) {
		this.day1 = day1;
	}

	public int getDay2() {
		return day2;
	}

	public void setDay2(int day2) {
		this.day2 = day2;
	}

	public int getDay3() {
		return day3;
	}

	public void setDay3(int day3) {
		this.day3 = day3;
	}

	public int getDay4() {
		return day4;
	}

	public void setDay4(int day4) {
		this.day4 = day4;
	}

	public int getDay5() {
		return day5;
	}

	public void setDay5(int day5) {
		this.day5 = day5;
	}

	public int getDay6() {
		return day6;
	}

	public void setDay6(int day6) {
		this.day6 = day6;
	}

	public int getDay7() {
		return day7;
	}

	public void setDay7(int day7) {
		this.day7 = day7;
	}

	public String getNamaKelas() {
		return namaKelas;
	}
}

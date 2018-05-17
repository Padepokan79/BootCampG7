/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 13:06
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfRicha1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int biayaUpgradeIron = 15000, biayaUpgradeThor = 320000, biayaUpgradeHulk = 13500,
		biayaUpgradeCaptain = 20500, biayaUpgradeSpider = 5000, rab = 50000, denda = 1000;

		double nilaiIron, nilaiThor, nilaiHulk, nilaiCaptain, nilaiSpider; 

		System.out.println("Skala Performa 0.0 - 10.0!!\n--------------------------");
		System.out.println("Daftar Performa Avengers!");
		System.out.print("Iron man\t: ");
		nilaiIron = key.nextDouble();
		System.out.print("Thor\t\t: ");
		nilaiThor = key.nextDouble();
		System.out.print("Hulk\t\t: ");
		nilaiHulk = key.nextDouble();
		System.out.print("Captain Amerika\t: ");
		nilaiCaptain = key.nextDouble();
		System.out.print("Spiderman\t: ");
		nilaiSpider = key.nextDouble();

		//Iron Man
		if (nilaiIron < 3.0) {
			rab = rab+denda;
			biayaUpgradeIron = 0;
		}
		else if(nilaiIron <= 5.0){
			biayaUpgradeIron = biayaUpgradeIron * 30/100;
		}
		else if(nilaiIron <= 7.0){
			biayaUpgradeIron = biayaUpgradeIron * 50/100;
		}
		else if(nilaiIron <= 9.0){
			biayaUpgradeIron = biayaUpgradeIron * 75/100;
		}
		else{
			biayaUpgradeIron=biayaUpgradeIron;
		}

		//THor
		if (nilaiThor < 3.0) {
			rab = rab+denda;
			biayaUpgradeThor = 0;
		}
		else if(nilaiThor <= 5.0){
			biayaUpgradeThor = biayaUpgradeThor * 30/100;
		}
		else if(nilaiThor <= 7.0){
			biayaUpgradeThor = biayaUpgradeThor * 50/100;
		}
		else if(nilaiThor <= 9.0){
			biayaUpgradeThor = biayaUpgradeThor * 75/100;
		}
		else{
			biayaUpgradeThor=biayaUpgradeThor;
		}

		//Hulk
		if (nilaiHulk < 3.0) {
			rab = rab+denda;
			biayaUpgradeHulk = 0;
		}
		else if(nilaiHulk <= 5.0){
			biayaUpgradeHulk = biayaUpgradeHulk * 30/100;
		}
		else if(nilaiHulk <= 7.0){
			biayaUpgradeHulk = biayaUpgradeHulk * 50/100;
		}
		else if(nilaiHulk <= 9.0){
			biayaUpgradeHulk = biayaUpgradeHulk * 75/100;
		}
		else{
			biayaUpgradeHulk=biayaUpgradeHulk;
		}

		//Captain Amerika
		if (nilaiCaptain < 3.0) {
			rab = rab+denda;
			biayaUpgradeCaptain = 0;
		}
		else if(nilaiCaptain <= 5.0){
			biayaUpgradeCaptain = biayaUpgradeCaptain * 30/100;
		}
		else if(nilaiCaptain <= 7.0){
			biayaUpgradeCaptain = biayaUpgradeCaptain * 50/100;
		}
		else if(nilaiCaptain <= 9.0){
			biayaUpgradeCaptain = biayaUpgradeCaptain * 75/100;
		}
		else{
			biayaUpgradeCaptain=biayaUpgradeCaptain;
		}

		//Spiderman
		if (nilaiSpider < 3.0) {
			rab = rab+denda;
			biayaUpgradeSpider = 0;
		}
		else if(nilaiSpider <= 5.0){
			biayaUpgradeSpider = biayaUpgradeSpider * 30/100;
		}
		else if(nilaiSpider <= 7.0){
			biayaUpgradeSpider = biayaUpgradeSpider * 50/100;
		}
		else if(nilaiSpider <= 9.0){
			biayaUpgradeSpider = biayaUpgradeSpider * 75/100;
		}
		else{
			biayaUpgradeSpider=biayaUpgradeSpider;
		}

		//Output
		System.out.println("__________________________________________");
		int totalBiaya = (biayaUpgradeSpider + biayaUpgradeCaptain + biayaUpgradeHulk + biayaUpgradeThor + biayaUpgradeIron);
		rab = rab - totalBiaya;
		if (rab < 0) {
			System.out.println("Sorry rab tidak mencukupi");
		}
		else if(rab > 0){
			System.out.println("Total biaya yang dikeluarkan : $"+totalBiaya);
			System.out.println("Sisa Rab : $"+rab);
		}
	}
}
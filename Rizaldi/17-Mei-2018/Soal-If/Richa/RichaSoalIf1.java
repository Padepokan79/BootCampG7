/*
 * File           : RichaSoalIf1.java
 * Project Name   : Richa
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Richa
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:34:42 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:35:13 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class RichaSoalIf1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int totalPrice, upgradeIronPrice, upgradeThorPrice, upgradeHulkPrice, upgradeCaptainPrice, upgradeSpiderPrice, rab, penaltyCost;
		double ironVal, thorVal, hulkVal, captainVal, spiderVal; 
        
        rab         = 50000;
        penaltyCost = 1000;
        upgradeIronPrice    = 15000;
        upgradeThorPrice    = 320000;
        upgradeHulkPrice    = 13500;
        upgradeCaptainPrice = 20500;
        upgradeSpiderPrice  = 5000;


		System.out.println("Skala Performa 0.0 - 10.0!!\n--------------------------");
		System.out.println("Daftar Performa Avengers!");
		System.out.print("Iron man\t: ");
		ironVal = keyboard.nextDouble();
		System.out.print("Thor\t\t: ");
		thorVal = keyboard.nextDouble();
		System.out.print("Hulk\t\t: ");
		hulkVal = keyboard.nextDouble();
		System.out.print("Captain Amerika\t: ");
		captainVal = keyboard.nextDouble();
		System.out.print("Spiderman\t: ");
		spiderVal = keyboard.nextDouble();

		// Iron Man ======================
		if (ironVal < 3.0) {
			rab = rab+penaltyCost;
			upgradeIronPrice = 0;
		}
		else if(ironVal <= 5.0){
			upgradeIronPrice = upgradeIronPrice * 30/100;
		}
		else if(ironVal <= 7.0){
			upgradeIronPrice = upgradeIronPrice * 50/100;
		}
		else if(ironVal <= 9.0){
			upgradeIronPrice = upgradeIronPrice * 75/100;
		}
		else{
			upgradeIronPrice=upgradeIronPrice;
		}

		// THor ====================
		if (thorVal < 3.0) {
			rab = rab+penaltyCost;
			upgradeThorPrice = 0;
		}
		else if(thorVal <= 5.0){
			upgradeThorPrice = upgradeThorPrice * 30/100;
		}
		else if(thorVal <= 7.0){
			upgradeThorPrice = upgradeThorPrice * 50/100;
		}
		else if(thorVal <= 9.0){
			upgradeThorPrice = upgradeThorPrice * 75/100;
		}
		else{
			upgradeThorPrice=upgradeThorPrice;
		}

		// Hulk ========================
		if (hulkVal < 3.0) {
			rab = rab+penaltyCost;
			upgradeHulkPrice = 0;
		}
		else if(hulkVal <= 5.0){
			upgradeHulkPrice = upgradeHulkPrice * 30/100;
		}
		else if(hulkVal <= 7.0){
			upgradeHulkPrice = upgradeHulkPrice * 50/100;
		}
		else if(hulkVal <= 9.0){
			upgradeHulkPrice = upgradeHulkPrice * 75/100;
		}
		else{
			upgradeHulkPrice=upgradeHulkPrice;
		}

		// Captain Amerika =====================
		if (captainVal < 3.0) {
			rab = rab+penaltyCost;
			upgradeCaptainPrice = 0;
		}
		else if(captainVal <= 5.0){
			upgradeCaptainPrice = upgradeCaptainPrice * 30/100;
		}
		else if(captainVal <= 7.0){
			upgradeCaptainPrice = upgradeCaptainPrice * 50/100;
		}
		else if(captainVal <= 9.0){
			upgradeCaptainPrice = upgradeCaptainPrice * 75/100;
		}
		else{
			upgradeCaptainPrice=upgradeCaptainPrice;
		}

		// Spiderman =======================
		if (spiderVal < 3.0) {
			rab = rab+penaltyCost;
			upgradeSpiderPrice = 0;
		}
		else if(spiderVal <= 5.0){
			upgradeSpiderPrice = upgradeSpiderPrice * 30/100;
		}
		else if(spiderVal <= 7.0){
			upgradeSpiderPrice = upgradeSpiderPrice * 50/100;
		}
		else if(spiderVal <= 9.0){
			upgradeSpiderPrice = upgradeSpiderPrice * 75/100;
		}
		else{
			upgradeSpiderPrice=upgradeSpiderPrice;
		}

		//Output
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		totalPrice = (upgradeSpiderPrice + upgradeCaptainPrice + upgradeHulkPrice + upgradeThorPrice + upgradeIronPrice);
		rab = rab - totalPrice;
		if (rab < 0) {
			System.out.println("rab tidak mencukupi");
		}
		else if(rab > 0){
			System.out.println("Total biaya yang dikeluarkan : $"+totalPrice);
			System.out.println("Sisa Rab : $"+rab);
		}
	}
}
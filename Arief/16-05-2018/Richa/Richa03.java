/*
Date Created	: 16 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Richa03 {
	public static void main (String [] args) {
		Scanner inputKey = new Scanner (System.in);
		double 	scaleIron, scaleThor, scaleHulk, scaleCaptain, scaleSpiderman, rab, total, penalty, penaltyDef,
				statIron, statThor, statHulk, statCaptain, statSpiderman, persen30, persen50, persen75, persen100,
				scale3, scale5, scale7, scale9, scale10;

		penaltyDef = 0;
		penalty = 1000;
		rab = 50000;

		statIron = 15000;
		statThor = 32000;
		statHulk = 13500;
		statCaptain = 20500;
		statSpiderman = 5000;

		persen30 = 30.0/100;
		persen50 = 50.0/100;
		persen75 = 75.0/100;
		persen100 = 1;

		scale3 = 3;
		scale5 = 5;
		scale7 = 7;
		scale9 = 9;
		scale10 = 10;

		System.out.println("Daftar Performa Avengers");
		System.out.print("Iron man: ");
		scaleIron = inputKey.nextDouble();

		System.out.print("Thor: ");
		scaleThor = inputKey.nextDouble();

		System.out.print("Hulk: ");
		scaleHulk = inputKey.nextDouble();

		System.out.print("Captain america: ");
		scaleCaptain = inputKey.nextDouble();

		System.out.print("Spiderman: ");
		scaleSpiderman = inputKey.nextDouble();

		if (scaleIron >= penaltyDef && scaleIron < scale3){
			statIron = penaltyDef;
			penalty += penalty;
		} else if (scaleIron >= scale3 && scaleIron <= scale5){
			statIron *= persen30;
		} else if (scaleIron > scale5 && scaleIron <= scale7){
			statIron *= persen50;
		} else if (scaleIron > scale7 && scaleIron <= scale9){
			statIron *= persen75;
		} else if (scaleIron > scale9 && scaleIron <= scale10){
			statIron *= persen100;
		} else {
			statIron = penaltyDef;
		}

		if (scaleThor >= penaltyDef && scaleThor < scale3){
			statThor = penaltyDef;
			penalty += penalty;
		} else if (scaleThor >= scale3 && scaleThor <= scale5){
			statThor *= persen30;
		} else if (scaleThor > scale5 && scaleThor <= scale7){
			statThor *= persen50;
		} else if (scaleThor > scale7 && scaleThor <= scale9){
			statThor *= persen75;
		} else if (scaleThor > scale9 && scaleThor <= scale10){
			statThor *= persen100;
		} else {
			statThor = penaltyDef;
		}

		if (scaleHulk >= penaltyDef && scaleHulk < scale3){
			statHulk = penaltyDef;
			penalty += penalty;
		} else if (scaleHulk >= scale3 && scaleHulk <= scale5){
			statHulk *= persen30;
		} else if (scaleHulk > scale5 && scaleHulk <= scale7){
			statHulk *= persen50;
		} else if (scaleHulk > scale7 && scaleHulk <= scale9){
			statHulk *= persen75;
		} else if (scaleHulk > scale9 && scaleHulk <= scale10){
			statHulk *= persen100;
		} else {
			statHulk = penaltyDef;
		}

		if (scaleCaptain >= penaltyDef && scaleCaptain < scale3){
			statCaptain = penaltyDef;
			penalty += penalty;
		} else if (scaleCaptain >= scale3 && scaleCaptain <= scale5){
			statCaptain *= persen30;
		} else if (scaleCaptain > scale5 && scaleCaptain <= scale7){
			statCaptain *= persen50;
		} else if (scaleCaptain > scale7 && scaleCaptain <= scale9){
			statCaptain *= persen75;
		} else if (scaleCaptain > scale9 && scaleCaptain <= scale10){
			statCaptain *= persen100;
		} else {
			statCaptain = penaltyDef;
		}

		if (scaleSpiderman >= penaltyDef && scaleSpiderman < scale3){
			statSpiderman = penaltyDef;
			penalty += penalty;
		} else if (scaleSpiderman >= scale3 && scaleSpiderman <= scale5){
			statSpiderman *= persen30;
		} else if (scaleSpiderman > scale5 && scaleSpiderman <= scale7){
			statSpiderman *= persen50;
		} else if (scaleSpiderman > scale7 && scaleSpiderman <= scale9){
			statSpiderman *= persen75;
		} else if (scaleSpiderman > scale9 && scaleSpiderman <= scale10){
			statSpiderman *= persen100;
		} else {
			statSpiderman = penaltyDef;
		}

		total = statIron + statThor + statHulk + statCaptain + statSpiderman;
		System.out.println();

		if (total > rab){
			System.out.println("Maaf, RAB tidak mencukupi");
		} else {
			rab -= (total - penalty);
			System.out.println("Total RAB yang digunakan: $" + total);
			System.out.println("Sisa RAB termasuk denda : $" + rab);
		}

	}
}
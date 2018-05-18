/*
 * File           : RizaldiSoalIf3.java
 * Project Name   : Soal-If
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 8:59:23 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 8:59:34 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class RizaldiSoalIf3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double monyRp, monyUsd, budgetReq, budget, salary, usd, exTime, persentase;

	salary = 1000000; // rupiah
	budget = 320000; // usd
	usd = 14084;

	System.out.print ("berapa uang Tono: Rp " );
	monyRp = keyboard.nextDouble ();
	monyUsd = monyRp/usd;
	budgetReq = budget-monyUsd;
	budgetReq = budgetReq*usd;

	System.out.println("==============================");

	System.out.printf("uang tono kurang sebesar: Rp %.0f\n", (budgetReq));
	exTime = (budgetReq/(salary));
	System.out.printf("lama tono harus menabung : %.0f", exTime);
	System.out.println  (" bulan");
	System.out.print ("keterangan : ");

	persentase = (monyUsd/budget) * 100;
	System.out.println ("Persentase uang Tono " + persentase + " %");

    if(monyUsd>(1*budget)){
        System.out.println ("Liburan uda siap...");
    }
    else{
        if (monyUsd > (0.9*budget)) {
            System.out.println ("Sabar ton bentar lagi...");
        }
        else if (monyUsd > (0.6*budget)) {
            System.out.println ("jual rumah aja...");
        }

        else if (monyUsd > (0.4*budget)) {
            System.out.println ("bisa pergi, gak usah pulang...");
        }
        else if (monyUsd <= (0.4*budget)) {
            System.out.println ("Gagal liburan...");
        }
    }
	

}
}
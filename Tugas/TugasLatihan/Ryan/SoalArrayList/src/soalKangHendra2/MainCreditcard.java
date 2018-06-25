package soalKangHendra2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *SoalArrayList
 * MainCreditcard.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 10.53.04 22 Jun 2018
 */
public class MainCreditcard {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int jmlTerjualMt, jmlTerjualMw, jmlTerjualVp, jmlTerjualVg, temp=0;
		
		System.out.print("Banyak terjual Master Titanium : ");
		jmlTerjualMt = key.nextInt();
		MasterTitanium mt = new MasterTitanium(jmlTerjualMt);
		System.out.print("Banyak terjual Master WorldMiles : ");
		jmlTerjualMw = key.nextInt();
		MasterWorldMiles mw = new MasterWorldMiles(jmlTerjualMw);
		System.out.print("Banyak terjual Visa Platinum : ");
		jmlTerjualVp = key.nextInt();
		VisaPlatinum vp = new VisaPlatinum(jmlTerjualVp);
		System.out.print("Banyak terjual Visa Gold : ");
		jmlTerjualVg = key.nextInt();
		VisaGold vg = new VisaGold(jmlTerjualVg);
		
		System.out.println("==========================================");
		
		ArrayList<Integer> pengahsilan = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			pengahsilan.add(mt.insentif()+mw.insentif()+vp.insentif()+vg.insentif());
		}
		for (Integer integer : pengahsilan) {
			temp = temp + integer;
		}
		temp = temp - (pengahsilan.get(2)*20/100);
		System.out.println("Pengahasilan Selama setahun Rp."+temp);
	}

}

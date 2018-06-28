package SoalHendraYN;

import java.util.ArrayList;

import org.omg.PortableInterceptor.InvalidSlotHelper;

public class SoalKeduaMainApp implements SoalKeduaInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0, insentifBulan=0, insentifTahun=0;
		
		SoalKeduaCreditCard vGold = new SoalKeduaCreditCard("visa gold", visaGold, 15);
		SoalKeduaCreditCard mTitanium = new SoalKeduaCreditCard("master platinum", masterTitanium, 8);
		SoalKeduaCreditCard vPlatinum = new SoalKeduaCreditCard("visa platinum", visaPlatinum, 17);
		SoalKeduaCreditCard mWorldmiles = new SoalKeduaCreditCard("master worldmiles", masterWorldMiles, 4);
		
		ArrayList<String> namaBulan = new ArrayList<>();
		namaBulan.add("januari");	namaBulan.add("februari");
		namaBulan.add("maret");		namaBulan.add("april");
		namaBulan.add("mei");		namaBulan.add("juni");
		namaBulan.add("juli");		namaBulan.add("agustus");
		namaBulan.add("september");	namaBulan.add("otober");
		namaBulan.add("november");	namaBulan.add("desember");
		ArrayList<SoalKeduaCreditCard> listCredit = new ArrayList<>();
		listCredit.add(vGold);
		listCredit.add(mTitanium);
		listCredit.add(vPlatinum);
		listCredit.add(mWorldmiles);
		
		index=0;
		for (String bulan : namaBulan) {
			insentifBulan = 0;
			System.out.print("Bulan " + bulan + " dengan insentif bulanan sebesar Rp.");
			for (SoalKeduaCreditCard lc : listCredit) {
				
				//System.out.println("Nama insentif " + lc.namaCreditCard + ", terjual sebanyak " + lc.terjualBulan);
				insentifBulan += lc.getInsentif() * lc.terjualBulan;
			}
			if(bulan.equals("maret"))
			{	insentifBulan = insentifBulan-(insentifBulan/100*20);
				System.out.println(insentifBulan);
			}
			else
			{
				System.out.println(insentifBulan);
			}
			insentifTahun += insentifBulan;	
		}
		System.out.println("Insentif Tahunan : " + insentifTahun);
		
	}

}

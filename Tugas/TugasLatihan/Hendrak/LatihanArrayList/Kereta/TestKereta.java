/*
Created by : Hendra Kurniawan
Date 	   : 21 Juni 2018  Time : 9:31 AM
Modified   :	
*/
package Kereta;
import java.util.*;

public class TestKereta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempPenghasilan =0, tempPenghasilan2=0, tempPenghasilan3=0, tempPenghasilan4=0, tempPenghasilan5=0, tempPenghasilan6=0, tempPenghasilan7=0, penghasilanSeminggu;
		int penghasilanHari =0, penghasilanHari2=0, penghasilanHari3=0, penghasilanHari4=0, penghasilanHari5=0, penghasilanHari6=0, penghasilanHari7=0;
		int literasi;
		Kereta ekonomi = new Kereta("ekonomi",18000, 120, 100, 50, 30, 20, 150, 110);
		Kereta bisnis = new Kereta("bisnis",35000, 50, 15, 13, 10, 20, 55, 60);
		Kereta executive = new Kereta("executive",80000, 40, 21, 11, 16, 12, 35, 40);
		
		ArrayList<Kereta> listkereta = new ArrayList<Kereta>();
		listkereta.add(ekonomi);
		listkereta.add(bisnis);
		listkereta.add(executive);
		
		//cara ke 1 
		for(Kereta ker : listkereta) {
			
			if(ker.jenisKereta.equals("ekonomi"))
			{
				tempPenghasilan = tempPenghasilan + ker.hari1 * ker.getHargaTicket();
				tempPenghasilan2 = tempPenghasilan2 + ker.hari2 * ker.getHargaTicket();
				tempPenghasilan3 = tempPenghasilan3 + ker.hari3 * ker.getHargaTicket();
				tempPenghasilan4 = tempPenghasilan4 + ker.hari4 * ker.getHargaTicket();
				tempPenghasilan5 = tempPenghasilan5 + ker.hari5 * ker.getHargaTicket();
				tempPenghasilan6 = tempPenghasilan6 + ker.hari6 * ker.getHargaTicket();
				tempPenghasilan7 = tempPenghasilan7 + ker.hari7 * ker.getHargaTicket();
			}
			else if(ker.jenisKereta.equals("bisnis"))
			{
				tempPenghasilan = tempPenghasilan + ker.hari1 * ker.getHargaTicket();
				tempPenghasilan2 = tempPenghasilan2 + ker.hari2 * ker.getHargaTicket();
				tempPenghasilan3 = tempPenghasilan3 + ker.hari3 * ker.getHargaTicket();
				tempPenghasilan4 = tempPenghasilan4 + ker.hari4 * ker.getHargaTicket();
				tempPenghasilan5 = tempPenghasilan5 + ker.hari5 * ker.getHargaTicket();
				tempPenghasilan6 = tempPenghasilan6 + ker.hari6 * ker.getHargaTicket();
				tempPenghasilan7 = tempPenghasilan7 + ker.hari7 * ker.getHargaTicket();
				
			}
			
			else if(ker.jenisKereta.equals("executive"))
			{
				tempPenghasilan = tempPenghasilan + ker.hari1 * ker.getHargaTicket();
				tempPenghasilan2 = tempPenghasilan2 + ker.hari2 * ker.getHargaTicket();
				tempPenghasilan3 = tempPenghasilan3 + ker.hari3 * ker.getHargaTicket();
				tempPenghasilan4 = tempPenghasilan4 + ker.hari4 * ker.getHargaTicket();
				tempPenghasilan5 = tempPenghasilan5 + ker.hari5 * ker.getHargaTicket();
				tempPenghasilan6 = tempPenghasilan6 + ker.hari6 * ker.getHargaTicket();
				tempPenghasilan7 = tempPenghasilan7 + ker.hari7 * ker.getHargaTicket();
			}
			
		}
		System.out.println("Penghasilan hari ke 1   : " + tempPenghasilan);		
		System.out.println("Penghasilan hari ke 2   : " + tempPenghasilan2);
		System.out.println("Penghasilan hari ke 3   : " + tempPenghasilan3);
		System.out.println("Penghasilan hari ke 4   : " + tempPenghasilan4);
		System.out.println("Penghasilan hari ke 5   : " + tempPenghasilan5);
		System.out.println("Penghasilan hari ke 6   : " + tempPenghasilan6);
		System.out.println("Penghasilan hari ke 7   : " + tempPenghasilan7);
		
		penghasilanSeminggu = tempPenghasilan + tempPenghasilan2 + tempPenghasilan3 + tempPenghasilan4 + tempPenghasilan5 + tempPenghasilan6 + tempPenghasilan7;
		System.out.println("Penghasilan minggu ke 1 : " + penghasilanSeminggu);
		
		
		//cara ke 2 
		ArrayList<Integer > penghasilan = new ArrayList<Integer>();
		
		System.out.println();
		literasi = 0;
		for (Kereta kereta : listkereta) {
			
			tempPenghasilan = kereta.hari1 * kereta.getHargaTicket();	
			penghasilanHari = penghasilanHari + tempPenghasilan; 
			tempPenghasilan2 = kereta.hari2 * kereta.getHargaTicket();	
			penghasilanHari2 = penghasilanHari2 + tempPenghasilan2;
			tempPenghasilan3 = kereta.hari3 * kereta.getHargaTicket();	
			penghasilanHari3 = penghasilanHari3 + tempPenghasilan3;
			tempPenghasilan4 = kereta.hari4 * kereta.getHargaTicket();	
			penghasilanHari4 = penghasilanHari4 + tempPenghasilan4;
			tempPenghasilan5 = kereta.hari5 * kereta.getHargaTicket();	
			penghasilanHari5 = penghasilanHari5 + tempPenghasilan5;
			tempPenghasilan6 = kereta.hari6 * kereta.getHargaTicket();	
			penghasilanHari6 = penghasilanHari6 + tempPenghasilan6;
			tempPenghasilan7 = kereta.hari7 * kereta.getHargaTicket();	
			penghasilanHari7 = penghasilanHari7 + tempPenghasilan7;
			literasi ++;
			if(literasi == listkereta.size())
			{
				penghasilan.add(penghasilanHari);
				penghasilan.add(penghasilanHari2);
				penghasilan.add(penghasilanHari3);
				penghasilan.add(penghasilanHari4);
				penghasilan.add(penghasilanHari5);
				penghasilan.add(penghasilanHari6);
				penghasilan.add(penghasilanHari7);
			}
		
		}
		penghasilanSeminggu = 0;
		
		for (int index = 0; index < penghasilan.size() ; index++) {
			System.out.println("Hari ke " + (index + 1)+ " : "  + penghasilan.get(index));
			penghasilanSeminggu += penghasilan.get(index);
		}
		
		System.out.println("Minggu ke 1 : " + penghasilanSeminggu);
	}
}

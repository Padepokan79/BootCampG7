//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 8:01 AM
//Modified : 
import java.util.Scanner;

public class RizaldiIf1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int ipa,ipb,ipc,ipd,ipe,ipf,ipg,iph,totLulus = 0, tdkLulus =0;
		double rata2;
		String ket="",bobot="";

		System.out.println("Inputan :");
		System.out.println("==========================");
		System.out.print("nilai IPA :");
		ipa = keyboard.nextInt();
		System.out.print("nilai IPB :");
		ipb = keyboard.nextInt();
		System.out.print("nilai IPC :");
		ipc = keyboard.nextInt();
		System.out.print("nilai IPD :");
		ipd = keyboard.nextInt();
		System.out.print("nilai IPE :");
		ipe = keyboard.nextInt();
		System.out.print("nilai IPF :");
		ipf = keyboard.nextInt();
		System.out.print("nilai IPG :");
		ipg = keyboard.nextInt();
		System.out.print("nilai IPH :");
		iph = keyboard.nextInt();
		System.out.println("==========================");
		rata2 = (ipa+ipb+ipc+ipd+ipe+ipf+ipg+iph)/8 ;
		
		if(ipa > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		if(ipb > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		
		if(ipc > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		

		if(ipd > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		
		if(ipe > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		
		if(ipf > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		
		if(ipg > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		
		if(iph > 6)
		{
			totLulus += 1;
		}
		else{ tdkLulus +=1;}
		
						
		if(totLulus >= 6&& rata2>=8&&rata2<=10&&tdkLulus==0)
		{
			ket = "Lulus";
			if(rata2 >=9 && rata2 <=10)
			{
			ket = "Drop Out(Mustahil)";
			}
		}
		else
		{
			ket= "Tidak Lulus";
			if(tdkLulus == 8)
			{
				ket = "Drop Out(Genius)";
			}
		}
		







		System.out.println("Keterangan  : " + ket);
		if(rata2 < 6)
		{
			bobot = "E";
		}
		if(rata2>=6 && rata2<7)
		{
			bobot ="D";
		}
		if(rata2>=7 && rata2<8)
		{
			bobot ="C";
		}
		if(rata2>=8 && rata2 <9)
		{
			bobot ="B";
		}
		if(rata2>=9 && rata2 <=10)
		{
			bobot ="A";
		}
		System.out.println("Bobot nilai : "+ bobot);
	}
}
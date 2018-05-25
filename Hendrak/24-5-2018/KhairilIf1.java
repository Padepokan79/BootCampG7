//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 10:17 PM
//Modified :
import java.util.Scanner;

public class KhairilIf1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int nilaiDadu;
		int daduA1 =1 , daduA2=2 , daduA3=3 , daduA4=4 , daduA5=5, daduA6=6;
		int daduB1 =1 , daduB2=2 , daduB3=3 , daduB4=4 , daduB5=5 ,daduB6=6;
		int daduC1 =1 , daduC2=2 , daduC3=3 , daduC4=4 , daduC5=5, daduC6=6;
		
		System.out.print("Masukan Jumlah Nilai Dadu :");
		nilaiDadu = keyboard.nextInt();
		System.out.println("Angka Dadu yang Mungkin Terjadi");
		System.out.println("===============================");
		if(nilaiDadu < 3)
		{
			System.out.println("HHmmm Nilai Dadu Tidak mungkin segitu!!");
		}

		
		if(nilaiDadu == 3)
		{
			System.out.println(daduA1+ "/"+ daduB1 +"/"+daduC1);
		}
		else if(nilaiDadu == 4)
		{
			System.out.println(daduA1+ "/"+ daduB1 +"/"+daduC2);
			System.out.println(daduA1+ "/"+ daduB2 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB1 +"/"+daduC1);
			
		}
		else if(nilaiDadu == 5)
		{
			System.out.println(daduA1+ "/"+ daduB1 +"/"+daduC3);
			System.out.println(daduA1+ "/"+ daduB2 +"/"+daduC2);
			System.out.println(daduA1+ "/"+ daduB3 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB2 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB1 +"/"+daduC2);
			System.out.println(daduA3+ "/"+ daduB1 +"/"+daduC1);	
		}
		else if(nilaiDadu == 6)
		{
			System.out.println(daduA1+ "/"+ daduB1 +"/"+daduC4);
			System.out.println(daduA1+ "/"+ daduB2 +"/"+daduC3);
			System.out.println(daduA1+ "/"+ daduB3 +"/"+daduC2);
			System.out.println(daduA1+ "/"+ daduB4 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB3 +"/"+daduC1);
			System.out.println(daduA3+ "/"+ daduB2 +"/"+daduC1);
			System.out.println(daduA4+ "/"+ daduB1 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB2 +"/"+daduC2);
			
		
		}
		else if(nilaiDadu == 7)
		{
			System.out.println(daduA1+ "/"+ daduB1 +"/"+daduC5);
			System.out.println(daduA1+ "/"+ daduB2 +"/"+daduC4);
			System.out.println(daduA1+ "/"+ daduB3 +"/"+daduC3);
			System.out.println(daduA1+ "/"+ daduB4 +"/"+daduC2);
			System.out.println(daduA1+ "/"+ daduB5 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB4 +"/"+daduC1);
			System.out.println(daduA3+ "/"+ daduB3 +"/"+daduC1);
			System.out.println(daduA4+ "/"+ daduB2 +"/"+daduC1);
			System.out.println(daduA5+ "/"+ daduB1 +"/"+daduC1);
			
		}
		else if(nilaiDadu == 8)
		{	System.out.println(daduA1+ "/"+ daduB1 +"/"+daduC6);
			System.out.println(daduA1+ "/"+ daduB2 +"/"+daduC5);
			System.out.println(daduA1+ "/"+ daduB3 +"/"+daduC4);
			System.out.println(daduA1+ "/"+ daduB4 +"/"+daduC3);
			System.out.println(daduA1+ "/"+ daduB5 +"/"+daduC2);
			System.out.println(daduA1+ "/"+ daduB6 +"/"+daduC1);
			System.out.println(daduA2+ "/"+ daduB5 +"/"+daduC1);
			System.out.println(daduA3+ "/"+ daduB4 +"/"+daduC1);
			System.out.println(daduA4+ "/"+ daduB3 +"/"+daduC1);
			System.out.println(daduA4+ "/"+ daduB2 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB1 +"/"+daduC1);
			
		}
		else if(nilaiDadu == 9)
		{	

			System.out.println(daduA1+ "/"+ daduB2 +"/"+daduC6);
			System.out.println(daduA1+ "/"+ daduB3 +"/"+daduC5);
			System.out.println(daduA1+ "/"+ daduB4 +"/"+daduC4);
			System.out.println(daduA1+ "/"+ daduB5 +"/"+daduC3);
			System.out.println(daduA1+ "/"+ daduB6 +"/"+daduC2);
			System.out.println(daduA2+ "/"+ daduB6 +"/"+daduC1);
			System.out.println(daduA3+ "/"+ daduB5 +"/"+daduC1);
			System.out.println(daduA4+ "/"+ daduB4 +"/"+daduC1);
			System.out.println(daduA5+ "/"+ daduB3 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB2 +"/"+daduC1);
			System.out.println(daduA3+ "/"+ daduB3 +"/"+daduC3);
			
		}
		else if(nilaiDadu == 10)
		{	

			System.out.println(daduA1+ "/"+ daduB3 +"/"+daduC6);
			System.out.println(daduA1+ "/"+ daduB4 +"/"+daduC5);
			System.out.println(daduA1+ "/"+ daduB5 +"/"+daduC4);
			System.out.println(daduA1+ "/"+ daduB6 +"/"+daduC3);
			System.out.println(daduA2+ "/"+ daduB6 +"/"+daduC2);
			System.out.println(daduA3+ "/"+ daduB6 +"/"+daduC1);
			System.out.println(daduA4+ "/"+ daduB5 +"/"+daduC1);
			System.out.println(daduA5+ "/"+ daduB4 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB3 +"/"+daduC1);
			System.out.println(daduA3+ "/"+ daduB3 +"/"+daduC4);
			
			
		}
		else if(nilaiDadu == 11)
		{	

			System.out.println(daduA1+ "/"+ daduB4 +"/"+daduC6);
			System.out.println(daduA1+ "/"+ daduB5 +"/"+daduC5);
			System.out.println(daduA1+ "/"+ daduB6 +"/"+daduC4);
			System.out.println(daduA2+ "/"+ daduB6 +"/"+daduC3);
			System.out.println(daduA3+ "/"+ daduB6 +"/"+daduC2);
			System.out.println(daduA4+ "/"+ daduB6 +"/"+daduC1);
			System.out.println(daduA5+ "/"+ daduB5 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB4 +"/"+daduC1);	
			
		}
		
		else if(nilaiDadu == 12)
		{	

			System.out.println(daduA1+ "/"+ daduB5 +"/"+daduC6);
			System.out.println(daduA1+ "/"+ daduB6 +"/"+daduC5);
			System.out.println(daduA2+ "/"+ daduB6 +"/"+daduC4);
			System.out.println(daduA3+ "/"+ daduB6 +"/"+daduC3);
			System.out.println(daduA4+ "/"+ daduB6 +"/"+daduC2);
			System.out.println(daduA5+ "/"+ daduB6 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB5 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB1 +"/"+daduC5);
			System.out.println(daduA6+ "/"+ daduB2 +"/"+daduC4);
			System.out.println(daduA6+ "/"+ daduB3 +"/"+daduC3);	
			
		}
		
			else if(nilaiDadu == 13)
		{	
			System.out.println(daduA1+ "/"+ daduB6 +"/"+daduC6);
			System.out.println(daduA2+ "/"+ daduB5 +"/"+daduC6);
			System.out.println(daduA2+ "/"+ daduB6 +"/"+daduC5);
			System.out.println(daduA3+ "/"+ daduB6 +"/"+daduC4);
			System.out.println(daduA4+ "/"+ daduB6 +"/"+daduC3);
			System.out.println(daduA5+ "/"+ daduB6 +"/"+daduC2);
			System.out.println(daduA6+ "/"+ daduB6 +"/"+daduC1);
			System.out.println(daduA6+ "/"+ daduB1 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB2 +"/"+daduC5);
			System.out.println(daduA6+ "/"+ daduB3 +"/"+daduC4);
			System.out.println(daduA6+ "/"+ daduB2 +"/"+daduC5);
			System.out.println(daduA6+ "/"+ daduB1 +"/"+daduC6);	
			
		}
		
			else if(nilaiDadu == 14)
		{	
			System.out.println(daduA2+ "/"+ daduB6 +"/"+daduC6);
			System.out.println(daduA3+ "/"+ daduB5 +"/"+daduC6);
			System.out.println(daduA4+ "/"+ daduB4 +"/"+daduC6);
			System.out.println(daduA5+ "/"+ daduB3 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB2 +"/"+daduC6);
			System.out.println(daduA5+ "/"+ daduB6 +"/"+daduC2);
			System.out.println(daduA6+ "/"+ daduB6 +"/"+daduC3);
			System.out.println(daduA6+ "/"+ daduB4 +"/"+daduC4);
			System.out.println(daduA6+ "/"+ daduB3 +"/"+daduC5);
			System.out.println(daduA6+ "/"+ daduB2 +"/"+daduC6);
				
			
		}

		else if( nilaiDadu ==15)
		{
			System.out.println(daduA3+ "/"+ daduB6 +"/"+daduC6);
			System.out.println(daduA4+ "/"+ daduB6 +"/"+daduC5);
			System.out.println(daduA5+ "/"+ daduB6 +"/"+daduC4);
			System.out.println(daduA3+ "/"+ daduB6 +"/"+daduC6);
			System.out.println(daduA4+ "/"+ daduB5 +"/"+daduC6);
			System.out.println(daduA5+ "/"+ daduB4 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB3 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB4 +"/"+daduC5);
			System.out.println(daduA6+ "/"+ daduB5 +"/"+daduC4);

		}

		else if(nilaiDadu ==16)
		{
			System.out.println(daduA4+ "/"+ daduB6 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB5 +"/"+daduC5);
			System.out.println(daduA6+ "/"+ daduB6 +"/"+daduC4);
			System.out.println(daduA6+ "/"+ daduB4 +"/"+daduC6);
			System.out.println(daduA5+ "/"+ daduB5 +"/"+daduC6);
			System.out.println(daduA5+ "/"+ daduB6 +"/"+daduC5);

		}
		else if(nilaiDadu ==17)
		{
			System.out.println(daduA5+ "/"+ daduB6 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB5 +"/"+daduC6);
			System.out.println(daduA6+ "/"+ daduB6 +"/"+daduC5);

		}

		else if(nilaiDadu ==18)
		{
			System.out.println(daduA6+ "/"+ daduB6 +"/"+daduC6);
			
		}
	}
}
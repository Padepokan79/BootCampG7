/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 10:01
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfYana1{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        
        Double buy, tas, dompet, sepatu, jas, kemeja, dasi, 
        uangBudi, minimumUang1, minimumUang2, minimumUang3, minimumUang4, diskon, kembalian, totalBayar ;

        tas = 60000.0;
        dompet = 40000.0;
        sepatu = 120000.0;
        jas = 250000.0;
        sepatu = tas+dompet;
        dasi = dompet;
        diskon = 10.0/100.0;

        minimumUang1 = 90000.0;
        minimumUang2 = 100000.0;
        minimumUang3 = 200000.0;
        minimumUang4 = 500000.0;        

        System.out.println("======================================================");
        System.out.println("Masukkan nominal uang Budi : ");
        uangBudi = key.nextDouble();
        
        //=======================
        if(uangBudi>minimumUang1){
            kembalian=(jas+kemeja+dasi)*diskon;
            totalBayar=((jas+kemeja+dasi)-kembalian);
            buy=uangBudi-totalBayar;
            System.out.println("======================================================");
            System.out.println("Budi membeli jas seharga Rp     : "+jas);            
            System.out.println("Budi membeli kemeja seharga Rp     : "+kemeja);            
            System.out.println("Budi membeli dasi seharga Rp     : "+dasi); 
            System.out.println("total harga belanja         : "+totalBayar);           
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);            
        }        
        else if(uangBudi>minimumUang2){
            kembalian=(tas+sepatu)*diskon;
            totalBayar=((tas+sepatu)-kembalian);
            buy=uangBudi-totalBayar;
            System.out.println("======================================================");
            System.out.println("Budi membeli tas seharga Rp     : "+tas);
            System.out.println("Budi membeli sepatu seharga Rp  : "+sepatu);
            System.out.println("total harga belanja         : "+totalBayar);
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);            
        }
        else if(uangBudi>minimumUang3){
            kembalian=(tas+wallet)*diskon;
            totalBayar=((tas+wallet)-kembalian);
            buy=uangBudi-totalBayar;
            System.out.println("======================================================");
            System.out.println("Budi membeli tas seharga Rp     : "+tas);
            System.out.println("Budi membeli dompet seharga Rp  : "+wallet);
            System.out.println("total harga belanja         : "+totalBayar);
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);            
        }
        else  if(uangBudi>minimumUang4){
            kembalian=tas*diskon;       
            totalBayar=(tas-kembalian);
            buy=uangBudi-totalBayar;
            System.out.println("======================================================");
            System.out.println("Budi membeli tas seharga Rp : "+tas);
            System.out.println("total harga belanja         : "+totalBayar);
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);
        }
        else if(uangBudi<tas){
            System.out.println("======================================================");
            System.out.println("uang budi tidak cukup untuk belanja ");
        }

    }
}
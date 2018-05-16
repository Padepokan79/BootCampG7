/*
 * File           : YanaSoalIf1.java
 * Project Name   : Yana
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Yana
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 8:38:38 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 8:38:49 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class YanaSoalIf1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        
        Double buy, bag, wallet, shoes, coat, shirt, necktie, budisMoney, minMoney90, minMoney100, minMoney200, minMoney500, disc, discPurchase, totalPurchase;

        bag=60000.0;
        wallet=40000.0;
        shoes=120000.0;
        coat=250000.0;
        shirt=bag+wallet;
        necktie=wallet;
        disc=10.0/100.0;

        minMoney90=90000.0;
        minMoney100=100000.0;
        minMoney200=200000.0;
        minMoney500=500000.0;        

        System.out.println("======================================================");
        System.out.println("Masukkan nominal uang Budi : ");
        budisMoney=keyboard.nextDouble();
        
        //=======================
        if(budisMoney>minMoney500){
            discPurchase=(coat+shirt+necktie)*disc;
            totalPurchase=((coat+shirt+necktie)-discPurchase);
            buy=budisMoney-totalPurchase;
            System.out.println("======================================================");
            System.out.println("Budi membeli jas seharga Rp     : "+coat);            
            System.out.println("Budi membeli kemeja seharga Rp     : "+shirt);            
            System.out.println("Budi membeli dasi seharga Rp     : "+necktie); 
            System.out.println("total harga belanja         : "+totalPurchase);           
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);            
        }        
        else if(budisMoney>minMoney200){
            discPurchase=(bag+shoes)*disc;
            totalPurchase=((bag+shoes)-discPurchase);
            buy=budisMoney-totalPurchase;
            System.out.println("======================================================");
            System.out.println("Budi membeli tas seharga Rp     : "+bag);
            System.out.println("Budi membeli sepatu seharga Rp  : "+shoes);
            System.out.println("total harga belanja         : "+totalPurchase);
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);            
        }
        else if(budisMoney>minMoney100){
            discPurchase=(bag+wallet)*disc;
            totalPurchase=((bag+wallet)-discPurchase);
            buy=budisMoney-totalPurchase;
            System.out.println("======================================================");
            System.out.println("Budi membeli tas seharga Rp     : "+bag);
            System.out.println("Budi membeli dompet seharga Rp  : "+wallet);
            System.out.println("total harga belanja         : "+totalPurchase);
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);            
        }
        else  if(budisMoney>minMoney90){
            discPurchase=bag*disc;       
            totalPurchase=(bag-discPurchase);
            buy=budisMoney-totalPurchase;
            System.out.println("======================================================");
            System.out.println("Budi membeli tas seharga Rp : "+bag);
            System.out.println("total harga belanja         : "+totalPurchase);
            System.out.println("Sisa uang Budi adalah Rp    : "+buy);
        }
        else if(budisMoney<bag){
            System.out.println("======================================================");
            System.out.println("uang budi tidak cukup untuk belanja ");
        }

    }
}
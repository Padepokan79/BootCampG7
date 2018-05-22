/*
 * File           : RizaldiGamblerr.java
 * Project Name   : Rizaldi
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Rizaldi
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Sunday, 20th May 2018 9:41:23 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Sunday, 20th May 2018 9:41:39 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class RizaldiGamblerr{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        Boolean haveWinner, bustedOut;
        int price, fail21P1, fail21P2, fail21P3, failTemp1, failTemp2, failTemp3,
        pick1, pick2, pick3, tempPointp1, tempPointp2, tempPointp3,
        p1Point, p2Point, p3Point, moneyHuman, moneyMinByPrice,
        totalPointP1, totalPointP2, totalPointP3;
           
        bustedOut   =false;
        haveWinner  =false;
        moneyHuman  =60000;
        totalPointP1=0;
        totalPointP2=0;
        totalPointP3=0;

        while(!haveWinner&&!bustedOut){// game berlangsung selama belum ada pemenang atau pembangkrut            
            fail21P1=0;
            fail21P2=0;
            fail21P3=0;
            p1Point =0;
            p2Point =0;
            p3Point =0;
            
            do{// perulangan ronde berakhir jika point melebihi 21
                
                pick1=0;
                pick2=0;
                pick3=0;                
                failTemp1=0;
                failTemp2=0;
                failTemp3=0;
                tempPointp1=0;
                tempPointp3=0;
                tempPointp2=0;
                moneyMinByPrice=0;

                // player TURN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                System.out.println("Berapa anda ingin bayar kartu ? : ");
                price=keyboard.nextInt();
                System.out.println("===============================================");
                if(price==3000){            // jika bayar 3000 max sampai kartu 10.
                    pick1=rand.nextInt(9)+2;
                    moneyMinByPrice=price;
                    tempPointp1+=pick1;
                    System.out.println("Anda mendapat kartu dengan point    : "+ tempPointp1);
                }else if(price==6000){      // jika bayar 6000 max ada jack queen king nya.
                    pick1=rand.nextInt(12)+2;
                    if(pick1==10){
                        pick1=10;
                    }else if(pick1==11){
                        pick1=10;
                    }else if(pick1==12){
                        pick1=10;
                    }else{
                        pick1=pick1;
                    }
                    moneyMinByPrice=price;
                    tempPointp1+=pick1;
                    System.out.println("Anda mendapat kartu dengan point : "+ tempPointp1);
                }else if(price==10000){     // jika bayar 10000 max ada AS nya
                    pick1=rand.nextInt(13)+2;
                    if(pick1==10){
                        pick1=10;
                    }else if(pick1==11){
                        pick1=10;
                    }else if(pick1==12){
                        pick1=10;
                    }else if(pick1==13){
                        pick1=pick1;// isi nya AS ===================
                    }else{
                        pick1=pick1;
                    }
                    moneyMinByPrice=price;
                    tempPointp1+=pick1;
                    if(tempPointp1==13){
                        System.out.println("SELAMAT Anda mendapat kartu AS !!! ");
                    }else{
                        System.out.println("Anda mendapat kartu dengan point : "+ tempPointp1);
                    }
                }else{                      // jika bayar ngaco semua player tidak dapat point
                    moneyMinByPrice=0;
                    tempPointp1+=0;
                    System.out.println("KARTU tidak ada dalam daftar harga !!! ");
                    System.out.println("Point yang anda dapat point : "+tempPointp1);

                }

                // comp 1 TURN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                pick2=rand.nextInt(12)+2;
                tempPointp2+=pick2;
                System.out.println("Computer 1 mendapat kartu dengan point  : "+ tempPointp2);
                // comp 2 TURN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                pick3=rand.nextInt(12)+2;
                tempPointp3+=pick3;
                System.out.println("Computer 2 mendapat kartu dengan point  : "+ tempPointp3);
                
                if(tempPointp1==0){// jika anda beli harga ngaco komputer dapat point nol
                    tempPointp2=0;
                    tempPointp3=0;
                }

                System.out.println("");

                p1Point+=tempPointp1;
                p2Point+=tempPointp2;
                p3Point+=tempPointp3;
                moneyHuman-=moneyMinByPrice;

                if(moneyHuman<=0){// jika uang anda habis anda kalah telak
                    bustedOut=true;
                    System.out.println("Anda Kalah dari komputer !!!");
                    System.out.println("===============================================||");
                    if(moneyHuman<0){
                        System.out.println("Anda Berhutang sebanyak : "+moneyHuman);
                    }else{
                        System.out.println("Sisa uang anda sebanyak : "+moneyHuman);
                    }
                }

                if(tempPointp1==13){// jika point anda = 21 nilai point otomatis 21
                    p1Point=21;
                }

                if(p1Point>21){// jika point anda > 21 (reset to zero)
                    failTemp1+=1;
                    p1Point=0;
                    System.out.println("Point Anda melebihi batas !!! Point akan di RESET ><");
                }
                if(p2Point>21){// jika point anda > 21 (reset o zero)
                    p2Point=0;
                    System.out.println("Point Computer 1 melebihi batas !!! Point akan di RESET ><");
                }
                if(p3Point>21){// jika point anda > 21 (reset to zero)
                    System.out.println("Point Computer 2 melebihi batas !!! Point akan di RESET ><");
                    p3Point=0;
                }

                fail21P1+=failTemp1;// penambahan jumlah point gagal human point > 21 sebanyak 3 kali
                
                // print point
                System.out.println("===============================================||");
                System.out.println("Perolehan point sementara   >>>>>>>>>>>>>>>>>>>>");
                System.out.println("Sisa Uang Anda Sebesar      : "+moneyHuman);
                System.out.println("Jumlah Hangus Point Anda    : "+fail21P1);
                System.out.println("===============================================||");
                System.out.println("Point anda          : "+p1Point);
                System.out.println("Point Computer 1    : "+p2Point);
                System.out.println("Point Computer 2    : "+p3Point);
                System.out.println("_________________________________________________");

                if((p1Point==21&&p2Point!=21&&p3Point!=21)&&(moneyHuman>0)){
                haveWinner=true;
                System.out.println("YOU WINN the game !!!");
                }
                if((p2Point==21&&p1Point!=21&&p3Point!=21)&&(moneyHuman<0)){
                    moneyHuman=0;
                    haveWinner=true;
                    System.out.println("Computer 1 WIN the game !!!");
                }
                if((p3Point==21&&p1Point!=21&&p2Point!=21)&&(moneyHuman<0)){
                    moneyHuman=0;
                    haveWinner=true;
                    System.out.println("Computer 2 WIN the game !!!");
                }
                

                if(fail21P1>=3){
                    moneyHuman=0;
                    bustedOut=true;
                    System.out.println("Anda Kalah dari komputer !!!");
                }

            }while(fail21P1<=3&&!haveWinner&&!bustedOut);

                totalPointP1=p1Point;
                totalPointP2=p2Point;
                totalPointP3=p3Point;
                System.out.println("===============================================||");
                System.out.println("Perolehan Point Akhir       ><><><><><><><><><><");
                if(moneyHuman==0){
                    System.out.println("Sisa uang anda sebanyak : "+moneyHuman);
                }else if(moneyHuman>0){
                    System.out.println("Sisa uang anda sebanyak : "+moneyHuman);
                }else{
                    System.out.println("Anda Berhutang sebanyak : "+moneyHuman);
                }
                System.out.println("Jumlah Hangus Point Anda    : "+fail21P1);
                System.out.println("===============================================||");
                System.out.println("Point anda          : "+totalPointP1);
                System.out.println("Point Computer 1    : "+totalPointP2);
                System.out.println("Point Computer 2    : "+totalPointP3);
                System.out.println("_________________________________________________");



        }

    }
}
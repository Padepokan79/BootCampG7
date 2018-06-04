/*
 * File           : RizaldiLotre.java
 * Project Name   : Rizaldi
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Rizaldi
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Sunday, 20th May 2018 1:06:17 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Sunday, 20th May 2018 1:06:35 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class RizaldiLotre{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        int maxPoint, p1Point, p2Point, pickP1, pickP2, price,
        tempPointp1, tempPointp2, moneyP1, moneyP2, minMoney,
        tempMoneyP1, tempMoneyP2;
        Boolean turnP1, haveWinner;
               
        turnP1=true;
        haveWinner=true;

        maxPoint=1000;
        minMoney=0;
        moneyP1=100000;
        moneyP2=100000;
        p1Point=0;
        p2Point=0;        
        do{ // start looping 
          pickP1=0;
          pickP2=0;
          tempMoneyP1=0;
          tempMoneyP2=0;
          
          if(turnP1){ // player 1 turn
            turnP1=false;
            System.out.print("player1> berapa harga lotre yang dibeli ? (100/200/300/500) : ");
            price=keyboard.nextInt();
              if(price==100){
                tempMoneyP1=100;
                pickP1=rand.nextInt(10);            
              }else if(price==200){
                tempMoneyP1=200;
                pickP1=rand.nextInt(20);            
              }else if(price==300){
                tempMoneyP1=300;                
                pickP1=rand.nextInt(50);            
              }else if(price==500){
                tempMoneyP1=500;                
                pickP1=rand.nextInt(100);            
              }else{
                turnP1=true;
                tempMoneyP1=0;                
                System.out.println("Harga lotre tidak ada !!!");
              }
            System.out.println(" ");            
            System.out.println("Point Player 1  : "+pickP1);            
          } // end turn player 1
          else{ // player 2 turn
          turnP1=true;
            System.out.print("player2> berapa harga lotre yang dibeli ? (100/200/300/500) : ");
            price=keyboard.nextInt();
              if(price==100){
                tempMoneyP2=100;
                pickP2=rand.nextInt(10);            
              }else if(price==200){
                tempMoneyP2=200;
                pickP2=rand.nextInt(20);            
              }else if(price==300){
                tempMoneyP2=300;
                pickP2=rand.nextInt(50);            
              }else if(price==500){
                tempMoneyP2=500;
                pickP2=rand.nextInt(100);            
              }
              else{
                turnP1=false;
                tempMoneyP2=0;
                System.out.println("Harga lotre tidak ada !!!");
              }
            System.out.println(" ");
            System.out.println("Point Player 2 : "+pickP2);
          } // end turn player 2
          
          p1Point+=pickP1; // penambahan point player 1
          p2Point+=pickP2; // penambahan point player 2
          moneyP1-=tempMoneyP1; // pengurangan uang player 1 sesuai harga lotre
          moneyP2-=tempMoneyP2; // pengurangan uang player 2 sesuai harga lotre
          System.out.println("Perolehan Point sementara : ");
          System.out.println("===========================");
          System.out.println("point Player 1      = "+p1Point);
          System.out.println("point Player 2      = "+p2Point);
          System.out.println("Sisa Uang Player 1  = "+moneyP1);
          System.out.println("Sisa Uang Player 2  = "+moneyP2);
          System.out.println("===========================================================");
          System.out.println(" ");

          if((p1Point>=maxPoint||p2Point>=maxPoint)||(moneyP1<=minMoney||moneyP2<=minMoney)){ // game stoped ketika p1 atau p2 mencapai point 100 keatas
            haveWinner=true;            
          }
          else{
            haveWinner=false;
          }
        }while(!haveWinner);// end looping <>

        if(p1Point>=maxPoint||moneyP2<=minMoney){
          System.out.println("Selamat player 1 anda Menang dengan point : "+p1Point);                        
          System.out.println("Dengan Sisa Uang                          : "+moneyP1);                        
        }else{
          System.out.println("Selamat player 2 anda Menang dengan point : "+p2Point);                        
          System.out.println("Dengan Sisa Uang                          : "+moneyP2);                        
        }
    }
}
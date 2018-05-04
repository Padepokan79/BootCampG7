/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 16:12
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AndrianBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        String friend, gender;
        Double giftPrice, cute, minCute, minGift, sultan;
        boolean invited, regular, male, female, nesaFriend, vip;

        System.out.println("Apakah anda teman sekolah nesa ? (Y/T) : ");        
        friend=keyboard.next();                
        System.out.println("sebutkan gender anda (pria/wanita) : ");        
        gender=keyboard.next();                                        
        System.out.println("berapa harga hadiah yang anda bawa : ");        
        giftPrice=keyboard.nextDouble();                
        System.out.println("berapa skala penampilan anda : ");        
        cute=keyboard.nextDouble();             
        

        minCute=8.5;
        minGift=5000000.0;
        sultan=20000000.0;
        male=gender.equals("pria");
        female=gender.equals("wanita");
        nesaFriend=friend.equals("Y");
        
        regular=(nesaFriend&&(male||female)&&giftPrice>=minGift&&cute>=minCute);
        vip=(nesaFriend&&(male||female)&&giftPrice>sultan);
        invited=(regular||vip);

        System.out.println("    ");                
        System.out.println("Anda boleh masuk ke pesta = "+invited);   
    }
}
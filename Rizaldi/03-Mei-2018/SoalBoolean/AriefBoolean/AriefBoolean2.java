/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:40 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AriefBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        String day;
        boolean close, sun, mon, tue, wed, thu, fri, sat;

        System.out.println("Hari apa anda akan ke toko : ");        
        day=keyboard.next();                

        sun=day.equals("minggu");
        mon=day.equals("senin");
        tue=day.equals("selasa");
        wed=day.equals("rabu");
        thu=day.equals("kamis");
        fri=day.equals("jumat");
        sat=day.equals("sabtu");

        close=(sun||fri);
        
        System.out.println("    ");                
        System.out.println("Pada hari "+day+" toko akan tutup = "+close);   
    }
}
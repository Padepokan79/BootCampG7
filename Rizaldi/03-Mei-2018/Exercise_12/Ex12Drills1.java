/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 19:25 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex12Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Boolean a, b, c, d, e, f;
        double x, y;

        System.out.print("Give me two numbers. First : ");
        x=keyboard.nextDouble();
        System.out.print("Second : ");
        y=keyboard.nextDouble();

        a=(x<y);    // IS LESS THAN
        b=(x<=y);   // IS LESS THAN/EQUAL TO
        c=(x==y);   // IS EQUAL TO
        d=(x!=y);   // IS NOT EQUAL TO
        e=(x>y);    // IS GREATER THAN
        f=(x>=y);   // IS GREATER THAN/EQUAL TO

        System.out.println(x+" is LESS THAN "+y+": "+a);
        System.out.println(x+" is LESS THAN/EQUAL TO "+y+": "+b);
        System.out.println(x+" is EQUAL TO "+y+": "+c);
        System.out.println(x+" is NOT EQUAL TO "+y+": "+d);
        System.out.println(x+" is GREATER THAN "+y+": "+e);
        System.out.println(x+" is GREATER THAN/EQUAL TO "+y+": "+f);
        System.out.println();

        System.out.println(!(x<y)+" "+(x>=y));
        System.out.println(!(x<=y)+" "+(x>y));
        System.out.println(!(x==y)+" "+(x!=y));
        System.out.println(!(x!=y)+" "+(x==y));
        System.out.println(!(x>y)+" "+(x<=y));
        System.out.println(!(x>=y)+" "+(x<y));

    }
}
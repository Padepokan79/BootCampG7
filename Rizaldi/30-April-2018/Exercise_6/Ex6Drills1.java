/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 27 April 2018 11:32 AM     
     * Updated By : 
     * Updated At : 
*/

public class Ex6Drills1{
    public static void main( String[] args){
        int a, b, c, d, e, f, g, a1;
        double x, y, z, x1;
        String one, two, both;

        a=10;
        b=27;

        System.out.println("a is "+a+", b is "+b);

        c=a+b;
        System.out.println("a+b is "+c);
        d=a-b;
        System.out.println("a-b is "+d);
        e=a+b*3;
        System.out.println("a+b*3 is "+e);
        f=b/2;
        System.out.println("b/2 is "+f);
        g=b%10;
        System.out.println("b%10 is "+g);        
        a1=f;
        System.out.println("f is "+a1);

        x=1.1;
        System.out.println("\nx is"+x);
        y=x*x;
        System.out.println("x*x is "+y);
        z=b/2;
        System.out.println("b/2 is "+z);
        x1=x/x*2;
        System.out.println("x/x*2 is "+x1);
        System.out.println();

        one="dog";
        two="house";
        both=one+two;
        System.out.println(both);

    }
}
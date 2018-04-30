/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 27 April 2018 10:50 AM     
     * Updated By : 
     * Updated At : 
*/

public class Ex5Drills1{
    public static void main( String[] args){
        int x, y, age, height;
        double seconds, e, checking, weight;
        String firstname, lastname, title, birthPlace, birthday;

        x = 10;
        y = 400;
        age = 39;
        height = 173;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        weight = 60;

        firstname = "Graham";
        lastname = "Mitchell";
        title = "Mr.";
        birthday = "12 November 2018";
        birthPlace = "Bandung";

        System.out.println("The variable x contains "+x);
        System.out.println("The value "+y+" is stored in the variable y.");
        System.out.println("The experiment took "+seconds+" seconds.");
        System.out.println("A favorite irrational = is Euler's number: "+e);
        System.out.println("Hopefully you have more than $"+checking+"!");
        System.out.println("My name's "+title+" "+firstname+lastname);
        System.out.println("My weight is "+weight);
        System.out.println("My height is "+height);
        System.out.println("i was born at "+birthday+" in "+birthPlace);
    }
}
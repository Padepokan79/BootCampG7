public class Ex5Drills1{
    public static void main( String[] args){
        int x, y, age, height;
        double seconds, e, checking, weight;
        String firstname, lastname, title, birthPlace, birthday;

        x = 10;
        y = 400;
        age = 39;
        height = 182;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        weight = 82;

        firstname = "Graham";
        lastname = "Mitchell";
        title = "Mr.";
        birthday = "August 13 1985";
        birthPlace = "New York City, Washington DC";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational = is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstname + lastname );
        System.out.println( "I am " + weight + " and " + height + " tall.");
        System.out.println( "i was born at " + birthday + " in " + birthPlace);
    }
}
public class Ex5Drills2{
    public static void main( String[] args){
        int a, b, c;

        a = 20;
        b = 50;
        c = a;
                
        System.out.println( "Nilai a adalah " + a );
        System.out.println( "Nilai b adalah " + b );

        System.out.println( "Jika keduanya ditukar" );

        a = b;
        b = c;

        System.out.println( "Nilai b adalah " + a );
        System.out.println( "Nilai b adalah " + b );
    }
}
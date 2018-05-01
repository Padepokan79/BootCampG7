// anto memiliki uang sebesar 100rb,
// membeli sebuah baju seharga 20rb, 
// mengikuti lomba dengan uang pendaftaran sebesar 50rb,
// dan menjadi juara ke dua mendapat hadiah sebesar 120rb,
// dibelikan boneka sebesar 80rb
// berapa sisa uang anto ?
public class Ex6Drills2{
    public static void main( String[] args){        

        int uang, baju, daftar, juara2, boneka, sisa;

        uang = 100000;
        baju = 20000;
        daftar = 50000;
        juara2 = 120000;
        boneka = 80000;

        uang = uang - baju - daftar + juara2 - boneka;

        System.out.println( "Sisa uang Anto adalah " + uang );

    }
}
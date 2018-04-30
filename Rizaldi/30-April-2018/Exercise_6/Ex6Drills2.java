/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 27 April 2018 13:22 AM     
     * Updated By : 
     * Updated At : 
*/

// anto memiliki uang sebesar 100rb,
// membeli sebuah baju seharga 20rb, 
// mengikuti lomba dengan uang pendaftaran sebesar 50rb,
// dan menjadi juara ke dua mendapat hadiah sebesar 120rb,
// dibelikan boneka sebesar 80rb
// berapa sisa uang anto ?
public class Ex6Drills2{
    public static void main( String[] args){        

        int currentMoney=100000, cloth=20000, register=50000, scndWinner=120000, doll=80000, lastMoney=0;        

        lastMoney=currentMoney-cloth-register+scndWinner-doll;
        currentMoney=lastMoney;

        System.out.println("Uang anto adalah "+currentMoney);

    }
}
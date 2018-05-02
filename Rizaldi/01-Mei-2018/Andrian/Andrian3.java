/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 08:52 AM     
     * Updated By : 
     * Updated At : 
*/

        // pusing soalnya :v :v :v
public class Andrian3{
    public static void main( String[] args){        
        
        double xPrice, yPrice, qtyAppleX, qtyAppleY, qtyOrangex, qtyOrangeY;

        xPrice=3400;
        yPrice=4100;
        qtyAppleX=2;
        qtyOrangex=1;
        qtyAppleY=1;
        qtyOrangeY=2;

        // counting the price of 1 orange
        double orangeYMinOrangeX, orangePrice, yPriceMulBy2, applePrice, orangeYMulBy2;
        orangeYMulBy2=qtyOrangeY*2;
        yPriceMulBy2=yPrice*2;
        orangeYMinOrangeX=orangeYMulBy2-qtyOrangex;
        orangePrice=(yPriceMulBy2-xPrice)/orangeYMinOrangeX;

        // ounting the price of one apple
        applePrice=(xPrice-(qtyOrangex*orangePrice))/qtyAppleX;

        System.out.printf("Harga dua buah apel dan satu buah jeruk adalah Rp 3400,\n"+
        "Harga satu apel dan dua jeruk adalah Rp 4100,\n"+
        "Berapa harga satu buah apel dan satu buah jeruk ?\n");
        System.out.printf("\n");

        System.out.printf(" Harga 1 buah jeruk adalah Rp %.0f\n",orangePrice);
		System.out.println();
		System.out.printf(" Harga 1 buah apel adalah Rp %.0f\n",applePrice);
		System.out.println();

    }
}
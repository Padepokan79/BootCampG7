/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 14:57 AM     
     * Updated By : 
     * Updated At : 
*/

public class Arief3{
    public static void main( String[] args){        
        
        float tofuPrice, tempePrice, kangkungPrice;
        int qtyTofu, qtyTempe, qtyKangkung;

        tofuPrice=3000;
        tempePrice=4500;
        kangkungPrice=1000;

        qtyTofu=4;
        qtyTempe=8;
        qtyKangkung=3;

        float payTofu, payTempe, payKangkung, totalPayment;        
        
        payTofu=qtyTofu*tofuPrice;
        payTempe=qtyTempe*tempePrice;
        payKangkung=qtyKangkung*kangkungPrice;

        totalPayment=payTofu+payTempe+payKangkung;

        System.out.printf("Us pergi kepasar membeli beberapa lauk. Satu bungkus tahu harganya Rp. 3.000,\n"+
        "tempe satu potong seharga Rp. 4.500, dan kangkung Rp. 1.000 per ikatnya.\n"+
        "Jika Uus belanja tahu 4 bungkus, tempe 8 potong, dan kangkung 3 ikat, berapa uang yang harus dibayarkan oleh Uus?\n");
        System.out.printf("\n");

        System.out.printf("uang yang harus dibayarkan oleh Uus adalah : Rp %.2f\n", totalPayment);

    }
}
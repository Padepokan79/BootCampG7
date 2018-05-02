/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 14:33 AM     
     * Updated By : 
     * Updated At : 
*/

public class Arief1{
    public static void main( String[] args){        
        
        float penPrice, lusin, moneyType, qtyMoneyType;
        penPrice=1950;
        lusin=12;
        moneyType=10000;
        qtyMoneyType=3;

        float payPen, payMoney, moneyReturn;
        payPen=penPrice*lusin;
        payMoney=moneyType*qtyMoneyType;

        moneyReturn=payMoney-payPen;
        System.out.printf("kembalian yang diterima Udin  : Rp %.2f\n", moneyReturn);

    }
}
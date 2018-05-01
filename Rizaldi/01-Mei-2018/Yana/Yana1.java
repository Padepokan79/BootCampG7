/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 13:00 AM     
     * Updated By : 
     * Updated At : 
*/

public class Yana1{
    public static void main( String[] args){        
        float walletMoney, halfWallet, marblePrice, marbleUnit;

        walletMoney=20000;
        halfWallet=walletMoney/2;
        marbleUnit=10;
        marblePrice=halfWallet/marbleUnit;
        walletMoney=halfWallet;        

        float laba, soldMarble, totalLaba;
        soldMarble=4;
        laba=marblePrice*20/100;
        totalLaba=laba*soldMarble;

        walletMoney=walletMoney+((marbleUnit-soldMarble)*marblePrice);
        walletMoney=walletMoney+totalLaba;

        System.out.println("jumlah uang Ijal saat ini adalah : Rp "+walletMoney);

    }
}
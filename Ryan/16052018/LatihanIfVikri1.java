/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 10:07
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfVikri1{
    public static void main(String[] args){
        Scanner key = new Scanner (System.in);

        int jmlAnak, jmlIstri;

        System.out.println("======================================================");
        System.out.print("masukkan jumlah anak\t: ");
        qtyChild=keyboard.nextInt();
        System.out.print("masukkan jumlah isteri\t: ");
        qtyWife=keyboard.nextInt();

        if(jmlAnak >= 2 && jmlIstri == 1){
            System.out.println("selamat... anda diberi mobil oleh nenek");
        }
        else if(jmlAnak == 1 && jmlIstri >= 2){
            System.out.println("selamat... anda diberi mobil oleh nenek");
        }
        else{
            System.out.println("anda tidak dapat mobil");
        }
    }
}
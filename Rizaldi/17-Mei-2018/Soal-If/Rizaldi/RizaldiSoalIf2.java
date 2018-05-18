/*
 * File           : RizaldiSoalIf2.java
 * Project Name   : Soal-If
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 7:55:47 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 8:17:46 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class RizaldiSoalIf2{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        Double drible, speed, body, jump, shooting, accuracy, stamina;
        
        System.out.println("==========================");                            
        System.out.print("Skill drible      : ");                            
        drible=keyboard.nextDouble();
        System.out.print("Speed             : ");                            
        speed=keyboard.nextDouble();
        System.out.print("Body Balance      : ");                            
        body=keyboard.nextDouble();
        System.out.print("Jump              : ");                            
        jump=keyboard.nextDouble();
        System.out.print("Shooting power    : ");                            
        shooting=keyboard.nextDouble();
        System.out.print("Accuracy          : ");                            
        accuracy=keyboard.nextDouble();
        System.out.print("Stamina           : ");                            
        stamina=keyboard.nextDouble();
        System.out.println("==========================");                            
        System.out.println("Posisi yang cocok adalah : ");                            
           


        if((body>9&&jump>=7&&speed>=7)||stamina==10){
            System.out.println("- Center Back, ");                            
        }   
        if(speed>9&&drible>9){
            System.out.println("- Winger, ");
        }
        if((accuracy==10&&shooting>8)||(jump>=9&&speed>=9&&body>=9)){
            System.out.println("- Striker, ");
        }
        if(drible==10&&speed==10&&body==10&&jump==10&&shooting==10&&accuracy==10&&stamina<4){
            System.out.println("- Pelatih, ");
        }
        if(drible>9&&speed>9&&body>9&&jump>9&&shooting>9&&accuracy>9&&stamina<8){
            System.out.println("- Cadangan Mati, ");
        }
        if(drible<2&&speed>=2&&body<2&&jump<2&&shooting<2&&accuracy<2&&stamina>=2){
            System.out.println("- Wasit, ");
        }
        System.out.println("==========================");                            
                                           
    }
}
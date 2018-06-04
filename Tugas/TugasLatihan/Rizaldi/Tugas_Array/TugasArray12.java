
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TugasArray12{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length];
        int min, max, ind, ind2, indAfter, countDuplicate;
        ind=0;
        // ind2=0;
        

        System.out.println("============================================");
        System.out.println("Data array adalah : ");
        for(int index:arr1){
            System.out.print(index+" ");
        }
        System.out.println(" ");
        System.out.println("Data array duplikat : ");
        
        
        
        for(ind=0; ind<arr1.length; ind++){
            // countDuplicate=0;
            for(ind2=0; ind2<arr3.length; ind2++){
                if(arr1[ind]==arr3[ind2]){
                    // countDuplicate+=1;
            System.out.print(arr1[ind]+" ");
                }
            }
            
            // ind=arr1.length; // SEGEL BAHAYA JANGAN DIBUKA !!!
            
        }
    }
}
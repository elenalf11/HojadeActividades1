package Actividadeswhile;
import java.util.Scanner;

public class Actividad1 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        int i = 1;
        
        System.out.print("Ingrese un número, por favor: ");

        while (i <= numero){
             System.out.println(i);
             i ++;
        }

       
         
        sc.close();

        
    }
    
}

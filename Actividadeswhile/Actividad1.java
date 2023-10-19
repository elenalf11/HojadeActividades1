package Actividadeswhile;
import java.util.Scanner;

public class Actividad1 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        
        System.out.print("Ingrese un número, por favor: ");

        while (1<numero)

        System.out.println(numero --);
         
        sc.close();

        
    }
    
}

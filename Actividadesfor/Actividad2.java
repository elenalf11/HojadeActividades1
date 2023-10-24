package Actividadesfor;
import java.util.Scanner;

public class Actividad2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
         int numero = sc.nextInt();
         int suma = 0;
         sc.close();

        System.out.print("Ingrese un número, por favor: ");
       
        
        for (int i = 2; i <= numero; i += 2) {
                suma += i;
                
        
        } 
        
        System.out.println("La suma total es: " + suma);
        
    }
    
}

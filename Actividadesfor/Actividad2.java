package Actividadesfor;
import java.util.Scanner;

public class Actividad2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
         int tunumero = sc.nextInt();
         int numero = 1;
         int suma = 0;
         sc.close();

        System.out.print("Ingrese un número, por favor: ");
       
        
        for (;numero < (tunumero + 1); numero++) {

            if ((numero%2)==0){

                System.out.println("numeros par: " + numero);
                suma = suma + numero;
                
            } else {}
        } System.out.println("La suma total es: " + suma);
        
        
        
    }
    
}

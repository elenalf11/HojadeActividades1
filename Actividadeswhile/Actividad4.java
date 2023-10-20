package Actividadeswhile;
import java.util.Scanner;
import java.util.Random;

public class Actividad4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();
       
        int numeroAleatorio = rand.nextInt(100) + 1;
        System.out.println("Dime un número del 1 al 100 y te diré si has acertado el número en el que estoy pensando");
        int numero = sc.nextInt();
        int intentos = 3;
       
        while (intentos == 3){
         
            if (numero == numeroAleatorio){
                System.out.println("¡Enhorabuena! Has acertado el número");
            }
            else if (numero<numeroAleatorio) {
                System.out.println("El número que buscas es un poco más alto, ¡Sigue intentándolo!");
            }
            else if (numero > numeroAleatorio){
                System.out.print("El número que buscas es un poco más bajo, ¡Sigue intentándolo!");
            }
        
    }

    
        sc.close();

    }
    
}

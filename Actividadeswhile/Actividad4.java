package Actividadeswhile;
import java.util.Scanner;
import java.util.Random;

public class Actividad4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        Random rand = new Random ();
        int numeroAleatorio = rand.nextInt(100) + 1;
        int intentos = 0;

        while(true){
            System.out.println("Dime un número del 1 al 100 y te diré si has acertado el número en el que estoy pensando");
            int numero = sc.nextInt();
            intentos ++;


            if (numero == numeroAleatorio){

                System.out.println("¡Enhorabuena! Has acertado el número");      
                
            }    else if (numero<numeroAleatorio){
                    System.out.println("Sigue intentándolo, pista: es más alto");
                }       else if (numero>numeroAleatorio){
                        System.out.println("Sigue intenándolo, pista: es más bajo");
                        }  
             sc.close();

        }  
       
    }
    
}

package Actividadesdowhile;
import java.util.Scanner;

public class Actividad2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int tunumero = sc.nextInt();
        int numero = 2;
        int suma = 0 ;
        sc.close();
        System.out.println("Introduce un número y te digo la suma de sus pares: ");

        do{
           suma += 1;
           numero +=2;

        } while (numero <= tunumero);
        System.out.println("La suma de los números pares es: " + suma);


    }
    
}

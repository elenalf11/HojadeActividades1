package Actividadeswhile;
import java.util.Scanner;

public class Actividad3 {
    public static void main (String [] args){
        System.out.println("Introduzca un número entero, por favor: ");
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        int contador = 0;
        int numeroAbsoluto = Math.abs(numero);

        // Manejamos el caso especial de 0
        if (numero == 0){
            contador = 1;
            
            
        } else {
            while(numeroAbsoluto > 0 ){
            numeroAbsoluto /= 10;
            contador ++;

               
            }
        System.out.println("El número tiene " + contador + " dígito/s.");
        sc.close();
        }

}
}

package Actividadeswhile;
import java.util.Scanner;

public class Actividad3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        int cifra = 0;

        System.out.println("Introduzca un número entero, por favor: ");
       
        if (numero%10>=0){
            System.out.println("Es un número entero , te diré cuántas cifras tiene.");
            
            
        }
        else {System.out.println("No es un número entero.");}

        while(numero>0 ){
            numero = numero/10;
            cifra++;

            
            System.out.println("El número tiene " + cifra + " dígito/s.");   
        }
        sc.close();
    }

    
}

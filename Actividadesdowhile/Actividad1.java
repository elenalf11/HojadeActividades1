package Actividadesdowhile;
import java.util.Scanner;

public class Actividad1{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int unoaldiez = 1;
        int numero = sc.nextInt();
        System.out.println("Dime un número y te digo su tabla de multiplicar");
        sc.close();


        do {
            System.out.println(numero + " x " + unoaldiez + " = " + numero * unoaldiez);
            unoaldiez++;
        } while (unoaldiez <= 10);
        

    }
    
}

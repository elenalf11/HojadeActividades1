package Actividades;
import java.util.Scanner;

public class Actividad5 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un número del 1 al 100");
        int num = sc.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.print("El número está dentro del rango");

        } else {System.out.print("El número no está dentro del rango");}

        sc.close();

        
    }
    
}

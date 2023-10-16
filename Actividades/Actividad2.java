package Actividades;
import java.util.Scanner;


public class Actividad2 {
    public static void main (String [] args) {
        
        System.out.print("Introduzca un número entero, por favor: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num >=0){
            System.out.print("El número es positivo");
        }
        else {System.out.print("El número es negativo");};
        sc.close();

        }
    
}

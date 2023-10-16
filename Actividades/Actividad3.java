package Actividades;
import java.util.Scanner;

public class Actividad3 {
    public static void main (String [] args){

        System.out.print("Introduzca un número, por favor: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num % 2 == 0 ){
            System.out.print("El número es par");
        }
        else {System.out.print("El número es impar");};
        sc.close();


    }
    
}

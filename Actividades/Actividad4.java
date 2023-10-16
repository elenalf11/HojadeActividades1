package Actividades;
import java.util.Scanner;

public class Actividad4 {
    public static void main (String [] args){
        System.out.print("Di tu año de nacimiento, por favor: ");
        Scanner sc = new Scanner (System.in);
        int año2;
        año2 = sc.nextInt();
        int año1;
        año1 = 2023;
        System.out.print("Tu edad es " + (año1 - año2));
        sc.close();
        





    }
    
}

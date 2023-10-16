package Actividades;
import java.util.Scanner;

public class Actividad4 {
    public static void main (String [] args){
         Scanner sc = new Scanner (System.in);

        System.out.print("Di tu año de nacimiento, por favor: "); 
        int año2 = sc.nextInt(); 
        int año1 = 2023;
        
        
        System.out.print("Tu edad es " + (año1 - año2));
        sc.close();
        





    }
    
}

package Actividadesfor;
import java.util.Scanner;

public class Actividad5 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un número, por favor: ");
        int numero = sc.nextInt();
        sc.close();
        
        for (int i = 1; i >=numero; i-- ){
            System.out.println(i);
        }

    }
    
}

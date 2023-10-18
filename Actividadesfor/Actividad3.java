package Actividadesfor;
import java.util.Scanner;

public class Actividad3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int unoaldiez = 1;

        System.out.print("Introduzca un número, por favor: ");
        int num = sc.nextInt();
        sc.close();
        


        for(; unoaldiez<11; unoaldiez++){
            System.out.println(num + "x " + unoaldiez + "= " + (num * unoaldiez) );
        }



        

    }
    
    
}

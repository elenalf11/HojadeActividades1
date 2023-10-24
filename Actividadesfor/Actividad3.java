package Actividadesfor;
import java.util.Scanner;

public class Actividad3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número, por favor: ");
        int num = sc.nextInt();
        sc.close();
        


        for(int i = 1; i <= 10; i++){
            System.out.println(num + "x " + i + "= " + (num * i) );
        }



        

    }
    
    
}

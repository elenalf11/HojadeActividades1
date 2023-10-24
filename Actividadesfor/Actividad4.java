package Actividadesfor;
import java.util.Scanner;

public class Actividad4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        int factorial = 1;
        System.out.println("Dime un número, por favor: ");
        sc.close();


        if(numero>0){
            for(int i = 1; i <= numero ; i++){
                factorial += i;
                System.out.println(factorial);
            } System.out.println("El factorial de su número es: " + factorial);
            
        }
        else{System.out.println("Esto es un número negativo, esto no va a funcionar");}

            
    }
    
}

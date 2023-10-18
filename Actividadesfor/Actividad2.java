package Actividadesfor;
import java.util.Scanner;

public class Actividad2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese un número, por favor: ");
        int N = sc.nextInt();
        

        for(int num=1; num<=N; num++){
            if (num%2==0){
                System.out.print(num + ", ");

            }

            
            
            
        
   
        }
        
        
        sc.close();
    }
    
}

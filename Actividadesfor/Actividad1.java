package Actividadesfor;
import java.util.Scanner;

public class Actividad1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número, por favor: ");
        int N = sc.nextInt();

        for(int i= 1;  i<= N; i++ ){
             System.out.print(i + ", ");

        }
       

        sc.close();



        

    }
}

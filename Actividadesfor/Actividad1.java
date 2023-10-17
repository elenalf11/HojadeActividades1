package Actividadesfor;
import java.util.Scanner;

public class Actividad1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número, por favor: ");
        int N = sc.nextInt();

        for(int num= 1;  num<= N; N-- ){
             System.out.print(N + ", ");

        }
       

        sc.close();



        

    }
}

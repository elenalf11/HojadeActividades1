package Actividadesfor;
import java.util.Scanner;

public class Actividad1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número, por favor: ");
        int num1 = sc.nextInt();

        for(int num= 1;  num<= num1; num1-- ){
             System.out.print(num1 + ", ");

        }
       

        sc.close();



        

    }
}

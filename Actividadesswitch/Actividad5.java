package Actividadesswitch;
import java.util.Scanner;

public class Actividad5 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int nota = sc.nextInt();
        System.out.println("Dime tu nota y diré si has aprobado");
        sc.close();

        switch (nota){
            case 1:
                System.out.println("Estás suspenso");
                break;
            case 2:
                System.out.println("Estás suspenso");
                break;
            case 3:
                System.out.println("Estas aprobado con un suficiente");
                break;
            case 4:
                System.out.println("Estas aprobado con un notable");
                break;
            case 5:
                System.out.println("Estas aprobado con un sobresaliente");
            default:
                System.out.println("Dime tu nota de 1 a 5, ese número no es válido.");


        }




    }
    
}

package Actividadesswitch;
import java.util.Scanner;

public class Actividad1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int día = sc.nextInt();
        sc.close();
        System.out.println("Dime un número del 1 al 7, y te diré a que día corresponde: ");

    
        switch (día){
            case 1 :
                System.out.println("El día es Lunes");
                break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miércoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
             case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sábado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;
            default: 
                System.out.println("El número no está dentro del intervalo, prueba con un número que esté dentro del intervalo");

                
        }
    }
}

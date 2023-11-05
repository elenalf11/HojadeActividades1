package Actividadesswitch;
import java.util.Scanner;

public class Actividad4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mostrar información");
        System.out.println("Editar perfil");
        String salir = "Salir";
        int usuario = sc.nextInt();
        System.out.println("Por favor seleccione: Mostrar información, Editar perfil o Sarlir");
        sc.close();

        switch(usuario){
            case 1:
                System.out.println("Aquí tienes información sobre algo....");
            break;

            case 2:
                System.out.println("Aquí puedes modificar algunos datos de tu perfil...");
            break;

            case 3:
                System.out.println("Aquí podrás salir de aquí ...");
            break;

            default:
                System.out.println("Por favor escriba bien el sevicio que quiere usar");

        }
        




    }
    
}

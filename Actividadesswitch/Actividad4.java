package Actividadesswitch;
import java.util.Scanner;

public class Actividad4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String info = "Mostrar información";
        String perfil ="Editar perfil";
        String salir = "Salir";
        String usuario = sc.nextLine();
        System.out.println("Por favor seleccione: Mostrar información, Editar perfil o Sarlir");
        sc.close();

        switch(usuario){
            case "Mostrar información":
                System.out.println("Aquí tienes información sobre algo....");
            break;

            case "Editar perfil":
                System.out.println("Aquí puedes modificar algunos datos de tu perfil...");
            break;

            case "Salir":
                System.out.println("Aquí podrás salir de aquí ...");
            break;

            default:
                System.out.println("Por favor escriba bien el sevicio que quiere usar");

        }
        




    }
    
}

package Actividades;

import java.util.Scanner;

public class Actividad1 {
    public static void main (String [] args){

		System.out.println("Ingrese su calificación, por favor: ");
		Scanner sc = new Scanner(System.in);
		int nota;
		nota=sc.nextInt();
		if (nota>=60){
			System.out.print("Usted está aprobado, enhorabuena ");
		
		}
		else {System.out.print("Usted está suspenso, lo siento");}
        sc.close();

	}

}

    


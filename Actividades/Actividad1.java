package Actividades;

import java.util.Scanner;

public class Actividad1 {
    public static void main (String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su calificación (0-100), por favor: ");
		int nota = sc.nextInt();
		
		if (nota>=60){
			System.out.print("Usted está aprobado, enhorabuena ");
		
		}
		
		else {System.out.print("Usted está suspenso, lo siento");}
        
		sc.close();

	}

}

    


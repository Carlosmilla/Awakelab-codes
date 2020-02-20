package Robots;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Robots robot = new Robots (); // se declara la clase para poder usar sus metodos
		boolean op = false;
		int opcion;
		
		//AQUI SE PUEDE IMPLEMENTAR UN MENU 
				// se llaman los metodos
			  robot.ingresarRobot();
		
		do {
			System.out.println("\nBIENVENIDO AL MENU DE LOS ROBOTS");
			System.out.println("\n********************************");
			System.out.println("\nSELECCIONE QUE DESEA VER");
			System.out.println("\n********************************");
			System.out.println("1. Lista de Robots de menor porcentaje de vida a mayor");
			System.out.println("2. Robots mayores al 50% de vida");
			System.out.println("3. Los 3 robots con mas vida");
			System.out.println("4. Salir");
			System.out.println("\n********************************");
			opcion = scan.nextInt();
		switch (opcion) {
		    case 1: 
		    	 System.out.println("\nOrdenados de menor a mayor segun su procentaje de vida: \n");
		   	  robot.OrdenarArreglo();
		   	break;
		    case 2:
		  	  System.out.println("\nMayores de 50% de vida: \n");
		  	  robot.mayor50DeVida();
		  	break;
		    case 3: 
		      System.out.println("\nLos 3 Mayores porcentajes de vida: \n");
		   	  robot.mayoresVidas();
		   	break;
		    case 4:
		    	op = false;
		}	 
   } while (op == !false);
}
}


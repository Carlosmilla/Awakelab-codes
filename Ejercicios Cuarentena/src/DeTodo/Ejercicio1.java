package DeTodo;

import java.util.Scanner;

public class Ejercicio1 {

	private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		
		Integer iOpcion;
		
		System.out.println("BIENVENIDO\n");
		System.out.println("Seleccione un dia:\n");
		System.out.println("1. Lunes ");
		System.out.println("2. Martes");
		System.out.println("3. Miercoles");
		System.out.println("4. Jueves");
		System.out.println("5. Viernes");
		System.out.println("6. Sabado");
		System.out.println("7. Domingo");
		System.out.println("8. Salir");
		iOpcion = scan.nextInt();
		
		switch (iOpcion) {
		case 1: 
			System.out.println("Dia Habil");
			break;
		case 2: 
			System.out.println("Dia Habil");
			break;
		case 3: 
			System.out.println("Dia Habil");
			break;
		case 4: 
			System.out.println("Dia Habil");
			break;
		case 5: 
			System.out.println("Dia Habil");
			break;
		case 6: 
			System.out.println("Medio dia Habil");
			break;
		case 7: 
			System.out.println("Dia No Habil");	
			break;
		case 8: 
			System.out.println("Adios");
			System.exit(8);
		}
		

	}

}
//		 Scanner scan = new Scanner(System.in);
//         
//	        System.out.println("Introduce un dia de la semana");
//	        String dia = scan.next();
//	         
//	        switch(dia){
//	            case "lunes" :
//	            case "martes":
//	            case "miercoles":
//	            case "jueves":
//	            case "viernes":
//	                System.out.println("Es un dia laboral");
//	                break;
//	            case "sabado":
//	            case "domingo":
//	                System.out.println("Es un dia festivo");
//	            default:
//	                System.out.println("Introduce un dia de la semana");
//	        }
//	    }
//	}

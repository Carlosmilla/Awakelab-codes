package Trabajoenclase2;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
    Scanner data = new Scanner (System.in);
    Scanner data2 = new Scanner (System.in);
    String titular;
    int cantidad;
    int opcion;
    boolean salir = false;
    
		Cuenta dato = new Cuenta();
		
		System.out.println("Ingrese su nombre: ");
		titular = data.nextLine();
		cantidad = (int) (Math.random()*1000000+1);
		
		dato.setTitular(titular);
		dato.setCantidad(cantidad);
		 
		System.out.println(dato.toString());
		System.out.println("*********************************************");
		System.out.println();
		
		while(!salir){
			System.out.println("SELECCIONE LA OPERACION QUE DESEA REALIZAR");
			System.out.println("*********************************************");
			System.out.println("1. Ingreso de efectivo");
			System.out.println("2. Retiro de efectivo");
			System.out.println("3. Salir");
			System.out.println("*********************************************");
			opcion = data2.nextInt();
		    
			switch (opcion) {
			case 1:
				System.out.println("Ingrese la cantidad que desea agregar: ");
				int extra = data.nextInt();
				dato.setinfoop(extra);
				System.out.println();
				System.out.println("*********************************************");
				System.out.println("Su nuevo estado de cuenta es el siguiente: ");
				System.out.println(dato.getOpcion1());
				System.out.println("*********************************************");
				System.out.println();
				break;
				
			case 2:
				System.out.println("Ingrese la cantidad que desea retirar: $");
				extra = data.nextInt();
				dato.setinfoop(extra);
					System.out.println();
					System.out.println("*********************************************");
					System.out.println("Su nuevo estado de cuenta es el siguiente: $");
					System.out.println(dato.getOpcion2());
					System.out.println("*********************************************");
					System.out.println();
					break;
				
			case 3: 
				System.exit(0);
				
			}
				
		}

     }

}

package Ciclos;

import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		Integer iNumVentas, iVentas, iSumaVentas=0;
		
		System.out.println("Ingrese la cantidad de ventas a Ingresar: ");
		System.out.println("");
		iNumVentas = scan.nextInt();
		
		for (int i=1; i<=iNumVentas; i++) {
			System.out.println("\nIngrese el total de la venta "+i);
			iVentas = scan.nextInt();
			iSumaVentas = iSumaVentas + iVentas;
		}
		
		System.out.println("\nLa suma de las ventas es\n");
		System.out.println(+iSumaVentas);

	}

}

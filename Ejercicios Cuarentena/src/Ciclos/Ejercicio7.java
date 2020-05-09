package Ciclos;

import java.util.Scanner;

public class Ejercicio7 {
	
    private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		
		String sPassword = "abcd";
		Integer Intentos = 3; 
		boolean coincide = false;
		String sPass;
		
		System.out.println("BIENVENIDO");
		
		for (int i=0; i<Intentos && !coincide; i++) {
			System.out.println("Ingrese contraseña");
			sPass = scan.nextLine();
			
			if (sPass.equalsIgnoreCase(sPassword)) {
				System.out.println("Contraseña correcta");
				coincide = true;
			} else {
				System.out.println("Incorrecta "+(Intentos-i)+" intentos restantes");
			}
		}

	}

}


package DeTodo;

import java.util.Scanner;

public class Ejercicio2 {
    
	private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingrese el primer numero\n");
		int A = scan.nextInt();
		System.out.println("\nIngrese el segundo numero\n");
		int B = scan.nextInt();
		
		for (int i=0; i<10; i++) {
		int numeros = (int) (Math.random()*A+B);
		System.out.println("Los numeros son "+i+": "+numeros);
		}
	}

}

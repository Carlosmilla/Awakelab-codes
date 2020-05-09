package Ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    
	public static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
	
		System.out.println("CALCULAR ECUACIONES DE SEGUNDO GRADO");
		System.out.println("\nIngrese el Valor de A: ");
		int iA = scan.nextInt();
		System.out.println("\nIngrese el Valor de B: ");
		int iB = scan.nextInt();
		System.out.println("\nIngrese el Valor de C: ");
		int iC = scan.nextInt();
		
	    double valor1 = (-iB + (Math.sqrt((iB*iB)-4*(iA*iC))));
	    double valor2 = (-iB - (Math.sqrt((iB*iB)-4*(iA*iC))));
	    double X1 = valor1/(2*iA);
	    double X2 = valor2/(2*iA);
	    
	    System.out.println("\nLos valores de x son: ");
	    System.out.println(+X1);
	    System.out.println(+X2);

	}

}

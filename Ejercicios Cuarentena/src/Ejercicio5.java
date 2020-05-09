import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner (System.in);
		double dPi = 3.14;
		double dRadio = 0;
		
		System.out.println("Ingrese el Radio del Circulo: ");
		System.out.println("");
		dRadio = data.nextDouble();
		
		double dArea = dPi*(dRadio*dRadio);
		
		System.out.println("\nEl area del circulo es: "+dArea);
		
	}

}

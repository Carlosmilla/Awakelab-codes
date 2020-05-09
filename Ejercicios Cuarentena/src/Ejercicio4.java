import java.util.Scanner; 

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner (System.in);
		int iOpcion = 0;
		
		while (iOpcion != 5) {
			
		
			System.out.println("\nSELECCIONE UN NOMBRE\n");
			System.out.println("1. Carlos");
			System.out.println("2. Fer");
			System.out.println("3. Cristian");
			System.out.println("4. Ximena\n");
			System.out.println("5. Salir\n");
			iOpcion = data.nextInt();
			
			if (iOpcion > 5) {
				System.out.println("\nValor erroneo, se terminara el programa");
				System.exit(2);
			}
			switch (iOpcion) {
			case 1: 
				System.out.println("\nBienvenido Carlos");
				break;
			case 2: 
				System.out.println("\nBienvenida Fer");
				break;
			case 3: 
				System.out.println("\nBienvenido Cristian");
				break;
			case 4: 
				System.out.println("\nBienvenida Ximena");
				break;
			}
		}	
		
	}	
}

package DeTodo;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    
	private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) throws IOException {
		
		int num, cifras;
		char continuar;
		
		do {
			System.out.println("\nINGRESE UN NUMERO ENTERO\n");
			num = scan.nextInt();
			cifras = 0;
			while (num != 0) {
			   num = num/10;
			   cifras++;
			}
			System.out.println("El numero tiene "+cifras+" cifras\n");
			System.out.println("\nContinuar? Y/N\n");
			continuar = (char) System.in.read();
			
		} while (continuar != 'n' && continuar != 'N');

	}

}

//int numero=0;
//do{
//    System.out.println("Introduce un numero");
//    numero=sc.nextInt();
//}while(numero<0); int contador=0; for (int i=numero;i>0;i/=10){
//    //Incrementamos el contador
//    contador++;
//}
//
////Controlamos en el caso de que haya una cifra o mas
//if (contador==1){
//    System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
//}else{
//    System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
//}
//
//}
//}

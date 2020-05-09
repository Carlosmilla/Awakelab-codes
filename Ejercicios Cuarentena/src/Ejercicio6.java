import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner data = new Scanner (System.in);
		
		int iNum;
		double dResto;

		System.out.println("\nIngrese un numero o si desea sair ingrese 00\n");
		iNum = data.nextInt();
		
		if (iNum == 00) {
			System.exit(2);
		}
		
		dResto = iNum%2;
		
		if (dResto == 0) {
			System.out.println("\nEl numero: "+iNum+" es divisible por 2");
		} else {
			System.out.println("\nEl numero: "+iNum+" no es divisible por 2");
		}
		
	}

}

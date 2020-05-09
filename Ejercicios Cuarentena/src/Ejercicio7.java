import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int iValor = 0;
		double dIVA = 1.21;
		
		System.out.println("Ingrese el precio del producto: \n");
		iValor = scan.nextInt();
		
	    System.out.println("\nCalculando valor + IVA\n");
	    
	    double dTotal = iValor*dIVA;
	    
	    System.out.println("Resultado: "+dTotal);
	}

}

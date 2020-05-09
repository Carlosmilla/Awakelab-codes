
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1, iNum2;
		
		iNum1 = (int) (Math.random()*10+1);
		iNum2 = (int) (Math.random()*10+1);
		
		System.out.println("Los numeros son: "+iNum1+" y "+iNum2);
		
		if (iNum1>iNum2) {
			System.out.println("El numero: "+iNum1+ " es mayor");
		} else if (iNum1<iNum2) {
			System.out.println("El numero: "+iNum2+ " es mayor");
		} else if (iNum1==iNum2) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("Valores invalidos saco wea");
		}

	}

}
